package fourthstep;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;
    public MemberArrayList(){
        arrayList = new ArrayList<>(); //default = 10 capacity
    }
    public void addMember(Member member){
        arrayList.add(member);
    }
    public boolean removeMember(int memberId){
//        for (int i = 0 ; i<arrayList.size();i++){
//            Member member = arrayList.get(i);
//            if (member.getMemberId() == memberId){
//                arrayList.remove(i);
//                return true;
//            }
//        }
        Iterator<Member> ir = arrayList.iterator();
        while (ir.hasNext()){
            Member member = ir.next();
            if (member.getMemberId() == memberId){
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }
    public void showALLMembers(){
//        for (int i = 0 ; i<arrayList.size();i++){
//            Member member = arrayList.get(i);
//            System.out.println(member);
//        }
        Iterator<Member> ir = arrayList.iterator();
        while(ir.hasNext()){
            Member member = ir.next();
            System.out.println(member);
        }
    }
}

