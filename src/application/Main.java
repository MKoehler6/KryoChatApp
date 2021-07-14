package application;

import gui.Gui;

import javax.swing.*;

public class Main {
    public static boolean isHost, isConnected = false;
    public static Gui gui;
    public static void main(String[] args) {
        gui = new Gui();
        gui.create();
    }
}
