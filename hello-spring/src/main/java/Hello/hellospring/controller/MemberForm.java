package Hello.hellospring.controller;

public class MemberForm {
    private String name; //HTML의 인자 값 name="name" 이랑 같이 매핑이 된다. -> spring이 setname으로 설정해준다. 그럼 우린 getname으로 꺼내오면 된다.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
