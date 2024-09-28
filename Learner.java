package Azibuye.co.za;

public class Learner {
    String name;
    Long grade;
    String email;

    public Learner(String learnerName, Long learnerGrade, String learnerEmail){
        name = learnerName;
        grade = learnerGrade;
        email = learnerEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
