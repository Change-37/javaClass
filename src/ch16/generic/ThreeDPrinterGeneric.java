package ch16.generic;

public class ThreeDPrinterGeneric<T> {
    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    private T material;

    @Override
    public String toString() {
        return "3D printer";
    }
}
