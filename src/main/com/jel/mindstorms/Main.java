package com.jel.mindstorms;

// lejos ev3 api artifact on mavencentral:
// https://search.maven.org/#search%7Cga%7C1%7Ca%3A%22lejos-ev3-api%22

import lejos.hardware.BrickFinder;
import lejos.hardware.BrickInfo;
import lejos.hardware.ev3.EV3;
import lejos.hardware.Keys;
import lejos.hardware.lcd.*;
import lejos.hardware.motor.Motor;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class Main {

    public static void main(String[] args) {
        EV3 brick = (EV3)BrickFinder.getDefault();
        GraphicsLCD g = brick.getGraphicsLCD();
        Keys buttons = brick.getKeys();
        final int SW = g.getWidth();
        final int SH = g.getHeight();

        g.setFont(Font.getDefaultFont());
        g.drawString("Hallo Finn", SW/2, SH/2, GraphicsLCD.BASELINE|GraphicsLCD.HCENTER);
        buttons.waitForAnyPress();
        g.clear();
        g.refresh();

        EV3LargeRegulatedMotor motorA =
                new EV3LargeRegulatedMotor(MotorPort.A);
        motorA.setSpeed(720);
    }
}
