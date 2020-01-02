/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaceprivate;

import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import peaceprivate.MainHomePage;
/**
 *
 * @author Ismail
 */
public class Register extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
String url = "jdbc:mysql://localhost:3306/peace";
    /**
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        conn=javaconnect.ConnecrDb();
        txt_Emp.setText(String.valueOf(Emp.empId).toString());
        
        Date dNow = new Date();

        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String time = "" + ft.format(dNow);
        MonthChooser.addItem(time);
        
        
        
        
        //Focus for ID TextField
        id.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                if(id.getText().equalsIgnoreCase("IDNO")){
                    id.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(id.getText().equalsIgnoreCase("")){
                    id.setText("IDNO");
                } //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        //Focus for Name TextField
       name.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                if(name.getText().equalsIgnoreCase("Name of the student")){
                    name.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(name.getText().equalsIgnoreCase("")){
                    name.setText("Name of the student");
                } //To change body of generated methods, choose Tools | Templates.
            }
        });
       
       
       //Focus for Mobile TextField
       mobileNum.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                if(mobileNum.getText().equalsIgnoreCase("Mobile")){
                    mobileNum.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(mobileNum.getText().equalsIgnoreCase("")){
                   mobileNum.setText("Mobile");
                } //To change body of generated methods, choose Tools | Templates.
            }
        });
       
       
        
       //Focus for Parent Mobile TextField
       Pnum.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                if(Pnum.getText().equalsIgnoreCase("Parent/Emergancy Number")){
                    Pnum.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(Pnum.getText().equalsIgnoreCase("")){
                   Pnum.setText("Parent/Emergancy Number");
                } //To change body of generated methods, choose Tools | Templates.
            }
        });
       
       
       //Focus for Branch TextField
       branch.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                if(branch.getText().equalsIgnoreCase("Branch Name")){
                    branch.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(branch.getText().equalsIgnoreCase("")){
                   branch.setText("Branch Name");
                } //To change body of generated methods, choose Tools | Templates.
            }
        });
       
       
        //Focus for Course description TextField
       Cdesc.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                if(Cdesc.getText().equalsIgnoreCase("Course Description")){
                    Cdesc.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(Cdesc.getText().equalsIgnoreCase("")){
                   Cdesc.setText("Course Description");
                } //To change body of generated methods, choose Tools | Templates.
            }
        });
       
       
         //Focus for Course description TextField
       classno.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                if(classno.getText().equalsIgnoreCase("Classroom No")){
                    classno.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(classno.getText().equalsIgnoreCase("")){
                   classno.setText("Classroom No");
                } //To change body of generated methods, choose Tools | Templates.
            }
        });
       
       
          //Focus for Course type TextField
       ctype.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                if(ctype.getText().equalsIgnoreCase("Course Time")){
                    ctype.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(ctype.getText().equalsIgnoreCase("")){
                   ctype.setText("Course Time");
                } //To change body of generated methods, choose Tools | Templates.
            }
        });
       
         
    }
private String status;
private String paymentCheck;
private String courses;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegPanel = new javax.swing.JPanel();
        newSt = new javax.swing.JPanel();
        St_Tapped = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        mobileNum = new javax.swing.JTextField();
        Pnum = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        branch = new javax.swing.JTextField();
        classno = new javax.swing.JTextField();
        Cdesc = new javax.swing.JTextField();
        ctype = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        SpokenEng = new javax.swing.JRadioButton();
        WrSkills = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        pay = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        MonthChooser = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        intermediate_rbuton = new javax.swing.JRadioButton();
        advanced_rbutton = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        Paid = new javax.swing.JCheckBox();
        unpaid = new javax.swing.JCheckBox();
        jSeparator7 = new javax.swing.JSeparator();
        doneButtn = new javax.swing.JButton();
        RestButton = new javax.swing.JButton();
        beginerRadioBtn = new javax.swing.JRadioButton();
        lgg = new javax.swing.JLabel();
        txt_Emp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        RegPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true), new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true)));

        newSt.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add New Student", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12)), new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true))); // NOI18N

        St_Tapped.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        id.setEditable(false);
        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setText("Name of the student");

        mobileNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mobileNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mobileNum.setText("Mobile");

        Pnum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pnum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pnum.setText("Parent/Emergancy Number");
        Pnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnumActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Contact Address");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Signature of the registrar");

        jSeparator4.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.pink, java.awt.Color.pink, java.awt.Color.darkGray, java.awt.Color.gray), new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true)));

        jSeparator5.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.pink, java.awt.Color.pink, java.awt.Color.darkGray, java.awt.Color.gray), new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Signature of the Student");

        branch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        branch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        branch.setText("Branch Name");

        classno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        classno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        classno.setText("Classroom No");

        Cdesc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cdesc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cdesc.setText("Course Description");

        ctype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ctype.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ctype.setText("Course Time");

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peaceprivate/images/icons8_courses_16.png"))); // NOI18N
        jLabel6.setText("Course");

        SpokenEng.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SpokenEng.setText("Spoken English");
        SpokenEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpokenEngActionPerformed(evt);
            }
        });

        WrSkills.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        WrSkills.setText("Writting Skills");
        WrSkills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WrSkillsActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peaceprivate/images/icons8_coins_32.png"))); // NOI18N
        jLabel7.setText("Amount Of Payment");

        pay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Month");

        MonthChooser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name)
                                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(MonthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addGap(75, 75, 75)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(branch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cdesc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(classno, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctype, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobileNum, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel1)))
                                .addGap(115, 115, 115)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(SpokenEng)
                                .addGap(49, 49, 49)
                                .addComponent(WrSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(53, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(191, 191, 191))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MonthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(mobileNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(Pnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SpokenEng)
                            .addComponent(WrSkills))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel7))))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap())))
        );

        St_Tapped.addTab("Student Info", jPanel2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peaceprivate/images/icons8_student_32.png"))); // NOI18N
        jLabel4.setText("Student Status");

        intermediate_rbuton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        intermediate_rbuton.setText("Intermediate");
        intermediate_rbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intermediate_rbutonActionPerformed(evt);
            }
        });

        advanced_rbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        advanced_rbutton.setText("Advanced");
        advanced_rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advanced_rbuttonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peaceprivate/images/icons8_cash_in_hand_32.png"))); // NOI18N
        jLabel8.setText("Month Fee");

        Paid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Paid.setText("Paid");
        Paid.setBorderPaintedFlat(true);
        Paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaidActionPerformed(evt);
            }
        });

        unpaid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        unpaid.setText("Unpaid");
        unpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unpaidActionPerformed(evt);
            }
        });

        doneButtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        doneButtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peaceprivate/images/icons8_ok_32.png"))); // NOI18N
        doneButtn.setText("DONE");
        doneButtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtnActionPerformed(evt);
            }
        });

        RestButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RestButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peaceprivate/images/icons8_restart_32.png"))); // NOI18N
        RestButton.setText("RESET");
        RestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestButtonActionPerformed(evt);
            }
        });

        beginerRadioBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        beginerRadioBtn.setText("Beginer");
        beginerRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginerRadioBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator7)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Paid)
                        .addContainerGap(520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(beginerRadioBtn)
                        .addGap(33, 33, 33)
                        .addComponent(intermediate_rbuton)
                        .addGap(54, 54, 54)
                        .addComponent(advanced_rbutton)
                        .addGap(256, 256, 256))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(doneButtn)
                .addGap(168, 168, 168)
                .addComponent(RestButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(unpaid)
                .addGap(294, 294, 294))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(intermediate_rbuton)
                        .addComponent(advanced_rbutton)
                        .addComponent(beginerRadioBtn))
                    .addComponent(jLabel4))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Paid)
                    .addComponent(unpaid))
                .addGap(103, 103, 103)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doneButtn)
                    .addComponent(RestButton))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        St_Tapped.addTab("Other Info", jPanel1);

        lgg.setText("Loggedin As:- ");

        javax.swing.GroupLayout newStLayout = new javax.swing.GroupLayout(newSt);
        newSt.setLayout(newStLayout);
        newStLayout.setHorizontalGroup(
            newStLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(St_Tapped)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newStLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lgg)
                .addGap(18, 18, 18)
                .addComponent(txt_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        newStLayout.setVerticalGroup(
            newStLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newStLayout.createSequentialGroup()
                .addGroup(newStLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lgg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Emp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(St_Tapped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout RegPanelLayout = new javax.swing.GroupLayout(RegPanel);
        RegPanel.setLayout(RegPanelLayout);
        RegPanelLayout.setHorizontalGroup(
            RegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(newSt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RegPanelLayout.setVerticalGroup(
            RegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newSt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 495, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(RegPanel);

        setBounds(400, 150, 836, 497);
    }// </editor-fold>//GEN-END:initComponents

    private void PnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnumActionPerformed

    private void doneButtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtnActionPerformed
        // TODO add your handling code here:
         String moncombo = (String) MonthChooser.getSelectedItem();
         // Done Button
         int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Add Student",JOptionPane.YES_NO_OPTION);
        if(p==0){

            try {
                com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, "root", "");
                String sql ="insert into `register`" 
                        + "(`idNum`,`name`,`month`,`branch`,`courseDesc`,`status`,`classnum`,`ctype`,`mobnum`,`pnum`,`payCheck`,`courses`,`pay`) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
               // pst=conn.prepareStatement(sql);
                pst.setString(1, null);
                pst.setString(2,name.getText());
                pst.setString(3,moncombo);
                pst.setString(4,branch.getText());
                pst.setString(5,Cdesc.getText());
                pst.setString(6,status);
                pst.setString(7,classno.getText());
                pst.setString(8,ctype.getText());
                pst.setString(9,mobileNum.getText());
                pst.setString(10,Pnum.getText());
                pst.setString(11,paymentCheck);
                pst.setString(12,courses);
                pst.setString(13,pay.getText());
                
 if (name.getText().equals("") ||  branch.getText().equals("") || Cdesc.getText().equals("") || classno.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Fill all the Fields");
            } else {
                pst.execute();
                JOptionPane.showMessageDialog(null,"Student Registred successfully");
            }
        
    } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
        }
        //--------------------------------------------
        
        String emp = txt_Emp.getText().toString();
        String amnt = pay.getText().toString();
        String idNum = id.getText().toString();
        String mgc = name.getText();
        
          JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File(mgc+"Report.pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
           
        try {
            // TODO add your handling code here:
            
            String sql ="select * from `register` where name='"+mgc+"'";
            
 
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
           
           
           Document myDocument = new Document();
           PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
           PdfPTable table = new PdfPTable(13);
           myDocument.open();
           
   
           float[] columnWidths = new float[] { 7,7,7,7,7,7,7,7,7,7,7,7,7};
           table.setWidths(columnWidths);

           table.setWidthPercentage(100); //set table width to 100%
           
           myDocument.add(new Paragraph("Peace Institute Of Spoken English & Writing Skills",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
           myDocument.add(new Paragraph("Student Registration",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
           myDocument.add(new Paragraph(new Date().toString()));
           myDocument.add(new Paragraph("Report Generated By  Employe ID:- "+emp,FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD)));
           myDocument.add(new Paragraph("-----------------------------------------------------------------------------"));
          table.addCell(new PdfPCell(new Paragraph("ID Number",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Date Of Registration",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Branch",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Course Descreption",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Status",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Class Number",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Class Type",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Mobile Number",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Parent Mobile",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Payment Check",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Courses",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Amount Paid",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          
          
          while(rs.next())
            {
           table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(9),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(10),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(11),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(12),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(13),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
            }
           
           myDocument.add(table);
           myDocument.add(new Paragraph("Amount Paid:"+amnt,FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD )));
           myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
           myDocument.add(new Paragraph("Please Check your ID Number in the first row of the table",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD )));
           myDocument.close();  
           JOptionPane.showMessageDialog(null,"Report was successfully generated");
            
     }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         
         
     }
   finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         
            }
     } 
        
    
        // ---------------------------------------------------------
        Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            String val0 = timeString;
            String val1 = dateString;
            String val = txt_Emp.getText().toString();
                try{

                String reg= "insert into Audit (emp_id, date, status) values ('"+val+"','"+val0+" / "+val1+"','Student Registration')";
                pst=conn.prepareStatement(reg);
                pst.execute();

                  }
            catch (Exception e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
            } 
    
    }//GEN-LAST:event_doneButtnActionPerformed

    private void intermediate_rbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intermediate_rbutonActionPerformed
        // TODO add your handling code here:
         status ="Intermediate";
        advanced_rbutton.setSelected(false);
        intermediate_rbuton.setSelected(true);
        beginerRadioBtn.setSelected(false);
        
    }//GEN-LAST:event_intermediate_rbutonActionPerformed

    private void advanced_rbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advanced_rbuttonActionPerformed
        // TODO add your handling code here:
        status ="Advanced";
        advanced_rbutton.setSelected(true);
        intermediate_rbuton.setSelected(false);
        beginerRadioBtn.setSelected(false);
    }//GEN-LAST:event_advanced_rbuttonActionPerformed

    private void PaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaidActionPerformed
        // TODO add your handling code here:
        paymentCheck ="Paid";
        Paid.setSelected(true);
        unpaid.setSelected(false);
    }//GEN-LAST:event_PaidActionPerformed

    private void unpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unpaidActionPerformed
        // TODO add your handling code here:
         paymentCheck ="Unpaid";
        Paid.setSelected(false);
        unpaid.setSelected(true);
    }//GEN-LAST:event_unpaidActionPerformed

    private void SpokenEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpokenEngActionPerformed
        // TODO add your handling code here:
        courses ="Spoken English";
        SpokenEng.setSelected(true);
        WrSkills.setSelected(false);
     
        
    }//GEN-LAST:event_SpokenEngActionPerformed

    private void WrSkillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WrSkillsActionPerformed
        // TODO add your handling code here:
        courses ="Writting Skills";
        SpokenEng.setSelected(false);
        WrSkills.setSelected(true);
       
    }//GEN-LAST:event_WrSkillsActionPerformed

    private void beginerRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginerRadioBtnActionPerformed
        // TODO add your handling code here:
        courses ="Beginer";
        advanced_rbutton.setSelected(false);
        intermediate_rbuton.setSelected(false);
        beginerRadioBtn.setSelected(true);
    }//GEN-LAST:event_beginerRadioBtnActionPerformed

    private void RestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestButtonActionPerformed
        // TODO add your handling code here:
                name.setText("");
                branch.setText("");
                Cdesc.setText("");
                classno.setText("");
                ctype.setText("");
                mobileNum.setText("");
                pay.setText("");
    }//GEN-LAST:event_RestButtonActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cdesc;
    private javax.swing.JComboBox<String> MonthChooser;
    private javax.swing.JCheckBox Paid;
    private javax.swing.JTextField Pnum;
    private javax.swing.JPanel RegPanel;
    private javax.swing.JButton RestButton;
    private javax.swing.JRadioButton SpokenEng;
    private javax.swing.JTabbedPane St_Tapped;
    private javax.swing.JRadioButton WrSkills;
    private javax.swing.JRadioButton advanced_rbutton;
    private javax.swing.JRadioButton beginerRadioBtn;
    private javax.swing.JTextField branch;
    private javax.swing.JTextField classno;
    private javax.swing.JTextField ctype;
    private javax.swing.JButton doneButtn;
    private javax.swing.JTextField id;
    private javax.swing.JRadioButton intermediate_rbuton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lgg;
    private javax.swing.JTextField mobileNum;
    private javax.swing.JTextField name;
    private javax.swing.JPanel newSt;
    private javax.swing.JTextField pay;
    private javax.swing.JLabel txt_Emp;
    private javax.swing.JCheckBox unpaid;
    // End of variables declaration//GEN-END:variables
}
