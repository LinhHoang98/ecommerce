import {useForm} from "@tanstack/react-form";

export const Registration = () => {
    const form = useForm({
        defaultValues: {
            username: ''
        },
        // onSubmit: ({value}) => {
        //
        // }
    });

    return (
        <div>
            <form onSubmit={form.handleSubmit}>

            </form>
        </div>
    )
}