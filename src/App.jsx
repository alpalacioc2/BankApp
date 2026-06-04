import { useEffect, useState } from "react";
import { getCustomers } from "./api/customerApi";

function App() {

  const [customers, setCustomers] = useState([]);

  useEffect(() => {
    fetchCustomers();
  }, []);

  const fetchCustomers = async () => {
    try {
      const response = await getCustomers();

      // Spring Data REST structure
      setCustomers(response.data._embedded.customers);

    } catch (error) {
      console.error("Error fetching customers:", error);
    }
  };

  return (
    <div>
      <h1>Customers</h1>

      {customers.map((customer) => (
        <div key={customer.id}>
          <p>{customer.name}</p>
          <p>{customer.email}</p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;