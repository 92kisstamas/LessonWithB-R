package hu.progmatic;

import java.util.Properties;

public class AA {
    public static void main(String[] args) {
        Properties props = System.getProperties();

        for (Object propName : props.keySet()) {
            if (propName.toString().contains(".encoding")) {
                System.out.println(propName + " = " + props.getProperty(propName.toString()));
            }
        }
    }
}
