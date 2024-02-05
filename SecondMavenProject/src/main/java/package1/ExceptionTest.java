package package1;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Null pointer Exception
		
		String s= null;
		try {
			System.out.println(s.charAt(0));
		}catch(Exception e) {
			System.out.println("There is no value in the string " + e);
		}
					
		// Arraybound Exception
		
		int a[] = {1,2,3,4,5};	
		try {
		System.out.println(a[7]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array length is 5 " + e);			
		}
		
		// Arithmetic exception		
			int n = 2;
		try {
			System.out.println(n/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Division by zero not possible " +e);
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
			finally {
				
				System.out.println("Final Block");
			}
			
	}

}
