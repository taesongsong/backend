package a1125.person;

public class Main1 {하세요.
MemberService memberService = new MemberService();
    boolean result = memberService.login("hong","12345");
    if(result){
        System.out.println("로그인되있습니다.");
        memberService.logout("hong");
    }else{
        System.out.println("id 또는 passward가 올바르지 않아요");
    }
    }
}
