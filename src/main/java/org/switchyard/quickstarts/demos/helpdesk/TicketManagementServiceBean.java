package org.switchyard.quickstarts.demos.helpdesk;

import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;

@Service(TicketManagementService.class)
public class TicketManagementServiceBean implements TicketManagementService {

    private static final Logger LOGGER = Logger.getLogger(TicketManagementServiceBean.class);

    @Override
    public TicketAck openTicket(Ticket ticket) {
        log("opening ticket");
        ticket.setStatus("opened");
        return new TicketAck().setId(ticket.getId()).setReceived(true);
    }

    @Override
    public void approveTicket(Ticket ticket) {
        log("approving ticket");
        ticket.setStatus("approved");
    }

    @Override
    public void closeTicket(Ticket ticket) {
        log("closing ticket");
        ticket.setStatus("closed");
    }

    @Override
    public void requestDetails(Ticket ticket) {
        log("requesting details");
        ticket.setStatus("requested");
    }

    @Override
    public void rejectTicket(Ticket ticket) {
        log("rejecting ticket");
        ticket.setStatus("rejected");
    }

    private void log(String msg) {
        LOGGER.info("********** " + msg + " **********");
    }

}
