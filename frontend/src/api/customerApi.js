import axios from "axios";

const API_BASE_URL =
  import.meta.env.VITE_API_BASE_URL || "http://localhost:8080";

const CUSTOMER_URL = `${API_BASE_URL}/api/customers`;

export const getCustomers = async () => {
  return await axios.get(CUSTOMER_URL);
};

export const createCustomer = async (customer) => {
  return await axios.post(CUSTOMER_URL, customer);
};