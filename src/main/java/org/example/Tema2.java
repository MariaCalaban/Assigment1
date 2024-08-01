package org.example;

public class Tema2 {
    public static void main(String[] args) {
        printName();
        printAddition();
        printDivision();
        printOperations();
        System.out.println("Suma nuemrelor este: "+ add(2,3));
        System.out.println("Diferenta numerelor este: " + subtraction(10,5));
        System.out.println("Inmultirea numerelor este: " +multiplication(2,8));
        System.out.println("Impartirea numerelor este: " + division(10,2));
        System.out.println("Media aritmetica este: " + average(2,5,6));
        System.out.println("Restul impartirii este: " + remainder(15,4));
        System.out.println("Temperatura in Celsius este: " + conversion(89) + " C ");
        System.out.println("Lungimea in metri este: " + transform(899) + " m ");
//        System.out.println("Viteza m/sec: " + speed);



    }
    public static void printName(){
        System.out.println("Hello");
        String nume = "Maria Calaban";
        System.out.println(nume);

    }
    public static void printAddition(){
        int a = 2;
        int b = 3;
        System.out.println(a+b);
    }
    public static void printDivision(){
        double a = 5.0;
        double b = 2.0;
        System.out.println(a/b);
    }
    public static void printOperations(){
        // ex 4.a
        int a = -5;
        int b = 8;
        int c = 6;
        System.out.println((a+b*c));



        //ex.4.b
        int x = 55;
        int y = 9;
        int z = 9;
        System.out.println((x + y) % z);

        //4.c
        int numara = 20;
        int numarb = -3;
        int numarc = 5;
        int numard = 8;
        System.out.println(numara + numarb * numarc/numard);

        // 4.d
        int numarA = 5;
        int numarB = 15;
        int numarC = 3;
        int numarD = 2;
        int numarE= 8%3;
        System.out.println(numarA+ numarB / numarC * numarD - numarE);


    }
    // ex.2
           public static int add(int a, int b){
            int result = a+b;
            return result;
        }
      public static int subtraction(int a, int b){
        int result = a-b;
        return result;
    }
    public static int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }
    public static int division(int a, int b){
        int result = a/b;
        return result;
    }
    // ex.3
    public static int average(int a, int b, int c){
        int result = (a+b+c)/3;
        return result;
    }
    // ex.4
    public static int remainder(int a, int b){
        int remainder = a%b;
        return remainder;
    }
    //ex.5

    public static double conversion(int a){
         double fahrenheitInCelsius = ((a -32)*5)/9;
         return fahrenheitInCelsius;
    }
    // ex.6
    public static float transform(int a){
        float inchesInMeters =  (float) (a/39.370);
        return inchesInMeters;
    }
     // ex.7
    /*public static void speed(double distance, int hour, int min, int sec){
            int timeInSeconds = hour  3600 + min  60 + sec;
            double mPerSec = distance / timeInSeconds;
            double kmPerSec = mPerSec * 3.6;
            double milePerHour = 1609 * distance;

    }*/
}

