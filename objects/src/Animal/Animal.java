package Animal;

public class Animal {
int age;
String gender;
public Animal (int old , String ten) {
	age=old;
	gender=ten;
}
static void isMammal() {
		
}
static void mate() {
	
}

public static void main (String[] args) {
	Animal myObjects=new Animal (8,"male");
	System.out.println(myObjects.age+"  "+ myObjects.gender);
	
}
}
