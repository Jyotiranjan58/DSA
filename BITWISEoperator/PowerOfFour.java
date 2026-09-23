public class PowerOfFour {
    public static void main(String[] args) {
        int n = 8;
        int num = n;
        while (num > 1 && num % 4 == 0) {
            num = num / 4;
        }
        if (num == 1) {
            System.out.println("It is a power of four");
        } else {
            System.out.println("it is not a power of four");
        }
    }

}
