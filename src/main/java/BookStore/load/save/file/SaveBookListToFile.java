package BookStore.load.save.file;


import BookStore.Book;

import java.io.*;

import static BookStore.BookStore.bookList;

public class SaveBookListToFile {

    public static void saveFile() throws FileNotFoundException {

        String path = "E:/JAVA/Programowanie2/src/main/resources/SaveMyListToFile.csv";
        // File bookListFile = new File(path);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)))) {

            for (Book line : bookList) {
                String lineToWrite = line.getTitle() + "; " + line.getYearOfPublishment() + "; " + line.getIsbnNumber();
                bw.write(lineToWrite + ":" + "\n");
            }

        } catch (IOException ex) {

        }

    }

}
