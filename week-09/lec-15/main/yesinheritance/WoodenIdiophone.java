package main.yesinheritance;

public class WoodenIdiophone extends Idiophone {

    // 🤔 This is a WOOD Idiophone, right?
    // How does the constructor need to change?
    // How does the super() call need to change?
    public WoodenIdiophone(
            String name,
            InstrumentShape shape,
            GraphicModel graphicModel) {

        super(name, shape, BodyMaterial.WOOD, graphicModel);
    }

    @Override
    public void makeSound() {
        System.out.println("<< a default 'wood idiophone' sound plays >>");
    }
}
