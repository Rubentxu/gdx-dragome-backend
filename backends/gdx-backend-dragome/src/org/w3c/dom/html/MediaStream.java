// Generated by esidl 0.4.0.

package org.w3c.dom.html;

import org.w3c.dom.ObjectArray;

public interface MediaStream
{
    // MediaStream
    public String getLabel();
    public ObjectArray<StreamTrack> getTracks();
    public MediaStreamRecorder record();
    public static final short LIVE = 1;
    public static final short ENDED = 2;
    public short getReadyState();
    public Function getOnended();
    public void setOnended(Function onended);
}
