// Chapter 5 Game Zone Exercise

public class TwoDice 
{
    public static void main(String[] args)
    {
        // Variables and constants
        Die firstDie = new Die();
        Die secondDie = new Die();
        String outcome;

        // Processing phase
        if(firstDie.getDieValue() > secondDie.getDieValue())
        {
            outcome = "The player wins the game!";
        } // end of initial IF statement
        else
        {
            if(firstDie.getDieValue() < secondDie.getDieValue())
            {
                outcome = "Sorry, the computer has won...";
            } // end of nested IF
            else
            {
                outcome = "We have a tie game!";
            } // end of nested ELSE
        } // end of initial ELSE statement

        // Output phase
        System.out.println("Player die roll is: " + firstDie.getDieValue());
        System.out.println("Computer die roll is: " + secondDie.getDieValue());
        System.out.println(outcome);
    }    
}