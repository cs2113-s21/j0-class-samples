public class PointDistances{

    // static double dist(double x1, double y1, double x2, double y2){
    //     return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
    // }

    public static void main(String args[]){
        


        Point points[] = {
            new Point(2.3,4.8), //does assignment and decleration at same time
            new Point(1.1,3.0),
            new Point(5.8,0.3)
        }; 

        Line lines[] = {
            new Line(points[0],points[1]), //points[0]->points[1]
            new Line(points[0],points[2]), //points[0]->points[2]
            new Line(points[1],points[2]), //points[1]->points[2]
        };
        
        //new is very much like a malloc call, to allocate and
        //*instaniate* the object that we are working with

        System.out.println("dist(p0,p1) = " + points[0].dist(points[1]));
        System.out.println("dist(p0,p2) = " + points[0].dist(points[2]));
        System.out.println("dist(p0,p1) = " + points[1].dist(points[2]));


        System.out.println("--------------------");
        for(int i=0;i<points.length;i++){
            System.out.printf("points[%d] = (%.2f,%.2f)\n",
                              i, points[i].getX(),points[i].getY());
        }


        System.out.println("--------------------");
        for(int i=0;i<points.length;i++){
            System.out.println("points["+i+"] = " + points[i]);
        }

        System.out.println("--------------------");
        for(Line l : lines){
            System.out.println(""+l+":"+l.getLength()+" " +l.getSlope());
        }



    }
}
