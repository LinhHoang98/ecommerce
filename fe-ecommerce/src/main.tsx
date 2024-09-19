import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import {ChakraProvider} from "@chakra-ui/react";
import {RouterProvider} from "@tanstack/react-router";
import {router} from "./route.tsx";

createRoot(document.getElementById('root')!).render(
  <StrictMode>
      <ChakraProvider>
          {/*<App />*/}
          <RouterProvider router={router} />
      </ChakraProvider>
  </StrictMode>,
)
