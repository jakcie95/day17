package day17;

import java.util.ArrayList;

public class Ex05 {
public static void main(String[] args) {
	String[] str = {"111","222","333"};
	//중괄호안의 값이 s에 순차적으로 들어가는 구조
	for(int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
	}
	for(String s : str) {
		System.out.println(s);
	}
	System.out.println("-----------");
	ArrayList<Integer> arr = new ArrayList<Integer>();
	arr.add(111);
	arr.add(2);
	arr.add(333);
	for(int a : arr) {
		System.out.println(a);
	}
	int i =0;
	for(; i< arr.size(); i++) {
		if(arr.get(i) == 2) {
			System.out.println("찾았다");
			break;
		}
	}
		System.out.println("i : "+i);
		System.out.println("arr.size : "+arr.size());
	}
}

