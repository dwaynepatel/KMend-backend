package com.kmend.techtest.utility;

public enum Region {
    UNITED_STATES("United States"),
    APAC("APAC"),
    LATIN_AMERICA("Latin America"),
    EUROPE("Europe");

    public final String label;

    private Region(String label) {
        this.label = label;
    }
}
