package org.example.tgservice.keyboardMarkups;

import lombok.RequiredArgsConstructor;
import org.example.tgservice.config.UserInitialization;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

@Service
@RequiredArgsConstructor
public class DaysButton implements Button{

    private final UserInitialization userInit;

    @Override
    public boolean support(String callback) {
        return callback.equals("day");
    }

    @Override
    public InlineKeyboardMarkup inlineKeyboardMarkup() {
        return null;
    }

    @Override
    public EditMessageText edit(Message message) {
        EditMessageText editMessage = new EditMessageText();
        editMessage.setChatId(message.getChatId().toString());
        editMessage.setText("Введите количество дней: ");
        editMessage.setMessageId(message.getMessageId());

        userInit.getUserDto().setTimeState("day");

        return editMessage;
    }


}
