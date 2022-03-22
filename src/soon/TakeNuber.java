package soon;

public class TakeNuber {
    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) throws Exception {
        if(firstNumber<=10 && 1<=firstNumber){
            this.firstNumber = firstNumber;
        }else {
            Exception Exception = new Exception();
            throw Exception;

        }

    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) throws Exception {
        if(secondNumber <= 10 && 1<= secondNumber){
            this.secondNumber = secondNumber;
        }else{
            Exception Exception = new Exception();
            throw Exception;
        }

    }
}
