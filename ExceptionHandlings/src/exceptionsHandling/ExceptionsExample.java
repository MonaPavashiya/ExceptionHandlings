package exceptionsHandling;

public class ExceptionsExample 
{

	public static void main(String[] args) 
	{
		System.out.println("Started");
		
		//Thread.sleep(4000);  //checked exception or Interrupted exception
		
		int i =10;
		System.out.println((i/0));//Unchecked exception or arithmetic exception
		
		System.out.println("Stopped");
	}

}
