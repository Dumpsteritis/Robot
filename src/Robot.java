import java.util.*;

public class Robot {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String stepYes;
		stepYes="";
		int oneStep;
		int batLevel;
		batLevel = 100;
		int rechargeBat;
		
		Scanner scanner = new Scanner(System.in);
		
		while (batLevel > 25){
			System.out.println("Should I take a step? (Yes or No?)");
			System.out.print("> ");
			stepYes = scanner.nextLine();
			
			if (stepYes.equalsIgnoreCase("Yes")) 
			{
				batLevel -= 25;
				System.out.print("> ");
				System.out.print("Percentage of battery remaining is: ");
				System.out.println(batLevel);	
			}
			else if(stepYes.equalsIgnoreCase("No")) 
			{
				System.out.print("Percentage of battery remaining is: ");
				System.out.println(batLevel);
			}
		}
		if (batLevel == 25)
		{
				System.out.println("Should I recharge myself?");
				System.out.print("> ");
				stepYes = scanner.nextLine();
				
				if (stepYes.equalsIgnoreCase("Yes"))
				{
					batLevel= 100;
					System.out.print("> ");
					System.out.print("Percentage of battery remaining is: ");
					System.out.println(batLevel);
				}
				else if (stepYes.equalsIgnoreCase("No"))
				{
					System.out.println("Should I take a step? (Yes or No?)");
					System.out.print("> ");
					stepYes = scanner.nextLine();
						
					if (stepYes.equalsIgnoreCase("Yes")) 
					{
						batLevel -= 25;
						System.out.print("> ");
						System.out.print("Percentage of battery remaining is: ");
						System.out.println(batLevel);
						System.out.println("I'm going to quickly recharge");
						batLevel= 100;
						System.out.print("> ");
						System.out.print("Percentage of battery remaining is: ");
						System.out.println(batLevel);
					
				}
		else if (stepYes.equalsIgnoreCase("No"))
				{
					System.out.print("Percentage of battery remaining is: ");
					System.out.print(batLevel);
					System.out.println("Should I take a step? (Yes or No?)");
					System.out.print("> ");
					stepYes = scanner.nextLine();
				}
			}
		}
	}
}		
