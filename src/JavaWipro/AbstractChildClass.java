package JavaWipro;

public class AbstractChildClass extends AbstractClasseg {

	@Override
	void makesound() {
		System.out.println("Animak makes sound");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChildClass s= new AbstractChildClass();
		s.eat();
		s.makesound();
		System.out.println(animalName);
	}

}
