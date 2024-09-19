import {createRootRoute, createRoute, createRouter, Link, Outlet} from "@tanstack/react-router";
import {TanStackRouterDevtools} from "@tanstack/router-devtools";
import App from "./App.tsx";
import {Registration} from "./pages/Registration.tsx";

const rootRoute = createRootRoute({
    component: () => (
        <>
            <div className="p-2 flex gap-2">
                <Link to="/" className="[&.active]:font-bold">
                    Home
                </Link>
                <Link to="/registration" className="[&.active]:font-bold">
                    Registration
                </Link>
            </div>
            <hr />
            <Outlet />
            <TanStackRouterDevtools />
        </>
    )
});

const indexRoute = createRoute({
    getParentRoute: () => rootRoute,
    path: '/',
    component: () => <App />
})

const registrationRoute = createRoute({
    getParentRoute: () => rootRoute,
    path: '/registration',
    component: () => <Registration />,
})

const routeTree = rootRoute.addChildren([indexRoute, registrationRoute]);

export const router = createRouter({routeTree});