package org.switchyard.quickstarts.demos.helpdesk;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Ticket implements Serializable {

    private String _id;
    private String _status;
    private String _details;

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        _id = id;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        _status = status;
    }

    public String getDetails() {
        return _details;
    }

    public void setDetails(String details) {
        _details = details;
    }

}
