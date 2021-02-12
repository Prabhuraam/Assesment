package assesment;

public class AnimalTest {
public class Animal{
	public void walk() {
		System.out.println("I am walking");
	}
}
public class Bird extends Animal{
	public void fly() {
		System.out.println("I am flying");
	}
}
AnimalTest(){
	Bird b=new Bird();
	b.walk();
	b.fly();
}
public static void main(String args[]) {
	AnimalTest t=new AnimalTest();
}
}