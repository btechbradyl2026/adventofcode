import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    File file = new File("nums");
    ArrayList a1 = new ArrayList<>();
    try {
        Scanner scan = new Scanner(file);

    }
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    }
}