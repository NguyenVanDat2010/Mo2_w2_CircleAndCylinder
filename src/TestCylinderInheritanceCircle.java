public class TestCylinderInheritanceCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        System.out.println("There are area = "+circle.getArea()+ " and perimeter = "+circle.getPerimeter());

        circle=new Circle(6,"White");
        System.out.println(circle);
        System.out.println("There are area = "+circle.getArea()+ " and perimeter = "+circle.getPerimeter());

        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        System.out.println("There are area = "+cylinder.getArea()+" and Volume = "+cylinder.getVolumetric());

        cylinder=new Cylinder(8,9,"Blue");
        System.out.println(cylinder);
        System.out.println("There are area = "+cylinder.getArea()+" and Volume = "+cylinder.getVolumetric());
    }
}
