package application.DTO;



import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.scene.control.CheckBox;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 *  (DTO)
 *  게시글 정보		
 *  				Java			DB
 *  - 게시글 번호		no				no	
 *  - 제목			title			title
 *  - 작성자			writer			writer
 *  - 내용			content			content
 *  - 등록일자		createdAt		red_date
 *  - 수정일자		updatedAt		updated_at
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {

	private int no;
	@NonNull private String title;
	@NonNull private String writer;
	@NonNull private String content;
	private String createdAt;
	private String updatedAt;
	private CheckBox cbDelete;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.createdAt = dateFormat.format(new Date());
		this.updatedAt = dateFormat.format(new Date());
		this.cbDelete = new CheckBox();
	}
	
	
	
}