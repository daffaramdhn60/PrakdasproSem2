package minggu12;

public class NodeAntrian {
    Pembeli data;
    NodeAntrian prev;
    NodeAntrian next;
 
    public NodeAntrian(Pembeli data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
