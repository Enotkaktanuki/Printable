public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        Magazine magazine = new Magazine();

        Printable[] printable = new Printable[]{book,magazine};

        for (Printable printable1:printable) {
            printable1.print();
        }
    }
}