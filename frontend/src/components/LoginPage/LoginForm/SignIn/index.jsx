import CustomTextField from "../../../Shared/CustomTextField";

const SignIn = () => {
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
                    handleBlur={() => { }}
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