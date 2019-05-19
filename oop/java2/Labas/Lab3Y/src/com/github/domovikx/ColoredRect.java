package com.github.domovikx;

import java.text.MessageFormat;

public class ColoredRect extends DrawRect {

    private String inColor;

    public void draw(String outColor, String inColor) {
        draw(outColor);
        this.inColor = inColor;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}, цвет прямоугольника: {1}", super.toString(), inColor);
    }

}
