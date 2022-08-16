package org.example;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Screen screen = new Screen();
        Spoky spoky = new Spoky();
        screen.putChar(11, 40, spoky.getSpooky(), Screen.WHITE, Screen.GREEN);
        screen.screenWithDots();

        }
    }




        /*System.out.println(terminal.getTerminalSize());
        int x = 40;
        int y = 11;
        screenWithDots(terminal);

        terminal.flush();
    }




    public static void screenWithDots(Terminal terminal) throws IOException {
        char dot = '.';
        int row , col ;
        row= terminal.getTerminalSize().getRows();
        col = terminal.getTerminalSize().getColumns();

       for (int i = 0; i<row; i++) {
           for(int j= 0; j<col; j++){
               terminal.setCursorPosition(j, i);

               if(i==(row/2) && j==(col/2)){
                   terminal.putCharacter(spooky);

               }
               terminal.putCharacter(dot);
           }
       }


   }




}

public class Main {
}*/