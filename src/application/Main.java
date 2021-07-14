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
// https://www.youtube.com/watch?v=d_vunavwQsE&list=PLj0NZBHsZJkO74HON3mW-N9wFTiGCeukW&index=1