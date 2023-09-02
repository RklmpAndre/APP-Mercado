package models.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import models.beans.Carrinho;
import models.beans.Itens;
import models.beans.Produto;

/**
 *
 * @author andre
 */
public class ItensDAO implements DAO{
    
    
    private static ItensDAO cDAO;
    
    public static ItensDAO getInstance() {
        if (cDAO == null) {
            cDAO = new ItensDAO();
        }
        return cDAO;   
    }
    
     //É private para evitar que o PessoaDAO seja criado de outra forma que
    // não seja através do método getInstance.
    public ItensDAO(){
        
    }
    
    ArrayList<Itens> i = new ArrayList<>();
    private Carrinho c = new Carrinho(i);
    
    @Override
    public boolean create(Object obj) {
        Objects.requireNonNull(obj);
        if(obj instanceof Itens){
            Itens i = (Itens) obj;
            c.addLista(i.getProduto(), i.getQuantidade());
            return true;
        }
        return false;
    }

    @Override
    public Object read(Object obj) {
        Objects.requireNonNull(obj);
        if(obj instanceof Itens){
            Itens i = (Itens) obj;
            Iterator it = c.getItensCarrinhoLista().iterator();
            while (it.hasNext()) {
                Itens itens = (Itens) it.next();
                if (itens.getProduto().equals(i.getProduto())) {
                    return itens;
                }
            }
        }
        return null;
    }

    @Override
    public boolean update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
