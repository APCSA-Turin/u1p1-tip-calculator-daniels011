package com.example.project;
// I learned how to round from here: https://stackoverflow.com/questions/13210491/math-round-java
public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        double tip = cost * (percent / 100.0);
        tip = Math.round(tip * 100);
        tip /= 100;
        result.append("Total tip: $" + tip + "\n");
        result.append("Total Bill with tip: $" + (cost + tip) + "\n");
        double personCostNoTip = cost / people;
        personCostNoTip = Math.round(personCostNoTip * 100);
        personCostNoTip /= 100;
        result.append("Per person cost before tip: $" + personCostNoTip+ "\n");
        double tipPerPerson = tip / people;
        tipPerPerson = Math.round(tipPerPerson * 100);
        tipPerPerson /= 100;
        result.append("Tip per person: $" + tipPerPerson + "\n");
        double totalPerPerson = (cost * (percent / 100.0) + cost) / people;
        totalPerPerson = Math.round(totalPerPerson * 100);
        totalPerPerson /= 100;
        result.append("Total cost per person: $" + totalPerPerson + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
    //try different values for people, percent, and cost to test your program before running test cases

        int people = 12; 
        int percent = 15;
        double cost = 566.7;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
