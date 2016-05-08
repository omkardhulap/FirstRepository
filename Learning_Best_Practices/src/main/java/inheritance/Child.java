package inheritance;

public class Child extends Parent {

	static int i=100;
	Child(){
		super(8);
	}
	
	
	/**
	 * Arguments
	 */
	public Child(int j) {
		super(j);
	}


	public  void a(){
		System.out.println("in C");
		try{}finally{}
	}
}
