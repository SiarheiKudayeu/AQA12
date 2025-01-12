package main.java.lesson6.ex3;

import java.util.Scanner;

public class PersonWithAskName {

    public static void main(String[] args) {
        PersonWithAskName person = new PersonWithAskName();
        try {
            person.askName();
        }catch (SiarheiNameException e){
            e.printStackTrace();
        }
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void witEx(){
        throw new ArithmeticException();
    }

    public void witMyUncheckedEx(){
        throw new UncheckedException();
    }

    public String askName() throws SiarheiNameException {
        System.out.println("Insert our name:");
        String name = new Scanner(System.in).nextLine();
        if (name.equals("Siarhei")) {
            throw new SiarheiNameException();
        }
        return name;
    }
}
