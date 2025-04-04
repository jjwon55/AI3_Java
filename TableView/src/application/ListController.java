package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListController {

    @FXML
    private Button btnIsert;

    @FXML
    private TableColumn<Board, Integer> colNo;
    @FXML
    private TableColumn<Board, String> colTitle;
    @FXML
    private TableColumn<Board, String> colWriter;
    @FXML
    private TableColumn<Board, String> colCreatedAt;
    @FXML
    private TableColumn<Board, Integer> colView;
    @FXML
    private TableView<Board> tableView;
    
    List<Board> boardList = null;
    
    
    @FXML
    void initialize() {
    	
    	boardList = new ArrayList<Board>();
    	boardList.add(new Board(1, "제목1", "작성자1", "내용1", new Date(),new Date(), 10) );
    	boardList.add(new Board(2, "제목2", "작성자2", "내용2", new Date(),new Date(), 20) );
    	boardList.add(new Board(3, "제목3", "작성자3", "내용3", new Date(),new Date(), 30) );
    	
    	colNo.setCellValueFactory(new PropertyValueFactory<>("No"));
    	colTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
    	colWriter.setCellValueFactory(new PropertyValueFactory<>("Writer"));
    	colCreatedAt.setCellValueFactory(new PropertyValueFactory<>("CreatedAt"));
    	colView.setCellValueFactory(new PropertyValueFactory<>("View"));
    	
    	ObservableList<Board> list = FXCollections.observableArrayList(boardList);
    	tableView.setItems(list);
    }
    @FXML
    void toInsert(ActionEvent event) {

    }

}
