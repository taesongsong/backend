import UserCard1 from "./UserCard";

function UserList(){
    const user = {
        name:"Alice", age : 30, job : "Designer", isActive: true
    }
    return(
        <div>
        <h1>사용자 목록</h1>
        <UserCard name={user.name} age={user.age} job={user.job} isActive={user.isActive}/>
        </div>
    );
}
export default UserList;