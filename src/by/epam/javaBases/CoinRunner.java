package by.epam.javaBases;

public class CoinRunner {
    public static void main(String[] args) {
        Coin coin1 = new Coin();
        coin1.setDiameter(8);
        Coin coin2 = new Coin();
        coin2.setDiameter(9);
        coin2.setDiameter(-85);
        CoinComparator comparator = new CoinComparator();
        comparator.compareCoins(coin1, coin2);

    }
}
