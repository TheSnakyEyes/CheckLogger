package sample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filemaster {
    public Check[] Import(String path) throws IOException {
        FileReader library = new FileReader(path);
        Scanner scan = new Scanner(library);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }
        Check[] lib = new Check[i];
        library.close();
        FileReader library1 = new FileReader(path);
        Scanner scan1 = new Scanner(library1);
        i = 0;
        while (scan1.hasNextLine()) {
            lib[i] = new Check(scan1.nextLine());
            i++;
        }
        library.close();

        return lib;
    }
    public void Export(String path, Check[] lib) throws IOException {
        FileWriter pen = new FileWriter(path);
        for (int i = 0; i < lib.length; i++){
            pen.write(lib[i].RollBack());
        }
        pen.close();
    }

}
