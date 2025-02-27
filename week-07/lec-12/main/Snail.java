package main;

public class Snail {

    private String name;
    private int landSpeed;
    private Snail friend;
    private boolean isSlimey;

    public Snail(String name, int landSpeed, Snail friend, boolean isSlimey) {
        this.name = name;
        this.landSpeed = landSpeed;
        this.friend = friend;
        this.isSlimey = isSlimey;
    }

}
