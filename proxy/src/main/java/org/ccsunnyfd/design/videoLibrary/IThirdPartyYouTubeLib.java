package org.ccsunnyfd.design.videoLibrary;

import java.util.HashMap;

/**
 * IThirdPartyYouTubeLib
 *
 * @version 1.0
 */
public interface IThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
