
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
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class DialogueScreenController implements Initializable {
    
    @FXML private ImageView SceneImage, CharImage;
    @FXML private ProgressBar AffectionBar;
    @FXML private Label CharName;
    @FXML private Text Time, Location, CharDialogue;
    @FXML private Button HistoryButton, OptionButton, ExitButton;
    @FXML private HBox DialogueBox;
    int dialoguePart = 0;

    
    @FXML private void dialogueNext(MouseEvent event) {
        String sample = "Hi there player! I didn't expect to see you around here.-How are you doing today? I was just about to go home.-See ya!";
        
        CharDialogue.setText(sample.split("-")[dialoguePart]);
        dialoguePart++;
    }
    
    
    @FXML private void openHistory () {
        
    }
    
    @FXML private void openOptions (ActionEvent event) throws IOException{
        Node node = (Node) event.getSource();
        Scene CurrentScene = node.getScene();
        Stage secondStage = new Stage();
        
        //Stage CurrentStage = (Stage) CurrentScene.getWindow();
        
        Parent root = FXMLLoader.load(getClass().getResource("/photonlincomapolaaa/View/OptionScreen.fxml"));
        Scene DisplayScene = new Scene(root);
        secondStage.setScene(DisplayScene);
        secondStage.show();
    }
    
    @FXML private void exit(ActionEvent event) throws IOException{
        Node node = (Node) event.getSource();
        Scene CurrentScene = node.getScene();
        Stage CurrentStage = (Stage) CurrentScene.getWindow();
            
        
        Alert alert = new Alert(AlertType.CONFIRMATION);
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
        Image character = new Image(getClass().getResourceAsStream("/photonlincomapolaaa/Images/characters/sample character.png"));
        CharImage.setImage(character);
        
        Image scene = new Image(getClass().getResourceAsStream("/photonlincomapolaaa/Images/scenes/sample scene.jpg"));
        SceneImage.setImage(scene); 
        
    }    
    
}
