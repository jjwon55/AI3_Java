package Day07.Ex02_다중상속;

public interface Microphone {

	int inputVolumeMax = 50;
	int inputVolumemin = 0;
	
	String receiveVoice(String voice);
}
