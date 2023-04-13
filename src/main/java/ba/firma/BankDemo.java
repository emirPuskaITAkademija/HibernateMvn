package ba.firma;

import ba.firma.entity.BankAccount;
import org.hibernate.Session;

import javax.swing.*;
import java.util.List;

public class BankDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(BankDemo::showGui);
    }

    private static void showGui() {
        JFrame frame = new JFrame("Bankovni računi");
        JPanel panel = new JPanel();
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        List<BankAccount> bankAccounts = session.createQuery("from BankAccount").list();
        session.getTransaction().commit();
        JComboBox<BankAccount> fromBankAccount = new JComboBox<>();
        bankAccounts.forEach(fromBankAccount::addItem);
        JComboBox<BankAccount> toBankAccount = new JComboBox<>();
        bankAccounts.forEach(toBankAccount::addItem);
        JTextField amountTextField = new JTextField("amount to transfer...");
        JButton transferButton = new JButton("TRANSFER");
        panel.add(fromBankAccount);
        panel.add(amountTextField);
        panel.add(toBankAccount);
        panel.add(transferButton);
        frame.setContentPane(panel);
        frame.setSize(800, 200);
        frame.setVisible(true);
    }
}
