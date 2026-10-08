package de.javaqualitytool.navigation;

public class MenuModel {

    private Scene currentScene;

    public MenuModel(){
        currentScene = Scene.MAIN_MENU;
    }

    public Scene getCurrentScene(){
        return currentScene;
    }

    public void setCurrentScene(Scene scene){
        this.currentScene = scene;
    }
}
