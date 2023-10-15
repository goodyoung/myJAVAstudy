package sixthstep;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeset {
    private TreeSet<Member> treeset;
    public MemberTreeset(){
        treeset = new TreeSet<>(); //default = 10 capacity
    }
    public void addMember(Member member){
        treeset.add(member);
    }
    public boolean removeMember(int memberId){
//        for (int i = 0 ; i<treeset.size();i++){
//            Member member = treeset.get(i);
//            if (member.getMemberId() == memberId){
//                treeset.remove(i);
//                return true;
//            }
//        }
        Iterator<Member> ir = treeset.iterator();
        while (ir.hasNext()){
            Member member = ir.next();
            if (member.getMemberId() == memberId){
                treeset.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }
    public void showALLMembers(){
//        for (int i = 0 ; i<treeset.size();i++){
//            Member member = treeset.get(i);
//            System.out.println(member);
//        }
        Iterator<Member> ir = treeset.iterator();
        while(ir.hasNext()){
            Member member = ir.next();
            System.out.println(member);
        }
    }
}

