package StandAloneTankWar;

import java.io.IOException;
import java.util.Properties;

public class PropertyMgr {
    static Properties props = new Properties();

    static {
        try {
            props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config/tank.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key) {

        return props.getProperty(key);
    }
}
