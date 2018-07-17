import java.util.Comparator;

public class HW_21_1_Comparator implements Comparator<HW_21_1_Book> {

    @Override
    public int compare(HW_21_1_Book first, HW_21_1_Book second) {
        double firstPrice = first.getPrice();
        double secondPrice = second.getPrice();

        int firstYearPublished = first.getYear();
        int secondYearPublished = second.getYear();

        if (firstPrice < secondPrice) {
            return -1;

        } else if (firstPrice > secondPrice) {
            return 1;
        } else {

            if (firstYearPublished < secondYearPublished) {
                return -1;
            } else if (firstYearPublished > secondYearPublished) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}