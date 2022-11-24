import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Doubles {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage ReadCSV <filename>");
            System.exit(0);
        }
        String[] fieldNames;
        int[] accumulators;
        BufferedReader in = null;

        try {

            in = new BufferedReader(new FileReader(args[0]));
            String s = null;
            String header = in.readLine();
            Scanner parser = null;
            int fieldsCounter = 0;
            try {
                parser = new Scanner(header);
                parser.useDelimiter(",");
                while (parser.hasNext()) {
                    parser.next();
                    fieldsCounter++;
                }
            } finally {
                parser.close();
            }
            fieldNames = new String[fieldsCounter];
            accumulators = new int[fieldsCounter];
            try {
                parser = new Scanner(header);
                parser.useDelimiter(",");
                int i=0;
                while(parser.hasNext()){
                    fieldNames[i]=parser.next();
                    accumulators[i]=0;
                    i++;
                }
                System.out.println();


            }
        } catch (FileNotFoundException ex) {
            System.err.println("File " + args[0] + " not found");
            System.exit(1);
        } catch (IOException ex) {
            System.err.println("Error reading file " + args[0]);
            System.exit(1);

        }

    }
}
