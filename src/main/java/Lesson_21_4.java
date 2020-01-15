import java.io.*;
import java.util.Date;

public class Lesson_21_4 {
    public static void main(String[] args) {
        try {
            new File("d:\\Lesson_21\\1\\File_1\\Lesson_21_4.txt").createNewFile();
            File dir = new File("d:\\Lesson_21\\1\\File_1");
            File[] list = dir.listFiles();
            String[] lists = new String[list.length];
            byte[] c = new byte[1000];

            OutputStream ops = new FileOutputStream("d:\\Lesson_21\\1\\File_2\\Lesson_21_4.txt");
            try {
                for (int i = 0; i < list.length; i++) {
                    StringBuilder sb = new StringBuilder();

                    if (list[i].isFile()) {
                        sb.append(list[i].getCanonicalPath()).append("***")
                                .append(list[i].getName()).append("***")
                                .append(new Date(list[i].lastModified()).toString()).append("\r\n");
                        lists[i] = sb.toString();
                        c = lists[i].getBytes();
                        ops.write(c);
                    }
                }
            } finally {
                ops.close();
            }

        } catch (Exception e) {
            ;
        }

    }

}