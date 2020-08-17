package by.epamtc.information.entity.impl;

import by.epamtc.information.entity.TextElement;
import lombok.Data;

import java.util.List;

@Data
public class Title implements TextElement {
    private String title;
    private Sentence sentence;

    @Override
    public String getString() {
        return title;
    }
}
