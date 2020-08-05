package by.epamtc.information.dao.impl;

import by.epamtc.information.dao.CustomFileReader;
import by.epamtc.information.dao.InformationDAO;
import by.epamtc.information.dao.impl.parser.TextElementParser;
import by.epamtc.information.entity.*;
import by.epamtc.information.entity.impl.Paragraph;
import by.epamtc.information.entity.impl.PunctuationMark;
import by.epamtc.information.entity.impl.Text;
import by.epamtc.information.entity.impl.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InformationDAOImpl implements InformationDAO {
    private TextElementParser parser = new TextElementParser();
    private CustomFileReader customFileReader = new CustomFileReaderImpl();

    @Override
    public Text text(String fileName) {
        Text text = new Text();
        final String sourceText = customFileReader.stringFromFile(fileName);
        text.setText(sourceText);
        return text;
    }
    

    @Override
    public List<TextElement> textElementList(Text text) {
        List<TextElement> textElements = new ArrayList<>();

        String titleRegex = "^\\d.+\\n";
        String paragraphRegex = "(?<TextBlock>[^{}]+\\n)";
        String codeBlockRegex = ".*\\{\\n(.*\\n)+?\\n*}\\n";

        getClass();
        Pattern pattern = Pattern.compile(codeBlockRegex);
        Matcher matcher = pattern.matcher(text.getText());

        while (matcher.find()){
            System.out.println(matcher.group());
        }


//        final String[] split = text.getText().split("\n");
//
//        for (String line : split) {
//            if (line.endsWith(":") || line.endsWith(".")){
//                textElements.add(new Paragraph(line));
//            }
//            if (line.startsWith("\\d")){
//                textElements.add(new Title(line));
//            }
//        }

        return textElements;
    }

    @Override
    public List<Word> wordList(Paragraph paragraph) {
        return null;
    }

    @Override
    public List<PunctuationMark> punctuationMarkList(Paragraph paragraph) {
        return null;
    }
}
