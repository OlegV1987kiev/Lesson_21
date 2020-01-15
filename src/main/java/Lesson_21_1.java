import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lesson_21_1 {

    public static String readText(String pth) throws IOException {
        System.out.println("------------------------------------");
        System.out.println("Читаем Текст из файла...." + pth);
        System.out.println("------------------------------------");
        byte[] str;

        try (FileInputStream inFile = new FileInputStream(pth)) {
            str = new byte[inFile.available()];
            inFile.read(str);
        }
        String text = new String(str);
        System.out.println(text);
        System.out.println("------------------------------------");
        return text;
    }

    public static void writeText(String pth, String text) throws IOException {
        System.out.println("------------------------------------");
        System.out.println("Записываем в файл..." + pth);
        System.out.println("------------------------------------");
        byte[] str;

        try (FileOutputStream inFile = new FileOutputStream(pth)) {
            str = text.getBytes();
            inFile.write(str, 0, str.length);
        }
    }

    public static void main(String[] args) throws IOException {
        String text = readText("d:\\Lesson_21\\1\\n2.txt");

        System.out.println("Исправляем Hello на 1234.");
        String new_text = text.replace("Hello", "1234");

        writeText("d:\\Lesson_21\\1\\n2.txt", new_text);
        text = readText("d:\\Lesson_21\\1\\n2.txt");

    }
}