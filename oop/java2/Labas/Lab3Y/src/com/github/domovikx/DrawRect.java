package com.github.domovikx;

import java.text.MessageFormat;

public class DrawRect extends Rectangle {

    private String outColor;

    public void draw(String outColor) {
        this.outColor = outColor;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}, out: {1}", super.toString(), outColor);
    }
}
