/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapplication;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENEVO
 */
public class StdShowVenueDetailsController implements Initializable {

    @FXML
    private TextArea OutpuTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnAction(ActionEvent event) throws IOException {
        
         Parent parent = FXMLLoader.load(getClass().getResource("StdHomePage.fxml"));
         Scene scene = new Scene(parent);
         Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         stage.setScene(scene);
         stage.show();
    }

    @FXML
    private void ShowDetailsOnAction(ActionEvent event) {
        
        OutpuTextArea.clear();
        File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
        try {
            f = new File("VenueDetails.txt");
            sc = new Scanner(f);
            if(f.exists()){
                OutpuTextArea.appendText("Content of VenueDetails.txt:\n");
                while(sc.hasNextLine()){
                    
                    System.out.println(sc.nextLine());
                     
                    
                }
            }
            else 
                OutpuTextArea.setText("oops! VenueDetails.txt does not exist...");
        } 
        catch (IOException ex) {
            Logger.getLogger(StdShowVenueDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
        }        
        
    }

}
    

