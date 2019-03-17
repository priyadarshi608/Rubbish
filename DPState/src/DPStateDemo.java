import sss.dpstate.context.*;
import sss.dpstate.state.*;

public class DPStateDemo {
	public static void main(String[] args) {
		
		MP3PlayerContext mp3PlayerContext = new MP3PlayerContext();
		mp3PlayerContext.pressPlayButton();
		mp3PlayerContext.pressPlayButton();
		mp3PlayerContext.pressPlayButton();
		mp3PlayerContext.pressPlayButton();
	}
}
