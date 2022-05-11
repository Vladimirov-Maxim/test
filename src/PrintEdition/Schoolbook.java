package PrintEdition;

public class Schoolbook extends Book{

    public String subject;
    public int grade;

    public Schoolbook(String name, int quantityOfPages, int year, String author, String[] pages, String subject, int grade) {
        super(name, quantityOfPages, year, author, pages);
        this.subject = subject;
        this.grade = grade;
    }
}
