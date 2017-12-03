
import dao.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import model.*;

/**
 *
 * @author Rebeca
 */
public class TesteOfertaDAO {

    public static void main(String[] args) throws SQLException {
        Produto prod1 = new Produto();
        prod1.setDescricao("Limpeza");
        prod1.setPreco((float)1.67);
        prod1.setTitulo("Detergente");
        
        Produto prod2 = new Produto();
        prod2.setDescricao("Papelaria");
        prod2.setPreco((float)5.20);
        prod2.setTitulo("Resma de papel");
        
        Produto prod3 = new Produto();
        prod3.setDescricao("Papelaria");
        prod3.setPreco((float)8.90);
        prod3.setTitulo("Grampeador");
        
        ItemPedido ip1 = new ItemPedido();
        ip1.setProd(prod1);
        ip1.setQuant(100);
        ip1.setPrecoTotal((float)167.00);
        
        ItemPedido ip2 = new ItemPedido();
        ip2.setProd(prod2);
        ip2.setQuant(100);
        ip2.setPrecoTotal((float)520.00);
        
        ItemPedido ip3 = new ItemPedido();
        ip3.setProd(prod3);
        ip3.setQuant(100);
        ip3.setPrecoTotal((float)890.00);
        
        Pedido p = new Pedido();
        p.setD(new Date(2017,12,01));
        p.setPrecoTotal((float) 167.89);
        p.setQtdTotal(150);
        
        ArrayList<ItemPedido> ar1 = new ArrayList<>();
        ar1.add(ip1);
        ar1.add(ip2);
        ar1.add(ip3);
        p.setItens(ar1);
        
        Oferta o = new Oferta();
        o.setCategoria("Limpeza");
        o.setP(prod1);
        o.setOr(p);
        o.setPrecoTotal((float)167.00);
        o.setQtd(100);
        
        ProdutoDAO p1 = new ProdutoDAO();
        
        p1.adicionarProduto(prod1);
        p1.adicionarProduto(prod2);
        p1.adicionarProduto(prod3);
        
        p1.deletarProduto(prod3);
        
        
        

    }

//@Teste
    //metodo testar cadastro
//dao.cadastrarDAo()
}
