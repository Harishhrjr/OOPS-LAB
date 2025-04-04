class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        setTitle(title);
        setAuthor(author);
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Title cannot be empty.");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (!author.trim().isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Author cannot be empty.");
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", "123-456-789");
        book.displayBookDetails();
        book.setTitle("Animal Farm");
        book.setAuthor("George Orwell");
        book.displayBookDetails();
    }
}
