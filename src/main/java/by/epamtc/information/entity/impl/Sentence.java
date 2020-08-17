package by.epamtc.information.entity.impl;

import by.epamtc.information.entity.SentenceElement;
import lombok.Data;

import java.util.List;

@Data
public class Sentence {
    private List<SentenceElement> sentenceElements;
}
