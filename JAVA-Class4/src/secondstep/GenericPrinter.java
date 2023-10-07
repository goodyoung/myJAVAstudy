package secondstep;

public class GenericPrinter <T extends Material>{
    private T material;

    public T getMaterail() {
        return material;
    }

    public void setMaterail(T material) {
        this.material = material;
    }
    public String toString(){
        return material.toString();
    }
    public void doPrinting(){
        material.doPrinting();
    }
}
