package com.Exchange.Task;

public class six_words  implements Execute{
    
    public String_Receiver receiver;
    String sentence_split[];

    public six_words(String_Receiver receiver) {
        this.receiver = receiver;
        this.sentence_split = receiver.getStr().split(" ");
    }

    @Override
    public void from() {

      
            System.out.println("From :" +  sentence_split[3]);
        
    }

    @Override
    public void to() {
        System.out.println("to :" + sentence_split[5]);
    }

    @Override
    public void amount() {
      
            System.out.println(sentence_split[2]);
        
    }


}
