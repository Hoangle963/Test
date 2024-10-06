package Dangnhap;

import javax.swing.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserRegistration {
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("User Registration");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Nhãn Username
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(50, 50, 100, 30);
        frame.add(usernameLabel);

        // Trường nhập Username
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 200, 30);
        frame.add(usernameField);

        // Nhãn Password
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 100, 100, 30);
        frame.add(passwordLabel);

        // Trường nhập Password
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 200, 30);
        frame.add(passwordField);

        // Nút đăng ký
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(150, 150, 100, 30);
        frame.add(registerButton);

        // Nhãn kết quả
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(50, 200, 300, 30);
        frame.add(resultLabel);

        // Hành động khi nhấn nút "Register"
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Kiểm tra điều kiện đơn giản
                if (username.equals("admin") && password.equals("password")) {
                    resultLabel.setText("Registration Successful!");
                } else {
                    resultLabel.setText("Invalid Username or Password!");
                }
            }
        });

        // Hiển thị JFrame
        frame.setVisible(true);
    }
}
