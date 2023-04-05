package ch16.generic;

public class ThreeDPrinterPlastic {
    public Plastic getPlastic() {
        return material;
    }

    public void setPlastic(Plastic plastic) {
        this.material = plastic;
    }

    private Plastic material;

    @Override
    public String toString() {
        return "3D printer";
    }
}
