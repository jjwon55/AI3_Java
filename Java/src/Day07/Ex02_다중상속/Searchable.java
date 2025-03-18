package Day07.Ex02_다중상속;

public interface Searchable {

	//채널 검색
	//: 검색어에 해당하는 채널번호르 ㄹ반환
	int channelSearch(String keyword);
	
	
	//컨텐츠 검색
	String[] contentSearch(String keyword);
	
}
