import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class InlineMark {
    public static InlineKeyboardMarkup GetMainInline(){
        InlineKeyboardMarkup container = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> KeyLine = new ArrayList<>();
        List<List<InlineKeyboardButton>> MyKeyBoard = new ArrayList<>();
        List<InlineKeyboardButton> KeyLine2 = new ArrayList<>();
        List<InlineKeyboardButton> KeyLine3 = new ArrayList<>();
        List<InlineKeyboardButton> KeyLine4 = new ArrayList<>();
        InlineKeyboardButton MyBut1 = new InlineKeyboardButton("Вывести список товаров");
        MyBut1.setCallbackData("11");

        InlineKeyboardButton MyBut2 = new InlineKeyboardButton("BUT2");
        MyBut2.setCallbackData("22");
        InlineKeyboardButton MyBut3 = new InlineKeyboardButton("BUT3");
        MyBut3.setCallbackData("33");
        InlineKeyboardButton MyBut4 = new InlineKeyboardButton("BUT4");
        MyBut4.setCallbackData("44");
        KeyLine.add(MyBut1);
        KeyLine2.add(MyBut2);
        KeyLine3.add(MyBut3);
        KeyLine4.add(MyBut4);
        MyKeyBoard.add(KeyLine);
        MyKeyBoard.add(KeyLine2);
        MyKeyBoard.add(KeyLine3);
        MyKeyBoard.add(KeyLine4);
        container.setKeyboard(MyKeyBoard);
        return container;
    }
}
