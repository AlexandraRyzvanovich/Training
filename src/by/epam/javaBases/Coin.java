package by.epam.javaBases;

public class Coin {
    private double diameter;
    private double weight;

    public double getDiameter(){
        return diameter;
    }

    public void setDiameter(double diameter){
        if(diameter > 0) {
            this.diameter = diameter;
        }else {
            System.out.println("negative diameter");
        }
    }
    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        if(weight > 0) {
            this.weight = weight;
        }else {
            System.out.println("negative weight");
        }
    }
}
