package Animal;

public class Duck {
	String beakColor="yellow";
	public static void main (String[] args) {
		Animal Duck= new Animal (9,"male");
		System.out.println(Duck.gender +"  "+Duck.age);
	}
	static void swim() {
		
		System.out.println("The duck can live by swimming");

	}
	static void quack() {
		System.out.println("Ducks have a quack");

	}

}
