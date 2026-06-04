import axios from "axios";

const BASE_URL = "http://localhost:8080/api/customers";

export const getCustomers = async () => {
    return await axios.get(BASE_URL);
};