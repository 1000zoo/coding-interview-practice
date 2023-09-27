package chapter07_Object_Oriented_Programming.Prob07;

public class Message {
    private User from;
    private int to; //room id
    private String contents;
//    private String date;

    public Message(User from, int to, String contents) {
        this.from = from;
        this.to = to;
        this.contents = contents;
        // this.date = currentTime()
    }
}
