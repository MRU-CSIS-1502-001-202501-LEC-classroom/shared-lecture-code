package main.yesinheritance;

public class WoodenHollowTubeIdiophone extends WoodenIdiophone {

    // 🤔 This is a HOLLOW_TUBE Idiophone, right?
    // How does the constructor need to change?
    // How does the super() call need to change?
    public WoodenHollowTubeIdiophone(
            String name,
            GraphicModel graphicModel) {

        super(name, InstrumentShape.HOLLOW_TUBE, graphicModel);

    }

    @Override
    public void makeSound() {
        System.out.println("<< a wonderful wooden hollow tube sound plays >>");
    }
}
