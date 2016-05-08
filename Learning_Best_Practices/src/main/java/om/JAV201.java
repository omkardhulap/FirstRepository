/**
 * Author : Omkar
 */
package om;

public class JAV201 {

	/**
	 * Description :
	 * Input :
	 * Output :
	 */
	public static void main(String[] args) {
		System.out.println("Hi");
		//		test1();
//		test2();
		test3();
	}
	
	private static void test3(){
		outer:for (int i=0;i<5;i++){
			inner:for (int j=0;j<5;j++){
				if(j==2)break outer;
			}
	System.out.println("came out of inner");
		}
	System.out.println("came out of outer");
	}
	
	private static void test2(){
//		int[] array;
		int[] array = new int[1];
		System.out.println("Print something");
//		array = new int[2];
		System.out.println("array size>>"+ array.length);
		System.out.println("array size>>"+ array.getClass().hashCode());
		
	}
	
	private void test1(){
		int i=10;
		int j=0;
		try{
			while(i<12){
				System.out.println("hello"+j);
				j++;
				if(j==99){
					break;
				}
			}
		}catch(Exception e){
			System.out.println("Exception >> "+ e);
		}

	}

}
