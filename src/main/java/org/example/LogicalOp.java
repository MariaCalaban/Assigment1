package org.example;

public class LogicalOp {
    //ex.4
    public  int checkBiggerNumber(int firstnumber, int secondnumber){
        if(firstnumber > secondnumber)
        return firstnumber;
        else
        return secondnumber;
    }
    //ex.5
    public  String egalitate (String firstname, String Evozon){
        if("firstname"=="Evozon")
            return "Learning text comparison";
        else
            return "Got to try some more";
    }
//ex.6
    public String vremebuna(int cm){
        if(cm > 8 || cm == 6)
            return "The amount of snow this winter was (cm):" + cm;
        else
            return "The forecast snow is (cm): " + cm;
    }

    public void countToHundred(int number){
        for(int i = number ; i<=100 ; i++)
            System.out.println( i);
    }
}
