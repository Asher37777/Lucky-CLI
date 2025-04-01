package casino;

class Main {

    public static void main(String[] args) {
        Deck deck = new Deck(1);
        for(Card x : deck.getDeck())
        {
            System.out.println(x);
        }
    }
}