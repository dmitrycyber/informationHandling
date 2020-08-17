package by.epamtc.information.entity.impl;

import by.epamtc.information.entity.SentenceElement;
import lombok.Data;

@Data
public class Word implements SentenceElement {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String getString() {
        return word;
    }
}
