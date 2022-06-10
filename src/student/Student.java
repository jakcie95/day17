package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	public static ArrayList<Student> arr = new ArrayList<Student>();
	private Scanner sc = new Scanner(System.in);
	private String Name;
	private int StNum;
	
	public void register() {
		Student student = new Student();
		String name;
		int num = 0;
		boolean bool = true;
		while( bool ) {
			System.out.println("학번입력 : ");
			num = sc.nextInt();
			int k=0;
			for(;k<arr.size();k++) {
				if(arr.get(k).getStNum() == num) {
					System.out.println("동일한 학번이 존재합니다.");
					break;
				}
			}
			if(k == arr.size())
				break;
		}
		System.out.println("이름 입력 : ");
		name = sc.next();
		student.setStNum(num);
		student.setName(name);
		System.out.println("정보가 저장되었습니다.");
		arr.add(student);
	}
	public void serch() {
		System.out.println("학번 입력");
		int num =0;
		boolean bool = true;
		while(bool) {
		StNum = sc.nextInt();
		int i =0;
		for(; i < arr.size(); i++) {
			Student s = arr.get(i);
			if(arr.get(i).StNum == StNum) {
				System.out.println("=====학생정보=====");
				System.out.println("이름 : "+s.getName());
				System.out.println("학번 : "+s.getStNum());
				bool = false;
				break;
			}
		}
		if(i == arr.size()) {
			System.out.println("찾는 정보가 없습니다");
		}
		}
	}
	public void delete() {
		boolean bool = true;
		while(bool) {
		System.out.println("삭제할 학번 입력");
		StNum = sc.nextInt();
		int j =0;
		for(;j<arr.size();j++) {
			if(arr.get(j).StNum == StNum) {
				arr.remove(j);
				System.out.println("삭제가 완료되었습니다.");
				bool = false;
				break;
			}
		}
		if(j == arr.size()) {
			System.out.println("찾는 정보가 없습니다");
		}
		}
	}
	public void modify() {
		boolean bool = true;
		while(bool) {
			System.out.println("학번을 입력해 주세요 : ");
			StNum = sc.nextInt();
			int k =0;
			for(;k<arr.size();k++) {
				if(arr.get(k).getStNum() == StNum) {
					System.out.println("수정할 이름을 입력해주세요");
					String name = sc.next();
					Student st = arr.get(k);
					st.setName(name); 
					arr.remove(k); arr.add(st);
					System.out.println("수정되었습니다");
					bool = false;
					break;
				}
			}
			if(k == arr.size())
				System.out.println("해당 학생은 존재하지 않습니다");
		}
		
		
	}
	public void print() {
		for(Student s : arr) {
			System.out.println("학번 : "+s.getStNum());
			System.out.println("이름 : "+s.getName());
			System.out.println("------------");
		}
	}
	
	
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getStNum() {
		return StNum;
	}
	public void setStNum(int stNum) {
		StNum = stNum;
	}
}

	
