package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	public static ArrayList<Student> arr = new ArrayList<Student>();
	private Scanner input = new Scanner(System.in);
	private String name;
	private int stNum;
	private String addr;

	public void info() {
		int num;
		while(true) {
			System.out.println("1.등록");
			System.out.println("2.검색");
			System.out.println("3.삭제");
			System.out.println("4.수정");
			System.out.println("5.모든학생출력");
			System.out.println("6.나가기");
			num = input.nextInt();
			switch (num) {
			case 1:
				register();
				break;
			case 2:
				search();
				break;
			case 3:
				delete();
				break;
			case 4:
				modify();
				break;
			case 5:
				print();
				break;
			case 6:return;
			}
		}
	}
	public void register() {
		Student student = new Student();
		String name, addr;
		int stNum = 0;
		boolean bool = true;
		while( bool ) {
			System.out.println("학번 입력");
			stNum = input.nextInt();
			int k=0;
			for(;k<arr.size();k++) {
				if(arr.get(k).getStNum() == stNum) {
					System.out.println("동일한 학번이 존재합니다");
					break;
				}
			}
			if(k == arr.size())
				break;
		}
		
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("주소 입력");
		addr = input.next();
		
		student.setStNum(stNum);
		student.setName(name);
		student.setAddr(addr);
		
		arr.add(student);
		System.out.println("등록 되었습니다!!!");
	}
	public void search() {
		boolean bool = true;
		while( bool ) {
			System.out.println("검색 학번 입력");
			stNum = input.nextInt();
			int k=0;
			for( ;k<arr.size(); k++) {
				if(arr.get(k).getStNum() == stNum) {
					System.out.println("---학생 정보---");
					System.out.println(arr.get(k).getStNum());
					System.out.println(arr.get(k).getName());
					System.out.println(arr.get(k).getAddr());
					System.out.println("-------------");
					bool = false;
					break;
				}
			}
			if(k == arr.size())
				System.out.println("해당 학생은 존재하지 않습니다");
		}
		
	}
	public void delete() {
		boolean bool = true;
		while( bool ) {
			System.out.println("삭제 학번 입력");
			stNum = input.nextInt();
			int k=0;
			for( ;k<arr.size(); k++) {
				if(arr.get(k).getStNum() == stNum) {
					arr.remove(k);
					System.out.println("삭제 되었습니다");
					bool = false;
					break;
				}
			}
			if(k == arr.size())
				System.out.println("해당 학생은 존재하지 않습니다");
		}
	}
	public void modify() {
		boolean bool = true;
		while( bool ) {
			System.out.println("수정 학번 입력");
			stNum = input.nextInt();
			int k=0;
			for( ;k<arr.size(); k++) {
				if(arr.get(k).getStNum() == stNum) {
					System.out.println("---학생 정보---");
					System.out.println(arr.get(k).getStNum());
					System.out.println(arr.get(k).getName());
					System.out.println(arr.get(k).getAddr());
					System.out.println("-------------");
					System.out.println("수정할 이름 입력");
					String name = input.next();
					System.out.println("수정할 주소 입력");
					String addr = input.next();
					
					Student st = arr.get(k);
					st.setName(name); st.setAddr(addr);
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
			System.out.println("주소 : "+s.getAddr());
			System.out.println("------------");
		}
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
