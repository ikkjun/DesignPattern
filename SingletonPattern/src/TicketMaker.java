public class TicketMaker {
    private static TicketMaker ticket = new TicketMaker();
    private static int ticketNum = 1000;
    TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return ticket;
    }

    public static int getNextTicketNumber() {
        return ticketNum++;
    }
}
