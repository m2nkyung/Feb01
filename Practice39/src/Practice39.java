//Practice 35를  수정하여  교재에  나와  있는  내용  중에서  5-6번을  완성하라.
import java.util.Scanner;
public class Practice39 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Plane jeju = new Plane();

		System.out.println("제주행 비행기의 정보를 입력하세요");
		System.out.print("식별번호 : ");
		jeju.setId(input.nextInt());
		System.out.print("모델 : ");
		jeju.setModel(input.next());
		System.out.print("승객수 : ");
		jeju.setCapacity(input.nextInt());	
		
		System.out.println("\n제주행 비행기의 값입니다.\n" + jeju.toString());
		System.out.println("현재까지 추가된 비행기는 모두 " + jeju.getPlanes() + "대입니다.");

		
		System.out.println("서울행 비행기의 정보를 입력하세요");
		System.out.print("식별번호 : ");
		int i = input.nextInt();
		System.out.print("모델 : ");
		String s = input.next();
		System.out.print("승객수 : ");
		int j = input.nextInt();
		
		Plane seoul = new Plane(i, s, j);
	
		System.out.println("\n서울행 비행기의 값입니다.\n" + seoul.toString());
		System.out.println("현재까지 추가된 비행기는 모두 " + seoul.getPlanes() + "대입니다.");
	}

}
