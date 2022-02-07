package u4pp;

/**
* JAVADOC HERE
*/
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

    
    
    
    /**
    * JAVADOC HERE
    */
    public static void play(Scanner sc) {
        System.out.println("Welcome to Rock Paper Scissors!");
        boolean poopoo = true;
        int wins = 0;
        int losses = 0;
        int ties = 0;
        while (poopoo) 
        {
            
            String input = "";
            
            
            while (true)
            {
                
                System.out.println("Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny?");
                input = sc.nextLine();  
                if (input.toUpperCase().equals("R"))
                {
                    System.out.println("Rock");
                    break;
                }
                
                else if (input.toUpperCase().equals("P"))
                {
                    System.out.println("Paper");
                    break;
                }
                
                else if (input.toUpperCase().equals("S"))
                {
                    System.out.println("Scissor");
                    break;

                }
                
                else if (input.toUpperCase().equals("A"))
                {
                    System.out.println("Any");
                    break;
                    
                }
                else 
                {
                    System.out.println("Invalid Input");
                }
              
                
            } // end input while loop

            getRandom ();
            String computerChoice = getRandom ();
            if (input.equals("A"))
            {
                input = getRandom ();
            }
           

            int g = results(input, computerChoice);

           

            //if results(input, computerChoice);
            System.out.print("You picked " + input  + " and the" + " Computer picked " + computerChoice + " You "  + "");
        
            if (g == -1)
            {
                System.out.println("lose");
                losses ++;
            }
            if (g == 0)
            {
                System.out.println("tie");
                ties ++;
            }
            if (g == 1)
            {
                System.out.println("win");
                wins ++;
            }
//print wins and losses here
              System.out.println("You have " +  wins  + " wins and " + losses + " losses and " + ties + " ties");
          
            
            
        
            while(true)
            {
                System.out.println("Would you like to play again? (Y)es or (N)o:");
            input = sc.nextLine();
            if (input.toUpperCase().equals("Y")||input.toUpperCase().equals("YES"))
            {
                break;
            }
            else if (input.toUpperCase().equals("N")||input.toUpperCase().equals("NO"))
            {
                System.out.println("Thanks for playing!");
                poopoo = false;
                break;
            }
            else 
            {
            System.out.println("Invalid Input");
            }
           } 
    
        }
        
    
    
    }
    
    
    
    /**
    * results for the String player and the computer for RPS
    * @parameter the first choice, player 
    * @parameter the second choice, computer
    * @return 1 if player wins, 0 if tie, and -1 if loses
    */
    public static int results(String playerChoice, String computerChoice) {
        if((playerChoice.equals("R") && computerChoice.equals("S")) ||
        (playerChoice.equals("S") && computerChoice.equals("P"))  ||
        (playerChoice.equals("P") && computerChoice.equals("R")))
        {
            return 1;
        }
        else if (playerChoice.equals(computerChoice))
        {
            return 0;
        }  
        else
        {
            return -1;

        }
    }
        public static String getRandom () {
            int r = (int)(Math.random() * 3);
            if (r == 0)
            {
                return "R"; 
            }
            if (r == 1)
            {
                return "P";
            }
            if (r == 2)
            {
                return "S";
            }
            return "";
        }
    
        
    /* any helper methods you might need */
}