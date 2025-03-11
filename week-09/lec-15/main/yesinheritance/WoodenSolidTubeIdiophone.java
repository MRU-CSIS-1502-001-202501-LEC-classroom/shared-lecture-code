package main.yesinheritance;

public class WoodenSolidTubeIdiophone extends WoodenIdiophone {

    // 🤔 This is a HOLLOW_TUBE Idiophone, right?
    // How does the constructor need to change?
    // How does the super() call need to change?
    public WoodenSolidTubeIdiophone(
            String name,
            GraphicModel graphicModel) {

        super(name, InstrumentShape.SOLID_TUBE, graphicModel);

    }

    @Override
    public void makeSound() {
        System.out.println("<< a wonderful wooden solid tube sound plays >>");
    }
}
