import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
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
                String response = parseMessage(inMess.getText());
                //Создаем объект класса SendMessage - наш будущий ответ пользователю
                SendMessage outMess = new SendMessage();
/////////////////////////////// //СОЗДАЁМ inline-КЛАВИАТУРУ//////////////////////////////////////////////////
                InlineKeyboardMarkup container=new InlineKeyboardMarkup();
                List<InlineKeyboardButton>KeyLine=new ArrayList<>();
                List<List<InlineKeyboardButton>>MyKeyBoard=new ArrayList<>();
                InlineKeyboardButton MyBut1=new InlineKeyboardButton("BUT");
                MyBut1.setCallbackData("11");
                InlineKeyboardButton MyBut2=new InlineKeyboardButton("BUT2");
                MyBut2.setCallbackData("22");
                InlineKeyboardButton MyBut3=new InlineKeyboardButton("BUT3");
                MyBut3.setCallbackData("33");
                InlineKeyboardButton MyBut4=new InlineKeyboardButton("BUT4");
                MyBut4.setCallbackData("44");
                KeyLine.add(MyBut1);
                KeyLine.add(MyBut2);
                KeyLine.add(MyBut3);
                KeyLine.add(MyBut4);
                MyKeyBoard.add(KeyLine);
                container.setKeyboard(MyKeyBoard);
///////////////////////////////////СОЗДАЛИ КЛАВИАТУРУ///////////////////////////////////////////////////////////////////////
                //Добавляем в наше сообщение id чата а также наш ответ
                outMess.setChatId(chatId);
                outMess.setText(response);
                outMess.setReplyMarkup(container);
                execute(outMess);
            }
            else if (update.hasCallbackQuery()){
                SendMessage sendMessage=new SendMessage();
                CallbackQuery callbackQuery=update.getCallbackQuery();
                String data=callbackQuery.getData();
                User user=callbackQuery.getFrom();
                Message message=callbackQuery.getMessage();
                if(data.equals("11"))   Sender(update,"Была нажата кнопка 1");
                else if(data.equals("22")) Sender(update,"Была нажата кнопка 2");
                else if(data.equals("33")) Sender(update,"Button 3 was pressed");
                else if (data.equals("44")) Sender(update,"Button 4 was pressed");




            }

        } catch (TelegramApiException e) {
            e.printStackTrace();

        }
    }
    public void Sender(Update update,String textMsg){
        CallbackQuery callbackQuery=update.getCallbackQuery();
        Message message=callbackQuery.getMessage();
        SendMessage send=new SendMessage();
        send.setChatId(message.getChatId().toString());

        String data=callbackQuery.getData();



        send.setText(textMsg);
        try {
            execute(send);
        }
        catch (TelegramApiException e){e.printStackTrace();}



    }
    public String parseMessage(String textMsg) {
        String response;
        //Сравниваем текст пользователя с нашими командами, на основе этого формируем ответ
        if(textMsg.equals("/start"))
            response = "Привет,я знаю много цитат.Жми /get";
        else if(textMsg.equals("/get"))
            response = storage.getRandQuote();

        else
            response = "Сообщение не распознано";
        return response;
    }
}
