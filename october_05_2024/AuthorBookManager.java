import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Book {
    private int id;
    private String name;
    private int noOfPages;

    public Book(int id, String name, int noOfPages) {
        this.id = id;
        this.name = name;
        this.noOfPages = noOfPages;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    @Override
    public String toString() {
        return "Book ID: " + id + ", Name: " + name + ", No of Pages: " + noOfPages;
    }
}

class Author {
    private int id;
    private String name;
    private String city;
    private Book book;

    public Author(int id, String name, String city, Book book) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Book getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Author ID: " + id + ", Name: " + name + ", City: " + city + ", Book: [" + book.toString() + "]";
    }
}

public class AuthorBookManager {

    public static void main(String[] args) {
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author(1, "Rohit Sharma", "Bansod", new Book(101, "Cricketer", 450)));
        authors.add(new Author(2, "Virat Kohli", "Delhi", new Book(102, "Cricketer", 180)));
        authors.add(new Author(3, "Salman Khan", "Indore", new Book(103, "Bollywood", 315)));
        authors.add(new Author(4, "Sohail Khan", "Karachi", new Book(104, "Bollywood", 256)));

        System.out.println("List of Authors:");
        for (Author author : authors) {
            System.out.println(author);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Author ID to remove: ");
        int authorIdToRemove = scanner.nextInt();

        Iterator<Author> iterator = authors.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Author author = iterator.next();
            if (author.getId() == authorIdToRemove) {
                iterator.remove();
                found = true;
                System.out.println("Author with ID " + authorIdToRemove + " has been removed.");
            }
        }

        if (!found) {
            System.out.println("Author with ID " + authorIdToRemove + " not found.");
        }

        System.out.println("\nUpdated List of Authors:");
        for (Author author : authors) {
            System.out.println(author);
        }

        scanner.close();
    }
}
