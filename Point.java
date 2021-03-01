
public class Point extends Object{

    //data memembers
    private double x; //private, they are only accessible within the
                      //scope of the object
    private double y;
    
    
    public Point(double x, double y){
        //which x is which?
        //We have a scoping issue, which x takes precidence?
        //It's always the one *closer* in scope
        
        // this.x = x; //<- this is referes to current instance of the
        //             //object we are working with
        // this.y = y;

        setXY(x,y);
    }


    public Point(Point other){
        setXY(other.getX(),other.getY());
    }
    
    public double dist(Point other){
        //this <- the current instance of a Point
        //other <- the other instance of a Point we are calculating the distance to

        return Math.sqrt(Math.pow(this.x-other.x,2) + Math.pow(this.y-other.y,2));

    }

    public double getX(){return this.x;}
    public double getY(){return this.y;}
    
    public void setX(double x){this.x = x;}
    public void setY(double y){this.y = y;}

    public void setXY(double x, double y){setX(x);setY(y);}
    
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
}
