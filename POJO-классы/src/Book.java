public class Book {
    private final String name;
    private final String author;
    private final int numberPages;
    private final int isbn;

    public Book(String name, String author, int numberPages, int isbn) {
        this.name = name;
        this.author = author;
        this.numberPages = numberPages;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public int getIsbn() {
        return isbn;
    }
}
