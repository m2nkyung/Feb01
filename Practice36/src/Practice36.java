public class Practice36 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b1 = new Box();
		System.out.println("첫번째 박스입니다.\n" + b1.toString());
		
		Box b2 = new Box();
		b2.setX(30);
		b2.setY(45);
		b2.setZ(53);
		
		b2.fillBox();
		System.out.println("\n두번째 박스입니다.\n" + b2.toString());
		
		Box b3 = new Box(100, 60, 20, true);
		System.out.println("\n세번째 박스입니다.\n" + b3.toString());

	}
}