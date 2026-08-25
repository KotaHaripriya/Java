package Problems_on_Switch;

public class Days_of_month {
    public static void main(String[] args) {
        int month = 11;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("Total days : 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Total days : 30");
                break;
            default:System.out.println("Invalid Month");
                break;
        }
}
}
