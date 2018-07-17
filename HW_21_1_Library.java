import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HW_21_1_Library {

    public static void main(String[] args) {

        List<HW_21_1_Book> lib = new ArrayList<HW_21_1_Book>();

        HW_21_1_Book book1 = new HW_21_1_Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 1967, 150);
        HW_21_1_Book book2 = new HW_21_1_Book("The Lord of the Rings", "J. R. R. Tolkien", 1949, 200);
        HW_21_1_Book book3 = new HW_21_1_Book("Paradise Lost", "John Milton", 1674, 100);
        HW_21_1_Book book4 = new HW_21_1_Book("The Red and the Black", "Stendhal", 1830, 170);
        HW_21_1_Book book5 = new HW_21_1_Book("The Brothers Karamazov", "Fyodor Dostoyevsky", 1880, 220);
        lib.add(book1);
        lib.add(book2);
        lib.add(book3);
        lib.add(book4);
        lib.add(book5);

        Set<HW_21_1_Book> result = findByAuthor(lib, "Fyodor Dostoyevsky");
        for (HW_21_1_Book bookFromResult : result) {
            System.out.println("Title = " + bookFromResult.getTitle() + ", Author = " + bookFromResult.getAuthor()
                    + ", year = " + bookFromResult.getYear() + ", price = $" + bookFromResult.getPrice());
        }
    }

    public static Set<HW_21_1_Book> findByAuthor(List<HW_21_1_Book> lib, String author) {
        Set<HW_21_1_Book> sortedBooks = new TreeSet<HW_21_1_Book>(new HW_21_1_Comparator());

        for (HW_21_1_Book book : lib) {

            if (book.getAuthor().equals(author)) {
                sortedBooks.add(book);
            }
        }

        return sortedBooks;
    }

}