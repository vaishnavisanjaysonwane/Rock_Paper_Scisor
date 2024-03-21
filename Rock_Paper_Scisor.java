import java.util.*;
public class RockPaperScissorGame{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		while(true){
			String []availableMoves={"Rock","Paper","Scissor"};
			String ComputerMove=availableMoves[new Random().nextInt(availableMoves.length)];
			
			System.out.println("Computer has chosen it's move....");
			System.out.println();
			System.out.println("Now it's your turn to choose. Good Luck!");
			System.out.println();
			
			String userMove;
			while(true){
				System.out.println("chose your choice from available choice:'Rock' 'Paper' 'Scissor'");
				System.out.println("enter your chose:");
				userMove=sc.nextLine();
				if(userMove.equals("Rock")||userMove.equals("Paper")||userMove.equals("Scissor")){
					break;
				}
				System.out.println();
				System.out.println("Invalide Moves!!");
				System.out.println("plz enter the moves from available moves..");
				System.out.println();
			}
			System.out.println("Computer chose : "+ComputerMove);
			if(userMove.equals(ComputerMove)){
				System.out.println("Its a tie..");
			}else if(userMove.equals("Rock"))
			{
				if(ComputerMove.equals("Paper")){
					System.out.println("Computer Won!!");
					System.out.println("Better luck next time !!");
				}else if(ComputerMove.equals("Scissor")){
					System.out.println("You Won!!");
					System.out.println("Congratulations..");
				}
			}
			else if(userMove.equals("Paper"))
			{
				if(ComputerMove.equals("Scissor")){
					System.out.println("Computer Won!!");
					System.out.println("Better luck next time !!");
				}else if(ComputerMove.equals("Rock")){
					System.out.println("You Won!!");
					System.out.println("Congratulations..");
				}
			}
			else if(userMove.equals("Scissor"))
			{
				if(ComputerMove.equals("Rock")){
					System.out.println("Computer Won!!");
					System.out.println("Better luck next time !!");
				}else if(ComputerMove.equals("Paper")){
					System.out.println("You Won!!");
					System.out.println("Congratulations..");
				}
			}
			System.out.println();
			String playagain;
			System.out.println("do you want to play again!!");
			while(true){
				System.out.println("enter yes or no :");
				playagain=sc.nextLine();
				if(playagain.equals("Yes")||playagain.equals("No")||playagain.equals("yes")||playagain.equals("no")){
					System.out.println();
					System.out.println("***************************");
					System.out.println();
					break;
				}
				System.out.println();
				System.out.println("Invalid Input");
				System.out.println();
			}
			if(playagain.equals("no") || playagain.equals("No")) {
				break;
			}
		}
	}
}