package org.ccsunnyfd.design.videoLibrary;

/**
 * Video
 *
 * @version 1.0
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
