import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public static ArrayList<String>GetList() throws IOException {
        ArrayList<String>stlist=new ArrayList<>();
        File f=new File("/home/yura/diridea/test");
        Scanner scan;
        FileReader fr;
        try {
             fr=new FileReader(f);
            scan=new Scanner(fr);

            while (scan.hasNext()) {stlist.add(scan.nextLine());}
                 fr.close();//Как я понял ,закрывать поток чтения нужно после необходимых манипуляций с данными потока.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



        return stlist;




    }



}
