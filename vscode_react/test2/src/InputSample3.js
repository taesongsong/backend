import { useState, useRef } from "react";


function InputSample3(){
    const [input,setInputs] = useState({
        name: '',
        nickname: '',
        email:''
    });

    const onReset = () =>{
        setInputs({
            name:'',
            nickname:'',
            email:''
        });
        nameInput.current.focus(); // input 창을 클릭해서 커서를 깜박여라
    }    
    
    return(
        <div>
            <input name="name" onChange={onChange} value={name} placeholder="이름" ref={nameInput}></input>
            <input name="nickname" onChange={onChange} value={nickname} placeholder="닉네임"></input>
            <input name="email" onChange={onChange} value={email} placeholder="이메일" />
            <button onClick={onReset} >초기화</button>
            <div>
                <b>값: {text} </b>
            </div>
        </div>
    );
}
export default InputSample3;