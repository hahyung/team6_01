package team;

import java.util.Scanner;


import ssg.SSG;

import lhh.Hstudent;


public class TeamMain {
	
	public static void main(String[] args) {
		

		SSG ssg = new SSG();

		Hstudent hs = new Hstudent();
		
		Scanner scan = new Scanner(System.in);
		int select;
		
		while(true) {
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
				ssg.MainSSG();
			}else {
				System.exit(0);
			}
		}
	}
}	
