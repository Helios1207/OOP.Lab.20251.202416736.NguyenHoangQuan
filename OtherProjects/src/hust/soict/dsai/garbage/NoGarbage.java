package hust.soict.dsai.garbage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] inputBytes = new byte[(int) file.length()];
        fis.read(inputBytes);
        fis.close();

        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (byte b : inputBytes) {
            sb.append((char) b);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}