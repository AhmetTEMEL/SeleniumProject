package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

    public static String getValue(String key) {
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream("src/config/config.properties");
            prop.load(input);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
