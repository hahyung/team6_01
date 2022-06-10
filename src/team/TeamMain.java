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
		System.out.println("학생관리프로그램");
		
		boolean run = true;
		
		
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
