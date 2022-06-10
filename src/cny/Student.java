package cny;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
		
		ArrayList<Student> arr = new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
	
		private String name;
		private int stuNum;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getStuNum() {
			return stuNum;
		}

		public void setStuNum(int stuNum) {
			this.stuNum = stuNum;
		}
		// 학생정보 
		public void info() {
			
			int num;
			while(true) {
				System.out.println("1. 등록");
				System.out.println("2. 검색");
				System.out.println("3. 삭제");
				System.out.println("4. 수정");
				System.out.println("5. 출력");
				System.out.println("6. 종료");
				System.out.println(">>>");
				num = input.nextInt();
				
				switch(num) {
				
				case 1 : 
					register();
					break;
				case 2 : 
					search();
					break;
				case 3 : 
					delete();
					break;
				case 4 : 
					modify();
					break;
				case 5 : 
					print();
					break;
				case 6 :
					System.exit(0);
					break;
				
				}
			} 
		}
		
		// 등록
		public void register() {
			
			Student s = new Student();
			
			String name;
			int stuNum = 0;
			
			while(true) {
				System.out.println("아이디(학번)을 입력해주세요");
				stuNum = input.nextInt();
				int i = 0;
				for( ; i < arr.size(); i++) {
				
					if(arr.get(i).getStuNum() == stuNum) {
						System.out.println("존재하는 아이디(학번)입니다.");
						break;
					}
					
				}
				
				if( i == arr.size()) {
					break;
				}
			}
			
			System.out.println("이름을 입력해주세요");
			name = input.next();
			
			s.setName(name);
			s.setStuNum(stuNum);
			
			arr.add(s);
			
			System.out.println("등록되었습니다.");
	
		}
		
		// 검색
		public void search() {
			System.out.println("이름을 입력해주세요");
			name = input.next();
			
			int i = 0;
			for( ; i < arr.size(); i++) {
				Student st = arr.get(i);
				
				if(st.getName().equals(name)) {
					System.out.println("이름 : " + st.getName());
					System.out.println("아이디(학번) : " + st.getStuNum());
					break;
				}
			}
			
			if( i == arr.size() ) {
				System.out.println("해당 학생은 존재하지 않습니다.");
			}
		}

		// 삭제
		public void delete() {
			System.out.println("삭제할 이름을 입력해주세요");
			name = input.next();
			
			int i = 0;
			for( ; i < arr.size(); i++) {
				Student ss = arr.get(i);
				
				if(ss.getName().equals(name)) {
					arr.remove(i);
					System.out.println("삭제 되었습니다.");
					break;
				}
			}
			
			if( i == arr.size()) {
				System.out.println("해당 학생은 존재하지 않습니다.");
			}
		}
		
		// 수정
		public void modify() {
			
			
			System.out.println("수정할 아이디(학번)을 입력해주세요");
			stuNum = input.nextInt();
			
			int i = 0;
			for( ; i < arr.size(); i++) {
				
				if(arr.get(i).getStuNum() == stuNum) {
					System.out.println("--------------");
					System.out.println("이름 : " + arr.get(i).getName());
					System.out.println("아아디(학번) : " + arr.get(i).getStuNum());
					System.out.println("--------------");
					
					System.out.println("수정할 이름을 입력하세요");
					name = input.next();
				
					Student sm = arr.get(i);
					sm.setName(name);
					
					arr.remove(i);
					arr.add(sm);

					System.out.println("수정되었습니다.");
					
					break;
				}
					
			}
			
			if(i == arr.size()) {
				System.out.println("해당 학생은 존재하지 않습니다.");
			}
		}
		
		// 출력 
		public void print() {
			
			int i = 0;
			for( ; i < arr.size(); i++) {
				Student sp = arr.get(i);
				
				System.out.println("이름 : " + sp.getName());
				System.out.println("아아디(학번) : " + sp.getStuNum());
				System.out.println("--------------");
			}
			
		}
		
}


