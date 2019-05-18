package BookStore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class BookFunctionTest {

    List<Book> bookList = new ArrayList<Book>();
    BookFunction bookFunction = new BookFunction();

    //to będzie wywoływane przed każdym testem
    @Before
    public void mojaListaTestowa() {

        bookList.add(new Book("tytul1", "1111111111", "2001"));
        bookList.add(new Book("tytul2", "2222222222", "2002"));
        bookList.add(new Book("tytul3", "3333333333", "2003"));
        bookList.add(new Book("tytul4", "4444444444", "2010"));
        bookList.add(new Book("tytul5", "5555555555", "2005"));
        bookList.add(new Book("tytul6", "6666666666", "2000"));
    }

    @Test
    @DisplayName("Tytuł po ISBN")
    public void checkReturnBookIsbn() {

        Book book = bookFunction.findISBN("6666666666", bookList);
        Assert.assertEquals("tytul6", book.getTytul());
    }

    @Test
    @DisplayName("Ostatnie dwie")
    public void reurnTwoLastTest() {

        //AsertJ biblioteki do obsługi kolekcji
        assertThat(bookFunction.reurnTwoLast(bookList)).contains(bookList.get(4)).contains(bookList.get(5));
    }

    @Test
    @DisplayName("Najwcześniej wydana")
    public  void returErliestYearTest (){
        Book book = bookFunction.returnErliestBook(bookList);
        Assert.assertEquals("tytul6",book.getTytul());

    }
    @Test
    @DisplayName("Najpóźniej wydana")
    public  void returLatestYearTest (){
        Book book = bookFunction.returnLatestBook(bookList);
        Assert.assertEquals("tytul4",book.getTytul());
    }
    @Test
    @DisplayName("Suma lat wydania")
    public void returnSumPublishmentYearTest(){
       int suma = bookFunction.returnSumPublishmentYear(bookList);
       Assert.assertEquals(12021,suma);

    }
}

