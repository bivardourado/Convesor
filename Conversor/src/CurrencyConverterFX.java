import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class CurrencyConverterFX {
    private static JFrame frame;
    private static JTextField inputField;
    private static JLabel resultLabel;

    public static void main(String[] args) {
        frame = new JFrame("Conversor de Moedas");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel inputLabel = new JLabel("Valor a ser convertido:");
        frame.add(inputLabel);

        inputField = new JTextField(20);
        frame.add(inputField);

        JButton convertButton = new JButton("Converter");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor = Double.parseDouble(inputField.getText());
                String[] opcoes = {"Dólar para Real", "Real para Dólar"};
                int opcao = JOptionPane.showOptionDialog(frame, "Escolha uma opção de conversão:", "Opções",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
                if (opcao == 0) {
                    double result = valor * getCotacao();
                    resultLabel.setText(valor + " dólares equivalem a " + result + " reais.");
                } else {
                    double result = valor / getCotacao();
                    resultLabel.setText(valor + " reais equivalem a " + result + " dólares.");
                }
            }
        });
        frame.add(convertButton);

        resultLabel = new JLabel("");
        frame.add(resultLabel);

        frame.setVisible(true);
    }

    private static double getCotacao() {
        try {
            URL url = new URL("https://economia.awesomeapi.com.br/all/USD-BRL");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = reader.readLine();
            reader.close();
            return Double.parseDouble(line.split("\"")[3].replace(",", "."));
        } catch (Exception e) {
            return 5.50;
        }
    }
}

