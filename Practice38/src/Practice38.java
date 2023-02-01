// (클래스간의 has-a 관계) 영화를 나타내는 Movie이라는 이름의 클래스를 설계하여라.

import java.util.Scanner;
public class Practice38 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Movie m = new Movie();
		System.out.println("디폴트 영화의 정보입니다.");
		System.out.println(m.toString());
		
		Movie m2 = new Movie();
		System.out.println("영화 정보를 입력하세요");
		
		System.out.print("영화 제목은? ");
		m2.setTitle(input.next());
		System.out.print("영화 감독은? ");
		m2.setDirector(input.next());
		System.out.print("관람년도는? ");
		int y = input.nextInt();
		System.out.print("관람월은? ");
		int mo = input.nextInt();
		System.out.print("관람일은? ");
		int d = input.nextInt();
		
		Date movieDate = new Date(y, mo, d);
		m2.setDate(movieDate);
		
		System.out.println("입력한 영화의 정보입니다.");
		System.out.println(m2.toString());
	}
}