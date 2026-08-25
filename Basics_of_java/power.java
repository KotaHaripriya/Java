public class power {
    public static void main(String[] args) {
        int base = 4, index = 4, power = 1;
        while (index >= 1) {
            power = power * base;
            index--;
        }
        System.out.println("Power := " + power);
    }

}
