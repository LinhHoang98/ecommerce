import {useForm} from "@tanstack/react-form";
import {Button, FormControl, FormLabel, Input} from "@chakra-ui/react";

export const Registration = () => {
    const form = useForm({
        defaultValues: {
            username: '',
            password: '',
            confirmPassword: '',
        },
        onSubmit: async ({value}) => {
            console.log(value);
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