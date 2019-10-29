package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Scanner;

/*
	문제) 5명의 사람이름을 입력하여 ArrayList에 저장하고 이 중에 '김'씨 성의 이름을 출력하시오.
		입력은 Scanner를 이용하여 입력받는다.
 */
public class T03_ArrayListTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		
		System.out.print("1번째 사람 : ");
		name.add(s.nextLine());
		System.out.print("2번째 사람 : ");
		name.add(s.nextLine());
		System.out.print("3번째 사람 : ");
		name.add(s.nextLine());
		System.out.print("4번째 사람 : ");
		name.add(s.nextLine());
		System.out.print("5번째 사람 : ");
		name.add(s.nextLine());
		
		ArrayList<String> kimsarr = new ArrayList<>();
		for(int i = 0; i < name.size(); i++) {
			String kim;
			if(name.get(i).charAt(0) == '김') {
				kim = name.get(i);
				kimsarr.add(kim);
			}
		}
		System.out.println("------------------");
		System.out.println(kimsarr);
	}
}
