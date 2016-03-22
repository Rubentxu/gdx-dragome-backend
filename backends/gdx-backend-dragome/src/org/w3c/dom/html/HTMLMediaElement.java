// Generated by esidl 0.4.0.

package org.w3c.dom.html;

import org.w3c.dom.ObjectArray;

public interface HTMLMediaElement extends HTMLElement
{
    // HTMLMediaElement
    public MediaError getError();
    public String getSrc();
    public void setSrc(String src);
    public String getCurrentSrc();
    public String getCrossOrigin();
    public void setCrossOrigin(String crossOrigin);
    public static final short NETWORK_EMPTY = 0;
    public static final short NETWORK_IDLE = 1;
    public static final short NETWORK_LOADING = 2;
    public static final short NETWORK_NO_SOURCE = 3;
    public short getNetworkState();
    public String getPreload();
    public void setPreload(String preload);
    public TimeRanges getBuffered();
    public void load();
    public String canPlayType(String type);
    public static final short HAVE_NOTHING = 0;
    public static final short HAVE_METADATA = 1;
    public static final short HAVE_CURRENT_DATA = 2;
    public static final short HAVE_FUTURE_DATA = 3;
    public static final short HAVE_ENOUGH_DATA = 4;
    public short getReadyState();
    public boolean getSeeking();
    public double getCurrentTime();
    public void setCurrentTime(double currentTime);
    public double getInitialTime();
    public double getDuration();
    public long getStartOffsetTime();
    public boolean getPaused();
    public double getDefaultPlaybackRate();
    public void setDefaultPlaybackRate(double defaultPlaybackRate);
    public double getPlaybackRate();
    public void setPlaybackRate(double playbackRate);
    public TimeRanges getPlayed();
    public TimeRanges getSeekable();
    public boolean getEnded();
    public boolean getAutoplay();
    public void setAutoplay(boolean autoplay);
    public boolean getLoop();
    public void setLoop(boolean loop);
    public void play();
    public void pause();
    public String getMediaGroup();
    public void setMediaGroup(String mediaGroup);
    public MediaController getController();
    public void setController(MediaController controller);
    public boolean getControls();
    public void setControls(boolean controls);
    public double getVolume();
    public void setVolume(double volume);
    public boolean getMuted();
    public void setMuted(boolean muted);
    public boolean getDefaultMuted();
    public void setDefaultMuted(boolean defaultMuted);
    public AudioTrackList getAudioTracks();
    public VideoTrackList getVideoTracks();
    public ObjectArray<TextTrack> getTextTracks();
    public MutableTextTrack addTextTrack(String kind);
    public MutableTextTrack addTextTrack(String kind, String label);
    public MutableTextTrack addTextTrack(String kind, String label, String language);
}
