import org.telegram.telegrambots.bots.TelegramLongPollingBot;

import org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;


import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bot extends TelegramLongPollingBot {

    final private String BOT_TOKEN = "5907762286:AAGBnokK8RigMYcReOeyI1pG8T1wR_XTPmw";
    final private String BOT_NAME = "Telebot";
    Storage storage;

    Bot() {
        storage = new Storage();
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

        try {
            if (update.hasMessage() && update.getMessage().hasText()) {//Итак,если есть сообщение и сообщение имеет текст,то:

                execute(parseMessage(update));//отправляем метод,в котором реализуется ветвление,то есть в зависимости от входящего сообщения меняется ответное
            } else if (update.hasCallbackQuery()) {

               execute(CallBackSender(update));

            }

        } catch (TelegramApiException e) {
            e.printStackTrace();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public SendMessage CallBackSender(Update update) throws IOException {//этот метод в зависимости от содержимого CallBackQuery отправляет нужное
        CallbackQuery callbackQuery = update.getCallbackQuery();//сообщение
        Message message = callbackQuery.getMessage();
        SendMessage send = new SendMessage();
        send.setChatId(message.getChatId().toString());

        String calldata=callbackQuery.getData();
        String textMsg="";

            if(calldata.equals("11")){
            send.setReplyMarkup(null);
            send.setReplyMarkup(ReplyMark.MainBoard());//Цепляем нижнюю клавиатуру главное меню
            textMsg="Была нажата кнопка Вывести список товара";
            send.setText(textMsg);
            }
            else if(calldata.equals("22")){
                send.setReplyMarkup(null);
                textMsg="Button 2 was pressed";

                 send.setText(textMsg);
            send.setReplyMarkup(InlineMark.GetDynamVitrina());}


return send;

    }

    public void ReplySender(Update update, ReplyKeyboardMarkup rkm) {//Этот метод возвращает готовый обЪект SendMessage
        Message inmess = update.getMessage();                        //которому на вход подается нужная Репли-Клавиатура
        String chatID = inmess.getChatId().toString();                //и метод цепляет ее к сообщению и возвращает это сообщение
                                                                      //В параметры ему удобно подавать статические методы моего
        SendMessage send = new SendMessage();                         //класса ReplyMark
        send.setChatId(chatID);
        send.setReplyMarkup(rkm);
        try {
            execute(send);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public SendMessage parseMessage(Update update) {//Выдает нам готовый обьект сообщения ,разный в зависимости от параметров входящего сообщения

        Message inmess = update.getMessage();
        String textMsg = inmess.getText();
        String chatid = inmess.getChatId().toString();
        SendMessage send = new SendMessage();
        send.setChatId(chatid);//Собственно как обычно создали обьект сообщения,дали ему нужные установки
        //Сравниваем текст пользователя с нашими командами, на основе этого формируем ответ
        if (textMsg.equals("/start")) {//TextMsg это текст входящего сообщения(см выше)
            send.setReplyMarkup(InlineMark.GetMainInline());
            send.setText("Привет,я знаю много цитат.Жми /get");
        } else if (textMsg.equals("/get")) {
            send.setText(storage.getRandQuote());
        } else if (textMsg.equals("товар 1")) {
            send.setReplyMarkup(ReplyMark.SubMenuOne());
            send.setText("Submenu 1");
        }else if (textMsg.equals("товар 2")) {
            send.setReplyMarkup(ReplyMark.SubMenuTwo());
            send.setText("Submenu 2");
        }else
            send.setText("Сообщение не распознано");
        return send;
    }
}
