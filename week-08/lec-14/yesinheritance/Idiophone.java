package main.yesinheritance;

public class Idiophone extends Instrument {

    public Idiophone(String name,
            InstrumentShape shape,
            BodyMaterial bodyMaterial,
            GraphicModel graphicModel) {
        super(name, shape, bodyMaterial, graphicModel);
    }

    @Override
    public void makeSound() {
        
    }

}
