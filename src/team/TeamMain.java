package team;

import java.util.ArrayList;
import java.util.Scanner;
class StInfo{
	private String name;
	private int id;
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
}
public class TeamMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<StInfo> st = new ArrayList<StInfo>();
		System.out.println("�л��������α׷�");
		
		boolean run = true;
		
		
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
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			
			}
		}
	}
	
	
	
}	
