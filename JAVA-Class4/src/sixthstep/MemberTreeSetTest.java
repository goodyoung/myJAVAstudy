package sixthstep;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeset memberTreeset = new MemberTreeset();
        Member memberLee = new Member(1001,"이순신");
        Member memberKim = new Member(1002,"김유신");
        Member memberKang = new Member(1003,"강감찬");

        memberTreeset.addMember(memberLee);
        memberTreeset.addMember(memberKim);
        memberTreeset.addMember(memberKang);

        memberTreeset.showALLMembers();
        System.out.println("==============================");
        Member memberHong = new Member(1003,"홍길동");
        memberTreeset.addMember(memberHong);
        memberTreeset.showALLMembers();
    }
}
