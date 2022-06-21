

package com.company;
import java.io.*;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static <Int> void main(String[] args) throws FileNotFoundException {
        File text_file;
        try {
            text_file = new File("C:\\Users\\NEAK\\Documents\\Text\\Composing_text.txt");
            if (text_file.createNewFile()) {
                System.out.println("File Created: " + text_file);
            }
        } catch (IOException e) {
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
        int count = 0;
        StringBuilder line_edit = new StringBuilder();
        try
        {
            FileReader reading = new FileReader("C:\\Users\\NEAK\\Documents\\Text\\Composing_text.txt");
            Scanner line = new Scanner(new File("C:\\Users\\NEAK\\Documents\\Text\\Composing_text.txt"));
            FileWriter edit = new FileWriter("C:\\Users\\NEAK\\Documents\\Text\\Edited_text.txt");
            while (line.hasNextLine())
            {
                String line_text = line.nextLine();
                String [] text_words = line_text.split(" ");

                for (String text_word : text_words)
                {
                    count += 1;
                   edit.append(text_word).append(" ");
                    if ( count % 10 == 0 )
                    {
                        edit.append("\n");
                    }

                }
            }
            edit.close();

        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
