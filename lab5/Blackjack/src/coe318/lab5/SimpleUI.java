package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() { //What the display is
        System.out.println("House holds: " + this.game.getHouseCards().toString());//FIX THIS
        System.out.println("You hold: " + this.game.getYourCards().toString());
    }

  @Override
    public boolean hitMe() {
        System.out.println("Another card? ");//FIX THIS
        String userInput = user.nextLine(); //Checks to see if player wants another hit
        boolean hitCard = false;
        
        if ("Y".equals(userInput) || "y".equals(userInput)) //yes
            hitCard = true;
        else if ("N".equals(userInput) || "n".equals(userInput)) // no
            hitCard = false;
    return hitCard;
    }

  @Override
    public void gameOver() {
        this.display();
        int playerScore = game.score(game.getYourCards());
        int houseScore = game.score(game.getHouseCards());
        System.out.println("Your Score: " + playerScore + " House Score: " + houseScore);
        
        if( (playerScore > houseScore || houseScore > 21) && (playerScore <= 21))
            System.out.println("You win!");
        else
            System.out.println("The House Wins!");
        
        System.out.println("Game over");
}
    
}