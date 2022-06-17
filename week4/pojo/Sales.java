package week3;

public class Sales {
    public long getId() {
        return id;

    }

    public Sales setId(long id) {
        this.id = id;
        return this;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public Sales setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
        return this;
    }

    private long id;
    private String nameOfCar;

    public Employer getEmployer() {
        return employer;
    }

    public Sales setEmployer(Employer employer) {
        this.employer = employer;
        return this;
    }

    private Employer employer;

    public Sales(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }




}
