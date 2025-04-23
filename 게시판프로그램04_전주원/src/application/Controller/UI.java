package application.Controller;

public enum UI {

	MAIN("/application/Main.fxml"),
	INSERT("/application/Ui/Insert.fxml"),
	READ("/application/Ui/Read.fxml"),
	UPDATE("/application/Ui/Update.fxml");

	
	private final String path;
	
	UI(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}
}
