public class Cylinder extends Circle{
    private double height=4;

    public Cylinder(){
    }
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height=height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumetric(){
        return getArea()*height;
    }

    public String toString(){
        return "A Cylinder with height = "+getHeight()+" which is a subclass of "+super.toString();
    }
}
