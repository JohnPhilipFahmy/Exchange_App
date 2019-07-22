package com.Exchange.Task;

public class MainClass {

    public static void main(String[] args) {
         Execute execute = null;
        String_Receiver receiver = new String_Receiver();
        
        // input sentence
        receiver.setStr("exchange from $20 to eg");
        
        
        String sentence_split[]= receiver.getStr().split(" ");
       
         if(sentence_split.length==5){
          execute = new five_words(receiver);
        }
        else if(sentence_split.length==6){
          execute = new six_words(receiver);
        }
        else{
             System.out.println("error");
        }
        execute.amount();
        execute.from();
        execute.to();
    }
}
