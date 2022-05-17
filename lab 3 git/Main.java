package zad3;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("Scene Graph 2D");
        window.setContentPane( new SceneGraph() );
        window.pack();
        window.setLocation(100,60);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        // Exercsise 2

        JFrame window2 = new JFrame("Subroutine Hierarchy");
        window2.setContentPane( new SubroutineHierarchy() );
        window2.pack();
        window2.setLocation(100,60);
        window2.setResizable(false);
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window2.setVisible(true);

    }
}
