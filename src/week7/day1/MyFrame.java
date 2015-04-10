package week7.day1;

import helper.FileHelper;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class MyFrame extends JFrame {

  public static final String FILE_NOT_FOUND = "File not found. Please enter valid path to file";
  private JTextArea textArea;
  private JTextField pathField;
  private JButton loadButton;
  private JButton saveButton;


  public MyFrame(String title) {
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

  private void initButtons() {
    loadButton = new JButton("Load");
    loadButton.addActionListener(new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String filePath = pathField.getText();
        if (!new File(filePath).exists()) {
          JOptionPane.showMessageDialog(new JFrame(), FILE_NOT_FOUND, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
          try {
            String text = FileHelper.readFromFile(filePath);
            textArea.setText(text);
          } catch (IOException ex) {
            JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
          }
        }
      }
    });
    saveButton = new JButton("Save");
  }
}
