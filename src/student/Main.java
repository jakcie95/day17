package student;

import java.util.ArrayList;
import java.util.Scanner;


/*
학생관리 프로그램을 만들어 주세요
- 1.학생등록
	- 존재하는 학생이면 존재하는 학생입니다.
	- 동일한 아이디(또는 학번)가입하면 존재하는 아이디(학번)입니다
	- 저장이 완료되면 '등록되었습니다'
-2.학생검색
	- 존재하면 해당 학생 출력
	- 존재하지 않으면 '존재하지 않습니다'
-3.학생삭제
	- 존재하지 않으면 '존재하지 않습니다'
	- 존재하는 학생이면 해당값 삭제
-4.수정
	- 존재하지 않으면 '존재하지 않습니다'
	- 존재한다면 해당 학생의 아이디(학번)을 제외한 나머지값 수정
-5.모든학생 출력
-6.종료

*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		int num;
		while(true) {
			System.out.println("학생관리 프로그램입니다");
			System.out.println("1.등록 2.검색 3.삭제 4.수정 5.출력 6.종료");
			num = sc.nextInt();
			switch(num) {
			case 1 : 
				s.register();
				break;
			case 2 : 
				s.serch();
				break;
			case 3 : 
				s.delete();
				break;
			case 4 : 
				s.modify();
				break;
			case 5 : 
				s.print();
				break;
			case 6 : 
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;
			}
		}

	}

}
