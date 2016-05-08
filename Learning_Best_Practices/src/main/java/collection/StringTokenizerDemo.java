package collection;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	
		public static void main(String[] args) {
	 
			String str = "This is a, string tokenizer example, created by Kavya.";
			StringTokenizer st = new StringTokenizer(str);
	 
			System.out.println("---- Split by space ------");
			while (st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			}
	 
			System.out.println("---- Split by comma ',' ------");
			StringTokenizer st2 = new StringTokenizer(str, ",");
	 
			while (st2.hasMoreTokens()) {
				System.out.println(st2.nextToken());
			}
		}
	}

