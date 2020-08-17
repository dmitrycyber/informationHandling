package by.epamtc.information.entity.impl;

import by.epamtc.information.entity.SentenceElement;
import lombok.Data;

@Data
public class PunctuationMark implements SentenceElement {
    private String mark;

    public PunctuationMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String getString() {
        return mark;
    }
}
