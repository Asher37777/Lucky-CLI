package casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Deck {

    private Stack<Card> deck;
    private int numDecks;

    public Deck(int numDecks)
    {
        this.numDecks = numDecks;
        this.shuffle();
    }

    private void initDeck(int numDecks)
    {
        deck = new Stack<>();

        for(int i = 0; i < numDecks; i++)
        {
            Card.Color color = Card.Color.BLACK;
            Card.Suit suit = Card.Suit.SPADES;
            for(int j = 1; j < 14; j++)
            {
                deck.push(new Card(color,suit,j));
            }

            suit = Card.Suit.CLUB;
            for(int j = 1; j < 14; j++)
            {
                deck.push(new Card(color,suit,j));
            }

            suit = Card.Suit.HEART;
            color = Card.Color.RED;
            for(int j = 1; j < 14; j++)
            {
                deck.push(new Card(color,suit,j));
            }

            suit = Card.Suit.DIAMOND;
            for(int j = 1; j < 14; j++)
            {
                deck.push(new Card(color,suit,j));
            }

        }

        
    }

    public void shuffle()
    {
        initDeck(numDecks);
        Collections.shuffle(deck);
    }

    public Stack<Card> getDeck()
    {
        return deck;
    }
    
}
