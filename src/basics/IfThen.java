package basics;

public class IfThen {
    public static void main(String[] args) {
        System.out.println("Hello, Deepak");
        boolean isAlien = false;
        if (!isAlien){
            System.out.println("Its not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("myValuesTotal = " +  myValuesTotal);
        double theReminder  =  myValuesTotal % 40.00d;
        System.out.println("theReminder = "+ theReminder);
        boolean isNoReminder = (theReminder == 0) ? true : false;
        System.out.println("isNoReminder = " + isNoReminder);
        if (!isNoReminder){
            System.out.println("Got some reminder");
        }
    }
}
