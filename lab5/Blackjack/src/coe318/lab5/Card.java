package coe318.lab5;

public class Card implements Comparable {
  //Symbolic constants

  public static final int CLUB = 0;
  public static final int DIAMOND = 1;
  public static final int HEART = 2;
  public static final int SPADE = 3;

  boolean cardFace;
  int suitRank;
  int cardSuit;
  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
   * have a rank equal to their number. Jack, Queen, King and Ace have the ranks
   * 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
   */
  public Card(int rank, int suit, boolean faceUp) {
    suitRank = rank;
    cardSuit = suit;
    cardFace = faceUp;
  }

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
    return cardFace; //FIX THIS
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
    cardFace = faceUp;//FIX THIS
  }

  /**
   * @return the rank
   */
  public int getRank() {
    return suitRank; //FIX THIS
  }

  /**
   * @return the suit
   */
  public int getSuit() {
    return cardSuit;//FIX THIS
  }

  @Override
  public boolean equals(Object crd) { // Make sure equal
    if (!(crd instanceof Card)) { //if crd is not an instance of card, will return false, this makes sure that it is.
      return false;
    }
    Card c = (Card) crd;
    if (c.cardSuit == cardSuit && c.suitRank == suitRank)   // makes sure values align before proceeding (true value)
        return true; //FIX THIS
    else
        return false;
  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }

  public int compareTo(Card c) {
    if (this.suitRank < c.suitRank)
        return -1;
    else if (this.suitRank > c.suitRank)    //compares current suitRank to card suit rank and return appropriate value
        return 1; 
    
    
    else if(this.cardSuit > c.cardSuit) //Same as above, but with what suit it is, instead of the rank
        return 1;
    else if(this.cardSuit < c.cardSuit)
        return -1;
    else
        return 0;
}

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() {
    int rank = getRank(); //FIX THIS
        if (rank == 11)
            return ("Jack");
        else if (rank == 12)    //Gives value to "picture" cards
            return ("Queen");
        else if (rank == 13)
            return ("King");
        else if (rank == 14)
            return ("Ace");
        else
            return(Integer.toString(suitRank));
    }

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() {
    int suit = getSuit();
    String suitName = "";
    
    if (suit == 0)
        suitName = " Clubs";    //Applies string name to a suit value (given previously)
    else if (suit == 1)
        suitName = " Diamonds";
    else if (suit == 2)
        suitName = " Hearts";
    else
        suitName = " Spades";
    return(suitName);
          
    }

  public int scoreVal(){
      if(this.suitRank == 14)   //applies score value according to rank of suit
          return 1;
      else if (this.suitRank == 10)
          return 10;
      else
          return this.suitRank;
  }
  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() {
    if (isFaceUp() == false)    //checks face up or not
         return ("?");//FIX THIS
    else
        return("" + getRankString() + "" + getSuitString());
        
  }

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, SPADE, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: "
            + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: "
            + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: "
            + club5.equals(spadeAce));
    System.out.println("club5 equals club5: "
            + club5.equals(club5));
  }
}
