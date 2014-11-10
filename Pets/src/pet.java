
public class pet {
	public  String name = "сферический конь в вакууме"; 
	private int age; // возраст в годах
	boolean furry; // лохматость
	float weight; // вес

	public pet(int age) {
		this.age = age;
	}

	public void sleep() {
		System.out.println(this.name + " говорит: ушел спать,спокойной ночи");
	}

	public void eat() {
		System.out.println("спс было очень вкусно");
	}

	public void reportAge() {

		int singles,decimals;
		String reportedAge = "мне "+age+" ";
		
		singles = age % 10;
		decimals = (age / 10) % 10;
		
		if (decimals > 1 || decimals == 0) { // стандартный случай для первого и со второго по девятый десяток
			if (singles > 4 || singles == 0) {
				reportedAge = reportedAge + "лет";
			} else if (singles > 1) {
				reportedAge = reportedAge + "года";
			} else { // т.е. когда singles = 1
				reportedAge = reportedAge + "год";
			}
		} else {
			reportedAge = reportedAge + "лет";			
		}
		
		System.out.println(reportedAge);
		// 1 год
		// 2-4 года  1328
		// 5-20 лет
		// [0,2-9]1 год
		// [0,2-9]2-[2-9]4 года
	}
}
