package ssg;

import java.util.ArrayList;
import java.util.Scanner;

class Member{
	Scanner scan = new Scanner(System.in);
	MemberVO vo = new MemberVO();
	private static ArrayList<MemberVO> arr = new ArrayList<MemberVO>();
	
	public void register() {
		
		String name, id;
		System.out.print("�̸� : ");
		name = scan.next();
		System.out.print("���̵� : ");
		id = scan.next();
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getId().equals(id)) {
				System.out.println("�����ϴ� ���̵� �Դϴ�.");
				return;
			}else if(arr.get(i).getName().equals(name)) {
				System.out.println("�����ϴ� �л��Դϴ�.");
				return;
			}
		}
		System.out.println("��ϵǾ����ϴ�.");
		vo.setId(id);
		vo.setName(name);
		arr.add(vo);
	}
	
	public void search() {
		String name;
		
		System.out.print("�л� �̸� : ");
		name = scan.next();
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getName().equals(name)) {
				System.out.println("�̸� : " + arr.get(i).getName());
				System.out.println("���̵� : " + arr.get(i).getId());
				return;
			}
		}
		System.out.println("�������� �ʽ��ϴ�.");
	}
	
	public void delete() {
		String name;
		
		System.out.print("�л� �̸� : ");
		name = scan.next();
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getName().equals(name)) {
				arr.remove(i);
				System.out.println("�����Ǿ����ϴ�.");
				return;
			}
		}
		System.out.println("�������� �ʽ��ϴ�.");
	}
	
	public void modify() {
		String name;
		
		System.out.print("�л� �̸� : ");
		name = scan.next();
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getName().equals(name)) {
				System.out.print("������ �̸� : ");
				name = scan.next();
				arr.get(i).setName(name);
				return;
			}
		}
		System.out.println("�������� �ʽ��ϴ�.");
	}
	
	public void memberList() {
		for(MemberVO stu : arr) {
			System.out.println("���̵� : " + stu.getId());
			System.out.println("�̸� : " + stu.getName());
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
			System.out.println("1.�л����");
			System.out.println("2.�л��˻�");
			System.out.println("3.�л�����");
			System.out.println("4.����");
			System.out.println("5.����л� ���");
			System.out.println("6.����");
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
