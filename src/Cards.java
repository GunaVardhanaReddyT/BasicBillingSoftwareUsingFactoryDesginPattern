public class Cards {
    public static billingSoftware getCard(String card) {
        if (card.equals("gold")) {
            return new Gold();
        } else if (card.equals("silver")) {
            return new Silver();
        } else {
            return null;
        }
    }
}
