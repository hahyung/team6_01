package ssg;

import java.util.ArrayList;
import java.util.Scanner;

class Member{
	Scanner scan = new Scanner(System.in);
	MemberVO vo = new MemberVO();
	private static ArrayList<MemberVO> arr = new ArrayList<MemberVO>();
	
	public void register() {
		
		String name, id;
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("아이디 : ");
		id = scan.next();
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getId().equals(id)) {
				System.out.println("존재하는 아이디 입니다.");
				return;
			}else if(arr.get(i).getName().equals(name)) {
				System.out.println("존재하는 학생입니다.");
				return;
			}
		}
		System.out.println("등록되었습니다.");
		vo.setId(id);
		vo.setName(name);
		arr.add(vo);
	}
	
	public void search() {
		String name;
		
		System.out.print("학생 이름 : ");
		name = scan.next();
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getName().equals(name)) {
				System.out.println("이름 : " + arr.get(i).getName());
				System.out.println("아이디 : " + arr.get(i).getId());
				return;
			}
		}
		System.out.println("존재하지 않습니다.");
	}
	
	public void delete() {
		String name;
		
		System.out.print("학생 이름 : ");
		name = scan.next();
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getName().equals(name)) {
				arr.remove(i);
				System.out.println("삭제되었습니다.");
				return;
			}
		}
		System.out.println("존재하지 않습니다.");
	}
	
	public void modify() {
		String name;
		
		System.out.print("학생 이름 : ");
		name = scan.next();
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getName().equals(name)) {
				System.out.print("수정할 이름 : ");
				name = scan.next();
				arr.get(i).setName(name);
				return;
			}
		}
		System.out.println("존재하지 않습니다.");
	}
	
	public void memberList() {
		for(MemberVO stu : arr) {
			System.out.println("아이디 : " + stu.getId());
			System.out.println("이름 : " + stu.getName());
			System.out.println("==============================");
		}
	}
}

public class SSG {
	
	public void MainSSG() {
		
		Member member = new Member();
		Scanner scan = new Scanner(System.in);
		int select;
		
		while(true) {
			System.out.println("1.학생등록");
			System.out.println("2.학생검색");
			System.out.println("3.학생삭제");
			System.out.println("4.수정");
			System.out.println("5.모든학생 출력");
			System.out.println("6.종료");
			System.out.print(">>>> ");
			select = scan.nextInt();
			
			if(select == 1) {
				member.register();
			}else if(select == 2) {
				member.search();
			}else if(select == 3) {
				member.delete();
			}else if(select == 4) {
				member.modify();
			}else if(select == 5) {
				member.memberList();
			}else if(select == 6) {
				break;
			}
		}
	}

}
