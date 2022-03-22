package ch3.Ex_14_3;

public class Date {
    private int date;
    private int month;
    private int year;

    public Date(int date, int month, int year) {
        setMonth(month);
        setDate(date);
        setYear(year);
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if(month == 2){
            if((year % 4) == 0){
                if(date > 0 && date <= 29){
                    this.date = date;
                }else{
                    System.out.println("Date should be in a valid range: 1 - 29");
                }

            }else if((year % 4) != 0){
                if(date > 0 && date <= 28){
                    this.date = date;
                }else{
                    System.out.println("Date should be in a valid range: 1 - 28");
                }
            }
        }else if(month != 2){
            if (date > 0 && date <= 31){
                this.date = date;
            }
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month > 0 && month <= 12){
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0){
            this.year = year;
        }
    }

    public void display(int date, int month, int year){
        System.out.printf("\n%d/%d/%d", date, month, year);
    }
}
