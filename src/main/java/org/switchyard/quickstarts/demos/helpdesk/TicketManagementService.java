package org.switchyard.quickstarts.demos.helpdesk;

public interface TicketManagementService {

    public TicketAck openTicket(Ticket ticket);

    public void approveTicket(Ticket ticket);

    public void closeTicket(Ticket ticket);

    public void requestDetails(Ticket ticket);

    public void rejectTicket(Ticket ticket);

}
