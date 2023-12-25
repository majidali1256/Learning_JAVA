
class Cylinder {
    private float height, radius, Volume, Area;

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public float SurfaceArea() {
        Area = 2 * 3.14f * radius * (radius + height);
        return Area;
    }

    public float VolumeCylinder() {
        Volume = 3.14f * radius * radius * height;
        return Volume;
    }
}
    // Using Constructor
    class Cylinder1{
        private float height1,radius1,Volume1,Area1;

        public Cylinder1(float height1,float radius1){
            this.height1=height1;
            this.radius1=radius1;
        }

        public float SurfaceArea(){
            Area1 = 2*3.14f*radius1*(radius1+height1);
            return Area1;
        }
        public float VolumeCylinder(){
            Volume1 = 3.14f*radius1*radius1*height1;
            return Volume1;
        }
}
public class A30_ExerciseAccessModifiers{
    public static void main(String[] args) {
Cylinder obj = new Cylinder();
obj.setHeight(10);
obj.setRadius(5);
        System.out.println("Volume of Cylinder is: " + obj.VolumeCylinder());
        System.out.println("Surface Area of Cylinder is: " + obj.SurfaceArea());

        // Using Constructor
        System.out.println(" \nOutPut Using Constructor");
        Cylinder1 obj1 = new Cylinder1(10,5);
        System.out.println("Volume Of Cylinder is : " +  obj1.VolumeCylinder());
        System.out.println("Surface Area of Cylinder is: " + obj1.SurfaceArea());
    }
};