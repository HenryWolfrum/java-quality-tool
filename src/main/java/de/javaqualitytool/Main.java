package de.javaqualitytool;

import de.javaqualitytool.navigation.MenuController;
import de.javaqualitytool.navigation.Scene;

public class Main {


    public static void main(String[] args) {

        MenuController controller = new MenuController();
        controller.initialize();
        controller.switchToScene(Scene.QUALITY_ANALYSIS);
    }



}