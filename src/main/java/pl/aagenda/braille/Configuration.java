/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.aagenda.braille;

import java.awt.Font;

/**
 *
 * @author mryohan
 */
public class Configuration {
    private static Configuration instance;
    private Configuration() {
        
    }
    
    public static Configuration getInstance() {
        if (null == instance) {
            instance = new Configuration();
        }
        return instance;
    }
    
    private Font font;
    private char keyLT;
    private char keyLM;
    private char keyLB;
    private char keyRT;
    private char keyRM;
    private char keyRB;

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public char getKeyLT() {
        return keyLT;
    }

    public void setKeyLT(char keyLT) {
        this.keyLT = keyLT;
    }

    public char getKeyLM() {
        return keyLM;
    }

    public void setKeyLM(char keyLM) {
        this.keyLM = keyLM;
    }

    public char getKeyLB() {
        return keyLB;
    }

    public void setKeyLB(char keyLB) {
        this.keyLB = keyLB;
    }

    public char getKeyRT() {
        return keyRT;
    }

    public void setKeyRT(char keyRT) {
        this.keyRT = keyRT;
    }

    public char getKeyRM() {
        return keyRM;
    }

    public void setKeyRM(char keyRM) {
        this.keyRM = keyRM;
    }

    public char getKeyRB() {
        return keyRB;
    }

    public void setKeyRB(char keyRB) {
        this.keyRB = keyRB;
    }
}
