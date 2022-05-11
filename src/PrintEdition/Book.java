package PrintEdition;

import java.util.Arrays;

public class Book extends PrintEdition{

    public int quantityOfPages, year;
    public String author;
    public String[] pages;

    public Book(String name, int quantityOfPages, int year, String author, String[] pages) {
        super(name);

        this.quantityOfPages = quantityOfPages;
        this.year = year;
        this.author = author;

        this.pages = new String[quantityOfPages + 1];
        this.pages[0] = name + ", " + author;

        pages = Arrays.copyOfRange(pages, 1, pages.length);

    }

    public String getPage(int n) {
        return pages[n];
    }
}
