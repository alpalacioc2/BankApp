import { useEffect, useState } from "react";
import { getCustomers, createCustomer } from "./api/customerApi";
import "./App.css";

function App() {

  const [customers, setCustomers] = useState([]);
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");

  // Fetch customers from backend
  const fetchCustomers = async () => {
    try {
      const response = await getCustomers();
      setCustomers(response.data);
    } catch (error) {
      console.error("Error fetching customers:", error);
    }
  };

  // Run once when component loads
  useEffect(() => {
    fetchCustomers();
  }, []);

  // Handle form submit
  const handleSubmit = async (event) => {
    event.preventDefault();

    const newCustomer = {
      name: name,
      email: email,
    };

    try {
      await createCustomer(newCustomer);

      // Clear form
      setName("");
      setEmail("");

      // Refresh customer list
      fetchCustomers();

    } catch (error) {
      console.error("Error creating customer:", error);
    }
  };

  return (
    <div className="app-container">

      <h1>BankApp Customer Portal</h1>

      <form onSubmit={handleSubmit} className="customer-form">

        <input
          type="text"
          placeholder="Customer name"
          value={name}
          onChange={(event) => setName(event.target.value)}
        />

        <input
          type="email"
          placeholder="Customer email"
          value={email}
          onChange={(event) => setEmail(event.target.value)}
        />

        <button type="submit">
          Add Customer
        </button>

      </form>

      <h2>Customers</h2>

      {customers.length === 0 ? (

        <p>No customers found.</p>

      ) : (

        customers.map((customer) => (
          <div className="customer-card" key={customer.id}>

            <h3>{customer.name}</h3>
            <p>{customer.email}</p>

          </div>
        ))

      )}

    </div>
  );
}

export default App;