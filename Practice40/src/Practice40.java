import java.util.Scanner;
public class Practice40 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Date d1 = new Date();
		System.out.println("첫번째 날짜를 입력하세요");
		System.out.print("년도 : ");
		d1.setYear(input.nextInt());
		System.out.print("월 : ");
		d1.setMonth(input.nextInt());
		System.out.print("일 : ");
		d1.setDay(input.nextInt());
		
		System.out.println("두번째 날짜를 입력하세요");
		System.out.print("년도 : ");
		int i = input.nextInt();
		System.out.print("월 : ");
		int j = input.nextInt();
		System.out.print("일 : ");
		int k = input.nextInt();
		
		Date d2 = new Date(i, j, k);
		
		if(d1.compareDate(d1, d2) == -1) {
			System.out.println("첫번째 날짜인 " + d1.toString() + "이 앞선 날짜입니다.");
		} else if (d1.compareDate(d1, d2) == 1) {
			System.out.println("두번째 날짜인 " + d2.toString() + "이 앞선 날짜입니다.");
		} else {
			System.out.println("두 날짜는 같은 날짜입니다.");
		}
	}
}
