package Animal;

public class Fish {
	int sizeinFt;
	boolean canEat;
	public static void main (String[] args) {

	Animal fish= new Animal (8,"male");
	System.out.println(fish.gender +"  "+fish.age);
	}

	static void swim() {
		System.out.println("The fish die when they stop swimming");

	}




}
