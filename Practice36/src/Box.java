public class Box {
	private int x;
	private int y;
	private int z;
	
	private boolean empty;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void fillBox() {
		empty = false;
	}

	public void emptyBox() {
		empty = true;
	}
	
	public Box() {
		this(0, 0, 0, true);
	}
	
	public Box(int tmpx, int tmpy, int tmpz, boolean s) {
		setX(tmpx);
		setY(tmpy);
		setZ(tmpz);
		empty = s;
	}
	
	public String toString() {
		String s = "가로 : " + x + "cm\n세로 : " + y + "cm\n높이 : " + z + "cm\n";
		
		if (empty == true) {
			s += "지금 박스는 비어있습니다.";
		} else {
			s += "지금 박스에는 물건이 들어 있습니다.";
		}
		
		return s;
	}
}