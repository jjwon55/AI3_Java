package application.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import application.Util.SceneUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MainController implements Initializable{
	
	@FXML
	private TableView<Board> boardTableView;
	
	@FXML
	private TableColumn<Board, Integer> colBoardNo;
	@FXML
	private TableColumn<Board, String> colTitle;
	@FXML
	private TableColumn<Board, String> colWriter;
	@FXML
	private TableColumn<Board, String> colRegDate;
    @FXML
    private TableColumn<Board, String> colUpdDate;
    @FXML
    private TableColumn<Board, CheckBox> colCbDelete;
    @FXML
    private CheckBox cbAll;

	BoardService boardService = new BoardServiceImpl();
	
	Stage stage;
	
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		
		List<Board> boardList = new ArrayList<Board>();
		boardList = boardService.list();
		
		for (Board board : boardList) {
			System.out.println(board);
		}
		
		ObservableList<Board> list = FXCollections.observableArrayList(boardList);
		
		colBoardNo.setCellValueFactory(new PropertyValueFactory<>("no"));
		colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
		colWriter.setCellValueFactory(new PropertyValueFactory<>("writer"));
		colRegDate.setCellValueFactory(new PropertyValueFactory<>("createdAt"));
		colUpdDate.setCellValueFactory(new PropertyValueFactory<>("updatedAt"));
		colCbDelete.setCellValueFactory(new PropertyValueFactory<>("CbDelete"));
		
		boardTableView.setItems(list);
		
		cbAll.setSelected(false);
		
		cbAll.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event evnet) {
				CheckBox checkBox = (CheckBox) evnet.getSource();
				boolean checkAll = checkBox.isSelected();
				boardTableView.getItems().stream()	.forEach( (board) -> {
					board.getCbDelete().setSelected(checkAll);
				});
			}
			
			
		});
		
		boardTableView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent event) {
				// 더블 클릭
				if( event.getClickCount() == 2 && boardTableView.getSelectionModel().getSelectedItem() != null ) {
					int boardNo = boardTableView.getSelectionModel().getSelectedItem().getNo();
					try {
						ReadController readCotroller = (ReadController) SceneUtil.getInstance().getController(UI.READ.getPath());
						readCotroller.read(boardNo);
						
						Parent root = SceneUtil.getInstance().getRoot();
						SceneUtil.getInstance().switchScene(event, UI.READ.getPath(), root);
					    
					} catch (IOException e) {
						System.err.println("[목록->읽기] 화면 이동 중 예외 발생..");
						e.printStackTrace();
					}
				}
			}
		});
	}
		
	
	
	
	public void close(ActionEvent event) {
		SceneUtil.getInstance().close(event);
	}
	
	public void deleteSelected(ActionEvent event) {
		boardTableView.getItems().stream().forEach( (board) -> {
			CheckBox cbDelete = board.getCbDelete();
			boolean checked = cbDelete.isSelected();
			
			if( checked ) {
				int boardNo = board.getNo();
				boardService.delete(boardNo);
			}
		});
		
		initialize(null, null);
	}
	
	
	public void moveToInsert(ActionEvent event) throws IOException {
		SceneUtil.getInstance().switchScene(event, UI.INSERT.getPath());
	
	}

	
}
