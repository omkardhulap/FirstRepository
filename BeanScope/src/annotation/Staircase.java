
package annotation;
/**
 * Author : Omkar Dhulap 29-Apr-2016
 */
public class Staircase {

	/**
	 * Description :
	 * Input :
	 * Output :
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staircase str = new Staircase();
		try {
			str.test(6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Description :
	 * Input :
	 * Output :
	 * @throws Exception 
	 */
	private void test(int n) throws Exception {
		
		StringBuffer bf = new StringBuffer();
		if(n< 1 || n > 100)
			throw new Exception("Invalid N");
		
		for(int i=0;i<n ;i++){
			for(int j=0;j<n;j++){
				if(i<(n-1)&& j<(n-1)){
					bf.append("_");
				}else{
					bf.append("#");
				}
				bf.append("\n");
				System.out.println(bf.toString());
			}
		}
	}
	
private void test2(int n) throws Exception {
		
		StringBuffer bf = new StringBuffer();
		if(n< 1 || n > 100)
			throw new Exception("Invalid N");
		
		for(int i=0;i<n ;i++){
			for(int j=0;j<n;j++){
				if(i<(n-1)&& j<(n-1)){
					bf.append("_");
				}else{
					bf.append("#");
				}
				bf.append("\n");
				System.out.println(bf.toString());
			}
		}
	}

}



