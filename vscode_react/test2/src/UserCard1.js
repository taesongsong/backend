function UserCard1({name, age, job, isActive}){

    const cardStyle={
        backgroundColor : props.isActive ? 'lightgreen' : 'lightgray' ,
        padding : '10px',
        margin : '10px',
        borderRadius: '5px'
    }


    return(
        <div style={cardStyle}>
            <h2>이름 {name}</h2>
            <p> 나이 : {age}</p>
            <p>직업 : {job}</p>
            <p>상태 : {isActive ? "활성":"비활성"}</p>
        </div>
    );  

}
UserCard1.defaultProps ={
export default UserCard1
}