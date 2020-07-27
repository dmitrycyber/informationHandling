package by.epamtc.information.dao.impl;

import by.epamtc.information.dao.InformationDAO;
import by.epamtc.information.dao.parser.TextParser;
import by.epamtc.information.entity.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InformationDAOImpl implements InformationDAO {
    private TextParser parser = TextParser.getInstance();

    @Override
    public Text text(String fileName) {
        String source = null;
        Text text = new Text();
        try(Reader reader = new FileReader(getClass().getClassLoader().getResource(fileName).getPath());
            BufferedReader bufferedReader = new BufferedReader(reader)
        ) {
            source = bufferedReader.lines()
                    .map(line -> line + "\n")
                    .reduce((line1, line2) -> line1 + line2)
                    .orElse(null);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        text.setText(source);
        return text;
    }
    

    @Override
    public List<TextElement> textElementList(Text text) {
        List<TextElement> textElements = new ArrayList<>();

        final String[] split = text.getText().split("\n");

        for (String line : split) {
            if (line.endsWith(":") || line.endsWith(".")){
                textElements.add(new Paragraph(line));
            }
        }



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
