package ch16.generic;

public class ThreeDPrinterDbject {
    public Object getMaterial() {
        return material;
    }

    public void setMaterial(Object material) {
        this.material = material;
    }

    private Object material;

    @Override
    public String toString() {
        return "3D printer";
    }
}
