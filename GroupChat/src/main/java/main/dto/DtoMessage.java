package main.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoMessage {

    private String text;

    private String datetime;

    private String username;

    public DtoMessage() {
    }

    public DtoMessage(String text, String datetime, String username) {
        this.text = text;
        this.datetime = datetime;
        this.username = username;
    }
}
