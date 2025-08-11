package JavaWipro;

public class Encapsulation {
	
	//private fields hidden from outside access
	private String name;
	private int age;
	
	//public getter method for name
	
	public String getName() {
		return name;
	}

	//public setter method for name
	
		public void setName(String name) {
			this.name= name;
		}
		
		//public getter method for age
		
		public int getAge() {
			return age;
		}

		//public setter method for name
		
			public void setAge(int age) {
				this.age= age;
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj= new Encapsulation();
		obj.setAge(23);
		obj.setName("Manisha");
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}
