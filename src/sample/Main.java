package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        JFrame cadre = new javax.swing.JFrame("Interface graphique");
        JPanel panneau = new JPanel();
        panneau.setPreferredSize(new Dimension(450, 350)); // dimension de la fenetre

        panneau.setBackground(Color.GRAY);
        cadre.setContentPane(panneau);
        cadre.setLocation(400, 300);
        cadre.pack();
        cadre.setVisible(true);
        cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
