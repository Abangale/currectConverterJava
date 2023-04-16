package TubesPBO;

import javax.swing.*;

public class currencyConverterMain {
    public static void main (String[] args) {
        JFrame frame = new JFrame("CurCon");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tp = new JTabbedPane();

        tp.addTab("Opening", new pageOpening());
        tp.addTab("Rupiah", new pageIDR());
        tp.addTab("Dollar", new pageUSD());
        tp.addTab("Baht", new pageBaht());
        tp.addTab("Rupee", new pageRupee());

        frame.getContentPane().add(tp);
        frame.pack();
        frame.setLayout(null);
        frame.setSize(450,290);
        frame.setLocationRelativeTo(null);
        tp.setSize(450,255);
        frame.setVisible(true);
    }
}