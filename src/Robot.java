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
		
		while (batLevel > 25)
		{	
			RobotLoop.takeStep();
			stepYes = scanner.nextLine();
			
			if (stepYes.equalsIgnoreCase("Yes")) 
			{
				batLevel -= 25;
				RobotLoop.batPercent();
				System.out.println(batLevel);
			}
			else if(stepYes.equalsIgnoreCase("No")) 
			{
				RobotLoop.batPercent();
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
					RobotLoop.batPercent();
					System.out.println(batLevel);
				}
				else if (stepYes.equalsIgnoreCase("No"))
				{
					RobotLoop.takeStep();
					stepYes = scanner.nextLine();
						
					if (stepYes.equalsIgnoreCase("Yes")) 
					{
						batLevel -= 25;
						RobotLoop.batPercent();
						System.out.println(batLevel);
						System.out.println("I'm going to quickly recharge");
						batLevel= 100;
						RobotLoop.batPercent();
					}
					else if (stepYes.equalsIgnoreCase("No"))
					{
					RobotLoop.batPercent();
					System.out.println(batLevel);
					RobotLoop.takeStep();
					stepYes = scanner.nextLine();
					
					while (batLevel > 25){
						RobotLoop.takeStep();
						stepYes = scanner.nextLine();
						
						if (stepYes.equalsIgnoreCase("Yes")) 
						{
							batLevel -= 25;
							RobotLoop.batPercent();
							System.out.println(batLevel);
						}
						else if(stepYes.equalsIgnoreCase("No")) 
						{
							RobotLoop.batPercent();
							System.out.println(batLevel);
					}
				}
			}
		
			}
		}
	}
}

