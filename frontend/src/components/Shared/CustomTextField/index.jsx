import { TextField } from "@mui/material"

const CustomTextField = ({
    name,
    value,
    type,
    required,
    disabled,
    error,
    handleBlur,
    inputClassName,
    rootClassName,
    placeholder,
}) => {
    return (
        <TextField
         fullWidth
         size="small"
         required={required}
         type={type}
         placeholder={placeholder}
         disabled={disabled}
         label=""
         error={error}
         name={name}
        //  value={value}
         onBlur={handleBlur}
         variant="outlined"
         slotProps={{
            input: {
              className: inputClassName || "",
            },
            root: {
                className: rootClassName || "", // styles the wrapper/input container
            },
          }}
        />
    )
}

export default CustomTextField