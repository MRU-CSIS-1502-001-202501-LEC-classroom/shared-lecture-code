package main.yesinheritance;

public class GraphicModel {
    private String thingToModel;

    public GraphicModel(String thingToModel) {
        this.thingToModel = thingToModel;
    }

    public void render() {
        System.out.printf("<< lovingly crafted 3D image of %s here >>%n", thingToModel);
    }
}
