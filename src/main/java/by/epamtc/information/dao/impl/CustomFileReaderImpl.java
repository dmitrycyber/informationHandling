package by.epamtc.information.dao.impl;

import by.epamtc.information.dao.CustomFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CustomFileReaderImpl implements CustomFileReader {

    @Override
    public String stringFromFile(String fileName){
        String source = null;
        try(Reader reader = new FileReader(CustomFileReaderImpl.class.getClassLoader().getResource(fileName).getPath());
            BufferedReader bufferedReader = new BufferedReader(reader)
        ) {
            source = bufferedReader.lines()
                    .map(line -> line + "\n")
                    .reduce((line1, line2) -> line1 + line2)
                    .orElse(null);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return source;
    }
}
