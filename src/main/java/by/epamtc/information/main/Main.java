package by.epamtc.information.main;

import by.epamtc.information.dao.DAOFactory;
import by.epamtc.information.dao.InformationDAO;
import by.epamtc.information.entity.impl.Text;
import by.epamtc.information.entity.TextElement;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        final DAOFactory instance = DAOFactory.getInstance();
        final InformationDAO informationDAO = instance.getInformationDAO();

        final Text text = informationDAO.text("text.txt");
        final List<TextElement> textElements = informationDAO.textElementList(text);

//        System.out.println(text);
        System.out.println(textElements.size());

    }


}
