package lombok.basic;


import lombok.*;


//롬복
//롬복은 어노체이션을 이용하여 코드를 자동 생생해준다.

//@NoArgsConstructor : 기본 생성자
//@AllArgsConstructor : 모든 매개변수 생성자
//@RequireArgsConstructor : null이 들어오지 못하도록 지정
//@NonNull					* 필수 생성자의 매개변수 지정

//@Getter 
//@Setter
//@ToString
//@Data
//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Person {

	
	@NonNull private String name;
	@NonNull private int age;
	private double height;
	private double weight;
	
}
