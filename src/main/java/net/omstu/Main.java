package main.java.net.omstu;

public class Main {
    public static void main(String[] args) {
        WorkWithSentences wws = new WorkWithSentences("Почему импульсный шуруповерт мощнее обычного");
        wws.shuffleSentences();
        System.out.println(wws.getBasicSentences());
        System.out.println(wws.getFinalSentences());
    }
}
