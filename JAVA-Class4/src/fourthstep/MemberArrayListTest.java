package fourthstep;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001,"가");
        Member memberLee2 = new Member(1002,"나");
        Member memberLee3 = new Member(1003,"다");
        Member memberLee4 = new Member(1004,"라");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberLee2);
        memberArrayList.addMember(memberLee3);
        memberArrayList.addMember(memberLee4);

        memberArrayList.showALLMembers();
    }
}
