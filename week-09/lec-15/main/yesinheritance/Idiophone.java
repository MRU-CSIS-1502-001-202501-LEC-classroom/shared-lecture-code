package main.yesinheritance;

public class Idiophone extends Instrument {

    public Idiophone(
            String name,
            InstrumentShape shape,
            BodyMaterial bodyMaterial,
            GraphicModel graphicModel) {

        // 🤔 What's the job of a constructor again?
        // Does an Idiophone have any fields to initialize?

        super(name, shape, bodyMaterial, graphicModel);

    }

    @Override
    public String toString() {
        return getName() + " is a Idiophone.";
    }

    @Override
    public void makeSound() {
        System.out.println("<< a default 'idiophone' sound plays >>");
    }

}
