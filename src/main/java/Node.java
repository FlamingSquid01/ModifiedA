public class Node {

    double x;
    double y;
    Node[] connections;

    public Node(double x, double y, Node[] connections){
        this.x = x;
        this.y = y;
        this.connections = connections;
    }
}
