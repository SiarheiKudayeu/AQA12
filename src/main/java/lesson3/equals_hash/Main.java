package main.java.lesson3.equals_hash;

public class Main {
    public static void main(String[] args) {
        Auto renault = new Auto("Renault", 10000, true);
        Auto renault2 = new Auto("Renault", 10000, true);

/*        //==
        System.out.println(15==15);*/
        //equals

        System.out.println("Hash Code for Auto 1" + renault.hashCode());
        System.out.println("Hash Code for Auto 2" + renault2.hashCode());
        System.out.println("=========");
        System.out.println("Link  for Auto 1" + renault);
        System.out.println("Link  for Auto 2" + renault2);
        System.out.println("======");
        System.out.println("Is renault and renault2 equals? - " + renault.equals(renault2));

        renault.setName("Audi");
        System.out.println("===========");
        System.out.println(renault);
        System.out.println(renault2);

        System.out.println("===========");
        System.out.println("Hash Code for Auto 1" + renault.hashCode());
        System.out.println("Hash Code for Auto 2" + renault2.hashCode());
        System.out.println("=========");
        System.out.println("Link  for Auto 1" + renault);
        System.out.println("Link  for Auto 2" + renault2);
        System.out.println(renault.equals(renault2));
    }
}
