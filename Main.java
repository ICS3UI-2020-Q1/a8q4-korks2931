import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JLabel n; 
  JLabel factorial; 


  JTextField userFactor;
  JTextArea resultCalc;

  JButton calculation;


  JPanel mainPanel;



  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // initialize the main panel 
   mainPanel = new JPanel(); 
   // turn on the manual layout 
   mainPanel.setLayout(null);

   // initialize the labels 
   n = new JLabel("n");
   // set bounds for the first label 
   n.setBounds(200,200,50,40);

   // initialize the text field 
    userFactor = new JTextField();
    // set bounds for the text field 
    userFactor.setBounds(220,210,50,20);


   // initialize the label 
   factorial = new JLabel("factorial(n)");
   // set bounds for the second label 
   factorial.setBounds(290,200,150,40);

    
    // initlaize the text area 
    resultCalc = new JTextArea();
    // set bounds for the text field 
    resultCalc.setBounds(390,210,50,20);
    

    // initialize the button 
    calculation = new JButton("Calc");
    // set bounds for the button 
    calculation.setBounds(470,210,90,20);


    // set the action command so we know which button was pressed 
   calculation.setActionCommand("Calc");
   

   // add the action ActionListener
   calculation.addActionListener(this);
  


   // add the labels to the main panel 
   mainPanel.add(n);
   mainPanel.add(factorial);
   // add the text field to the main panel 
   mainPanel.add(userFactor);
   // add the text areas 
   mainPanel.add(resultCalc);

   // add the button to the main Panel 
   mainPanel.add(calculation);
  
   // add the main panel to the frame
   frame.add(mainPanel);

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
    // get the number from the user and make a string
    String userNumber = userFactor.getText();
    // conver the string into integer
    int userNum =  Integer.parseInt(userNumber);
    

    // the accumulator
    int total = 0;

    // the factorial of the number 
    int factorial = 1;

    // for loop to find the factorial of the number
    for(int i = 1; i <= userNum; i = i+ 1 ){
      // add the numbers as it goes on
      total = total + i;
      // the factorial formula to find the factorial 
      factorial *= i;

    }
    // put the factorial in the result text area 
    resultCalc.setText("" + factorial);
    
    
    
    

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
