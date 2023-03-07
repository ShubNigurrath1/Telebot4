import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.io.IOException;
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
    public static InlineKeyboardMarkup GetDynamVitrina() throws IOException {
        InlineKeyboardMarkup container1=new InlineKeyboardMarkup();
        List<InlineKeyboardButton>KeyLine1=new ArrayList<>();
        List<InlineKeyboardButton>KeyLine2=new ArrayList<>();
        List<InlineKeyboardButton>KeyLine3=new ArrayList<>();
        List<InlineKeyboardButton>KeyLine4=new ArrayList<>();
        List<InlineKeyboardButton>KeyLine5=new ArrayList<>();
        List<InlineKeyboardButton>KeyLine6=new ArrayList<>();

        List<List<InlineKeyboardButton>>KeyList=new ArrayList<>();//Наполняем лист кейлайнами для последущей работы с ними в цикле.
        KeyList.add(KeyLine1);
        KeyList.add(KeyLine2);
        KeyList.add(KeyLine3);
        KeyList.add(KeyLine4);
        KeyList.add(KeyLine5);
        KeyList.add(KeyLine6);

        InlineKeyboardButton b1=new InlineKeyboardButton();//Создаём инлайн кнопки
        InlineKeyboardButton b2=new InlineKeyboardButton();
        InlineKeyboardButton b3=new InlineKeyboardButton();
        InlineKeyboardButton b4=new InlineKeyboardButton();
        InlineKeyboardButton b5=new InlineKeyboardButton();
        InlineKeyboardButton b6=new InlineKeyboardButton();

        List<InlineKeyboardButton>ButList=new ArrayList<>();//Создаём лист кнопок для последующей работы с ними в массиве
        ButList.add(b1);//и наполняем лист кнопками
        ButList.add(b2);
        ButList.add(b3);
        ButList.add(b4);
        ButList.add(b5);
        ButList.add(b6);


        List<List<InlineKeyboardButton>> KeyBoard=new ArrayList<>();//Создали клавиатуру для финального заполнения
        int i;
        for (i=0;i<Reader.GetList().size();i++){
            ButList.get(i).setText(Reader.GetList().get(i));
            ButList.get(i).setCallbackData(Reader.GetList().get(i)+"ll");
            KeyList.get(i).add(ButList.get(i));
            KeyBoard.add(KeyList.get(i));


        }
        container1.setKeyboard(KeyBoard);
        return container1;
    }
}
