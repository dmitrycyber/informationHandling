package by.epamtc.information.entity.impl;

import java.util.List;

public class Text {
    private String text;
    private List<Paragraph> paragraphs;
    private List<CodeBlock> codeBlocks;

    public void setText(String text) {
        this.text = text;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public void setCodeBlocks(List<CodeBlock> codeBlocks) {
        this.codeBlocks = codeBlocks;
    }

    public String getText() {
        return text;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public List<CodeBlock> getCodeBlocks() {
        return codeBlocks;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                '}';
    }
}
