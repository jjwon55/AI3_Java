package application.Controller;

import java.io.IOException;

import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import application.Util.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InsertController {

	
	 @FXML
     private TextField tfTitle;
     @FXML
     private TextField tfWriter;
     @FXML
     private TextArea taContent;
    
	 private BoardService boardService = new BoardServiceImpl();
	
	 
	 public void moveToList(ActionEvent event) throws IOException {
		 SceneUtil.getInstance().switchScene(event, UI.MAIN.getPath());
	 }
	
	
	 public void insert(ActionEvent event) throws IOException {
		 Board board = new Board(tfTitle.getText(), tfWriter.getText(), taContent.getText() );
		 int result = boardService.insert(board);
		 if( result > 0 ) {
			 System.out.println("글쓰기 처리 성공!");
			 SceneUtil.getInstance().switchScene(event, UI.MAIN.getPath());
		 }
	 }
}
