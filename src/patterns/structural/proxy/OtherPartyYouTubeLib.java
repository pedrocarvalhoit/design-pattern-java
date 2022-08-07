package patterns.structural.proxy;

import java.util.HashMap;

public interface OtherPartyYouTubeLib {
	
	HashMap<String, Video> popularVideos();
	
	Video getVideo(String videoId);

}
