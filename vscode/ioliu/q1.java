package vscode.ioliu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class q1 {
    public static void main(String[] args) {
        String filepath = "e:\\meilinna.jpg";
        String filepbth = "c:\\Users\\白宝帅\\Desktop\\vscode\\ioliu\\lin.jpg";
        int len = 0;
        byte [] buf = new byte[8];
        FileInputStream fi = null;
        FileOutputStream fo = null;
        
        try {
            fi = new FileInputStream(filepath);
            fo = new FileOutputStream(filepbth);
            while ((len = fi.read(buf))!=-1) {
                fo.write(buf, 0, len);
                //fo.write("b".toString());
                System.out.println("ok");
                
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (fi != null){
            try{
                fi.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        if (fo != null){
            try{
                fo.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        
    }
}
}