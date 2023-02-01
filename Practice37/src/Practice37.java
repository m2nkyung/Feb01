// • 교재 p.203의 예제 프로그램을 다음과 같이 동작하도록 확장하여라

import java.util.Scanner;
public class Practice37 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		Point p = new Point(0, 0);
		Circle c = new Circle(p, 0);
		
		System.out.println("첫번째 원의 정보입니다\n" + c.toString());
		

		System.out.println("두번째 원의 정보를 입력 받습니다.");
		System.out.print("중심좌표 X값을 입력하세요 : ");
		int i = input.nextInt();
		System.out.print("중심좌표 Y값을 입력하세요 : ");
		int j = input.nextInt();
		System.out.print("반지름 값을 입력하세요 : ");
		int k = input.nextInt();
		
		Point p1 = new Point(i, j);
		Circle c1 = new Circle(p1, k);
		
		System.out.println("\n두번째 윈의 정보입니다.\n" + c1.toString());
		
		
		System.out.println("두번째 원의 정보를 입력 받습니다.");
		System.out.print("중심좌표 X값을 입력하세요 : ");
		i = input.nextInt();
		System.out.print("중심좌표 Y값을 입력하세요 : ");
		j = input.nextInt();
		System.out.print("반지름 값을 입력하세요 : ");
		k = input.nextInt();
		
		Point p2 = new Point(i, j);
		Circle c2 = new Circle(p2, k);
		
		System.out.println("\n세번째 윈의 정보입니다.\n" + c2.toString());
		
	}
}