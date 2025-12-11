public class Project2 {
    public static void main(String[] args) {
        //Rectangle의 파라미터 - 인덱스, 중점의 X좌표, 중점의 Y좌표, 가로길이, 세로길이
        Rectangle rect0 = new Rectangle(0, -1, -1, 2, 2);
        Rectangle rect1 = new Rectangle(1, 1, 1, 4, 3);

        //Circle의 파라미터 - 인덱스, 중점의 X좌표, 중점의 Y좌표, 반지름
        Circle circle2 = new Circle(2, 4, 3, 1);

        //LeafNode의 파라미터 - 인덱스, Shape 객체
        LeafNode node0 = new LeafNode(0, rect0);
        LeafNode node1 = new LeafNode(1, rect1);
        LeafNode node2 = new LeafNode(2, circle2);

        //InnerNode의 파라미터 - 인덱스, 왼쪽 자식 Node 객체, 오른쪽 자식 Node 객체
        InnerNode node3 = new InnerNode(3, node1, node0);
        InnerNode node4 = new InnerNode(4, node3, node2);

        System.out.println(node4);
        System.out.println(node3);
        System.out.println(node2);
        System.out.println(node1);
        System.out.println(node0);
    }
}
class BoundingBox{
    private double xMax, yMax;
    private double xMin, yMin;
    public BoundingBox(double xMax, double yMax, double xMin, double yMin) {
        this.xMax = xMax;
        this.yMax = yMax;
        this.xMin = xMin;
        this.yMin = yMin;
    }

    public double getxMax(){
        return xMax;
    }
    public double getyMax() {
        return yMax;
    }
    public double getxMin() {
        return xMin;
    }
    public double getyMin() {
        return yMin;
    }
}
abstract class Shape{
    private int index;
    public Shape(int index){
        this.index = index;
    }

    public int getIndex(){
        return index;
    }

    public abstract BoundingBox CalBoundingBox();
}

class Rectangle extends Shape{
    private double length, width;
    private double x, y;
    public Rectangle(int index,double x,double y,double width,double length){
        super(index);
        this.x = x;
        this.y= y;
        this.length = length;
        this.width = width;
    }

    public BoundingBox CalBoundingBox(){
        double xMax, yMax;
        double xMin, yMin;
        xMax = x + width / 2;
        yMax = y + length / 2;
        xMin = x - width / 2;
        yMin = y - length / 2;
        return new BoundingBox(xMax, yMax, xMin, yMin);
    }
}

class Circle extends Shape{
    private double radius;
    private double x, y;
    public Circle(int index, double x, double y, double radius){
        super(index);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public BoundingBox CalBoundingBox(){
        double xMax, yMax;
        double xMin, yMin;
        xMax = x + radius;
        yMax = y + radius;
        xMin = x - radius;
        yMin = y - radius;
        return new BoundingBox(xMax, yMax, xMin, yMin);
    }
}

class Node{
    private int index;
    protected BoundingBox bBox;
    public Node(int index, BoundingBox bBox){
        this.index = index;
        this.bBox = bBox;
    }

    public int getIndex(){
        return index;
    }

    public BoundingBox getbBox(){
        return bBox;
    }
}

class LeafNode extends Node{
    private int index;
    private Shape shape;
    public LeafNode(int index, Shape shape){
        super(index, shape.CalBoundingBox());
        this.shape = shape;
    }

    @Override
    public String toString(){
        String msg = "node(" + shape.getIndex() +"): " + "min (" + bBox.getxMin() + " " + bBox.getyMin() + "), max ("
                    + bBox.getxMax() + " " + bBox.getyMax() +"), shape index (" + shape.getIndex() + ")";
        return msg;
    }

}

class InnerNode extends Node{
    private int index;
    private Node lNode, rNode;
    private
    static BoundingBox merge(BoundingBox lBox, BoundingBox rBox){
        double nMaxX, nMaxY;
        double nMinX, nMinY;
        if (lBox.getxMax() > rBox.getxMax()){
            nMaxX = lBox.getxMax();
        }
        else{
            nMaxX = rBox.getxMax();
        }
        if (lBox.getyMax() > rBox.getyMax()){
            nMaxY = lBox.getyMax();
        }
        else{
            nMaxY = rBox.getyMax();
        }
        if (lBox.getxMin() < rBox.getxMin()){
            nMinX = lBox.getxMin();
        }
        else{
            nMinX = rBox.getxMin();
        }
        if (lBox.getyMin() < rBox.getyMin()){
            nMinY = lBox.getyMin();
        }
        else{
            nMinY = rBox.getyMin();
        }
        return new BoundingBox(nMaxX, nMaxY, nMinX, nMinY);
    }
    public InnerNode(int index, Node lNode, Node rNode){
        super(index, merge(lNode.getbBox(), rNode.getbBox()));
        this.index = index;
        this.lNode = lNode;
        this.rNode = rNode;
    }

    @Override
    public String toString(){
        String msg2 = "node(" + index + "): " + "min (" + bBox.getxMin() + " " + bBox.getyMin() + "), max ("
                + bBox.getxMax() +" "+ bBox.getyMax() +"), child index ("
                + lNode.getIndex() + " " + rNode.getIndex() + ")";
        return msg2;
    }

}
