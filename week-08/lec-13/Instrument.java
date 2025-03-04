package main;

public class Instrument {
    private String name;
    private BodyMaterial bodyMaterial;
    private InstrumentShape shape;
    private GraphicModel graphicModel;

    public Instrument(String name, BodyMaterial bodyMaterial, MembraneMaterial membraneMaterial,
            GraphicModel graphicModel) {
        this.name = name;
        this.bodyMaterial = bodyMaterial;
        this.graphicModel = graphicModel;
    }

    public Instrument(String name, BodyMaterial bodyMaterial,
            GraphicModel graphicModel) {
        this.name = name;
        this.bodyMaterial = bodyMaterial;
        this.graphicModel = graphicModel;
    }

    public void makeSound() {
        System.out.println("play default sound");
    }

    public void render() {
        System.out.println("show default graphic");
    }

}
