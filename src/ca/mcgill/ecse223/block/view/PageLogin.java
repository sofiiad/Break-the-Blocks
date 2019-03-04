package ca.mcgill.ecse223.block.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ColorChooserUI;

import ca.mcgill.ecse223.block.controller.Block223Controller;
import ca.mcgill.ecse223.block.controller.InvalidInputException;

/**
 * Page where the user will have to log in.
 * @author Sofia Dieguez
 * */
public class PageLogin extends ContentPage {
	
	//data elements
	private String error = null;
	private static Font defaultFont = new Font("Century Gothic",Font.PLAIN,14);
	private static Font titleFont = new Font("Century Gothic",Font.BOLD,20);
	
	public PageLogin(Block223MainPage parent){
	    super(parent);
	    setLayout(new GridLayout(7,1));
	    setBackground(Color.WHITE);
	    
	    //Login elements 
	    Border border = BorderFactory.createLineBorder(new Color(207,243,238), 3);
	    
	    //Title page panel
	    JPanel titlePanel = new JPanel(new BorderLayout());
	    titlePanel.setBackground(new Color(229, 248, 255));
	    JLabel titleLabel = new JLabel("BLOCK223", JLabel.CENTER);
	    titleLabel.setFont(titleFont);
	    titlePanel.add(titleLabel, BorderLayout.CENTER);
	    
	    //Username label panel
	    JPanel usernameLabelPanel = new JPanel(new BorderLayout());
	    usernameLabelPanel.setBackground(Color.WHITE);
	    JLabel usernameLabel = new JLabel("         Username:");
	    usernameLabel.setFont(defaultFont);
	    usernameLabel.setHorizontalAlignment(JLabel.LEFT);
	    usernameLabelPanel.add(usernameLabel, BorderLayout.WEST);
	    
	    //Username text field panel
	    JPanel usernameTxtFieldPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    usernameTxtFieldPanel.setBackground(Color.WHITE);
	    JTextField usernameTextField = new JTextField();
	    usernameTextField.setPreferredSize(new Dimension(253, 27));
	    usernameTextField.setBorder(border);
	    usernameTextField.setFont(defaultFont);
	    usernameTxtFieldPanel.add(usernameTextField);
	    
	    //Password label panel
	    JPanel passwordLabelPanel = new JPanel(new BorderLayout());
	    JLabel passwordLabel = new JLabel("         Password:");
	    passwordLabel.setFont(defaultFont);
	    passwordLabel.setHorizontalAlignment(JLabel.LEFT);
	    passwordLabelPanel.add(passwordLabel, BorderLayout.WEST);
	
	    //Password password field panel
	    JPanel passwordPFieldPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    JPasswordField passwordPField = new JPasswordField();
	    passwordPField.setPreferredSize(new Dimension(253, 27));
	    passwordPField.setBorder(border);
	    passwordPFieldPanel.add(passwordPField);
	    
	    //Buttons
	    //Log in button panel
	    JPanel loginBtnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    loginBtnPanel.setBackground(Color.WHITE);
	    JButton logInButton = createButton("Log In");
	    loginBtnPanel.add(logInButton);
	    
	    //Sign up button panel
	    JPanel signUpBtnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        signUpBtnPanel.setBackground(Color.WHITE);
        JButton signUpButton = new JButton("Sign Up!");
        signUpButton.setBackground(Color.WHITE);
        signUpButton.setForeground(Color.BLUE);
        JLabel recommendSignUp = new JLabel("Don't have an account?");
        Border emptyBorder = BorderFactory.createEmptyBorder();
        signUpButton.setBorder(emptyBorder);
        signUpBtnPanel.add(recommendSignUp);
        signUpBtnPanel.add(signUpButton);
	    
        //Add panels to the screen
	    add(titlePanel);
	    add(usernameLabelPanel);
	    add(usernameTxtFieldPanel);
	    add(passwordLabelPanel);
	    add(passwordPFieldPanel);
	    add(loginBtnPanel);
	    add(signUpBtnPanel);
	    
        //Add action listeners
        logInButton.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		//clear error message
        		error = null;
        		
        		//Convert array of characters into a String
        		String password = new String(passwordPField.getPassword());
        		
        		//call the controller
        		try {
        			Block223Controller.login(usernameTextField.getText(), password);
        		} catch(InvalidInputException e) {
        			error=e.getMessage();
        			//refreshDataLogIn()//TODO
        		}
        		//ViewError//TODO
        	}//End of logInActionPerformed method
        	
        });//End of logInButton action listener
        
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		//displayPage(Block223MainPage.Page.signUp);//TODO
        	}
        });//End of signUpButton action listener
       
	}//End of PageLogin constructor
	
}//End of the PageLogin class
