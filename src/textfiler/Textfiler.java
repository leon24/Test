package textfiler;

import java.util.*;
import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.text.*;




public class Textfiler {
    private static final Logger LOG = LogManager.getLogger(Log4j2Tester.class);
    public static void main(String[] args) throws IOException {
        writeFile();
    }
    private static void writeFile() throws IOException {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        String DateNamn = strDate+" LeonLandvall.txt";
        System.out.println(DateNamn);
   try{ List <String> listtofile = new ArrayList();
        listtofile.add("Äpple");
        listtofile.add("Citron");
        listtofile.add("Apelsin");
        listtofile.add("Banan");
        System.out.println(listtofile);
        FileWriter fileWriter = new FileWriter(DateNamn);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    for (String element : listtofile){
        bufferedWriter.write(element);
        bufferedWriter.newLine();
                
        }
        bufferedWriter.close();
    }
      catch(Exception e){
          System.err.println("Din kod funkar inte");
          LOG.error("Din kod funkar inte");
          
        }
      }
    }
