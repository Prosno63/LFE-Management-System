/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENEVO
 */
public class StdHomePageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void VenueDetailsButtonOnAction(ActionEvent event) throws IOException {
        
         Parent parent = FXMLLoader.load(getClass().getResource("StdShowVenueDetails.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();          
    }

    @FXML
    private void FinalReportButtonOnAction(ActionEvent event) throws IOException {
        
         Parent parent = FXMLLoader.load(getClass().getResource("StdSubmitFinalReport.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();  
    }

    @FXML
    private void JournalButtonOnClick(ActionEvent event) throws IOException {
        
         Parent parent = FXMLLoader.load(getClass().getResource("StdSubmitJournal.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();  
    }

    @FXML
    private void ArtWorkOnClick(ActionEvent event) throws IOException {
        
         Parent parent = FXMLLoader.load(getClass().getResource("StdSubmitArtWork.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();  
    }

    @FXML
    private void ComplainBoxOnClick(ActionEvent event) throws IOException {
        
         Parent parent = FXMLLoader.load(getClass().getResource("StdFileAComplain.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();  
    }

    @FXML
    private void AttendanceButtonOnClick(ActionEvent event) throws IOException {
        
         Parent parent = FXMLLoader.load(getClass().getResource("StdViewTheAttendance.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();  
    }

    void data(User x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @FXML
    private void LogInButtonOnAction(ActionEvent event) throws IOException {
        
         Parent parent = FXMLLoader.load(getClass().getResource("LogInScene.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show(); 
    }
    
}
