module Examboard {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	opens application to javafx.graphics, javafx.fxml;
	opens application.Controller to javafx.fxml;
}
