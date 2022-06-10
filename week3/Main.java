package com.company;

public class Main {

    public static void main(String[] args) {
        Cars car= new Cars("mustang",234,"sdf","qwer");
        Employer emp=new Employer("Suiorkul","Abdykaiymov","+996704857564","suiorcool","fghjk");
        emp.setCars(car);
        Sales sal= new Sales("продажа Мустанга");
        sal.setEmployer(emp);
        sal.getEmployer();
        emp.getCars();

    };

}
