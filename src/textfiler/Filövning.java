package textfiler;

import java.util.*;
import java.io.*;
import java.text.*;





public class Filövning {
    static String DateNamn;
    public static void main(String[] args) throws IOException {
        writeFile();
        readFile();
    }
    public static void writeFile() throws IOException {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        Scanner scan = new Scanner(System.in);
        System.out.print("Vilka bilar ska finnas i lista: ");
        String bBilar = scan.nextLine();
        List<String> Bilar = new ArrayList(Arrays.asList(bBilar.split(" ")));
        DateNamn = strDate+" BilLista.txt";
     //   System.out.println(Bilar);
        FileWriter fileWriter = new FileWriter(DateNamn);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    for (String element : Bilar){
        bufferedWriter.write(element);
        bufferedWriter.newLine();       
        }
        bufferedWriter.close();
 
        }
    private static void readFile() throws FileNotFoundException, IOException{
        byte [] buffer = new byte[1000];
        FileInputStream inputStream = new FileInputStream(DateNamn);
        int total = 0;
        int nRead = 0;
        while((nRead = inputStream.read(buffer)) != -1){
            System.out.println(new String(buffer));
        }
        inputStream.close();
        System.out.println("Read " + total + " bytes"); 
    }
      }

