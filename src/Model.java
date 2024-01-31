import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<Deskovka> seznamDeskovek = new ArrayList<Deskovka>();

    public Model(){
        seznamDeskovek.add(new Deskovka("Carcansonne"));
        seznamDeskovek.add(new Deskovka("Catan"));
        seznamDeskovek.add(new Deskovka("Dostihy a sazky"));
    }
    public Deskovka getDeskovka(int index){
        return seznamDeskovek.get(index);
    }
}
