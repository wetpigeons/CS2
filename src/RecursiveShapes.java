public class RecursiveShapes {
    public static void main(String[] args){
        Turtle t = new Turtle();
        recursiveStar(t,-100,0,100,4);
        //recursiveH(t, -100,-100,50,5);
        //recursiveSpiral(t,-100,100,100,5,0);
        //tree(t,50);
        //serpinski(t, -100, -100, 0, 100, 100, -100, 3);
    }
    public static void recursiveH(Turtle t, double x, double y, double size, int iterations){
        H(t, x, y, size);
        if(iterations>0){
            recursiveH(t, x-size/2, y+size, size/2, iterations-1);
            recursiveH(t, x+size/2, y+size, size/2, iterations-1);
            recursiveH(t, x-size/2, y-size, size/2, iterations -1);
            recursiveH(t, x+size/2, y-size, size/2, iterations-1);
        }
    }
    public static void H(Turtle t, double x, double y, double size){
        t.up();
        t.setPosition(x-size/2, y+size, -90);
        t.down();
        t.forward(size*2);

        t.up();
        t.setPosition(x-size/2,y,0);
        t.down();
        t.forward(size);

        t.up();
        t.setPosition(x+size/2,y+size,-90);
        t.down();
        t.forward(size*2);
    }
    public static void recursiveSpiral(Turtle t, double x, double y, double size, int iterations, int direction){
        if(iterations>0){
            t.setPosition(x,y,direction);
            t.down();
            for(double i=0; i<(360*(size/100));i+=(1/(size/100))){
                t.forward(1);
                t.left(1/(size/100));
            }
            t.up();
            recursiveSpiral(t, x, y, size*0.97, iterations -1, direction+10);
        }
    }
    public static void star(Turtle t, double x, double y, double size){
        t.up();
        t.setPosition(x-size/2,y+(size/(2*Math.tan(Math.toRadians(72)))),0);
        t.down();
        for(int i = 0; i<5;i++) {
            t.forward(size / (2 * Math.tan(Math.toRadians(54))));
            t.left(72);
            t.forward(size / (2 * Math.tan(Math.toRadians(54))));
            t.right(144);
        }
        /*for(int i =0;i<5;i++) {
            t.forward(size);
            t.right(144);
        }*/

    }
    public static void recursiveStar(Turtle t,double x,double y, double size, int iterations){
        star(t,x, y, size);
        if(iterations>0){
            recursiveStar(t, (x-size/2), (y+ (size/(2*Math.tan(Math.toRadians(72))))), 0.5*size, iterations-1);
            recursiveStar(t, (x-size/2)+size,(y+(size/(2*Math.tan(Math.toRadians(72))))), 0.5*size, iterations-1);
            recursiveStar(t, (x-size/2)+size/2,(y+(size/(2*Math.tan(Math.toRadians(72)))))+size/(2*Math.tan(Math.toRadians(54))),0.5*size,iterations-1);
            recursiveStar(t, (x-size/2)+((size/2)-((size/2)*Math.cos(Math.toRadians(36)))/(Math.tan(Math.toRadians(54))*(Math.sin(Math.toRadians(72))))),(y+(size/(2*Math.tan(Math.toRadians(72)))))-(((size/2)/(Math.tan(Math.toRadians(54))))+(((size/2)*Math.sin(Math.toRadians(36)))/((Math.tan(Math.toRadians(54)))*(Math.sin(Math.toRadians(72)))))), 0.5*size, iterations-1);
            recursiveStar(t, (x-size/2)+((size/2)+((size/2)*Math.cos(Math.toRadians(36)))/(Math.tan(Math.toRadians(54))*(Math.sin(Math.toRadians(72))))),(y+(size/(2*Math.tan(Math.toRadians(72)))))-(((size/2)/(Math.tan(Math.toRadians(54))))+(((size/2)*Math.sin(Math.toRadians(36)))/((Math.tan(Math.toRadians(54)))*(Math.sin(Math.toRadians(72)))))), 0.5*size, iterations-1);
        }
    }
    public static void tree(Turtle t, int branchLength){
        if(branchLength>5){
            t.forward(branchLength);
            t.right(20);
            tree(t,branchLength-15);
            t.left(40);
            tree(t,branchLength-10);
            t.right(20);
            t.backward(branchLength);
        }
    }

    public static void triangle(Turtle t, int x1, int y1, int x2, int y2, int x3, int y3){
        t.up();
        t.setPosition(x1,y1);
        t.down();
        t.setPosition(x2,y2);
        t.setPosition(x3,y3);
        t.setPosition(x1,y1);
    }

    public static void serpinski(Turtle t, int x1, int y1, int x2, int y2, int x3, int y3, int iterations){
        if(iterations>0){
            triangle(t, x1, y1, x2, y2, x3, y3);
            serpinski(t, (x1+x2)/2,(y1+y2)/2,x2,y2,(x2+x3)/2,(y2+y3)/2,iterations-1);
            serpinski(t, x1,y1,(x1+x2)/2,(y2+y1)/2,(x1+x3)/2,(y1+y3)/2,iterations-1);
            serpinski(t, (x1+x3)/2,(y1+y3)/2,(x2+x3)/2,(y2+y3)/2,x3,y3,iterations-1);

        }
    }
}
