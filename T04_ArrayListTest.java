package kr.or.ddit.basic;

/*
	문제1) 5명의 별명을 입력하여 ArratList에 저장하고 별명의 길이가 제일 긴 별명을 출력하시오.
		(별명의 길이는 모두 다르게 입력한다.)
	문제2) 문제 1에서 별명의 길이가 같은 것을 여러개 입력했을때도 출력되도록 처리하시오.
 */
public class T04_ArrayListTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> nick = new ArrayList<>();
		System.out.print("1번째 별명 : ");
		nick.add(s.nextLine());
		System.out.print("2번째 별명 : ");
		nick.add(s.nextLine());
		System.out.print("3번째 별명 : ");
		nick.add(s.nextLine());
		System.out.print("4번째 별명 : ");
		nick.add(s.nextLine());
		System.out.print("5번째 별명 : ");
		nick.add(s.nextLine());
		
		ArrayList<String> longnickarr = new ArrayList<>();
		String longnick = nick.get(0);
		for(int i = 1; i < nick.size(); i++) {
			 if(longnick.length() < nick.get(i).length()) {
				 longnick = nick.get(i);
			 }
		}
		for(int i = 0; i < nick.size(); i++) {
			if(longnick.length() == nick.get(i).length()) {
				longnickarr.add(nick.get(i));
			}
		}
		System.out.println(longnickarr);
	}
}
