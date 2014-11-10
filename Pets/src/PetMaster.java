public class PetMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pet myPet = new pet(2);
		myPet.reportAge();
		myPet.eat();
		myPet.sleep();

		fish myFish = new fish(5);
		myFish.reportAge();
		myFish.diveTo(-1);
		myFish.diveTo(10);
		myFish.dive(5);
		myFish.dive(-20);
		myFish.eat();
		myFish.sleep();

		cat myCat = new cat(2);
		myCat.reportAge();
		myCat.climbTo(4);
		myCat.climb(-1);
		myCat.climb(7);
		myCat.climbTo(5);
		myCat.climb(10);
		myCat.climb(-13);
		myCat.eat();
		myCat.sleep();
	}

}
