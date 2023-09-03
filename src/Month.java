public class Month {


    public static int getDaysInMonth(int monthNumber) {
        int days;

        switch (monthNumber) {
            case 1: // січень
            case 3: // березень
            case 5: // травень
            case 7: // липень
            case 8: // серпень
            case 10: // жовтень
            case 12: // грудень
                days = 31;
                break;
            case 4: // квітень
            case 6: // червень
            case 9: // вересень
            case 11: // листопад
                days = 30;
                break;
            case 2: // лютий
                days = 28; // або 29 у високосному році
                break;
            default:
                days = -1; // Невірний номер місяця
                break;
        }

        return days;
    }

    public static void main(String[] args) {
        int monthNumber = 1;
        int daysInMonth = getDaysInMonth(monthNumber);
        System.out.println("Кількість днів " + monthNumber + ": " + daysInMonth);

    }
}

