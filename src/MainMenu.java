   import javax.swing.*;

public class MainMenu extends JFrame {
    public MainMenu() {
        setTitle("Java Kombat - Menu Principal");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar painel principal
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Adicionar botões
        JButton startButton = new JButton("Iniciar Jogo");
        startButton.setBounds(300, 200, 200, 50);
        panel.add(startButton);

        JButton optionsButton = new JButton("Opções");
        optionsButton.setBounds(300, 300, 200, 50);
        panel.add(optionsButton);

        JButton exitButton = new JButton("Sair");
        exitButton.setBounds(300, 400, 200, 50);
        panel.add(exitButton);

        // Adicionar ação ao botão "Sair"
        exitButton.addActionListener(e -> System.exit(0));

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}