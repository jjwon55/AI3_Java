package Day15.Ex01_ByteStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		//파일 경로
		String filePath = "sample.dat";
		
		try (
			//FileOutputStream 객체를 사용하여 파일을 byte 단위로 데이터 출력
			FileOutputStream fos = new FileOutputStream(filePath); 
			//BufferedOutputStream 객체를 사용하여 파일 데이터 출력 성능 향상
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			//DataOutputStream 객체를 사용하여 기본 데이터 타입을 출력
			DataOutputStream dos = new DataOutputStream(bos);
		){
			dos.write(3000);
			dos.writeDouble(12.45);
			dos.writeBoolean(false);
			System.out.println("sample.dat 파일을 출력하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
