import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class eX4 {
    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.println(
                    "Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }


        String sourceFile = args[0];
        String targetFile = args[1];
        String oldStr = args[2];
        String newStr = args[3];


        File source = new File(sourceFile);
        if (!source.exists()) {
            System.out.println("Source file " + sourceFile + " does not exist");
            System.exit(2);
        }

        try (

                Scanner input = new Scanner(source);

                PrintWriter output = new PrintWriter(targetFile);
        ) {
            while (input.hasNext()) {
                String line = input.nextLine();
                String newLine = line.replaceAll(oldStr, newStr);
                output.println(newLine);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        }
    }
}
