package by.epamtc.information.dao;

import by.epamtc.information.entity.SentenceElement;
import by.epamtc.information.entity.TextElement;
import by.epamtc.information.entity.impl.Sentence;

import java.util.List;

public interface Parser {
    List<TextElement> parseTextElements(String string);

    List<Sentence> parseSentence(String string);

    List<SentenceElement> parseSentenceElements(String string);



}
