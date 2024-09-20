import {StrictMode} from 'react'
import {createRoot} from 'react-dom/client'
import './index.css'
import {RouterProvider} from "@tanstack/react-router";
import {router} from "./route.tsx";
import {ChakraProvider} from "@chakra-ui/react";

createRoot(document.getElementById('root')!).render(
    <StrictMode>
        <ChakraProvider>
            <RouterProvider router={router}/>
        </ChakraProvider>
    </StrictMode>,
)
