import axios from "axios";

const backendServer = import.meta.env.VITE_BACKEND_SERVER || 'localhost';
const backendPort = import.meta.env.VITE_BACKEND_PORT || '8080';

console.log(`Connecting to backend server at: ${backendServer}:${backendPort}`);

export default axios.create({
    baseURL: `http://${backendServer}:${backendPort}/app/micro`,
    headers: {
        'Content-Type': 'application/json'
    }
});