package JUnit.BasicJUnitTest.AdvancePracticeProblems;

public class DateFormatter {

    public static void dateFormat(String inputDate) {
        String[] dateParts = inputDate.split("-");

        String formattedDate = dateParts[2] + "-" + dateParts[1] + "-" + dateParts[0];
        System.out.println(formattedDate);
    }

    public static void main(String[] args) {
        String date = "2014-04-12";
        dateFormat(date);
    }
}
