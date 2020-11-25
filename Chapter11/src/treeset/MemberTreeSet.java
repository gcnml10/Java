package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Member> TreeSet;
	
	public MemberTreeSet() {
		TreeSet = new TreeSet<Member>(new Member()); //comparator �� �ȿ� new Member() �������
	}
	
	public void addMember(Member member) {
		TreeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = TreeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				TreeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "��ȣ�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : TreeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
