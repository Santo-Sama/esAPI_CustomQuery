package com.example.esAPI_CustomQuery.enums;

public enum StatusFlight {
    ONTIME("The flight is on time"),
    DELAYED("The flight has been delayed"),
    CANCELLED("The flight has been cancelled");

    private String descrizione;

    StatusFlight(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
