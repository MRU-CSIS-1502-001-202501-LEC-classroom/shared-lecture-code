package main.yesinheritance;

public class Instrument {
    private final String name;

    private final InstrumentShape shape;

    private final BodyMaterial bodyMaterial;

    private final GraphicModel graphicModel;

    public Instrument(
            String name,
            InstrumentShape shape,
            BodyMaterial bodyMaterial,
            GraphicModel graphicModel) {

        this.name = name;
        this.shape = shape;
        this.bodyMaterial = bodyMaterial;
        this.graphicModel = graphicModel;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("<< some lame default 'percussive' sound plays >>");
    }

    public void render() {
        graphicModel.render();
    }

    @Override
    public String toString() {
        return String.format("%s: a %s-shaped instrument, made out of %s", name, shape, bodyMaterial);
    }

}
