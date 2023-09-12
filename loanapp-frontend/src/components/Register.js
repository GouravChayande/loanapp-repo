import { useState } from "react";

const Register = () => {
    const [username, setUsername] = useState("")
    const [password, setPassword] = useState("")
    const [fullname, setFullname] = useState("")
    const [designation, setDesignation] = useState("")
    const [department, setDepartment] = useState("")
    const [dob, setDob] = useState("")
    return (
        <>
        <form>
            <p>
            <label>Username: <input type="text" value={username}></input></label>
            </p>

            <p>
            <label>Password: <input type="password" value={password}></input></label>
            </p>

            <p>
            <label>Full Name: <input type="text" value={fullname}></input></label>
            </p>

            <p>
            <label>Designation: <input type="text" value={designation}></input></label>
            </p>

            <p>
            <label>Department <input type="text" value={department}></input></label>
            </p>

            <p>
            <label>Date of Birth: <input type="date"></input></label>
            </p>

            <button type="submit">Register</button>
        </form>
        </>
    )
};


export default Register;