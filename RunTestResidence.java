package inharitancehomeworkpackage;

public class RunTestResidence {
    public static void main(String[] args) {
        System.out.println("Home Residence");
        Residence i= new Residence();
        i.Drawingroom();
        i.Bedrooom();
        i.Garden();
        i.Corridor();

        System.out.println("Home House");
        House a =new House();
        a.Drawingroom();
        a.Bedrooom();
        a.Garden();
        a.Corridor();

        System.out.println("Home Bunglow");
        Bunglow b =new Bunglow();
        b.Drawingroom();
        b.Bedrooom();
        b.Garden();
        b.Corridor();

        System.out.println("Home Flat");
        Flat c = new Flat();
        c.Drawingroom();
        c.Bedrooom();
        c.Garden();
        c.Corridor();

        System.out.println("Home DetachedBunglow");
        DetachedBunglow d =new DetachedBunglow();
        d.Drawingroom();
        d.Bedrooom();
        d.Garden();
        d.Corridor();
        d.Spacious();
        d.Separatepantry();




    }
}
