package ro.mirodone;


public class Main {

    public static void main(String[] args) {

        NextSquare nextSquare = new NextSquare();
        double sqrt = nextSquare.findNextSquare(9);
        System.out.println(sqrt);

    }


}