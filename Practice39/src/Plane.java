public class Plane {
	private int id;
	private String model;
	private int capacity;
	private static int planes = 0;
	
	public Plane(int i, String s, int c) {
		id = i;
		model = s;
		capacity = c;
		planes++;
	}
	
	public Plane() {
		id = 0;
		model = "";
		capacity = 0;
		planes++;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public static int getPlanes() {
		return planes;
	}

	public String toString() {
		return "식별번호 : " + id + "편\n" + "모델 : " + model + "\n승객수 : " + capacity;
	}
}