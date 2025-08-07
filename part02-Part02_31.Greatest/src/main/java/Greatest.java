
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int big1 = Math.max(number1, number2);
        int biggest = Math.max(big1, number3);
        return biggest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
