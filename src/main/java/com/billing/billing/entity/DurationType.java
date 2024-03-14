package com.billing.billing.entity;

public enum DurationType {
    DAILY("Daily"),
    WEEKLY("Weekly"),
    MONTHLY("Monthly");

    private final String label;

    DurationType(final String label) {
        this.label = label;
    }

    public static DurationType valueOfLabel(String label) {
        for (DurationType e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }

    public String getLabel() {
        return label;
    }
}
