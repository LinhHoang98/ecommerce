import axios from "axios";
import {BASE_URL} from "../constants.ts";
import {RegistrationDto} from "./dto/registration.ts";

const axiosInstance = axios.create({baseURL: BASE_URL});

export const register = async (data: RegistrationDto) => {
    await axiosInstance.post("/accounts", data);
}