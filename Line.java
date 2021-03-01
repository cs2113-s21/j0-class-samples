public class Line { //segment ...

    private Point start;
    private Point end;

    private double length;
    private double slope;
    
    public Line(double x1, double y1,
                double x2, double y2){
        
        start = new Point(x1,y1);
        end = new Point(x2,y2);
        this.length = calcLength();
        this.slope = calcSlope();
    }

    public Line(Point start, Point end){
        this.start = new Point(start); //copy constructors
        this.end = new Point(end); //copy constructors
        this.length = calcLength();
        this.slope = calcSlope();

    }

    public double getLength(){return length;}
    public double getSlope(){return slope;}
    
    private double calcLength(){
        return start.dist(end);
    }

    private double calcSlope(){
        double run,rise;
        if(end.getX() >  start.getX()){
            run = end.getX() - start.getX();
            rise = end.getY() - start.getY();
        }else{
            run = start.getX() - end.getX();
            rise = start.getY() - end.getY();

        }
        return rise/run;
    }
    public String toString(){
        return "["+start+","+end+"]";
    }

}
