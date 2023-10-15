package sixthstep;
public class Member implements Comparable<Member>{

    private int memberId;        //회원 아이디
    private String memberName;   //회원 이름

    public Member(int memberId, String memberName){ //생성자
        this.memberId = memberId;
        this.memberName = memberName;
    }

    @Override
    public int hashCode() {
        //같은 멤버일 때 같은 해시코드를 갖는다..
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member)obj;
            if(this.memberId == member.getMemberId()){
                return true;
            }
            else return false;
        }
        return super.equals(obj);
    }

    public int getMemberId() {  //
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString(){   //toString 메소드 오버로딩
        return memberName + " 회원님의 아이디는 " + memberId + "입니다";
    }

    @Override
    public int compareTo(Member member) {
        //this는 add하려는 객체이다
        //member는 이미 tree안에 있어서 비교가 되는 객체이다.
        return this.memberId - member.getMemberId(); // 오름 차순
        //내림차순으로 하려면 (-1을 곱해야한다)
    }
}
