package main.java.lesson6.ex3;

public class SiarheiNameException extends Exception{
    @Override
    public String getMessage(){
        return "Don't use Siarhei name";
    }
}
