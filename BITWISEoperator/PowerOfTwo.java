public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 16;
        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println("Num : " + num + " is a Power Of Two");
        } else {
            System.out.println("Num : " + num + " is not a Power Of Two");
        }

    }

}
