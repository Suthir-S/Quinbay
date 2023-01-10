import java.io.File;
import java.io.IOException;
import java.lang.*;
import java.io.FileWriter;
import java.util.Scanner;

public class emp {
    public static void main(String[] args){
        try
        {
            File obj = new File("/Users/suthir/Documents/employees.txt");
            Scanner reader = new Scanner(obj);
            int inde=0;
            while(reader.hasNextLine()){
                String txt = reader.nextLine();
                String[] indata = txt.split(",") ;
                String[] role={"DEV","MANAGER","QA"};
                String dev="",man="",qa="";
                int len = indata.length;
                int i = 0;
                while (i < len) {
                    if (indata[i] == role[0]) {
                        inde = i;
                    } else if (indata[i] == role[1]) {
                        inde = i;
                    } else if (indata[i] == role[2]) {
                        inde = i;
                    } else {
                        i = i + 1;
                    }
                    for (String a : indata) {
                        if (a == role[0]) {
                            int dex = inde - 4;
                            dev += indata[dex];
                            dev += indata[dex + 3];
                            FileWriter deve = new FileWriter("/Users/suthir/IdeaProjects/Readfile/src/dev.txt");
                            deve.close();
                        } else if (a == role[1]) {
                            int dex = inde - 4;
                            man += indata[dex];
                            man += indata[dex + 3];
                            FileWriter mana = new FileWriter("/Users/suthir/IdeaProjects/Readfile/src/mana.txt");
                            mana.close();
                        } else if (a == role[2]) {
                            int dex = inde - 4;
                            qa += indata[dex];
                            qa += indata[dex + 3];
                            FileWriter qua = new FileWriter("/Users/suthir/IdeaProjects/Readfile/src/qua.txt");
                            qua.close();
                        }
                        //System.out.println(a);
                    }
                }
                //System.out.println(txt);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
