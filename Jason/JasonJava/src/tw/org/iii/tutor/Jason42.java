package tw.org.iii.tutor;

public class Jason42 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int[] c = {1, 2, 3, 4};
		
		try {
			System.out.println(a / b);	
			System.out.println(c[4]);
		}catch (ArithmeticException ae) {
			System.out.println("Oops!");
		}catch (ArrayIndexOutOfBoundsException ee) {
			System.out.println("not much!");
		}catch (RuntimeException re) {
			System.out.println("Oops!");
		}
		
		
//		try {
//						
//		}catch (ArrayIndexOutOfBoundsException ie) {
//			System.out.println("not much!");
//		}
		System.out.println("OK!");
	}

}
