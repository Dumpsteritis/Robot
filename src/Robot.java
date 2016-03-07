import java.util.*;

public class Robot 
{
	public void lastStep() 
	{	
		String stepYes;
		int batLevel;

		Scanner scanner = new Scanner(System.in);
	}

	public void batPercent() 
	{
		System.out.print("> ");
		System.out.print("Percentage of battery remaining is: ");
	}

	public void takeStep() 
	{
		System.out.println("Should I take a step? (Yes or No?)");
		System.out.print("> ");
	}
	
	public void reCharge()
	{	
		int batLevel;
		System.out.println("I'm running low on juice and am going to automatically recharge");
		batLevel = 100;
		batPercent();
		System.out.println(batLevel);
	}
}
