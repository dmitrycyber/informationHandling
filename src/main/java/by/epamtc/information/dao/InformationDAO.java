package by.epamtc.information.dao;

import by.epamtc.information.entity.*;
import by.epamtc.information.entity.impl.Paragraph;
import by.epamtc.information.entity.impl.PunctuationMark;
import by.epamtc.information.entity.impl.Text;
import by.epamtc.information.entity.impl.Word;

import java.util.List;

public interface InformationDAO {
    Text createText(String fileName);
}
