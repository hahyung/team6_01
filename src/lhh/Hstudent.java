package lhh;

import java.util.ArrayList;
import java.util.Scanner;


public class Hstudent {
	private String name;
	private int id, phone;
	ArrayList<Hstudent> arr = new ArrayList<Hstudent>();
	Scanner input = new Scanner(System.in);
	boolean run = true;
	public void display() {
		
		while(run) {
			System.out.println("1.�л� ���");
			System.out.println("2.�л� �˻�");
			System.out.println("3.�л� ����");
			System.out.println("4.����");
			System.out.println("5.����л� ���");
			System.out.println("6.����");
			int num = input.nextInt();
			
		switch(num) {
		case 1:
			register();
			break;
		case 2:
			search();
			break;
		case 3:
			delet();
			break;
		case 4:
			modify();
			break;
		case 5:
			allP();
			break;
		case 6:
			System.out.println("���α׷��� �����մϴ�.");
			return;
		}
		}
	}
	
	public void register(){
		System.out.println("�л����");
		Hstudent s = new Hstudent();
		//String name;
		//int id=0, phone;
		boolean check = true;
		while( check ) {
			System.out.println("�й� �Է�");
			id = input.nextInt();
			int k=0;
			for(;k<arr.size();k++) {
				if(arr.get(k).getId() == id) {
					System.out.println("������ �й��� �����մϴ�");
					break;
				}
			}
			if(k == arr.size())
				break;
		}
		System.out.println("�̸�");
		name = input.next();
		System.out.println("��ȭ��ȣ �Է�");
		phone = input.nextInt();
		
		s.setId(id); 
		s.setName(name); 
		s.setPhone(phone);
		
		arr.add(s);
		
	}
	public void search() {
		System.out.println("�л� �˻�");
		System.out.println("ã�� �̸� �Է�");
		name = input.next();
		int i = 0;
		for(; i<arr.size(); i++) {
			Hstudent st = arr.get(i);
			if(st.getName().equals(name)) {
				System.out.println(st.getId());
				System.out.println(st.getName());
				System.out.println(st.getPhone());
				break;
			}
		}
		if(i == arr.size()) {
			System.out.println("�ش� �л��� �������� �ʽ��ϴ�.");
		}
		
		
	}
	public void delet() {
		System.out.println("�л� ����");
		System.out.println("������ �л� �̸� �Է�");
		name = input.next();
		boolean run = true;
		while(run) {
		int j = 0;
		for(; j<arr.size(); j++) {
			Hstudent st = arr.get(j);
			if(st.getName().equals(name)) {
				arr.remove(j);
				System.out.println("�����Ǿ����ϴ�.");
				run = false;
				break;
			}
		}
		if(j == arr.size()) 
			System.out.println("�ش� �л��� �������� �ʽ��ϴ�.");
		}
		
	}
	public void modify() {
		System.out.println("����");
		System.out.println("�̸� �Է�");
		String name = input.next();
		boolean run = true;
		while(run) {
		int m = 0;
		for(; m<arr.size(); m++) {
			Hstudent mf = arr.get(m);
			if(mf.getName().equals(name)) {
				System.out.println(name+"���� ����");
				System.out.println(mf.getId());
				System.out.println(mf.getName());
				System.out.println(mf.getPhone());
				System.out.println("-------------");
				System.out.println("������ �̸� �Է�");
				name = input.next();
				System.out.println("������ ��ȭ��ȣ �Է�");
				int phone = input.nextInt();
				
				Hstudent ms = arr.get(m);
				ms.setName(name);
				ms.setPhone(phone);
				arr.remove(m); arr.add(ms);
				System.out.println("�����Ǿ����ϴ�");
				System.out.println("---�ٲ�����---");
				System.out.println(ms.getId());
				System.out.println(ms.getName());
				System.out.println(ms.getPhone());
				run = false;
				break;
			}
		
		}
		if(m == arr.size()) 
			System.out.println("�ش� �л��� �������� �ʽ��ϴ�.");
		}
		
	}
	public void allP() {
		System.out.println("����л� ���");
		for(int a=0;a<arr.size();a++) {
			Hstudent ap = arr.get(a);
			System.out.println("�й� : "+ap.getId());
			System.out.println("�̸� : "+ap.getName());
			System.out.println("��ȭ��ȣ : "+ap.getPhone());
			System.out.println("------------------");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
}
