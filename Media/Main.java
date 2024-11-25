
public class Main {

    public static void main(String[] args) {
        Book book = new Book("Book One", 50.0);
        System.out.println("Price of book: " + book.getPrice());
        book.updatePrice(100);
        System.out.println("Updated price of book: " + book.getPrice());

        Book book1 = new Book("Book Two", 60.0);
        System.out.println("Price of book: " + book1.getPrice());
        book1.updatePrice(200);
        System.out.println("Updated price of book: " + book1.getPrice());

        Book book2 = new Book("Book Three", 70.0);
        System.out.println("Price of book: " + book2.getPrice());
        book2.updatePrice(300);
        System.out.println("Updated price of book: " + book2.getPrice());

        Book book3 = new Book("Book Four", 80.0);
        System.out.println("Price of book: " + book3.getPrice());
        book3.updatePrice(400);
        System.out.println("Updated price of book: " + book3.getPrice());

        Book book4 = new Book("Book Five", 90.0);
        System.out.println("Price of book: " + book4.getPrice());
        book4.updatePrice(500);
        System.out.println("Updated price of book: " + book4.getPrice());
    }

    class Media {

        private double price;

        public Media(double price) {
            this.price = price;
        }

        public void updatePrice(double newPrice) {

            this.price = newPrice;
        }

        public double getPrice() {
            return price;
        }
    }

    public static class Book extends Media {
        private String name;
        private double price;

        public Book(String name, double price) {
         super(price);
        this.name = name;
        }
    }

    public class Movie {

        private String name;
        private double price;

        public Movie(String name, double price) {
            this.name = name;
            this.price = price;

        }
    }
}
