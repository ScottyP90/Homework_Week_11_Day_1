public class Caculator {

    private int num1;
    private int num2;

    public Caculator( int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int addNumbers(){
        return num1 + num2;
    }

    public int subtractNumbers(){
        return num1 - num2;
    }

    public int multiplyNumbers(){
        return num1 * num2;
    }

    public double divideNumbers(){
        return num1 / num2;
    }

}
