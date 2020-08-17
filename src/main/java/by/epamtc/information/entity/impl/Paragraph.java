package by.epamtc.information.entity.impl;

import by.epamtc.information.entity.TextElement;
import lombok.Data;

import java.util.List;

@Data
public class Paragraph implements TextElement {
    private String paragraph;
    private List<Sentence> sentences;

    @Override
    public String getString() {
        return paragraph;
    }
}
