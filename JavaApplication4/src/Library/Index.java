package Library;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Index extends JFrame implements ActionListener {

    JLabel labelAdmin, labelLibrarian, labelManagement,imageLabel;
    JButton btnAdmin, btnLibrarian;
    JPanel panel1, panel2, panel3;
    Font font, fontLarge;

    Index() {
        super("Login Page");
        setLocation(500, 350);
        setSize(500, 200);
        font = new Font("Arial", Font.BOLD, 25);
        fontLarge = new Font("Arial", Font.BOLD, 20);

        labelAdmin = new JLabel("Admin Login");
        labelLibrarian = new JLabel("Librarian Login");
        labelManagement = new JLabel("Library Management");

        btnAdmin = new JButton("Login");
        btnLibrarian = new JButton("Login");

        btnAdmin.addActionListener(this);
        btnLibrarian.addActionListener(this);

        labelAdmin.setFont(fontLarge);
        labelLibrarian.setFont(fontLarge);
        labelManagement.setFont(font);
        btnAdmin.setFont(fontLarge);
        btnLibrarian.setFont(fontLarge);

        labelManagement.setHorizontalAlignment(JLabel.CENTER);
        labelManagement.setForeground(Color.WHITE);
        labelManagement.setBackground(Color.BLUE);
        
        ImageIcon img = new ImageIcon(getClass().getClassLoader().getSystemResource("Icons/login.jpg"));
        Image i=img.getImage().getScaledInstance(130,120, Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(i);
        imageLabel=new JLabel(img2);


        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2, 2, 10, 10));
        panel1.add(labelAdmin);
        panel1.add(btnAdmin);
        panel1.add(labelLibrarian);
        panel1.add(btnLibrarian);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 1, 10, 10));
        panel2.add(imageLabel);

        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1, 1, 10, 10));
        panel3.add(labelManagement);
        panel3.setBackground(Color.BLUE);
        
        setLayout(new BorderLayout(10, 10));
        add(panel3, BorderLayout.NORTH);
        add(panel2, BorderLayout.WEST);
        add(panel1, BorderLayout.CENTER);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdmin) {
            System.out.println("Admin Login");
            // Assuming a class named Admin with a method setVisible(boolean)
            // Replace it with the appropriate class and method for your application.
            new AdminLogin().setVisible(true);
            this.setVisible(false);
        }
        if (e.getSource() == btnLibrarian) {
            System.out.println("Librarian login");
            // Assuming a class named Librarian with a method setVisible(boolean)
            // Replace it with the appropriate class and method for your application.
            new LibrarianLogin().setVisible(true);
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Index().setVisible(true);
    }
}