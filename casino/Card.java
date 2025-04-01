package casino;

public class Card {
    
    public enum Color
    {
        RED, BLACK
    }

    public enum Suit
    {
        HEART, CLUB, DIAMOND, SPADES
    }

    private Color color;
    private Suit suit;
    private int value;

    public Card(Color color, Suit suit, int value)
    {
        this.color = color;
        this.suit = suit;
        this.value = value;
    }

    public Color getColor()
    {
        return color;
    }

    public Suit getSuit()
    {
        return suit;
    }

    public int getValue()
    {
        return value;
    }

    public String toString()
    {
        return color + "-" + suit + "-" + value;
    }
    
}
