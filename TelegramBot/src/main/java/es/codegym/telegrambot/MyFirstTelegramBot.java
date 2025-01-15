package es.codegym.telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Map;

import static es.codegym.telegrambot.TelegramBotContent.*;

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
            setUserGlory(0);
            sendPhotoMessageAsync("step_1_pic");
            sendTextMessageAsync(STEP_1_TEXT,
                    Map.of("Hackear la nevera", "step_1_btn"));
        }

        if (getCallbackQueryButtonKey().equals("/start")) {
            setUserGlory(0);
            sendPhotoMessageAsync("step_1_pic");
            sendTextMessageAsync(STEP_1_TEXT,
                    Map.of("Hackear la nevera", "step_1_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_1_btn")){
            setUserGlory(20);
            sendPhotoMessageAsync("step_2_pic");
            sendTextMessageAsync(STEP_2_TEXT,
                    Map.of( "Tomar una salchica +20 de fama", "step_2_btn",
                            "Tomar una pescado +20 de fama", "step_2_btn",
                            "Tirar una lata de pepinillos +20 de fama", "step_2_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_2_btn")){
            setUserGlory(20);
            sendPhotoMessageAsync("step_3_pic");
            sendTextMessageAsync(STEP_3_TEXT,
                    Map.of("Hackear al robot aspiradora", "step_3_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_3_btn")){
            setUserGlory(30);
            sendPhotoMessageAsync("step_4_pic");
            sendTextMessageAsync(STEP_4_TEXT,
                    Map.of("Enviar al robot aspiradora por comida +30 de fama", "step_4_btn",
                            "Dar un paso en el robot aspirador +30 de fama", "step_4_btn",
                            "Huir del robot aspiradora +30 de fama", "step_4_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_4_btn")){
            addUserGlory(40);
            sendPhotoMessageAsync("step_5_pic");
            sendTextMessageAsync(STEP_5_TEXT,
                    Map.of("Usar la GoPro +40 de fama", "step_5_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_5_btn")){
            addUserGlory(30);
            sendPhotoMessageAsync("step_6_pic");
            sendTextMessageAsync(STEP_6_TEXT,
                    Map.of("Grabar un paseo por el parque +40 de fama","step_6_btn",
                            "Salir a saltar por los techos +40 de fama","step_6_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_6_btn")){
            //addUserGlory();
            sendPhotoMessageAsync("step_7_pic");
            sendTextMessageAsync(STEP_7_TEXT,
                    Map.of("Caminar sobre el teclado +50 de fama","step_7_btn"));
        }

        if(getCallbackQueryButtonKey().equals("step_7_btn")){
            sendPhotoMessageAsync("step_8_pic");
            sendTextMessageAsync(STEP_8_TEXT,
                    Map.of("Fama maxima alcanzada, GENIAL, teminos el dia de momento","final_text"));
        }

        if (getCallbackQueryButtonKey().equals("final_text")){
            sendPhotoMessageAsync("final_pic");
            sendTextMessageAsync(FINAL_TEXT,
                    Map.of("Precio este boton para reiniciar el dia o escribe /start","/start"));
        }

        /*
        if (getMessageText().equals("Bien")){
            sendTextMessageAsync("Que bien, cual es tu nombre ?");
        }

        if (getMessageText().contains("nombre")){
            sendTextMessageAsync("Mucho gusto, yo soy *Gato*");
        }

        if (getMessageText().contains("?")){
            sendTextMessageAsync("si, soy *Gato*, aunque no lo parezca");
        }

         */
    }

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}