package by.epam.javaBases;

public class CoinComparator {
    public void compareCoins(Coin coin1, Coin coin2){
        double delta = coin1.getDiameter() - coin2.getDiameter();
        if(delta > 0){
            System.out.println("first coin is bigger");
        }else if (delta == 0){
            System.out.println("they equals");
        }else {
            System.out.println("second is bigger on " + -delta);
        }
    }
}
