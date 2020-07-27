package by.epamtc.information.dao;

import by.epamtc.information.entity.*;

import java.util.List;

public interface InformationDAO {
    Text text(String fileName);

//    List<Paragraph> paragraphList(Text text);
//
//    List<CodeBlock> codeBlockList(Text text);

    List<Word> wordList(Paragraph paragraph);

    List<PunctuationMark> punctuationMarkList(Paragraph paragraph);

    List<TextElement> textElementList(Text text);

}
