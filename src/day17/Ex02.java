package day17;

import java.util.ArrayList;

class Test02<E>{//꺾쇠안의 E : 자료형, 클래스 형태만 저장가능 변수 x
	public void sumF(E a, E b) {
		System.out.println(a+","+b);
	}
}
public class Ex02 {
public static void main(String[] args) {
	Test02<String> t = new Test02<>();
	t.sumF("aaa", "bbb");
	Test02<Integer> t01 = new Test02<>();
	t01.sumF(111, 222);
}
}