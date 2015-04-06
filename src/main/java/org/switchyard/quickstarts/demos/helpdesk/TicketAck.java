package org.switchyard.quickstarts.demos.helpdesk;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TicketAck implements Serializable {

    private String _id;
    private boolean _received;

    public String getId() {
        return _id;
    }

    public TicketAck setId(String id) {
        _id = id;
        return this;
    }

    public boolean isReceived() {
        return _received;
    }

    public TicketAck setReceived(boolean received) {
        _received = received;
        return this;
    }

}
