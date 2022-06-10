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
		// �л����� 
		public void info() {
			
			int num;
			while(true) {
				System.out.println("1. ���");
				System.out.println("2. �˻�");
				System.out.println("3. ����");
				System.out.println("4. ����");
				System.out.println("5. ���");
				System.out.println("6. ����");
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
		
		// ���
		public void register() {
			
			Student s = new Student();
			
			String name;
			int stuNum = 0;
			
			while(true) {
				System.out.println("���̵�(�й�)�� �Է����ּ���");
				stuNum = input.nextInt();
				int i = 0;
				for( ; i < arr.size(); i++) {
				
					if(arr.get(i).getStuNum() == stuNum) {
						System.out.println("�����ϴ� ���̵�(�й�)�Դϴ�.");
						break;
					}
					
				}
				
				if( i == arr.size()) {
					break;
				}
			}
			
			System.out.println("�̸��� �Է����ּ���");
			name = input.next();
			
			s.setName(name);
			s.setStuNum(stuNum);
			
			arr.add(s);
			
			System.out.println("��ϵǾ����ϴ�.");
	
		}
		
		// �˻�
		public void search() {
			System.out.println("�̸��� �Է����ּ���");
			name = input.next();
			
			int i = 0;
			for( ; i < arr.size(); i++) {
				Student st = arr.get(i);
				
				if(st.getName().equals(name)) {
					System.out.println("�̸� : " + st.getName());
					System.out.println("���̵�(�й�) : " + st.getStuNum());
					break;
				}
			}
			
			if( i == arr.size() ) {
				System.out.println("�ش� �л��� �������� �ʽ��ϴ�.");
			}
		}

		// ����
		public void delete() {
			System.out.println("������ �̸��� �Է����ּ���");
			name = input.next();
			
			int i = 0;
			for( ; i < arr.size(); i++) {
				Student ss = arr.get(i);
				
				if(ss.getName().equals(name)) {
					arr.remove(i);
					System.out.println("���� �Ǿ����ϴ�.");
					break;
				}
			}
			
			if( i == arr.size()) {
				System.out.println("�ش� �л��� �������� �ʽ��ϴ�.");
			}
		}
		
		// ����
		public void modify() {
			
			
			System.out.println("������ ���̵�(�й�)�� �Է����ּ���");
			stuNum = input.nextInt();
			
			int i = 0;
			for( ; i < arr.size(); i++) {
				
				if(arr.get(i).getStuNum() == stuNum) {
					System.out.println("--------------");
					System.out.println("�̸� : " + arr.get(i).getName());
					System.out.println("�ƾƵ�(�й�) : " + arr.get(i).getStuNum());
					System.out.println("--------------");
					
					System.out.println("������ �̸��� �Է��ϼ���");
					name = input.next();
				
					Student sm = arr.get(i);
					sm.setName(name);
					
					arr.remove(i);
					arr.add(sm);

					System.out.println("�����Ǿ����ϴ�.");
					
					break;
				}
					
			}
			
			if(i == arr.size()) {
				System.out.println("�ش� �л��� �������� �ʽ��ϴ�.");
			}
		}
		
		// ��� 
		public void print() {
			
			int i = 0;
			for( ; i < arr.size(); i++) {
				Student sp = arr.get(i);
				
				System.out.println("�̸� : " + sp.getName());
				System.out.println("�ƾƵ�(�й�) : " + sp.getStuNum());
				System.out.println("--------------");
			}
			
		}
		
}


