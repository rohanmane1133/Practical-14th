/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textanalyzerhelper;

import java.util.ArrayList;

/**
 *
 * @author rohan
 */
public class TextAnalyzerHelper1 {

    /**
     * @param args the command line arguments
     */
    private String inputText;
    private int CountLines;
    private int tabs;
    private int space;
    private int word;
    private int length;
    private char [] CharArray; 
    public String getInputText() {
        return inputText;
    }
       
    public int getCountLines() {
        return CountLines;
    }

    public int getTabs() {
        return tabs;
    }

    public int getSpace() {
        return space;
    }

    public int getWord() {
        return word;
    }

    public int getLength() {
        return length;
    }
   
    public void analyze( String s)
    {
            inputText = s;
            length=inputText.length();
            CountLines=length>0?inputText.split("\n").length:0;
            space=inputText.split(" ").length;
            tabs=inputText.split("\t").length;
         ////////////////////
            word = inputText.trim().isEmpty() ? 0 : inputText.trim().split("\\s+").length;
            if(inputText.trim().isEmpty()!=false){
            int count = inputText.trim().split("\\s+").length;
            String [] WordArray = inputText.trim().split("\\s+");
            for(int i = 0;i<count;i++){
            if(WordArray[i]=="!"||WordArray[i]=="@"||WordArray[i]=="#"||WordArray[i]=="$"||WordArray[i]=="%"||WordArray[i]=="^"||WordArray[i]=="*"||WordArray[i]=="("||WordArray[i]== ")"||WordArray[i]=="-"||WordArray[i]=="1"||WordArray[i]=="2"||WordArray[i]=="3"||WordArray[i]=="4"||WordArray[i]=="5"||WordArray[i]=="6"||WordArray[i]=="7"||WordArray[i]=="8"||WordArray[i]== "9"||WordArray[i]=="10"){
            
            count--;
            
            
            }
            }
            word=count;
            }
            //////////
           ArrayList<String> chare= new ArrayList<>();
          char [] Array = inputText.toCharArray();
          for(int i = 0;i < Array.length;i++){
              
              
          
          
          }
          
          
    }
   
    @Override
public String toString() {
    return "TextAnalyzerHelper{" +
            "inputText='" + inputText + '\'' +
            ", textLength=" + length +
            ", wordCount=" + word +
            ", lineCount=" + CountLines +
            ", tabCount=" + tabs +
            ", spaceCount=" + space +
            '}';
}




    
   
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
