package week7.day1;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MyFrame extends JFrame {

  private JTextArea textArea;
  private JTextField pathField;
  private JButton loadButton;
  private JButton saveButton;


  public MyFrame(String title){
    super(title);
    setSize(500, 500);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    init();
  }

  private void init() {
    initButtons();

    JPanel buttonsPanel = new JPanel(new GridLayout(1, 2));
    buttonsPanel.add(loadButton);
    buttonsPanel.add(saveButton);
    getContentPane().add(buttonsPanel, BorderLayout.SOUTH);

    pathField = new JTextField();
    getContentPane().add(pathField, BorderLayout.NORTH);

    textArea = new JTextArea();
    getContentPane().add(textArea, BorderLayout.CENTER);
  }

  private void initButtons(){
    loadButton = new JButton("Load");
    loadButton.addActionListener(new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textArea.setText("After load button has been clicked");
      }
    });
    saveButton = new JButton("Save");
  }
}
