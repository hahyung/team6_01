package team;

import java.util.Scanner;

import lhh.Hstudent;

public class TeamMain {
	
	public static void main(String[] args) {
		
		Hstudent hs = new Hstudent();
		
		Scanner scan = new Scanner(System.in);
		int select;
		System.out.println("1.�ֳ����̵�");
		System.out.println("2.�������̵�");
		System.out.println("3.�ռ����̵�");
		System.out.println("4.����");
		System.out.print(">>>> ");
		select = scan.nextInt();
		
		if(select == 1) {
			
		}else if(select == 2) {
			hs.display();
		}else if(select == 3) {
			
		}else {
			System.exit(0);
		}
	}
}	
