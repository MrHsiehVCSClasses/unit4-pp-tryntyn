package u4pp;
/**
* 
*/
import java.util.Scanner;

//import javax.swing.plaf.TreeUI;

public class PalindromeTester {
    /**
    * //
    */
    public static void execute(Scanner sc) {
        boolean yo = true;
        System.out.println("Welcome to Palindrome Tester!");
        while(yo)
        {
            String tt = "";
            
            while(true)
            {
                System.out.println("Enter a phrase: ");
                tt = sc.nextLine();
                if (isPalindrome(tt) == true)
                {
                    System.out.println( tt + " is a palindrome");
                }
                
                else
                {
                    System.out.println( tt + " is not a palindrome");
                }
                break;
            }
            
            System.out.println("Keep testing? (Y)es or (N)o:");
            tt = sc.nextLine();
            while(true)
            {
                
                if (tt.toUpperCase().equals("Y")||tt.toUpperCase().equals("YES"))
                {
                    break;
                }
                else if (tt.toUpperCase().equals("N")||tt.toUpperCase().equals("NO"))
                {
                    System.out.println("Thanks for playing!");
                    break;
                }
                else 
                {
                    System.out.println("Invalid Input");
                    System.out.println("Keep testing? (Y)es or (N)o:");
                    tt = sc.nextLine();
                }
            }
        }
    }      
    
    
    
    
    
    //private static boolean isPalindrome(String tt) {
        // return false;
        // }
        
        
        
        
        
        
        /**
        * // palindrome function = words repeat backwards the same way 
        * @param i 
        * @param phase 
        */
        public static boolean isPalindrome(String phrase)
        
        {
            String phraseReverseString = "";
            String ithLetter;
            boolean here;
            phrase = phrase.replaceAll("[^A-Za-z]+", "");
            phrase = phrase. toLowerCase();
            for(int i=0; i < phrase.length(); i++)
            {
                ithLetter = phrase.substring(i,i+1);
                phraseReverseString = ithLetter + phraseReverseString;
            }
            if (phrase.equals(phraseReverseString))
            {
                here = true;
            }
            else
            {
                here = false; 
            }
            return here;
        }
        
        
        
        
        //boolean hi = true;
        //phrase = clear(phrase);
        //phrase = phrase.toUpperCase();
        
        //if(phrase.length() % 2 == 0)    
        {
            //for(int i = 0; i < phrase.length() / 2; i++);
            {
                //if(!(phrase.substring(i, i+1)).equals(phrase.substring(phrase.length()- i -1, phrase.length()- i)));
                {
                    //hi = false;
                }
            }
        }
        // else if(phrase.length() % 2  != 0)
        {
            //for(int i = 0; i < phrase.length() - 1 / 2; i++)
            {
                //if(!(phrase.substring(i, i+1)).equals(phrase.substring(phrase.length()- i -1, phrase.length() -i)))
                {
                    //hi = false;
                }
            }
        }
        //System.out.print(hi);
        //return hi;
        
        
        
        
        
        
        //private static String clear(String runClear)
        {
            //String inputReturn = "";
            //for(int i = 0; i < runClear.length(); i++)
            {
                // if(!(Character.isLetter(runClear.charAt(i))))
                {
                    //inputReturn += runClear.charAt(i);
                }
            }
            //return inputReturn;
        }
        
        /* Any helper methods you might need */
    }