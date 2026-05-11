package com.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperties {

    static Properties prop;

    public static Properties getProp() {

        prop = new Properties();

        try {

            FileInputStream file =
                    new FileInputStream(
                            System.getProperty("user.dir")
                            + "/src/test/resources/testData.properties");

            prop.load(file);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return prop;
    }
}