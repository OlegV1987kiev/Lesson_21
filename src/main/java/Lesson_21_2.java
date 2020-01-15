import java.io.*;

public class Lesson_21_2 {
    public static void main(String args[]) throws Exception {

        FileInputStream fin1 = new FileInputStream("d:\\Lesson_21\\1\\1.txt");
        FileInputStream fin2 = new FileInputStream("d:\\Lesson_21\\1\\2.txt");

        FileOutputStream fout = new FileOutputStream("d:\\Lesson_21\\1\\3.txt");

        SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
        int i = 0;
        while ((i = sis.read()) != -1) {
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();

    }
}