package textfiler;

import java.io.*;
import java.util.*;

public class LäsaFile {
    public static void main(String[] args) throws IOException {
        readFile();
    }
    private static void readFile() throws FileNotFoundException, IOException{
        Scanner scan = new Scanner(System.in);
        int startswith;
         int endwith;
        System.out.println("Vilka i vilket intervall vill du läsa in filer? ");
        startswith = scan.nextInt();
        endwith = scan.nextInt();
        File folder = new File("D:\\Users\\LeonsBärbara\\Documents\\NetBeansProjects\\Textfiler\\läsafiler");
        File[] listOfFiles = folder.listFiles();
         for (int i = 0; i < listOfFiles.length; i++)
        System.out.println(listOfFiles[i].getName());
         
         
         
        
//       File dir = new File(TargetD);
//       for (File file : ) {
//            Scanner s = new Scanner(file);
//        
//        ArrayList<String> list = new ArrayList<String>();
//        while (s.hasNext()){
//            list.add(s.next());
//        }
//        System.out.println(list);
//        }
    }
    }
//        for (File file : dir.listFiles()) {
//            Scanner s = new Scanner(file);
//        ArrayList<String> list = new ArrayList<String>();
//        while (s.hasNext()){
//            list.add(s.next());
//}
//        System.out.println(list);
//        s.close();
//        
//         
//        }
    




