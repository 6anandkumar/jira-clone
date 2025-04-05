import CustomTextField from "../../../Shared/CustomTextField";

const SignUp = () => {
    return (
        <div>
            <div className="mb-4">
                    <CustomTextField
                        name="firstName"
                        value=""
                        type="text"
                        placeholder="Enter Your First Name"
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
                        name="lastName"
                        value=""
                        type="text"
                        placeholder="Enter Your Last Name"
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

export default SignUp;