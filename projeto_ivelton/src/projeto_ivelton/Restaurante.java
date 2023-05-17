package projeto_ivelton;

import java.util.ArrayList;

public class Restaurante {

	private ArrayList<Mesa> mesas;
	

    public Restaurante() {
        this.mesas = new ArrayList<>();
    }

    public void adicionarMesa(Mesa mesa) {
        mesas.add(mesa);
    }

    public Mesa buscarMesa(int numero) {
        for (Mesa mesa : mesas) {
            if (mesa.getNumero() == numero) {
                return mesa;
            }
        }
        return null;
    }
}

   