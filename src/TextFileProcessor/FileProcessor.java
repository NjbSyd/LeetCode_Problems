package TextFileProcessor;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileProcessor {
    File file;

    // function to input text file
    FileProcessor() {
        file = new File("C:\\Users\\tcanj\\Downloads\\Shikwa.txt");
    }

    // function to remove all empty lines
    public void ExtractTextLinesAndWriteFile() {
        // TODO Extract Text Lines And Write to a new txt File
        File file2 = new File(file.getAbsolutePath().replace(".txt", "_new.txt"));
        try {
            Scanner fileReader = new Scanner(file);
            FileWriter fileWriter = new FileWriter(file2);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.length() > 0) {
                    System.out.println(line);
                    if (checkLine(line))
                        fileWriter.write(line + "\n");
                }
            }
            System.out.println("Success!!");
            fileReader.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    boolean checkLine(String line) {
        return !(Character.isDigit(line.charAt(0)));
    }
}
