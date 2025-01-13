package es.codegym.telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MyFirstTelegramBot extends MultiSessionTelegramBot {

    public static final String NAME = "PrimerBot0712_bot";
    public static final String TOKEN = "8149510674:AAEHJm2TkjM0o5qjeNYpwn0DAgD_b0YGEv4";

    public MyFirstTelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
    public void onUpdateEventReceived(Update update) {
        // TODO: escribiremos la funcionalidad principal del bot aquí
        if (getMessageText().equals("/start")) {
            sendTextMessageAsync("Hola, como va todo?");
        }

        if (getMessageText().equals("Bien")){
            sendTextMessageAsync("Que bien, cual es tu nombre ?");
        }

        if (getMessageText().contains("nombre")){
            sendTextMessageAsync("Mucho gusto, yo soy *Gato*");
        }

        if (getMessageText().contains("?")){
            sendTextMessageAsync("si, soy *Gato*, aunque no lo parezca");
        }
    }

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}