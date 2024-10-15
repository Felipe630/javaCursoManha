package cursoJava2024;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OlaMundoGUI extends JFrame {

    public OlaMundoGUI() {
        // Configurando a janela
        setTitle("Olá Mundo em JAVA");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Criando o botão
        JButton botao = new JButton("Clique em mim!");

        // Adicionando um escutador de eventos
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exibe um pop-up com a mensagem "Olá Mundo"
                JOptionPane.showMessageDialog(null, "Olá Amanda");
            }
        });

        // Adicionando o botão à janela
        add(botao);

        // Tornando a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Chamando e executando a GUI
        new OlaMundoGUI();
    }
}
