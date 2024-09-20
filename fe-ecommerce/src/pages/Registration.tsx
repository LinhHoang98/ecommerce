import {useForm} from "@tanstack/react-form";
import {Button, FormControl, FormLabel, Input} from "@chakra-ui/react";
import axios from "axios";
import {useMutation} from "@tanstack/react-query";

export const Registration = () => {

    const register = async (data: any) => {
        await axios.post("http://localhost:8080/api/v1/accounts", data);
    }

    const useRegister = () => {
        return useMutation({
            mutationFn: (data: any) => register(data),
            onMutate: () => console.log('success')
        });
    }

    const createAccountMutation = useRegister();

    const form = useForm({
        defaultValues: {
            username: '',
            password: '',
            confirmPassword: '',
        },
        onSubmit: async ({value}) => {
            createAccountMutation.mutate(value);
        }
    });

    return (
        <div>
            <form onSubmit={(e) => {
                e.preventDefault();
                e.stopPropagation();
                form.handleSubmit()
            }}>
                <form.Field name="username" children={(field) => {
                    return (
                        <FormControl>
                            <FormLabel>Username</FormLabel>
                            <Input id={field.name}
                                   name={field.name}
                                   value={field.state.value}
                                   onChange={(e) => field.handleChange(e.target.value)}
                                   onBlur={field.handleBlur}
                            />
                        </FormControl>
                    )
                }}/>

                <form.Field name="password" children={(field) => {
                    return (
                        <FormControl>
                            <FormLabel>Password</FormLabel>
                            <Input id={field.name}
                                   name={field.name}
                                   value={field.state.value}
                                   onChange={(e) => field.handleChange(e.target.value)}
                                   onBlur={field.handleBlur}
                                   type="password"
                            />
                        </FormControl>
                    )
                }}/>

                <form.Field name="confirmPassword" children={(field) => {
                    return (
                        <FormControl>
                            <FormLabel>Confirm Password</FormLabel>
                            <Input id={field.name}
                                   name={field.name}
                                   value={field.state.value}
                                   onChange={(e) => field.handleChange(e.target.value)}
                                   onBlur={field.handleBlur}
                                   type="password"
                            />
                        </FormControl>
                    )
                }}/>

                <form.Subscribe
                    // selector={(state) => [state.canSubmit, state.isSubmitting]}
                    children={() => (
                        <Button colorScheme='teal' type="submit">
                            Submit
                        </Button>
                    )}
                />
            </form>
        </div>
    )
}