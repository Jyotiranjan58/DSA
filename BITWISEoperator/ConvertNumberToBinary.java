public class ConvertNumberToBinary {
    public static void main(String[] args) {
        int num = 82989;
        String binary = "";
        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }
        System.out.println(binary);
    }
}
