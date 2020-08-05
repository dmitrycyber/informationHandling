package by.epamtc.information.entity.impl;

import by.epamtc.information.entity.TextElement;

import java.util.List;

public class Title implements TextElement {
    private String title;
    private List<Sentence> sentences;

    public Title(String title) {
        this.title = title;
    }
}
