//16. Understanding the real scenario of Abstract class
abstract class Shape{
    public abstract void draw();
}

class Rectangle extends Shape{
    public void draw(){System.out.println("drawing rectangle");}
}

class Circle1 extends Shape{
    public void draw(){System.out.println("drawing circle");}
}

class TestAbstraction1{
    public static void main(String args[]){
        Shape s=new Circle1();
        s.draw();
    }
}