import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Сказка о каше из топора.txt");
        getWordCount("Сказка о каше из топора.txt");

    }
    public static void getWordCount(String filename) throws IOException {
        File file = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Scanner scanner = new Scanner(file);
        int words = 0;
        int lines = 0;
         int chars = 0;
         String soglasnie = "Б, В, Г, Д, Ж, З, Й, К, Л, М, Н, П, Р, С, Т, Ф, Х, Ц, Ч, Ш, Щ" ;

        while (scanner.hasNextLine()) {
            lines++;
            String[] array = scanner.nextLine().split(" ");
            words = words + array.length;

            char [] simbol = reader.readLine().toCharArray();
             chars = chars + simbol.length;

        }
        while (scanner.hasNextLine()){
            String [] array = scanner.nextLine().split(" ");

                }
        System.out.println("Number of words: " + words);
        System.out.println("Number of lines: " + lines);
        System.out.println("Number of lines: " +  chars );

        scanner.close();
            }

    }
















        ////////////////////////////////////////////////////////// ЧТЕНИЕ
        //        File file = new File("Сказка о каше из топора.txt");
//
//        try(FileReader reader = new FileReader("Сказка о каше из топора.txt"))
//        {
//            int c;
//            while ((c = reader.read())!=-1){
//                System.out.print((char)c);
//            }
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }

