package by.epamtc.information.dao.parser;

public class TextParser {
    private static TextParser instance;

    private TextParser() {
    }

    public static TextParser getInstance() {
        if (instance != null){
            return instance;
        }
        return new TextParser();
    }
}
