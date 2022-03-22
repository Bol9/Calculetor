package soon;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        TakeNuber takeNuber = new TakeNuber();
        String[] rimNumber = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        Operation fourOperation = new Operation();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First Number");
        String firstNumEnter = scanner.next();

        String secondRim = null;

        int firstNum = 0;
        int secondNum = 0;
        boolean arabRimChecker = true;
        if (firstNumEnter.matches("[+-]?\\d*(\\.\\d+)?")) {// san san emes ekenin teksheret
            firstNum =Integer.parseInt(firstNumEnter);
            takeNuber.setFirstNumber(firstNum);
            System.out.println("Enter your Second Number");
            secondNum = scanner.nextInt();
            takeNuber.setSecondNumber(secondNum); // teksherip atat 1 menen 10 dun arasyndaby?


        } else {
            arabRimChecker =false;
            for (int i = 0; i < rimNumber.length; i++) {
                if(rimNumber[i].equals(firstNumEnter)){
                    firstNum = i+1;
                    System.out.println("Enter your Second Number");

                          secondRim  = scanner.next();
                    for (int j = 0; j < rimNumber.length; j++) {
                        if(rimNumber[j].equals(secondRim)){
                            secondNum = j+1;
                            break;
                        }else if(j== rimNumber.length-1){
                            throw new Exception("Rim sanynyn 1 den 10 go cheiin kiriniz");
                        }

                    }


                    break;
                }else if(i== rimNumber.length-1){
                    throw new Exception("Rim sanynyn 1 den 10 go cheiin kiriniz");
                }

            }
            //rim sany
        }









//        System.out.println(firstNum);
//        System.out.println(secondNum);
//        System.out.println(arabRimChecker);
        
        
        
        
        System.out.println("Chose your Operation !? (+, -, *, / )");
        String operation = scanner.next();

        switch (operation){
            case "+":
                if(arabRimChecker==true){
                    System.out.println(firstNum+operation+secondNum+" = "+ fourOperation.add(firstNum,secondNum));
                }else{
                    System.out.println(firstNumEnter+operation+
                            secondRim + " = " +RomenConverter.rimNumberCoverter(fourOperation.add(firstNum,secondNum)));
                    }


                break;
            case "-":
                if(arabRimChecker==true){
                    System.out.println(firstNum+operation+secondNum+" = "+ fourOperation.minus(firstNum,secondNum));
                }else{
                    if(fourOperation.minus(firstNum,secondNum)<=0){
                        System.out.println("Romen number can not be negativ and 0");
                    }else{
                        System.out.println(firstNumEnter+operation+
                                secondRim + " = " +RomenConverter.rimNumberCoverter(fourOperation.minus(firstNum,secondNum)));
                    }

                }
                break;
            case "*":
                if(arabRimChecker==true){
                    System.out.println(firstNum+operation+secondNum+" = "+ fourOperation.multiply(firstNum,secondNum));
                }else{
                    System.out.println(firstNumEnter+operation+
                            secondRim + " = " +RomenConverter.rimNumberCoverter(fourOperation.multiply(firstNum,secondNum)));
                    }


                break;
            case "/":
                if(arabRimChecker==true){
                    System.out.println(firstNum+operation+secondNum+" = "+ fourOperation.divide(firstNum,secondNum));
                }else{
                    System.out.println(firstNumEnter+operation+
                            secondRim + " = " +RomenConverter.rimNumberCoverter(fourOperation.divide(firstNum,secondNum)));
                    }


                break;
            default:
                throw new Exception("chose correct operation!");


        }


    }
}