package by.epamtc.information.entity;

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
