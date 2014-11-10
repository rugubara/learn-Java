public class cat extends pet {
	private int height;

	public cat(int age) {
		super(age);
		name = "кот";
	}

	public void climbTo(int height) {
		this.height = height;
		System.out.println(this.name + " говорит: я на высоте " + this.height
				+ " метров");
	}
	
	public void climb(int height) {
		this.height = this.height+height;
		System.out.println(this.name + " говорит: я на высоте " + this.height
				+ " метров");
	}
}
