package main.dto;

import main.model.Message;

public class MessageMapper {

    public static DtoMessage map(Message message) {
        DtoMessage dtoMessage = new DtoMessage();
        dtoMessage.setDatetime(dtoMessage.getDatetime());
        dtoMessage.setText(message.getMessage());
        dtoMessage.setUsername(message.getUser().getName());
        return dtoMessage;
    }
}
