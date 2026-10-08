package de.javaqualitytool.navigation;

public class MenuController {

    private final MenuModel model;
    private final MenuView view;

    public MenuController(){
        this.model = new MenuModel();
        this.view = new MenuView(this.model);
    }
    public void initialize(){
        model.setCurrentScene(Scene.MAIN_MENU);
        view.update();
    }

    public void switchToScene(Scene scene){
        model.setCurrentScene(scene);
        view.update();
    }
}
