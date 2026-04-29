import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int id;
    private Date date;
    private double total;
    private Client client;
    private ArrayList<LigneCommande> lignes;

    public Commande() {
    }
}