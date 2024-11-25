import java.util.ArrayList;
import java.util.List;

// Media Interface
public interface Media {
    void updatePrice(double newPrice);
    double getPrice();
}

// Book Class
class Book implements Media {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}

// Movie Class
class Movie implements main {
    private String title;
    private String director;
    private double price;

    public Movie(String title, String director, double price) {
        this.title = title;
        this.director = director;
        this.price = price;
    }

    @Override
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}

// LibraryObserver Interface
interface LibraryObserver {
    void updateEvent(LibraryEvent event);
}

// LibraryEvent Class
class LibraryEvent {
    private String eventMessage;

    public LibraryEvent(String eventMessage) {
        this.eventMessage = eventMessage;
    }

    public String getEventMessage() {
        return eventMessage;
    }
}

// Library Class
class Library<T extends main> {
    private List<T> mediaItems = new ArrayList<>();
    private List<LibraryObserver> observers = new ArrayList<>();

    // Add a media item to the library
    public void addMedia(T media) {
        mediaItems.add(media);
        notifyObservers(new LibraryEvent("New media added: " + media.getClass().getSimpleName() + " (" + getMediaTitle(media) + ")"));
    }

    // Update the price of a media item
    public void updateMediaPrice(T media, double newPrice) {
        media.updatePrice(newPrice);
        notifyObservers(new LibraryEvent("Price updated for: " + media.getClass().getSimpleName() + " (" + getMediaTitle(media) + ")"));
    }

    // Add an observer to the library
    public void addObserver(LibraryObserver observer) {
        observers.add(observer);
    }

    // Notify all observers
    private void notifyObservers(LibraryEvent event) {
        for (LibraryObserver observer : observers) {
            observer.updateEvent(event);
        }
    }

    // Helper method to get media title (for better event messages)
    private String getMediaTitle(T media) {
        if (media instanceof Book) {
            return ((Book) media).getTitle();
        } else if (media instanceof Movie) {
            return ((Movie) media).getTitle();
        }
        return "Unknown";
    }
}

// User Class (Observer Implementation)
class User implements LibraryObserver {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void updateEvent(LibraryEvent event) {
        System.out.println(name + " received notification: " + event.getEventMessage());
    }
}

// Main Class for Demonstration
public class Main {
    public static void main(String[] args) {
        // Create a Library
        Library<main> library = new Library<>();

        // Create Users (Observers)
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Add observers to the library
        library.addObserver(user1);
        library.addObserver(user2);

        // Add media to the library
        Book book = new Book("1984", "George Orwell", 15.99);
        Movie movie = new Movie("Inception", "Christopher Nolan", 12.99);

        library.addMedia(book);
        library.addMedia(movie);

        // Update media price
        library.updateMediaPrice(book, 18.99);
    }
}

