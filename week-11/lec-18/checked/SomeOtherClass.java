package main.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SomeOtherClass {

    public String getSomething(String filePath) throws FileNotFoundException {
        File f = new File(filePath);

        Scanner fileScanner = new Scanner(f);

        return "";

    }

}
