public class EnumDemo {
    public static void main(String[] args) {

        DaysOfWeek dayOfWeek = DaysOfWeek.SUNDAY;

        int ordinal = dayOfWeek.ordinal();
        System.out.println(ordinal);

        DaysOfWeek[] values = DaysOfWeek.values();
        for (DaysOfWeek d : values) {
            System.out.println(d);
        }

        switch (dayOfWeek) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
            default:
                break;
        }

        DaysOfWeek fromString = DaysOfWeek.valueOf("MONDAY");
        System.out.println(fromString);

        //DaysOfWeek fromStringLowercase = DaysOfWeek.valueOf("Monday");
        //System.out.println(fromString);

        DaysOfWeek fromStringLowercase = DaysOfWeek.valueOf("Monday".toUpperCase());
        System.out.println(fromString);
    }
}
