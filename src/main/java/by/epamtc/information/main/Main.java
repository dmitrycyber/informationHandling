package by.epamtc.information.main;

import by.epamtc.information.dao.InformationDAO;
import by.epamtc.information.entity.impl.*;
import by.epamtc.information.service.TextPrinterService;
import java.util.HashMap;


public class Main {


    public static void main(String[] args) {
        ApplicationContext context = Application.run("by.epamtc.information", new HashMap<>());

        InformationDAO informationDAO = context.getObject(InformationDAO.class);

        TextPrinterService textPrinterService = context.getObject(TextPrinterService.class);

        Text text = informationDAO.createText("text.txt");

        textPrinterService.printText(text);
    }
}
