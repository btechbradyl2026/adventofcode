import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    int count = 0;
    ArrayList a1 = new ArrayList<Integer>();
    ArrayList a2 = new ArrayList<Integer>();
    try {

        File file = new File("src/nums");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            a1.add(scan.nextInt());
            a2.add(scan.nextInt());
        }
        scan.close();
    }
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
        System.out.println(a1);
        System.out.println(a2);

        Collections.sort(a1);
        Collections.sort(a2);

        for (int i = 0; i < a1.size(); i ++) {
            int c1 = 0;
            for (int j = 0; j < a2.size(); j++) {
                if ( (int) a1.get(i) == (int) a2.get(j) ) {
                    c1 ++;
                }
            }
            count += ((int) a1.get(i) * c1);
        }
        System.out.println(count);
    }
}