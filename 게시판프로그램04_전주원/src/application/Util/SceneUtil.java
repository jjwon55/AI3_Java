package application.Util;

import java.io.IOException;

import application.Controller.ReadController;
import application.Controller.UI;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lombok.Data;

@Data
public class SceneUtil {

	private static SceneUtil instance;
	
	Stage stage;
	Scene scene;
	Parent root;
	FXMLLoader loader;
	private SceneUtil() {
		
	}
	
	public static SceneUtil getInstance() {
		if ( instance == null) {
			instance = new SceneUtil();
		}
		return instance;
	}
	
	 public void close(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("프로그램 종료");
    	alert.setHeaderText("프로그램을 종료하시겠습니까?");
    	alert.setContentText("프로그램이 종료됩니다.");
	    	
    	if( alert.showAndWait().get() == ButtonType.OK ) {
    		System.out.println("프로그램 종료");
    		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    		stage.close();
	    	}
    }
	
	 public void switchScene(ActionEvent event, String fxml) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
	    Parent root = loader.load();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	 
	
	 
	 
	 
	 
	 public void switchScene(ActionEvent event, String fxml, Parent root) throws IOException {
		 stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	 }
	 
	 
	 
	 public void switchScene(MouseEvent event, String fxml, Parent root) throws IOException {
		 stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	 }
	 
	 
	 public Object getController(String fxml) throws IOException {
	 	loader = new FXMLLoader(getClass().getResource( fxml ));
	 	root = loader.load();
	 	return loader.getController();
	 }

	public Parent getRoot() {
		return root;
	}
	
}
