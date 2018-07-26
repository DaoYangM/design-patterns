import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputTest {
    public static void main(String[] args) throws IOException {

        int c;

        FileInputStream fileInputStream = new FileInputStream("D:\\Code\\Java\\Design Patterns\\Decorator\\src\\test.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        LowerCaseInputStream lowerCaseInputStream = new LowerCaseInputStream(bufferedInputStream);

        while ( (c = lowerCaseInputStream.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
