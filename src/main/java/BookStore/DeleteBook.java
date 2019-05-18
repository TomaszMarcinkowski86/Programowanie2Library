package BookStore;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeleteBook {

    static void deleteBook(){

        Scanner scanner = new Scanner(System.in);
        String tylkoTytul = BookList.getBookList().stream().map(book -> book.getTytul()).collect(Collectors.joining("; "));
        System.out.println("Podaj tytuł ksiązki do usunięcia: " + tylkoTytul );
        String tytul = scanner.nextLine();
//       while(tytul.equals(tylkoTytul.split(";"))){
//           System.out.println("Nieprawidłowy tytuł!!");
//           tytul = scanner.nextLine();
//     }
        int indeks = tytul.indexOf(tylkoTytul);
        BookList.getBookList().remove(indeks);
    }
}
