import { useFormik } from "formik";
import CustomTextField from "../../../Shared/CustomTextField";

import * as yup from "yup";

const SignIn = () => {

    const formik = useFormik({
        initialValues: {
          email: "",
          password: "",
        },
        validationSchema: yup.object({
          email: yup.string().email("Invalid email").required("Email is required"),
          password: yup.string().min(6, "Minimum 6 characters").required("Password is required"),
        }),
        onSubmit: (values) => {
          console.log("Form submitted:", values);
        },
      });
    
    return (
        <div>
            <div className="mb-4">
                <CustomTextField
                    name="email"
                    value=""
                    type="text"
                    placeholder="Enter Your Email"
                    required={true}
                    disabled={false}
                    error=""
                    handleBlur={formik.handleBlur}
                    inputClassName="!p-0"
                    rootClassName="!p-0"
                />
            </div>

            <div className="mb-4">
                <CustomTextField
                    name="password"
                    value=""
                    type="password"
                    placeholder="Enter Your Password"
                    required={true}
                    disabled={false}
                    error=""
                    handleBlur={() => { }}
                    inputClassName="!p-0"
                    rootClassName="!p-0"
                />
            </div>
        </div>
    )
}

export default SignIn;