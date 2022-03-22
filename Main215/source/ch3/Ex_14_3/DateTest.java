package ch3.Ex_14_3;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(29, 2, 2003);
        Date date2 = new Date(22, 4, 2012);
        Date date3 = new Date(9, 10, 2001);

        date1.display(date1.getMonth(), date1.getDate(), date1.getYear());
        date2.display(date2.getMonth(), date2.getDate(), date2.getYear());
        date3.display(date3.getMonth(), date3.getDate(), date3.getYear());
    }
}
