package om;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Testclass {

	public static final int[] A1 = { 1, 2, 3, 4 };
	public static final int[] A11 = { 1, 2, 3, 4 };

	private static final Integer[] A2 = { 1, 2, 3, 4 };
	
	int i = 100;
	public static double j;
	public static final double k=1892345.923;

	public static boolean d1;
	public static Boolean d2;
	
	public static enum Seasons {SP,SU,FA,HO,G};

	public static List<Integer> L1 = null;

	public static final BigDecimal B1 = new BigDecimal('A');

	public static final BigInteger B2 = null;
	public static final List<Integer> A2_pub = Collections
			.unmodifiableList(Arrays.asList(getA2()));

	public static FileInputStream fis = null;
	public static FileReader fir = null;

	public static final Integer[] items() {
		return A2.clone();
	}

	public static Integer[] getA2() {
		return A2;
	}

	public static int readMyFile() {
		try {
			/*fis = new FileInputStream(
					"C:\\Users\\Omkar\\Documents\\Omkar\\copyright.txt");
			return fis.read();*/
			
			fir = new FileReader("C:\\Users\\Omkar\\Documents\\Omkar\\copyright.txt");
			Scanner scanner = new Scanner(fir);
			System.out.println((scanner.findInLine("o")!=null)?(scanner.next()):null);
		} catch (FileNotFoundException e) {
			System.out.println("got exception in readMyFile() 1");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("got exception in readMyFile() 2");
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * Description :
	 * Input :
	 * Output :
	 */
	public static int readMyFilethru() {
		return Testclass.readMyFile();
	}
	
	static void compare(int a, int b){
		assert(a!=0) && (b != 0);
		assert (a>b);
	}
	
}
