package test;
import java.io.*;

public class CatchBlock {
	public static void main(String[] args) {
	  try {
		  int a[] =new int[5];
		  a[5]=20/0;
	   }
	   catch(ArithmeticException e1) {
		   System.out.println("Arithmetic Exception occurs");
	   }
	   catch(ArrayIndexOutOfBoundsException e1) {
		   System.out.println("ArrayIndex0utOfBoundsException" );
	   }
	   catch (Exception e1)
	   {
		   System.out.println("Parent exception occurs");
	}
	   System.out.println("End of try-catch block");
}
}
	