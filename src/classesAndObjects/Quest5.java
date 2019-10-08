package classesAndObjects;

public class Quest5{
    public Quest5 () {}
    public Quest5 (int i) {this (i, i);}
    public Quest5 (int i, int j) {this ();}

    public static void main (String [] args) {
        Quest5 q = new Quest5 (2,3); //1
    }
}
