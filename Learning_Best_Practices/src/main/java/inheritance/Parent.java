package inheritance;

public  class Parent {

	static int i=100;

	/**
	 * Arguments
	 */
	public Parent(int j) {
		System.out.println("1>>"+i);
		i=j;
	}
	
	public  void a(){
		System.out.println("in P");
	}

}
