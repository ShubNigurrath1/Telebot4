import org.telegram.telegrambots.bots.TelegramLongPollingBot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;


import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class Bot extends TelegramLongPollingBot {

     final private String BOT_TOKEN = "5907762286:AAGBnokK8RigMYcReOeyI1pG8T1wR_XTPmw";
    final private String BOT_NAME = "Telebot";
    Storage storage;
    Bot(){
        storage=new Storage();
    }

    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {

        try{
            if(update.hasMessage()&&update.getMessage().hasText())
            {
                //Извлекаем из объекта сообщение пользователя
                Message inMess = update.getMessage();
                //Достаем из inMess id чата пользователя
                String chatId = inMess.getChatId().toString();
                //Получаем текст сообщения пользователя, отправляем в написанный нами обработчик,который возвращает нам ответ в зависимости от сообщения пользователя

                //Создаем объект класса SendMessage - наш будущий ответ пользователю
                SendMessage outMess = new SendMessage();
/////////////////////////////// //СОЗДАЁМ inline-КЛАВИАТУРУ//////////////////////////////////////////////////
                InlineKeyboardMarkup container=new InlineKeyboardMarkup();
                List<InlineKeyboardButton>KeyLine=new ArrayList<>();
                List<List<InlineKeyboardButton>>MyKeyBoard=new ArrayList<>();
                List<InlineKeyboardButton>KeyLine2=new ArrayList<>();
                List<InlineKeyboardButton>KeyLine3=new ArrayList<>();
                List<InlineKeyboardButton>KeyLine4=new ArrayList<>();
                InlineKeyboardButton MyBut1=new InlineKeyboardButton("Вывести список товаров");
                MyBut1.setCallbackData("11");
                InlineKeyboardButton MyBut2=new InlineKeyboardButton("BUT2");
                MyBut2.setCallbackData("22");
                InlineKeyboardButton MyBut3=new InlineKeyboardButton("BUT3");
                MyBut3.setCallbackData("33");
                InlineKeyboardButton MyBut4=new InlineKeyboardButton("BUT4");
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
///////////////////////////////////СОЗДАЛИ КЛАВИАТУРУ///////////////////////////////////////////////////////////////////////
                //Добавляем в наше сообщение id чата а также наш ответ

                parseMessage(update,container);
                execute(parseMessage(update,container));
            }
            else if (update.hasCallbackQuery()){

                CallbackQuery callbackQuery=update.getCallbackQuery();
                String data=callbackQuery.getData();


                if(data.equals("11"))   CallBackSender(update,"Была нажата кнопка 1");
                else if(data.equals("22")) CallBackSender(update,"Была нажата кнопка 2");
                else if(data.equals("33")) CallBackSender(update,"Была нажата кнопка 3");
                else if (data.equals("44")) CallBackSender(update,"Была нажата кнопка 4");




            }
            else  if (update.getMessage().getText().equals("товар 1")) ReplySender(update,ReplyMark.SubMenuOne());

        } catch (TelegramApiException e) {
            e.printStackTrace();

        }
    }
    public void CallBackSender(Update update,String textMsg){
        CallbackQuery callbackQuery=update.getCallbackQuery();
        Message message=callbackQuery.getMessage();
        SendMessage send=new SendMessage();
        send.setChatId(message.getChatId().toString());




        send.setText(textMsg);
        try {
            send.setReplyMarkup(ReplyMark.MainBoard());
            execute(send);
        }
        catch (TelegramApiException e){e.printStackTrace();}



    }
    public  void ReplySender(Update update,ReplyKeyboardMarkup rkm){
        Message inmess=update.getMessage();
        String chatID=inmess.getChatId().toString();
        SendMessage send=new SendMessage();
        send.setChatId(chatID);
        send.setReplyMarkup(rkm);
        try {execute(send);}
        catch (TelegramApiException e){e.printStackTrace();}

    }
    public SendMessage parseMessage(Update update,InlineKeyboardMarkup inline) {

        Message inmess=update.getMessage();
        String textMsg=inmess.getText();
        String chatid=inmess.getChatId().toString();
        SendMessage send=new SendMessage();
        send.setChatId(chatid);
        //Сравниваем текст пользователя с нашими командами, на основе этого формируем ответ
        if(textMsg.equals("/start")){
            send.setReplyMarkup(inline);

           send.setText("Привет,я знаю много цитат.Жми /get");
        }

        else if(textMsg.equals("/get")){
           storage.getRandQuote();
            send.setText( storage.getRandQuote());
        }
        else if(textMsg.equals("товар 1")){send.setReplyMarkup(ReplyMark.SubMenuOne());
        send.setText("есть товар 1");
        }
        else
            send.setText("Сообщение не распознано");




        return send;
    }
}
