package Composite;

/** "Composite" */
import java.util.List;
import java.util.ArrayList;
class CompositeGraphic implements Graphic {

    //Cole��o de Graficos  filhos
    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    //Printa o grafico
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    //Adiciona o grafico  a composi��o.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }
    //Remove a forma geometrica da composi��o.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
