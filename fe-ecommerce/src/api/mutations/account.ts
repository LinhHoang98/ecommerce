import {useMutation} from "@tanstack/react-query";
import {register} from "../api.ts";
import {RegistrationDto} from "../dto/registration.ts";

export const useRegister = () => {
    return useMutation({
        mutationFn: (data: RegistrationDto) => register(data),
        onMutate: () => console.log('success')
    });
}