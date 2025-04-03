module FXML {
	requires javafx.controls;
	requires javafx.fxml; 		//설정
	opens application to javafx.graphics, javafx.fxml;
}
