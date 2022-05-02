public class Programmer {

    public String name, company, position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    public String getPosition() {
        return this.position;
    }

    public void work() {

        if (this.position.equals("intern")) {
            this.position = "junior";
        } else if (this.position.equals("junior")) {
            this.position = "middle";
        } else if (this.position.equals("middle")) {
            this.position = "senior";
        } else if (this.position.equals("senior")) {
            this.position = "lead";
        }

    }

}
