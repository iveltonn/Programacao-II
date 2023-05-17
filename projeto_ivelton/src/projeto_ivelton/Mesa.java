package projeto_ivelton;

import java.util.ArrayList;

public class Mesa {
	private int numero;
    private ArrayList<Pedido> pedidos;
    private boolean fechada;

    public Mesa(int numero) {
        this.numero = numero;
        this.pedidos = new ArrayList<>();
        this.fechada = false;
    }
    public Mesa () {
    	
    }

    public int getNumero() {
        return numero;
    }

    public boolean isFechada() {
        return fechada;
    }

    public void adicionarPedido(Pedido pedidos) {
        this.pedidos.add(pedidos);
    }

    public void fecharMesa() {
        fechada = true;
        System.out.println("mesa fechada");
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Pedido pedido : pedidos) {
            total += pedido.getPreco();
        }
        return total;
    }

}
