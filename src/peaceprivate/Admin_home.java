/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaceprivate;

import com.mysql.jdbc.Connection;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Omar
 */
public class Admin_home extends javax.swing.JFrame {
java.sql.Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
String url = "jdbc:mysql://localhost:3306/peace";

    /**
     * Creates new form Admin_home
     */
    public Admin_home() {
        initComponents();
        conn=javaconnect.ConnecrDb();
        txt_emp.setText(String.valueOf(Emp.empId).toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Admin_Main_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Label_for_Logo_in_admin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Label_for_Full_Name = new javax.swing.JLabel();
        Label_for_UserName_in_Admin = new javax.swing.JLabel();
        Label_for_Password_in_Admin = new javax.swing.JLabel();
        Label_for_Possition_in_admin = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        FullName = new javax.swing.JTextField();
        Possition_admin = new javax.swing.JTextField();
        Password_in_Admin = new javax.swing.JPasswordField();
        Label_for_Password_in_Admin1 = new javax.swing.JLabel();
        Confirm_password_in_Admin = new javax.swing.JPasswordField();
        Label_for_Full_Name1 = new javax.swing.JLabel();
        Personal_Id = new javax.swing.JTextField();
        Label_for_City_in_Admin = new javax.swing.JLabel();
        Label_for_Password_in_Admin3 = new javax.swing.JLabel();
        jFormatted_for_telefon = new javax.swing.JFormattedTextField();
        UserName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Create_btn_in_Admin = new javax.swing.JButton();
        Reset_btn_in_Admin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Label_for_Image_in_Admin = new javax.swing.JLabel();
        Image_Path_in_Admin_Panel = new javax.swing.JTextField();
        Browse_btn_in_Admin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_emp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        secu_quest = new javax.swing.JTextField();
        secu_answer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Admin_Main_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peaceprivate/images/icons8_add_user_male_32.png"))); // NOI18N
        jLabel1.setText("Create account");

        Label_for_Logo_in_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peaceprivate/images/peace private logo last.jpg"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Label_for_Full_Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_for_Full_Name.setText("Full Name:");

        Label_for_UserName_in_Admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_for_UserName_in_Admin.setText("User Name:");

        Label_for_Password_in_Admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_for_Password_in_Admin.setText("Password:");

        Label_for_Possition_in_admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_for_Possition_in_admin.setText("Position:");

        city.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });

        FullName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameActionPerformed(evt);
            }
        });

        Possition_admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Possition_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Possition_adminActionPerformed(evt);
            }
        });

        Label_for_Password_in_Admin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_for_Password_in_Admin1.setText("Confirm:");

        Label_for_Full_Name1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_for_Full_Name1.setText("Personal ID");

        Personal_Id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Label_for_City_in_Admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_for_City_in_Admin.setText("City:");

        Label_for_Password_in_Admin3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_for_Password_in_Admin3.setText("Phone:");

        try {
            jFormatted_for_telefon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## - ### - ## - ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormatted_for_telefon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormatted_for_telefon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        UserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label_for_Full_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Personal_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label_for_Full_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label_for_UserName_in_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label_for_Password_in_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Password_in_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label_for_Password_in_Admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Confirm_password_in_Admin)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label_for_City_in_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label_for_Password_in_Admin3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jFormatted_for_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label_for_Possition_in_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Possition_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Label_for_Full_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Personal_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Label_for_Full_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_for_UserName_in_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_for_Password_in_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Password_in_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Label_for_Password_in_Admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Confirm_password_in_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_for_City_in_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_for_Password_in_Admin3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jFormatted_for_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Label_for_Possition_in_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Possition_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Create_btn_in_Admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Create_btn_in_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peaceprivate/images/icons8_add_16.png"))); // NOI18N
        Create_btn_in_Admin.setText("Create");
        Create_btn_in_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_btn_in_AdminActionPerformed(evt);
            }
        });

        Reset_btn_in_Admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reset_btn_in_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peaceprivate/images/icons8_restart_16.png"))); // NOI18N
        Reset_btn_in_Admin.setText("Reset");
        Reset_btn_in_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_btn_in_AdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Create_btn_in_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Reset_btn_in_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Create_btn_in_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Reset_btn_in_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_for_Image_in_Admin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_for_Image_in_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );

        Image_Path_in_Admin_Panel.setFocusable(false);

        Browse_btn_in_Admin.setText("Browse");
        Browse_btn_in_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse_btn_in_AdminActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Logged In As");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peaceprivate/images/icons8_security_shield_green_16.png"))); // NOI18N
        jLabel3.setText("Security Details");

        secu_quest.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        secu_quest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secu_quest.setText("Seacurity Question");

        secu_answer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        secu_answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secu_answer.setText("Answer");

        javax.swing.GroupLayout Admin_Main_PanelLayout = new javax.swing.GroupLayout(Admin_Main_Panel);
        Admin_Main_Panel.setLayout(Admin_Main_PanelLayout);
        Admin_Main_PanelLayout.setHorizontalGroup(
            Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 286, Short.MAX_VALUE))
                                    .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                                        .addComponent(Browse_btn_in_Admin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Image_Path_in_Admin_Panel)
                                            .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel3)
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(secu_answer)
                                    .addComponent(secu_quest, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                        .addComponent(Label_for_Logo_in_admin)
                        .addGap(122, 122, 122)
                        .addGroup(Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator1))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        Admin_Main_PanelLayout.setVerticalGroup(
            Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                .addGroup(Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Label_for_Logo_in_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                                .addGroup(Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                                        .addGap(164, 164, 164)
                                        .addGroup(Admin_Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Browse_btn_in_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Image_Path_in_Admin_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)
                                .addComponent(secu_quest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(secu_answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(Admin_Main_PanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Admin_Main_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Admin_Main_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(375, 130, 905, 591);
    }// </editor-fold>//GEN-END:initComponents

    private void Create_btn_in_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_btn_in_AdminActionPerformed
        // TODO add your handling code here:
        
        try{
            File readImage=new File(Image_Path_in_Admin_Panel.getText());
            
            
            FileInputStream fis=new FileInputStream(readImage);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            
            byte [] buf =new byte[1024];
            for(int readNum; (readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            
        }
            forImage=bos.toByteArray();
            
       
            Connection con = (Connection) DriverManager.getConnection(url, "root", "");
            String sql = "INSERT INTO `user accounts` (`PERSONAL ID`,`USERNAME`, `PASSWORD`,`CITY`,`PHONENO`,`POSITION`,`IMAGE`,`sec_que`,`answer`) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Personal_Id.getText());
            pst.setString(2, UserName.getText());
            pst.setString(3, Password_in_Admin.getText());
            pst.setString(4, city.getText());
            pst.setString(6, Possition_admin.getText());
            pst.setString(5, jFormatted_for_telefon.getText());
            pst.setBytes(7, forImage);
            pst.setString(8,secu_quest.getText());
            pst.setString(9,secu_answer.getText());
            String confirm = Confirm_password_in_Admin.getText();
            String pswd = Password_in_Admin.getText();
            if (FullName.getText().equals("") || UserName.getText().equals("") || Password_in_Admin.getText().equals("") || Confirm_password_in_Admin.getText().equals("") || Possition_admin.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Fill all the Fields");
            } else if (!(pswd.equals(confirm))) {
                JOptionPane.showMessageDialog(null, "Please Confirm Password !!");
            } else {
                pst.execute();
                JOptionPane.showMessageDialog(null, "saved");
            }
        
    } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            String val0 = timeString;
            String val1 = dateString;
            String val = txt_emp.getText().toString();
                try{

                String reg= "insert into Audit (emp_id, date, status) values ('"+val+"','"+val0+" / "+val1+"','Account Created')";
                pst=conn.prepareStatement(reg);
                pst.execute();

                  }
            catch (Exception e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_Create_btn_in_AdminActionPerformed

    public ImageIcon ResizedImage(String path){
        ImageIcon image1=new ImageIcon(path);
        Image img=image1.getImage();
        Image scaledImage=img.getScaledInstance(Label_for_Image_in_Admin.getWidth(), Label_for_Image_in_Admin.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Imagedone=new ImageIcon(scaledImage);
     return Imagedone;
    }
    
    
    private void Possition_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Possition_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Possition_adminActionPerformed

    private void Browse_btn_in_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse_btn_in_AdminActionPerformed
        // TODO add your handling code here:
        
        if(Personal_Id.getText().equalsIgnoreCase("") || FullName.getText().equalsIgnoreCase("") || UserName.getText().equalsIgnoreCase("") || Password_in_Admin.getText().equalsIgnoreCase("") 
           || Confirm_password_in_Admin.getText().equalsIgnoreCase("") || city.getText().equalsIgnoreCase("") || jFormatted_for_telefon.getText().equalsIgnoreCase("") || Possition_admin.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Fill all the Fields please!!!", "Empty Field", JOptionPane.ERROR_MESSAGE);
        }
        else{       
        JFileChooser chooser=new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.image","jpg","jpeg","png");
        chooser.setFileFilter(filter);
        int result=chooser.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            File f=chooser.getSelectedFile();
            String path=f.getAbsolutePath();
            Image_Path_in_Admin_Panel.setText(path);
           Label_for_Image_in_Admin.setIcon(ResizedImage(path)); 
        }
        }
        
       
        
        
    }//GEN-LAST:event_Browse_btn_in_AdminActionPerformed

    private void FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameActionPerformed

    private void Reset_btn_in_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_btn_in_AdminActionPerformed
        // TODO add your handling code here:
        Personal_Id.setText("");
        FullName.setText("");
        city.setText("");
        Password_in_Admin.setText("");
        Confirm_password_in_Admin.setText("");
        city.setText("");
        UserName.setText("");
        Possition_admin.setText("");
        jFormatted_for_telefon.setText("");
        Image_Path_in_Admin_Panel.setText("");
        Label_for_Image_in_Admin.setIcon(null);
    }//GEN-LAST:event_Reset_btn_in_AdminActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/

            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_home().setVisible(true);
            }
        });
    
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Admin_Main_Panel;
    private javax.swing.JButton Browse_btn_in_Admin;
    private javax.swing.JPasswordField Confirm_password_in_Admin;
    private javax.swing.JButton Create_btn_in_Admin;
    private javax.swing.JTextField FullName;
    private javax.swing.JTextField Image_Path_in_Admin_Panel;
    private javax.swing.JLabel Label_for_City_in_Admin;
    private javax.swing.JLabel Label_for_Full_Name;
    private javax.swing.JLabel Label_for_Full_Name1;
    private javax.swing.JLabel Label_for_Image_in_Admin;
    private javax.swing.JLabel Label_for_Logo_in_admin;
    private javax.swing.JLabel Label_for_Password_in_Admin;
    private javax.swing.JLabel Label_for_Password_in_Admin1;
    private javax.swing.JLabel Label_for_Password_in_Admin3;
    private javax.swing.JLabel Label_for_Possition_in_admin;
    private javax.swing.JLabel Label_for_UserName_in_Admin;
    private javax.swing.JPasswordField Password_in_Admin;
    private javax.swing.JTextField Personal_Id;
    private javax.swing.JTextField Possition_admin;
    private javax.swing.JButton Reset_btn_in_Admin;
    private javax.swing.JTextField UserName;
    private javax.swing.JTextField city;
    private javax.swing.JFormattedTextField jFormatted_for_telefon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField secu_answer;
    private javax.swing.JTextField secu_quest;
    private javax.swing.JLabel txt_emp;
    // End of variables declaration//GEN-END:variables
String FileName=null;
byte[] forImage=null;
ImageIcon format=null;
}
