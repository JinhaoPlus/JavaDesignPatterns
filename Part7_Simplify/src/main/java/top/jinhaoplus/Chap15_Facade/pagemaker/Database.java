package top.jinhaoplus.Chap15_Facade.pagemaker;

import java.io.IOException;
import java.util.Properties;

class Database {

    private Database() {
    }

    public static Properties getProperties(String dbName) {
        String filename = dbName + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(Database.class.getClassLoader().getResourceAsStream(filename));
        } catch (IOException e) {
            System.out.println("No file found!");
            e.printStackTrace();
        }

        return properties;
    }
}
