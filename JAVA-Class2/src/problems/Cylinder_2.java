package problems;

public class Cylinder_2 {
//    Circle cir = new Circle(2.8);

//    public double getVolume(){
//        return cir.getArea()*5.6;
//    }

    Circle_2 cir;
    double height;
    public Cylinder_2(Circle_2 cir, double height){
        this.cir = cir;
        this.height = height;
    }
    public double getVolume(){
        return cir.getArea()*height;
    }
    public static void main(String[] args) {
//        Cylinder cy = new Cylinder();
//        System.out.println(cy.getVolume());
        Cylinder_2 cd = new Cylinder_2(new Circle_2(2.8), 5.6);
        System.out.println(cd.getVolume());
    }
}
