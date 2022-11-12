package ru.donate.alpha.mdbspringboot.model;

// for checking mongo
@Document
public class userClass {

    @Id
    private String id;
    private String name;
    private boolean streamer;

    public userClass(String id, String name, boolean streamer) {
        super();
        this.id = id;
        this.name = name;
        this.streamer = streamer;
    }
}