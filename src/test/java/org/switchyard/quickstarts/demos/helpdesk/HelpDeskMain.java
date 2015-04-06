package org.switchyard.quickstarts.demos.helpdesk;

import org.apache.log4j.Logger;
import org.switchyard.common.io.pull.StringPuller;
import org.switchyard.component.test.mixins.http.HTTPMixIn;

public final class HelpDeskMain {

    private static final Logger LOGGER = Logger.getLogger(HelpDeskMain.class);

    public static void main(String... args) throws Exception {
        final String ticketId = "TCKT-" + System.currentTimeMillis();
        final String soapRequest = new StringPuller().pull("/xml/soap-request.xml").replaceAll("TICKET_ID", ticketId);
        final HTTPMixIn http = new HTTPMixIn();
        http.initialize();
        try {
            http.postString("http://localhost:8080/HelpDeskService/HelpDeskService", soapRequest);
            LOGGER.info("Started helpdesk process with ticket id: " + ticketId);
        } finally {
            http.uninitialize();
        }
    }

}
