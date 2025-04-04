package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class MainController {

    @FXML
    private Button button;

    @FXML
    private ImageView img;

    @FXML
    private Label menu;
    
    //메뉴리스트
    private static List<Menu> MENU_LIST;
    
    // 0.05초 마다 동작하는 타임라인 객체
    private Timeline timeline = null;
    //3초 뒤에 중지시키는 타임라인 객체
    private Timeline stop = null;
    
    
    /**
     * FXML 이 로딩될 꼐 초기화하는 메소드
     * 데이터 초기화
     * 이벤트 등록
     */
    @FXML
    public void initialize() {
    	setData();
    	setTimer();
    }
    /**
     * 애니메이션 위한 타님라인 객체 생성
     */
    void setTimer () {
    	//에니메이션 적용
    	//Timeline - 주기적으러 처리할 수 있도록 하는 애니메이션 클래스
    	timeline = new Timeline(
    			// keyFrame(시간, 이벤트)
    			//: 지정한 시간마다 익명함수 호출
    			//Duration.millis(밀리초) - 0.05ch
    		new KeyFrame(Duration.millis(50), e -> {
    			setMenu();		//랜덤 메뉴 세팅
    		})
		);
    	// 애니메이션 반복 횟수 설정 - Timeline.INDEFINITEI (무한반복)
    	timeline.setCycleCount(Timeline.INDEFINITE);
    	
    	//3초뒤에 애니메이션 멈춤
    	stop = new Timeline(
    			//3초 마다 동작하는 애니메이션 지정
    			new KeyFrame(Duration.millis(3000), e -> timeline.stop())
		);
    	//애니메이션 바복 횟수 설정 - 1번 반복
    	stop.setCycleCount(1);
    	
    	
    }
    
    void setData() {
    	MENU_LIST = new ArrayList<Menu>();
    	List<String> nameList = Arrays.asList("우동", "볶음밥","팟타이","팟카오무쌉","뼈해장국","라면","피자","돈카츠","치킨","순대국","쌀국수","찜닭","닭도리탕","초밥","떡볶이","감자탕","김치찌개","칼국수","부대찌개","제육");
    	
    	List<String> imgList = Arrays.asList("우동.jpg","볶음밥.jpg","팟타이.jpg","팟카오무쌉.jpg","뼈해장국.jpg","라면.jpg","피자.jpg","돈카츠.jpg","치킨.jpg","순대국.jpg","쌀국수.jpg","찜닭.jpg","닭도리탕.jpg","초밥.jpg","떡볶이.jpg","감자탕.jpg","김치찌개.jpg","칼국수.jpg","부대찌개.jpg","제육.jpg");
    	
    	for (int i = 0; i < 20; i++) {
    		String name = nameList.get(i);
    		String img = imgList.get(i);
    		MENU_LIST.add( new Menu(name, img) );
			
		}
    }
    @FXML
    void random(ActionEvent event) {
    	System.out.println("추천!!");
    	
    	//이전 애니메이션 중지
    	timeline.stop();
    	stop.stop();
    	
    	
    	//애니메이션 시작
    	timeline.play();
    	stop.play();
    }
    
    void setMenu() {
    	//TODO: 메뉴 20개의 메뉴 요소들 중 랜덤으로 하나 선택
    	//0~19 랜덤수
    	Random random = new Random();
    	int index = random.nextInt(20);
    	// 랜덤(추천) 메뉴
    	Menu randomMenu = MENU_LIST.get(index);
    	String menuName = randomMenu.getName();
    	String menuImg = randomMenu.getImg();
    	
    	//랜덤으로 뽑힌 메뉴명 라벨에 지정
    	menu.setText(menuName);
    	//랜덤메뉴 이미지 지정
    	String filePath = getClass().getResource("/img/" + menuImg).toExternalForm(); 
    	img.setImage(new Image(filePath));
    }

}
