package by.epamtc.information.dao.impl;

import by.epamtc.information.dao.CustomFileReader;
import by.epamtc.information.dao.InformationDAO;
import by.epamtc.information.dao.Parser;
import by.epamtc.information.entity.TextElement;
import by.epamtc.information.entity.impl.Text;
import by.epamtc.information.configuration.annotation.InjectByType;
import by.epamtc.information.configuration.annotation.Singleton;

import java.util.List;

@Singleton
public class InformationDAOImpl implements InformationDAO {
    @InjectByType
    private CustomFileReader customFileReader;

    @InjectByType
    private Parser parser;

    @Override
    public Text createText(String fileName) {
        Text text = new Text();
        final String sourceText = customFileReader.stringFromFile();

        List<TextElement> textElements = parser.parseTextElements(sourceText);
        text.setTextElements(textElements);
        return text;
    }
}
