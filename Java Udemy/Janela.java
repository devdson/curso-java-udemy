import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Janela {

        public static void main(String[] args) {
            
            // Criação e Configuração da Janela
            JFrame janela = new JFrame();
            janela.setSize(500,500);
            janela.setTitle("Ex 02");
            janela.setDefaultCloseOperation(3);

            // Criação da Label
            JLabel labelNome = new JLabel("Nome:");
            labelNome.setBounds(20, 20, 50, 20);

            // Criação do Campo de Texto
            JTextField campoTextoNome = new JTextField();
            campoTextoNome.setBounds(20,40,200,20);

            // Criação e Configuração do Botão
            JButton botaoEnviar = new JButton("Enviar");
            botaoEnviar.setBounds(20,60,100,20);
            botaoEnviar.addActionListener(event -> {
                
                String nomeDigitado = campoTextoNome.getText();
                JOptionPane.showMessageDialog(janela,"Olá " + nomeDigitado);

            });

            // Painel
            janela.setLayout(null);
            janela.getContentPane().add(labelNome);
            janela.getContentPane().add(campoTextoNome);
            janela.getContentPane().add(botaoEnviar);
            
            // Janela Visivel
            janela.setVisible(true);
        }
    
}
