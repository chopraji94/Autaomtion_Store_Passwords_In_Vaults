import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    static Properties properties;

    public static Properties StoreProperties() throws IOException {
        FileReader reader = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
        properties = new Properties();
        properties.load(reader);
        return properties;
    }

}
