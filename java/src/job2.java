class Rectangle {
    double x, y, width, height;
    Rectangle(double a,double b,double w,double h){
        x=a;
        y=b;
        width=w;
        height=h;
    }
     double getX(){
        return x;
    }
     double getY(){
        return y;
    }
     double getWidth(){
        return width;
    }
     double getHeight(){
        return height;
    }
}
 class Circle{
    double x,y,radius;
    Circle(double a,double b,double r){
        x=a;
        y=b;
        radius=r;
    }
     double getX(){
        return x;
    }
     double getY(){
        return y;
    }
     double getRadiux(){
        return radius;
    }
}
 class Geometry {
    Rectangle rect;
    Circle circle;
    Geometry(Rectangle rect,Circle circle){
        this.rect=rect;
        this.circle=circle;
    }
     double getDistance(){
        double ans;
        ans=Math.pow((circle.getX()-(rect.getX()+rect.getWidth()/2.0)),2)+Math.pow((circle.getY()-(rect.getY()-rect.getHeight()/2.0)),2);
        ans=Math.sqrt(ans);
        return ans;
    }
}
public class job2{
    public static void main(String[] args){
        Rectangle rect=new Rectangle(4,5,1,2);
        Circle circle=new Circle(6,8,3);
        Geometry geometry=new Geometry(rect,circle);
        System.out.println("圆与矩形中心间的距离为："+geometry.getDistance());
    }
}
