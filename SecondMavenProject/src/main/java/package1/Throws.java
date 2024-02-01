package package1;

public class Throws {

	public static void divide(int n) throws ArithmeticException{
		
		float f= n/0;
		System.out.println("Value is " + f);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		divide(5);
	}catch (ArithmeticException e){
		
		System.out.println("Arithmetic Exception " + e);
		
	}
	}

}
