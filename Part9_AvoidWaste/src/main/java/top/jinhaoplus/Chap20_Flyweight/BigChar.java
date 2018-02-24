package top.jinhaoplus.Chap20_Flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BigChar {
    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(BigChar.class.getClassLoader().getResourceAsStream("big" + charname + ".txt")));
            String line;
            StringBuffer buffer = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
                buffer.append("\n");
            }
            reader.close();
            this.fontdata = buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            this.fontdata = charname + "?";
        }
    }

    public void print() {
        System.out.print(fontdata);
    }
}
