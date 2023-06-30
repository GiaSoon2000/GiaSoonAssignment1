package com.example.giasoonassignment;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class GiaSoonAssignment extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        StackPane messagePane = new StackPane();// Create and configure the center pane for the compelling message

        // Create the root pane and set the background
        BorderPane rootPane = new BorderPane();

        // Load the background image
        Image backgroundImage = new Image(GiaSoonAssignment.class.getResource("Smash_hit.jpg").toString());
        BackgroundSize backgroundSize = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);

        rootPane.setBackground(new Background(background));
        messagePane.getChildren().add(messageBox());
        // Add the panes to the root pane
        rootPane.setTop(menuPane());
        rootPane.setCenter(messagePane);

        // Create the scene
        Scene scene = new Scene(rootPane, 800, 600);
        stage.setTitle("Smash hit");
        stage.setScene(scene);
        stage.show();
    }

    public VBox messageBox(){
        VBox msgBox = new VBox(10); // Set the spacing between the heading and message
        msgBox.setPadding(new Insets(100,0,0,35));
        msgBox.setAlignment(Pos.CENTER);
        msgBox.setSpacing(10);

        Text headingText = new Text("Shatter the Limits, Unleash Your Skills " +
                "\n- Become the Ultimate Glass Demolisher in Smash Hit!");
        headingText.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        headingText.setFill(Color.WHITE);

        Text messageText = new Text(
                "In Smash Hit, prepare for an exhilarating glass-shattering experience! Take aim, tap the" +
                        "\nscreen, and unleash a barrage of metal balls to break through mesmerizing glass structures." +
                        "\nWith the camera propelling you forward, every shot counts as you face a moving target in a" +
                        "\nstunning 3D world." +
                        "\n\nAre you ready to showcase your aiming skills, overcome challenges, and dominate the" +
                        "\nleaderboard? Dive into the addictive gameplay of Smash Hit and unleash the power within" +
                        "\nyou!\n");

        messageText.setFont(Font.font("Arial", 20));
        messageText.setFill(Color.WHITESMOKE);

        // Create and configure the play button
        Button playButton = new Button("Play");
        playButton.setFont(Font.font("Arial", FontWeight.BOLD, 24)); // Set the font weight and size of the button
        playButton.setStyle("-fx-pref-width: 120px; -fx-pref-height: 40px;"); // Set the size of the button


        msgBox.getChildren().addAll(headingText, messageText, playButton );

        return msgBox;
    }
    public HBox menuPane(){
        // Add the game name, menu bar, and social media icons to a VBox
        HBox menuPane = new HBox();
        menuPane.setAlignment(Pos.CENTER);
        menuPane.setPadding(new Insets(10));

        // Create and configure the game name text
        Text gameNameText = new Text("Smash Hit");
        gameNameText.setFill(Color.WHITE);
        gameNameText.setFont(Font.font("SansSerif", 40));


        Region spacing1 = new Region();
        HBox.setHgrow(spacing1, Priority.ALWAYS);

        Region spacing2 = new Region();
        HBox.setHgrow(spacing2, Priority.ALWAYS);

        // Create and configure the top-right social media icons
        ImageView icon1 = new ImageView(new Image(GiaSoonAssignment.class.getResource("social_icon1.png").toString()));
        icon1.setFitHeight(30);
        icon1.setPreserveRatio(true);
        ImageView icon2 = new ImageView(new Image(GiaSoonAssignment.class.getResource("social_icon2.png").toString()));
        icon2.setFitHeight(30);
        icon2.setPreserveRatio(true);
        ImageView icon3 = new ImageView(new Image(GiaSoonAssignment.class.getResource("social_icon3.png").toString()));
        icon3.setFitHeight(30);
        icon3.setPreserveRatio(true);


        // Create and configure the menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.setStyle("-fx-background-color: transparent;-fx-color: #000000");

        Menu menu = new Menu("Menu");
        Menu settingMenu = new Menu("Setting");
        Menu helpMenu = new Menu("Help");

        // Add menus to the menu bar
        menuBar.getMenus().addAll(menu, settingMenu, helpMenu);

        // Add the game name, menu bar, and social media icons to a VBox
        menuPane.getChildren().addAll(gameNameText,spacing1, menuBar, spacing2, icon1, icon2, icon3);

        return menuPane;
    }
    public static void main(String[] args) {
        launch();
    }
}