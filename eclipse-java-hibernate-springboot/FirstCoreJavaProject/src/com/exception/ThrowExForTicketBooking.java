package com.exception;
class TicketNotAvailableException extends Exception {
    public TicketNotAvailableException(String message) {
        super(message);
    }
}

 class TicketBookingSystem {
    private int totalAvailableTickets = 100;

    public void bookTicket(int numberOfTickets) throws TicketNotAvailableException {
        if (numberOfTickets > totalAvailableTickets) {
            throw new TicketNotAvailableException("Sorry, only " + totalAvailableTickets + " tickets available.");
        }
        totalAvailableTickets -= numberOfTickets;
        System.out.println(numberOfTickets + " ticket(s) booked successfully.");
    }

    public int getTotalAvailableTickets() {
        return totalAvailableTickets;
    }
 }
public class ThrowExForTicketBooking {
	    public static void main(String[] args) {
	        TicketBookingSystem bookingSystem = new TicketBookingSystem();

	        try {
	            System.out.println("Available tickets: " + bookingSystem.getTotalAvailableTickets());
	            System.out.println("Attempting to book 3 tickets.");
	            bookingSystem.bookTicket(3);
	            System.out.println("Available tickets: " + bookingSystem.getTotalAvailableTickets());
	            System.out.println("Attempting to book 150 tickets.");
	            bookingSystem.bookTicket(150); // This will throw an exception
	        } catch (TicketNotAvailableException e) {
	            System.out.println("Booking failed: " + e.getMessage());
	        }
	    }
}