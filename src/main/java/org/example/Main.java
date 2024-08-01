package org.example;

public class Main {
    public static void main(String[] args) {
        // Datele personale
        // Nume
        String nume = "Ion Popescu";
        // Vârsta în ani
        int varsta = 30;
        // Înălțimea în centimetri
        int inaltime = 175;
        // Adresa
        String adresa = "Strada Florilor, Nr. 10, București";
        //Greutate
        float greutate = 50.56F;
        //Gen
        String gen = "female,male";
        //Nr telefon
        int numarDeTelefon = 723592769;
        //Angajat
        boolean angajat = true;


        // Afișarea specificatiilor persoanei
        System.out.println("Detalii persoană:");
        System.out.println("Nume: " + nume);
        System.out.println("Vârsta: " + varsta + " ani");
        System.out.println("Înălțimea: " + inaltime + " cm");
        System.out.println("Adresa: " + adresa);

        System.out.println("greutate ");
        System.out.println("gen " + gen);
        System.out.println("numarDeTelefon " + numarDeTelefon);
        System.out.println("angajat " + angajat);

        Calculator calculator = new Calculator();
        LogicalOp op = new LogicalOp();

        System.out.println("Addition: " + calculator.addition(3,5));
        System.out.println("Substraction: " + calculator.subtraction(10,7));
        System.out.println("Division: " + calculator.Division(9,3));
        System.out.println("Multiplication: " + calculator.multiplication(3,6));


        System.out.println("Numarul mai mare este: " + op.checkBiggerNumber(3,6));
        System.out.println("Raspunsulcorect este: " +op.egalitate("asta e","Evozon"));
        System.out.println("Vremea este: " + op.vremebuna(5));

        op.countToHundred(50);
    }

}

