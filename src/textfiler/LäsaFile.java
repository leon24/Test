package textfiler;

import java.io.*;
import java.util.*;

public class LäsaFile {
    public static void main(String[] args) throws IOException {
        readFile();
    }
    private static void readFile() throws FileNotFoundException, IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Vilka i vilket intervall vill du läsa in filer? ");
        String fileNamn = scan.nextLine();
        File dir = new File("D:\\Users\\LeonsBärbara\\Documents\\NetBeansProjects\\Textfiler\\läsafiler");
        byte [] buffer = new byte[1000];
        FileInputStream inputStream = new FileInputStream(dir);
        int total = 0;
        int nRead = 0;
        while((nRead = inputStream.read(buffer)) != -1){
            System.out.println(new String(buffer));
        }
        inputStream.close();
        System.out.println("Read " + total + " bytes"); 
    }
}
