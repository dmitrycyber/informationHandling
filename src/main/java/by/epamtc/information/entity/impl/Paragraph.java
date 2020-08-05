package by.epamtc.information.entity.impl;

import by.epamtc.information.entity.TextElement;

import java.util.List;

public class Paragraph implements TextElement {
    private String paragraph;
    private List<Sentence> sentences;

    public Paragraph(String paragraph) {
        this.paragraph = paragraph;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "paragraph='" + paragraph + '\'' +
                '}';
    }
}
