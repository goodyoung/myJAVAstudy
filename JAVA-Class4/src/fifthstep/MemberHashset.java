package fifthstep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashset {
    private HashSet<Member> hashset;
    public MemberHashset(){
        hashset = new HashSet<>(); //default = 10 capacity
    }
    public void addMember(Member member){
        hashset.add(member);
    }
    public boolean removeMember(int memberId){
//        for (int i = 0 ; i<hashset.size();i++){
//            Member member = hashset.get(i);
//            if (member.getMemberId() == memberId){
//                hashset.remove(i);
//                return true;
//            }
//        }
        Iterator<Member> ir = hashset.iterator();
        while (ir.hasNext()){
            Member member = ir.next();
            if (member.getMemberId() == memberId){
                hashset.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }
    public void showALLMembers(){
//        for (int i = 0 ; i<hashset.size();i++){
//            Member member = hashset.get(i);
//            System.out.println(member);
//        }
        Iterator<Member> ir = hashset.iterator();
        while(ir.hasNext()){
            Member member = ir.next();
            System.out.println(member);
        }
    }
}

