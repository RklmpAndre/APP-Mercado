import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarrinhoDeComprasApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Carrinho de Compras");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // Crie um modelo de tabela para a JTable
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("Produto");

            // Crie a JTable
            JTable table = new JTable(tableModel);
            
            // Crie um JComboBox com alguns produtos de exemplo
            String[] produtos = {"Produto 1", "Produto 2", "Produto 3"};
            JComboBox<String> comboBox = new JComboBox<>(produtos);

            // Crie um JButton para adicionar produtos à tabela
            JButton adicionarButton = new JButton("Adicionar ao Carrinho");

            // Adicione um ActionListener ao botão
            adicionarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String produtoSelecionado = (String) comboBox.getSelectedItem();
                    tableModel.addRow(new Object[]{produtoSelecionado});
                }
            });

            // Crie um painel para organizar os componentes
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            panel.add(comboBox);
            panel.add(adicionarButton);

            // Adicione a tabela e o painel ao JFrame
            frame.add(new JScrollPane(table), BorderLayout.CENTER);
            frame.add(panel, BorderLayout.SOUTH);

            frame.pack();
            frame.setVisible(true);
        });
    }
}