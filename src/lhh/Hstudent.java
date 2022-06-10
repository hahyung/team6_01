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
			System.out.println("1.학생 등록");
			System.out.println("2.학생 검색");
			System.out.println("3.학생 삭제");
			System.out.println("4.수정");
			System.out.println("5.모든학생 출력");
			System.out.println("6.종료");
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
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		}
	}
	
	public void register(){
		System.out.println("학생등록");
		Hstudent s = new Hstudent();
		//String name;
		//int id=0, phone;
		boolean check = true;
		while( check ) {
			System.out.println("학번 입력");
			id = input.nextInt();
			int k=0;
			for(;k<arr.size();k++) {
				if(arr.get(k).getId() == id) {
					System.out.println("동일한 학번이 존재합니다");
					break;
				}
			}
			if(k == arr.size())
				break;
		}
		System.out.println("이름");
		name = input.next();
		System.out.println("전화번호 입력");
		phone = input.nextInt();
		
		s.setId(id); 
		s.setName(name); 
		s.setPhone(phone);
		
		arr.add(s);
		
	}
	public void search() {
		System.out.println("학생 검색");
		System.out.println("찾을 이름 입력");
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
			System.out.println("해당 학생은 존재하지 않습니다.");
		}
		
		
	}
	public void delet() {
		System.out.println("학생 삭제");
		System.out.println("삭제할 학생 이름 입력");
		name = input.next();
		boolean run = true;
		while(run) {
		int j = 0;
		for(; j<arr.size(); j++) {
			Hstudent st = arr.get(j);
			if(st.getName().equals(name)) {
				arr.remove(j);
				System.out.println("삭제되었습니다.");
				run = false;
				break;
			}
		}
		if(j == arr.size()) 
			System.out.println("해당 학생은 존재하지 않습니다.");
		}
		
	}
	public void modify() {
		System.out.println("수정");
		System.out.println("이름 입력");
		String name = input.next();
		boolean run = true;
		while(run) {
		int m = 0;
		for(; m<arr.size(); m++) {
			Hstudent mf = arr.get(m);
			if(mf.getName().equals(name)) {
				System.out.println(name+"님의 정보");
				System.out.println(mf.getId());
				System.out.println(mf.getName());
				System.out.println(mf.getPhone());
				System.out.println("-------------");
				System.out.println("수정할 이름 입력");
				name = input.next();
				System.out.println("수정할 전화번호 입력");
				int phone = input.nextInt();
				
				Hstudent ms = arr.get(m);
				ms.setName(name);
				ms.setPhone(phone);
				arr.remove(m); arr.add(ms);
				System.out.println("수정되었습니다");
				System.out.println("---바뀐정보---");
				System.out.println(ms.getId());
				System.out.println(ms.getName());
				System.out.println(ms.getPhone());
				run = false;
				break;
			}
		
		}
		if(m == arr.size()) 
			System.out.println("해당 학생은 존재하지 않습니다.");
		}
		
	}
	public void allP() {
		System.out.println("모든학생 출력");
		for(int a=0;a<arr.size();a++) {
			Hstudent ap = arr.get(a);
			System.out.println("학번 : "+ap.getId());
			System.out.println("이름 : "+ap.getName());
			System.out.println("전화번호 : "+ap.getPhone());
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
