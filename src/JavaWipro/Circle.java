package JavaWipro;

public class Circle implements CircleShape{
	
	//method from Interface Shape
	public void draw() {
		System.out.println("Drawing Circle");
	}
		
	//method from CircleShape
		public void radius() {
			 System.out.println("Rdius is 5 units");
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c=new Circle();
c.draw();
c.radius();
	}

}
