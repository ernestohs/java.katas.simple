package Katas.Simple;

public class LeapYear {
    public Boolean IsLeapYear(Integer year) {
        return year % 100 == 0 ? year % 400 == 0 : year % 4 == 0;
    }
}
