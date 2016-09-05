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
        for (File file : dir.listFiles()) {
            Scanner s = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
}//comment
        System.out.println(list);
        s.close();
        
         
        }
    }
}



