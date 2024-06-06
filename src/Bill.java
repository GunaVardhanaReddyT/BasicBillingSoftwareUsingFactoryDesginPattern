public class Bill {
    public static void main(String[] args) {
        String card = "gold";
        double cost = 1000.00;
        billingSoftware cards = Cards.getCard(card);
        double discAm = cards.discount(cost);
        double totalFirstTimeCost = Gold.cost + discAm;
        System.out.println("Original cost: " + cost);
        System.out.println("Discounted cost: " + discAm);
        System.out.println("Total First Time cost (for gold) = "+totalFirstTimeCost);
    }
}
