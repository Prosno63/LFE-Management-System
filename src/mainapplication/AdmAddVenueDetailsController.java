/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapplication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENEVO
 */
public class AdmAddVenueDetailsController implements Initializable {

    @FXML
    private TextField VenueNameField;
    @FXML
    private TextArea DesprictionField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnAction(ActionEvent event) throws IOException {
        
         Parent parent = FXMLLoader.load(getClass().getResource("AdmHomePage.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();
    }

    @FXML
    private void SubmitButtonOnAction(ActionEvent event) {
        
        File f = null;
        FileWriter fw = null;
        FileChooser fc = null;
        try {

            f = new File("VenueDetails.txt");  
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	VenueNameField.getText()+"\n"
                + DesprictionField.getText()+"\n"	
            );           
            
        } catch (IOException ex) {
            Logger.getLogger(AdmAddVenueDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(AdmAddVenueDetailsController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void LogOutButtonOnAction(ActionEvent event) throws IOException {
        
         Parent parent = FXMLLoader.load(getClass().getResource("LogInScene.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();
    }
        
}

