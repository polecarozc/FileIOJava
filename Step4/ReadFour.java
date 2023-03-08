package Step4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.Stack;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args){
            File file = new File("/Users/jacobp/Desktop/projects/FileIOJava/Step4/input.txt");
            BufferedReader br;
            try {
                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            String str;
            int runningTotal = 0;
            System.out.println("Adding to sum ... ");
            try{
                while((str = br.readLine()) != null){
                    runningTotal += Integer.parseInt(str);
                }
                System.out.println(runningTotal);
            }
            catch (IOException e) {
                System.out.println("File not found");
            }

        }

            // Print out a running total of all the
            // values in the input file.
}