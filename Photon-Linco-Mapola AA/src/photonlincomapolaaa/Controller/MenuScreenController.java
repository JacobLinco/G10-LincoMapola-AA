/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package photonlincomapolaaa.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MenuScreenController implements Initializable {
    @FXML private Button newGame, cont, exit;
    
    @FXML private void exit(ActionEvent event) throws IOException{
        Node node = (Node) event.getSource();
        Scene CurrentScene = node.getScene();
        Stage CurrentStage = (Stage) CurrentScene.getWindow();
            
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Leave Game");
        alert.setHeaderText("You are about to leave the game");
        alert.setContentText("confirm?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            CurrentStage.hide();
        } else {
            // ... user chose CANCEL or closed the dialog
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }    
    
}
