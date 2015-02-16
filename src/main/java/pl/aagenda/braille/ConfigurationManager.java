/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.aagenda.braille;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

/**
 *
 * @author mryohan
 */
public class ConfigurationManager {
    public static Configuration getDefaultConfiguration() {
        Font font;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, Configuration.class.getClassLoader().getResourceAsStream("braille.ttf"));
            font = font.deriveFont(Font.PLAIN, 15);
        } catch (FontFormatException | IOException ex) {
            font = new Font("Dialog", Font.PLAIN, 15);
        }
        Configuration c = new Configuration();
        c.setFont(font);
        c.setKeyLT('e');
        c.setKeyLM('d');
        c.setKeyLB('c');
        c.setKeyRT('o');
        c.setKeyRM('k');
        c.setKeyRB('m');
        return c;
    }
}
