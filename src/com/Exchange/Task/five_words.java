package com.Exchange.Task;

public class five_words implements Execute {

    public String_Receiver receiver;
    String sentence_split[];

    public five_words(String_Receiver receiver) {
        this.receiver = receiver;
        this.sentence_split = receiver.getStr().split(" ");
    }

    @Override
    public void from() {

        if (sentence_split[2].startsWith("$")) {
            System.out.println("From :" + "dolar");
        }
    }

    @Override
    public void to() {
        System.out.println("to :" + sentence_split[4]);
    }

    @Override
    public void amount() {
        if (sentence_split[2].startsWith("$")) {
            System.out.println(sentence_split[2].charAt(1) + "" + sentence_split[2].charAt(2));
        }
    }

}
