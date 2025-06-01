package BClasses;

public class ClassStudent {
    private int rgm;
    private String name;

    public ClassStudent(int rgm, String name) {
        this.rgm = rgm;
        this.name = name;
    }


    
    public int getRgm() {
        return rgm;
    }

    public String getName() {
        return name;
    }



    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String toString() {
        return String.format("RGM: %d, Nome: %s", rgm, name);
    }
}