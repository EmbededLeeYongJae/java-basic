package access;

import javax.print.attribute.standard.PagesPerMinute;

public class SpeakerMain {

	public static void main(String[] args) {
		
		Speaker speaker = new Speaker(90);
		
		speaker.showVolume();
		
		speaker.volumeUp();
		speaker.showVolume();
		
		speaker.volumeDown();
		speaker.showVolume();
		
		speaker.volumeUp();
		speaker.showVolume();
		
		speaker.volumeUp();
		speaker.showVolume();
		
//		//필드에 직접 접근
		System.out.println("volume 필드 직접 접근 수정");
//		speaker.volume = 200; // class에서 private 으로 필드에 직접 접근을 막는다
		speaker.showVolume();
		
	}

}
