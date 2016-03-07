import java.util.*;

public class Robot {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		String stepYes;
		stepYes="";
		int batLevel;
		batLevel = 100;
		
		Scanner scanner = new Scanner(System.in);
		
		while (batLevel > 25){
			Robot.takeStep();
			stepYes = scanner.nextLine();
			
			if (stepYes.equalsIgnoreCase("Yes")) 
			{
				batLevel -= 25;
				Robot.batPercent();
				System.out.println(batLevel);
			}
			else if(stepYes.equalsIgnoreCase("No")) 
			{
				Robot.batPercent();
				System.out.println(batLevel);
			}
		}
		
		if (batLevel <= 25)
		{
				System.out.println("Should I recharge myself?");
				System.out.print("> ");
				stepYes = scanner.nextLine();
				
				if (stepYes.equalsIgnoreCase("Yes"))
				{
					batLevel= 100;
					Robot.batPercent();
					System.out.println(batLevel);
				}
				else if (stepYes.equalsIgnoreCase("No"))
				{
					Robot.takeStep();
					stepYes = scanner.nextLine();
						
					if (stepYes.equalsIgnoreCase("Yes")) 
					{
						batLevel -= 25;
						Robot.batPercent();
						System.out.println(batLevel);
						System.out.println("I'm going to quickly recharge");
						batLevel= 100;
						Robot.batPercent();
						System.out.println(batLevel);
					}
					else if (stepYes.equalsIgnoreCase("No"))
					{
					Robot.batPercent();
					System.out.println(batLevel);
					Robot.takeStep();
					stepYes = scanner.nextLine();
				}	
			}
		}
	}
	private static void batPercent() 
		{
		// TODO Auto-generated method stub
		System.out.print("> ");
		System.out.print("Percentage of battery remaining is: ");		
		}

	private static void takeStep() 
		{
		// TODO Auto-generated method stub
		System.out.println("Should I take a step? (Yes or No?)");
		System.out.print("> ");
		}
}


