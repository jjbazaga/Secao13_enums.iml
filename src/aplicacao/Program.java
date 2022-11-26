package aplicacao;

import entidade.Pedido;
import entidades.enums.StatusPedido;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1000, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
        System.out.println(pedido);
    }
}