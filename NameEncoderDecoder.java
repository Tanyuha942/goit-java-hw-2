public class NameEncoderDecoder {

    public static String encode(String name) {
        return  "NOTFORYOU" +
                name.replace("e", "1").replace("u", "2").replace("i", "3").replace("o", "4").replace("a", "5") +
                "YESNOTFORYOU";
    }
    public static String decode(String name) {
        return name.substring(0, name.length() - "YESNOTFORYOU".length()).replace("NOTFORYOU", "").replace("1", "e").replace("2", "u").replace("3", "i").replace("4", "o").replace("5", "a");
    }

    public static void main(String[] args) {

        System.out.println("encode(\"Crab\") = " + encode("Crab"));
        System.out.println("decode(" + encode("Crab") + ") = " + decode( encode("Crab")));
    }
}