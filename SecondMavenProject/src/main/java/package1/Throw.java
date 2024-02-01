package package1;

public class Throw {
	
	public static void validate(int age)
	{
		
		if (age<18){
			
		throw new ArithmeticException("Member is not eligible for votting");
			
		}
		else {
			
			System.out.println("Member is eligible for votting");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		validate(13);

	}

}
