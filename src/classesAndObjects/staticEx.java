package classesAndObjects;

class StaticEx {
    {
       this.number = 55;
        System.out.println(this.age);
    }

    {
        System.out.println(this.age);
    }
    static {
        System.out.println(9);

    }
    private int age = 7;
    private int number;

    public int getNumber(){
        System.out.println(number);
        return number;
    }
}


class StaticExMain{
    public static void main(String[] args) {
        StaticEx ex = new StaticEx();
        ex.getNumber();
    }
}
