package by.epamtc.information.entity.impl;

import by.epamtc.information.entity.TextElement;
import lombok.Data;

@Data
public class CodeBlock implements TextElement {
    private String codeBlock;

    @Override
    public String getString() {
        return codeBlock;
    }
}
