package de.hsb.app.kv.model;

public enum Kreditkartentyp {
    MASTER("MasterCard"), VISA("Visa"), AMEX("American Express");
    private final String label;

    Kreditkartentyp(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
