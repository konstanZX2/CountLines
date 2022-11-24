import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//public class Scanners {
//    public static void main(String[] args) {
//        if (args.length == 0) {
//            System.err.println("Usage: CountWords <filename>");
//            System.exit(1);
//        }
//        int counter = 0;
//        Scanner input = null;
//
//        try {
//            input = new Scanner(new BufferedReader(new FileReader(args[0])));
//            while (input.hasNext()) {
//                input.next();
//                counter++;
//            }
//            System.out.println("number of words " + counter);
//        } catch (FileNotFoundException ex) {
//            System.out.println("File " + args[0] + " not found.");
//            System.exit(1);
//
//
//        } catch (IOException ex) {
//            System.err.println("Error reading file " + args[0]);
//            System.exit(1);
//        } finally {
//            if (input != null) {
//                input.close();
//            }
//        }
//    }
//}
