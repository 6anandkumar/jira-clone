import { Route, Routes } from "react-router-dom";
import LoginPage from "../../pages/LoginPage";

const AppRouter = () => {
    const isAuthentication = false;
    return (
        <div>
            <Routes>
                <Route path="/" element={isAuthentication ? <Navigate to="/taskList" replace /> : <LoginPage />} />
            </Routes>
        </div>
    )
}

export default AppRouter;