package de.javaqualitytool.navigation;

public class MenuView {

    private final MenuModel model;


    public MenuView(MenuModel model){
        this.model = model;
    }

    public void update(){
        drawScene(model.getCurrentScene());
    }

    public void drawScene(Scene scene){
        switch(scene){
            case MAIN_MENU:
                drawMainMenu();
                break;

            case QUALITY_ANALYSIS:
                drawQualityAnalysis();
                break;

            default:
                System.out.println("Invalid Scene");
                break;

        }
    }

    private void drawMainMenu(){
        System.out.println("This image is presented by Main Menu");
    }

    private void drawQualityAnalysis(){
        System.out.println("This image is analysed with quality");
    }
}
