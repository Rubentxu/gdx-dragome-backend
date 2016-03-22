// Generated by esidl 0.4.0.

package org.w3c.dom.eventsource;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.html.Function;

public interface EventSource extends EventTarget
{
    // EventSource
    public String getUrl();
    public static final short CONNECTING = 0;
    public static final short OPEN = 1;
    public static final short CLOSED = 2;
    public short getReadyState();
    public Function getOnopen();
    public void setOnopen(Function onopen);
    public Function getOnmessage();
    public void setOnmessage(Function onmessage);
    public Function getOnerror();
    public void setOnerror(Function onerror);
    public void close();
}
