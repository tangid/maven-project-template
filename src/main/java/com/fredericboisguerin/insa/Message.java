package com.fredericboisguerin.insa;

import java.util.Date;

public class Message {

    private final String mess;
    private final Date horodatation;
    private final boolean recu;

    public Message(String message, boolean recu)
    {
        this.mess = message;
        this.horodatation = new Date();
        this.recu = recu;

    }

    public String getMessage()
    {
        return this.mess;

    }

    public Date getHorodatation()
    {
        return this.horodatation;

    }

    public boolean isRecu() {
        return recu;
    }
}
