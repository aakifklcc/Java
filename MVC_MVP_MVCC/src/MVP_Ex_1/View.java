package MVP_Ex_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
    private Presenter presenter;
    private JLabel statusLabel;
    private JTextField inputField;
    
    public View(){
        
        createUI();
    }
    
    private void  createUI(){
        statusLabel = new JLabel("We update in response to the input");
        inputField= new JTextField(20);
        JButton loginButton =new JButton("Login");
        loginButton.addActionListener((ActionEvent e) -> {
            presenter.login(inputField.getText());
            
        });
        Box topBox =Box.createHorizontalBox();
        topBox.add(statusLabel);
        topBox.add(Box.createHorizontalStrut(5)); // component with
        topBox.add(inputField);
        topBox.add(Box.createHorizontalStrut(5)); // component with
        topBox.add(loginButton);
        
        JFrame frame = new JFrame("MVP Ex");
        
        ((JPanel) frame.getContentPane()).setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(topBox, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); // we centered the frame in the window
    }
    
    public void setPresenter(Presenter p){
        presenter =p;
        
    }
     public void updateStatusLabel(String text){
         statusLabel.setText(text);
     }
     
      public void hideInputField(){
          inputField.setVisible(false);
      }
    
}
