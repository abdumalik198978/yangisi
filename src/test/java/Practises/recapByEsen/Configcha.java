package Practises.recapByEsen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configcha {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("review.properties");
            properties.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("file not found");
        }
    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}