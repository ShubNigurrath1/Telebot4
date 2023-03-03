import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class ReplyMark {//Этот класс создан ради его статических методов которые возвращают Reply-клавиатуры,я беру их в нужный момент
    public static ReplyKeyboardMarkup MainBoard() {
        ReplyKeyboardMarkup container = new ReplyKeyboardMarkup();
        KeyboardButton B1 = new KeyboardButton();
        B1.setText("товар 1");

        KeyboardButton B2 = new KeyboardButton();
        B2.setText("товар 2");
        KeyboardButton B3 = new KeyboardButton();
        B3.setText("товар 3");
        KeyboardButton B4 = new KeyboardButton();
        B4.setText("товар 4");
        KeyboardButton B5 = new KeyboardButton();
        B5.setText("товар 5");
        KeyboardButton B6 = new KeyboardButton();
        B6.setText("товар 6");


        KeyboardRow KeyLine1 = new KeyboardRow();
        KeyLine1.add(B1);
        KeyboardRow KeyLine2 = new KeyboardRow();
        KeyLine2.add(B2);
        KeyboardRow KeyLine3 = new KeyboardRow();
        KeyLine3.add(B3);
        KeyboardRow KeyLine4 = new KeyboardRow();
        KeyLine4.add(B4);
        KeyboardRow KeyLine5 = new KeyboardRow();
        KeyLine5.add(B5);
        KeyboardRow KeyLine6 = new KeyboardRow();
        KeyLine6.add(B6);
        ArrayList<KeyboardRow> KeyBoard = new ArrayList<>();
        KeyBoard.add(KeyLine1);
        KeyBoard.add(KeyLine2);
        KeyBoard.add(KeyLine3);
        KeyBoard.add(KeyLine4);
        KeyBoard.add(KeyLine5);
        KeyBoard.add(KeyLine6);
        container.setKeyboard(KeyBoard);
        container.setResizeKeyboard(false);
        return container;

    }

    public static ReplyKeyboardMarkup SubMenuOne() {
        ReplyKeyboardMarkup container = new ReplyKeyboardMarkup();
        KeyboardButton B1 = new KeyboardButton();
        B1.setText("Подменю кнопки 1 главного меню");

        KeyboardButton B2 = new KeyboardButton();
        B2.setText("2");
        KeyboardButton B3 = new KeyboardButton();
        B3.setText("3");
        KeyboardButton B4 = new KeyboardButton();
        B4.setText("4");
        KeyboardButton B5 = new KeyboardButton();
        B5.setText("5");
        KeyboardButton B6 = new KeyboardButton();
        B6.setText("6");


        KeyboardRow KeyLine1 = new KeyboardRow();
        KeyLine1.add(B1);
        KeyboardRow KeyLine2 = new KeyboardRow();
        KeyLine2.add(B2);
        KeyboardRow KeyLine3 = new KeyboardRow();
        KeyLine3.add(B3);
        KeyboardRow KeyLine4 = new KeyboardRow();
        KeyLine4.add(B4);
        KeyboardRow KeyLine5 = new KeyboardRow();
        KeyLine5.add(B5);
        KeyboardRow KeyLine6 = new KeyboardRow();
        KeyLine6.add(B6);
        ArrayList<KeyboardRow> KeyBoard = new ArrayList<>();
        KeyBoard.add(KeyLine1);
        KeyBoard.add(KeyLine2);
        KeyBoard.add(KeyLine3);
        KeyBoard.add(KeyLine4);
        KeyBoard.add(KeyLine5);
        KeyBoard.add(KeyLine6);
        container.setKeyboard(KeyBoard);
        container.setResizeKeyboard(false);
        return container;

    }
    public static ReplyKeyboardMarkup SubMenuTwo() {
        ReplyKeyboardMarkup container = new ReplyKeyboardMarkup();
        KeyboardButton B1 = new KeyboardButton();
        B1.setText("Подменю кнопки 2 главного меню");

        KeyboardButton B2 = new KeyboardButton();
        B2.setText("2");
        KeyboardButton B3 = new KeyboardButton();
        B3.setText("3");
        KeyboardButton B4 = new KeyboardButton();
        B4.setText("4");
        KeyboardButton B5 = new KeyboardButton();
        B5.setText("5");
        KeyboardButton B6 = new KeyboardButton();
        B6.setText("6");


        KeyboardRow KeyLine1 = new KeyboardRow();
        KeyLine1.add(B1);
        KeyboardRow KeyLine2 = new KeyboardRow();
        KeyLine2.add(B2);
        KeyboardRow KeyLine3 = new KeyboardRow();
        KeyLine3.add(B3);
        KeyboardRow KeyLine4 = new KeyboardRow();
        KeyLine4.add(B4);
        KeyboardRow KeyLine5 = new KeyboardRow();
        KeyLine5.add(B5);
        KeyboardRow KeyLine6 = new KeyboardRow();
        KeyLine6.add(B6);
        ArrayList<KeyboardRow> KeyBoard = new ArrayList<>();
        KeyBoard.add(KeyLine1);
        KeyBoard.add(KeyLine2);
        KeyBoard.add(KeyLine3);
        KeyBoard.add(KeyLine4);
        KeyBoard.add(KeyLine5);
        KeyBoard.add(KeyLine6);
        container.setKeyboard(KeyBoard);
        container.setResizeKeyboard(false);
        return container;

    }
    public static ReplyKeyboardMarkup SubMenuThree() {
        ReplyKeyboardMarkup container = new ReplyKeyboardMarkup();
        KeyboardButton B1 = new KeyboardButton();
        B1.setText("Подменю кнопки 3 главного меню");

        KeyboardButton B2 = new KeyboardButton();
        B2.setText("2");
        KeyboardButton B3 = new KeyboardButton();
        B3.setText("3");
        KeyboardButton B4 = new KeyboardButton();
        B4.setText("4");
        KeyboardButton B5 = new KeyboardButton();
        B5.setText("5");
        KeyboardButton B6 = new KeyboardButton();
        B6.setText("6");


        KeyboardRow KeyLine1 = new KeyboardRow();
        KeyLine1.add(B1);
        KeyboardRow KeyLine2 = new KeyboardRow();
        KeyLine2.add(B2);
        KeyboardRow KeyLine3 = new KeyboardRow();
        KeyLine3.add(B3);
        KeyboardRow KeyLine4 = new KeyboardRow();
        KeyLine4.add(B4);
        KeyboardRow KeyLine5 = new KeyboardRow();
        KeyLine5.add(B5);
        KeyboardRow KeyLine6 = new KeyboardRow();
        KeyLine6.add(B6);
        ArrayList<KeyboardRow> KeyBoard = new ArrayList<>();
        KeyBoard.add(KeyLine1);
        KeyBoard.add(KeyLine2);
        KeyBoard.add(KeyLine3);
        KeyBoard.add(KeyLine4);
        KeyBoard.add(KeyLine5);
        KeyBoard.add(KeyLine6);
        container.setKeyboard(KeyBoard);
        container.setResizeKeyboard(false);
        return container;

    }
    public static ReplyKeyboardMarkup SubMenuFour() {
        ReplyKeyboardMarkup container = new ReplyKeyboardMarkup();
        KeyboardButton B1 = new KeyboardButton();
        B1.setText("Подменю кнопки 4 главного меню");

        KeyboardButton B2 = new KeyboardButton();
        B2.setText("2");
        KeyboardButton B3 = new KeyboardButton();
        B3.setText("3");
        KeyboardButton B4 = new KeyboardButton();
        B4.setText("4");
        KeyboardButton B5 = new KeyboardButton();
        B5.setText("5");
        KeyboardButton B6 = new KeyboardButton();
        B6.setText("6");


        KeyboardRow KeyLine1 = new KeyboardRow();
        KeyLine1.add(B1);
        KeyboardRow KeyLine2 = new KeyboardRow();
        KeyLine2.add(B2);
        KeyboardRow KeyLine3 = new KeyboardRow();
        KeyLine3.add(B3);
        KeyboardRow KeyLine4 = new KeyboardRow();
        KeyLine4.add(B4);
        KeyboardRow KeyLine5 = new KeyboardRow();
        KeyLine5.add(B5);
        KeyboardRow KeyLine6 = new KeyboardRow();
        KeyLine6.add(B6);
        ArrayList<KeyboardRow> KeyBoard = new ArrayList<>();
        KeyBoard.add(KeyLine1);
        KeyBoard.add(KeyLine2);
        KeyBoard.add(KeyLine3);
        KeyBoard.add(KeyLine4);
        KeyBoard.add(KeyLine5);
        KeyBoard.add(KeyLine6);
        container.setKeyboard(KeyBoard);
        container.setResizeKeyboard(false);
        return container;

    }
    public static ReplyKeyboardMarkup SubMenuFive() {
        ReplyKeyboardMarkup container = new ReplyKeyboardMarkup();
        KeyboardButton B1 = new KeyboardButton();
        B1.setText("Подменю кнопки 5 главного меню");

        KeyboardButton B2 = new KeyboardButton();
        B2.setText("2");
        KeyboardButton B3 = new KeyboardButton();
        B3.setText("3");
        KeyboardButton B4 = new KeyboardButton();
        B4.setText("4");
        KeyboardButton B5 = new KeyboardButton();
        B5.setText("5");
        KeyboardButton B6 = new KeyboardButton();
        B6.setText("6");


        KeyboardRow KeyLine1 = new KeyboardRow();
        KeyLine1.add(B1);
        KeyboardRow KeyLine2 = new KeyboardRow();
        KeyLine2.add(B2);
        KeyboardRow KeyLine3 = new KeyboardRow();
        KeyLine3.add(B3);
        KeyboardRow KeyLine4 = new KeyboardRow();
        KeyLine4.add(B4);
        KeyboardRow KeyLine5 = new KeyboardRow();
        KeyLine5.add(B5);
        KeyboardRow KeyLine6 = new KeyboardRow();
        KeyLine6.add(B6);
        ArrayList<KeyboardRow> KeyBoard = new ArrayList<>();
        KeyBoard.add(KeyLine1);
        KeyBoard.add(KeyLine2);
        KeyBoard.add(KeyLine3);
        KeyBoard.add(KeyLine4);
        KeyBoard.add(KeyLine5);
        KeyBoard.add(KeyLine6);
        container.setKeyboard(KeyBoard);
        container.setResizeKeyboard(false);
        return container;

    }
    public static ReplyKeyboardMarkup SubMenuSix() {
        ReplyKeyboardMarkup container = new ReplyKeyboardMarkup();
        KeyboardButton B1 = new KeyboardButton();
        B1.setText("Подменю кнопки 6 главного меню");

        KeyboardButton B2 = new KeyboardButton();
        B2.setText("2");
        KeyboardButton B3 = new KeyboardButton();
        B3.setText("3");
        KeyboardButton B4 = new KeyboardButton();
        B4.setText("4");
        KeyboardButton B5 = new KeyboardButton();
        B5.setText("5");
        KeyboardButton B6 = new KeyboardButton();
        B6.setText("6");


        KeyboardRow KeyLine1 = new KeyboardRow();
        KeyLine1.add(B1);
        KeyboardRow KeyLine2 = new KeyboardRow();
        KeyLine2.add(B2);
        KeyboardRow KeyLine3 = new KeyboardRow();
        KeyLine3.add(B3);
        KeyboardRow KeyLine4 = new KeyboardRow();
        KeyLine4.add(B4);
        KeyboardRow KeyLine5 = new KeyboardRow();
        KeyLine5.add(B5);
        KeyboardRow KeyLine6 = new KeyboardRow();
        KeyLine6.add(B6);
        ArrayList<KeyboardRow> KeyBoard = new ArrayList<>();
        KeyBoard.add(KeyLine1);
        KeyBoard.add(KeyLine2);
        KeyBoard.add(KeyLine3);
        KeyBoard.add(KeyLine4);
        KeyBoard.add(KeyLine5);
        KeyBoard.add(KeyLine6);
        container.setKeyboard(KeyBoard);
        container.setResizeKeyboard(false);
        return container;

    }
}
