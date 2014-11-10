public class fish extends pet {
	 
	private int depth;// глубина

	public fish(int age) {
		super(age);
		name = "рыба";
	}

	public void sleep() {
		System.out.println(this.name + " : ушел спать,спокойной ночи");
	}
	
	public void diveTo(int depth) { // занять глубину
		this.depth = depth;
		checkDepth();
		System.out.println(this.name + " : Я на глубине " + this.depth + " метров");
	}
	
	public void dive(int depth) { // изменить глубину
		this.depth =this.depth+depth;
		checkDepth();
		System.out.println(this.name + " : Я на глубине " + this.depth + " метров");
	}
	
	private void checkDepth() {
		if (this.depth < 0) {
			this.depth = 0;
			System.out.println(this.name + " : летать не умею :-(");
		}
	}
}
