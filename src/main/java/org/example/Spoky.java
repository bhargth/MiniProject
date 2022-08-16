package org.example;

import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class Spoky {

    private final char spooky ;

    public Spoky() {
        this.spooky = '\u2639';
    }

    public char getSpooky() {
        return spooky;
    }

    /*static private boolean continueReadingInput = true;
    static DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory();
    static Terminal terminal;


     public static void spokyActions(){
    while (continueReadingInput) {
        KeyStroke keyStroke = null;

        do {
            Thread.sleep(5); // might throw InterruptedException
            keyStroke = terminal.pollInput();
        } while (keyStroke == null);
        KeyType type = keyStroke.getKeyType();
        if (type == KeyType.Character) {
            continueReadingInput = false;
            System.out.println("quit");

        } else {
            terminal.setCursorVisible(false);
            switch (type) {
                case ArrowDown:
                    terminal.setCursorPosition(x, y += 1);
                    terminal.putCharacter(player);
                    break;
                case ArrowUp:
                    terminal.setCursorPosition(x, y -= 1);
                    terminal.putCharacter(player);
                    break;
                case ArrowRight:
                    terminal.setCursorPosition(x += 1, y);
                    terminal.putCharacter(player);
                    break;
                case ArrowLeft:
                    terminal.setCursorPosition(x -= 1, y);
                    terminal.putCharacter(player);
                    break;
            }
        }

        terminal.flush();

    }
    }*/


}
