/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.aagenda.braille;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author mryohan
 */
public class ConfigurationManager {
    private static final Logger logger = LogManager.getLogger(ConfigurationManager.class);
    
    private static void adjustDefaultConfiguration() {
        Font font;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, Configuration.class.getClassLoader().getResourceAsStream("braille.ttf"));
            font = font.deriveFont(Font.PLAIN, 15);
        } catch (FontFormatException | IOException ex) {
            font = new Font("Dialog", Font.PLAIN, 15);
        }
        Configuration c = Configuration.getInstance();
        c.setFont(font);
        c.setKeyLT('e');
        c.setKeyLM('d');
        c.setKeyLB('c');
        c.setKeyRT('o');
        c.setKeyRM('k');
        c.setKeyRB('m');
    }
    
    public static Configuration getLastConfiguration() {
        File f = new File("config.aag");
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
            Configuration config = (Configuration) ois.readObject();
            ois.close();
            adjustLastConfig(config);
            logger.info("Last configuration has been loaded");
        } catch (IOException | ClassNotFoundException ex) {
            logger.warn("Can't load last configuration due to an exception");
            logger.warn(ex);
            logger.info("Loading default configuration");
            adjustDefaultConfiguration();
        }
        return Configuration.getInstance();
    }
    
    private static void adjustLastConfig (Configuration config) {
        Configuration originalConfig = Configuration.getInstance();
        originalConfig.setFont(config.getFont());
        originalConfig.setKeyLB(config.getKeyLB());
        originalConfig.setKeyLM(config.getKeyLM());
        originalConfig.setKeyLT(config.getKeyLT());
        originalConfig.setKeyRT(config.getKeyRT());
        originalConfig.setKeyRM(config.getKeyRM());
        originalConfig.setKeyRB(config.getKeyRB());
    }
}
