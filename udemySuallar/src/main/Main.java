package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.runLengthEncoding("aaaaaaaaaabbcc"));





    }
    public String runLengthEncoding(String string) {


        int count = 1;
        String sonuc = "";

        string = string+"!";
        if(string.length()==2){
            return string;
        }
        String aString="";
        for(int i =0; i<string.length()-1;i++){
            if(string.charAt(i)==string.charAt(i+1)){
                count++;
                if(count>9){

                    string.replace(string.charAt(i),string.charAt(string.length()-1));
                    aString = Integer.toString(count-1);
                    sonuc = sonuc+(aString+string.charAt(i));
                    count =1;

                }
            }
            else{
                aString = Integer.toString(count);
                sonuc = sonuc+(aString+string.charAt(i));
                count =1;
            }
        }
        return sonuc;
    }


}


