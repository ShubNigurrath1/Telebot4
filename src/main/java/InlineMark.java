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

    public static InlineKeyboardMarkup GetDynamVitrina(){
        //создаем массив кнопок///////////////////////////////////
        InlineKeyboardButton b1=new InlineKeyboardButton();
        InlineKeyboardButton b2=new InlineKeyboardButton();
        InlineKeyboardButton b3=new InlineKeyboardButton();
        InlineKeyboardButton b4=new InlineKeyboardButton();

        InlineKeyboardButton[]ButMass={b1,b2,b3,b4};
/////////////////////////////////////////////////////////////////////
        //Создаем несколько динамических массивов кнопок(потому что апи бота врспринимает д.массив кнопок как ряд,и если в ряду одна кнопка,то следующая размещается под ней,что нам и надо,соответственно для каждой кнопки создадим массив кнопок)
        List<InlineKeyboardButton>KeyLine1= new ArrayList<>();
        List<InlineKeyboardButton>KeyLine2= new ArrayList<>();
        List<InlineKeyboardButton>KeyLine3= new ArrayList<>();
        List<InlineKeyboardButton>KeyLine4= new ArrayList<>();
        //Теперь создаем массив из динамических массивов
       ArrayList< List<InlineKeyboardButton>>ListMassiv=new ArrayList<>();
       ListMassiv.add(KeyLine1);
       ListMassiv.add(KeyLine2);
       ListMassiv.add(KeyLine3);
       ListMassiv.add(KeyLine4);
        ////////////////////////////////////////////////////////////////

        InlineKeyboardMarkup container1=new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>>MyKeyBoard=new ArrayList<>();
         String[]registr={"one","two","three","four","five"};
         int i;
         for(i=0;i<registr.length-1 ;i++){
             ButMass[i].setCallbackData(registr[i]);//КаллбэкДату устанавливаем в виде текста товара
             ButMass[i].setText(registr[i]);
             ListMassiv.get(i).add(ButMass[i]);

         }
         container1.setKeyboard(ListMassiv);
return container1;

    }
}
