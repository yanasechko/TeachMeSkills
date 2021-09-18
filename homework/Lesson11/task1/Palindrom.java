package Lesson11.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Palindrom {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("./src/Lesson11/task1/text1.txt");
        FileWriter fw = new FileWriter("./src/Lesson11/task1/text2.txt");
        BufferedReader bf = new BufferedReader(fr);
        var str = bf.readLine();

        while (str != null) {
            StringBuilder builder = new StringBuilder(str);
            if (builder.reverse().toString().equals(str)) {
                fw.write(builder + "\n");
            }
            str = bf.readLine();
        }
        fw.close();
    }
}






