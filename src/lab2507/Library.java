package lab2507;
class Book {
    // Private fields
    private String title;
    private String author;
    private boolean isAvailable;
    
    //const
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }
 // Method to issue the book
    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued: " + title);
        } else {
            System.out.println("Book is already issued.");
        }
    }
 // Method to return the book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not issued.");
        }
    }
    
    
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Issued"));
    
    }
}
    
    public class Library {
        public static void main(String[] args) {
           
            Book b1 = new Book("Now", "You");
            Book b2 = new Book("See", "Me");
            
            b1.displayBookInfo();
            b2.displayBookInfo();
            
            b1.issueBook();
            b1.displayBookInfo();

            b1.issueBook();

            b1.returnBook();
            b1.displayBookInfo();


            b1.returnBook();
     }
     }
