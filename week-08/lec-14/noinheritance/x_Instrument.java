package main.noinheritance;

public class Instrument {
    private final String name;

    private final InstrumentShape shape;

    private final MembraneMaterial membraneMaterial;
    private final BodyMaterial bodyMaterial;

    private final GraphicModel graphicModel;

    public Instrument(String name,
            InstrumentShape shape,
            MembraneMaterial membraneMaterial,
            BodyMaterial bodyMaterial,
            GraphicModel graphicModel) {
        this.name = name;
        this.shape = shape;
        this.membraneMaterial = membraneMaterial;
        this.bodyMaterial = bodyMaterial;
        this.graphicModel = graphicModel;
    }

    public void makeSound() {
        if (membraneMaterial != null) {
            if (shape == InstrumentShape.HOLLOW_HEMISPHERE) {
                if (bodyMaterial == BodyMaterial.METAL) {
                    System.out.println("<< a beautiful timpanic sound plays >>");
                    return;
                }

            }
        } else {
            if (shape == InstrumentShape.HOLLOW_TUBE) {
                if (bodyMaterial == BodyMaterial.WOOD) {
                    System.out.println("<< a beautiful marimbaesque sound plays >>");
                    return;
                }

            } else if (shape == InstrumentShape.SHALLOW_BOWL) {
                if (bodyMaterial == BodyMaterial.METAL) {
                    System.out.println("<< a beautiful gongish sound plays >>");
                    return;
                }
            }

        }

        System.out.println("<< some lame default 'percussive' sound plays >>");

    }

    public void render() {
        graphicModel.render();
    }

}
