function UserCard(props){

    const cardStyle={
        backgroundColor : props.isActive ? 'lightgreen' : 'lightgray' ,
        padding : '10px',
        margin : '10px',
        borderRadius: '5px'
    }


    return(
        <div style={cardStyle}>
            <h2>이름 {props.name}</h2>
            <p> 나이 : {props.age}</p>
            <p>직업 : {props.job}</p>
            <p>상태 : {props.isActive}</p>
        </div>
    );

    

}
export default UserCard