/**
 * Author : Omkar
 */
package utility;

class NestedTryExample{
	public static void main(String argx[]){
	try{
	int a=argx.length;
	System.out.println(a);
	int b=20/a;
	System.out.println("a="+a);
	try {
	if(a==1){
	a=a/(a-a); }
	if(a==2){
	int c[]={1};
	c[22]=99; } }
	catch(ArrayIndexOutOfBoundsException oe){
	System.out.println("Array index out of bounds");
	} }
	catch(ArithmeticException ae){
	System.out.println("Divide by 0");
	} } }