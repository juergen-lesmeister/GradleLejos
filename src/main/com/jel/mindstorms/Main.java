package com.jel.mindstorms;

// https://search.maven.org/#search%7Cga%7C1%7Ca%3A%22lejos-ev3-api%22

import lejos.hardware.BrickFinder;
import lejos.hardware.BrickInfo;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.*;
import lejos.hardware.motor.Motor;
import lejos.utility.Delay;

public class Main {

    public static void main(String[] args) {
        GraphicsLCD g = BrickFinder.getDefault().getGraphicsLCD();
        final int SW = g.getWidth();
        final int SH = g.getHeight();

        g.setFont(Font.getDefaultFont());
        g.drawString("Hallo Finn", SW/2, SH/2, GraphicsLCD.BASELINE|GraphicsLCD.HCENTER);
        Delay.msDelay(2000);
        g.clear();
        g.refresh();
    }
}
