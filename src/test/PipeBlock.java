package test;

public class PipeBlock {

	public static void main(String[] args) {
		
		 try {
			  int a[] =new int[4];
			  System.out.println(a[7]);
		   }
		   catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) 
			   
		   {
			   System.out.println("Code is" +e);
		}
		   System.out.println("End of try-catch block");

	}

}
