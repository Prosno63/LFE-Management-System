/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainapplication;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENEVO
 */
public class AdmAddUserController implements Initializable {

    @FXML
    private TextField idField;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private TextField VenueNameField;
    @FXML
    private ComboBox<String> comboBoxType;
    @FXML
    private ComboBox<String> comboBoxSchool;
    @FXML
    private RadioButton tbMale;
    @FXML
    private RadioButton tbFemale;
    @FXML
    private RadioButton tbTrans;
    
    private ToggleGroup tg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        comboBoxType.getItems().addAll("Student","Faculty"
            ,"Monitor","Local Guide","Venue Manager");
        comboBoxType.setValue("Student");

        comboBoxSchool.getItems().addAll("SETS","SBS"
            ,"B pharm","LAW","SSS");
        comboBoxSchool.setValue("SETS");        
        
        tg = new ToggleGroup();
        tbMale.setToggleGroup(tg);
        tbFemale.setToggleGroup(tg);
        tbTrans.setToggleGroup(tg);
    }    

    @FXML
    private void AddUserButton(ActionEvent event) throws IOException {
  
        FileOutputStream  fos;
        ObjectOutputStream oos;

        String gender = null;
         if (tbMale.isSelected()) gender = "Male";
          else if (tbFemale.isSelected()) gender = "Female";
           else if (tbTrans.isSelected()) gender = "TransGender";
            User x = new User( 
                    usernameField.getText(),
                    idField.getText(),
                    passwordField.getText(),
                    gender,
                    comboBoxType.getValue(),
                    VenueNameField.getText(),
                    comboBoxSchool.getValue()
                    
                    
            );


        try {
            File f = new File("UserObjects.bin");   
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);                
            }

            oos.writeObject(x);
            oos.close();
            
            System.out.println("Account Info Added");
            Alert a = new Alert(Alert.AlertType.CONFIRMATION); 
            a.setContentText("Adding Successful");
            a.showAndWait();
            
            System.out.println(x.toString());

            
        }catch (IOException e){
                Alert a = new Alert(Alert.AlertType.ERROR); 
                a.setContentText("Failed");
                a.showAndWait();            
        } finally {
         Parent parent = FXMLLoader.load(getClass().getResource("AdmAddUser.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();        
    }
    }

    @FXML
    private void BackButtonOnAction(ActionEvent event) throws IOException {
        
         Parent parent = FXMLLoader.load(getClass().getResource("AdmHomePage.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();
    }
   
}
