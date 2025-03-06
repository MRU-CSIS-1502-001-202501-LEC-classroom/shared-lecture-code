package main.yesinheritance;

public class Instrument {
    private final String name;

    private final InstrumentShape shape;

    private final BodyMaterial bodyMaterial;

    private final GraphicModel graphicModel;

    public Instrument(String name,
            InstrumentShape shape,
            BodyMaterial bodyMaterial,
            GraphicModel graphicModel) {

        this.name = name;
        this.shape = shape;
        this.bodyMaterial = bodyMaterial;
        this.graphicModel = graphicModel;
    }

    public void makeSound() {
        System.out.println("<< some lame default 'percussive' sound plays >>");
    }

    public void render() {
        graphicModel.render();
    }

}
