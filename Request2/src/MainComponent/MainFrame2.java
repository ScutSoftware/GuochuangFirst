
import Algorithm.Mega;
import Algorithm.Method1;
import Algorithm.Method2;
import Algorithm.SegmentationAndNounFilter;
import Algorithm.SortALG;
import MainComponent.BuildRelationship;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HuaLian Miss LULU
 */
public class MainFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    private StringBuffer str1 = new StringBuffer();
    private String[] str1Ary;    //"主题词更正与反馈" 中的字符串数组
    private String[] str2Ary;    //"主题词优先级排序" 中的字符串数组
    private StringBuffer keywordChoose = new StringBuffer();
    private StringBuffer keywordInput = new StringBuffer();
    private boolean [] step;//记录步骤
    
    public MainFrame2() {
        initComponents();
        initMainFrame();
    }
    public void initMainFrame()//初始化界面的一些属性
    {
        jTextField1.setEditable(false);
        jTextArea1.setEditable(false);
        jTextField2.setText(null);
        step = new boolean[4];
        step[0]=true;
        for(int i=0;i<step.length;i++)
        {
            step[i]=false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jButton12 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        jButton3.setText("jButton3");

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("关键词抽取");
        setBounds(new java.awt.Rectangle(0, 0, 536, 700));
        setResizable(false);

        jLabel1.setText("投诉文本记录");

        jButton1.setText("浏览");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText(" ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("确认");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("取消");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("主题词抽取结果");

        jTextArea1.setColumns(5);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("主题词更正与反馈");

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jLabel4.setText("添加其他主题词（空格隔开）");

        jTextField2.setText(" ");

        jButton5.setText("确认");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("取消");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("确认");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("取消");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel5.setText("主题词优先级排序");

        jButton10.setText("确认");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("取消");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("主题词确认");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jList1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jList1MouseMoved(evt);
            }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jList1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBox7, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBox9, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9)
                                        .addGap(32, 32, 32))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7))
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton7))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox10)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jButton11)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String fileName;
    private String filePath;
    private String mingciPath;
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();//文件选择框
        int result =0;
        File file=null;
        if(evt.getActionCommand().equals("浏览"))
	{
            
            fileChooser.setApproveButtonText("确定");
	    fileChooser.setDialogTitle("打开文件");
	    result = fileChooser.showOpenDialog(this);
	   if(result == JFileChooser.APPROVE_OPTION)
           {//选择的是确定按钮
	   file = fileChooser.getSelectedFile();//得到选择的文件
	   jTextField1.setText(file.getAbsolutePath());//文件路径
           filePath=file.getAbsolutePath();
	   fileName=file.getName();
           mingciPath= "名词.xlsx";
           }
           else if(result == JFileChooser.CANCEL_OPTION)
           {
			 jTextField1.setText("没有选择任何的文件!");
		
           }
           else
           {
			 jTextField1.setText("操作出现错误");
	   }
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(step[1]==true)
        {
        jCheckBox1.setText(keyword[0]);
        jCheckBox2.setText(keyword[1]);
        jCheckBox3.setText(keyword[2]);
        jCheckBox4.setText(keyword[3]);
        jCheckBox5.setText(keyword[4]);
        jCheckBox6.setText(keyword[5]);
        jCheckBox7.setText(keyword[6]);
        jCheckBox8.setText(keyword[7]);
        jCheckBox9.setText(keyword[8]);
        jCheckBox10.setText(keyword[9]);
        step[2]=true;
        }
        else
        {
             JOptionPane.showMessageDialog(null,"请在上一步中进行确定","提示",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    private boolean judeg3 = false ; 
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
       if(step[2])
       {        
        if(jCheckBox1.isSelected())
            str1.append(jCheckBox1.getLabel()+" ");
        if(jCheckBox2.isSelected())
            str1.append(jCheckBox2.getLabel()+" ");
        if(jCheckBox3.isSelected())
            str1.append(jCheckBox3.getLabel()+" ");
        if(jCheckBox4.isSelected())
            str1.append(jCheckBox4.getLabel()+" ");
        if(jCheckBox5.isSelected())
            str1.append(jCheckBox5.getLabel()+" ");
        if(jCheckBox6.isSelected())
            str1.append(jCheckBox6.getLabel()+" ");
        if(jCheckBox7.isSelected())
            str1.append(jCheckBox7.getLabel()+" ");
        if(jCheckBox8.isSelected())
            str1.append(jCheckBox8.getLabel()+" ");
        if(jCheckBox9.isSelected())
            str1.append(jCheckBox9.getLabel()+" ");
        if(jCheckBox10.isSelected())
            str1.append(jCheckBox10.getLabel()+" ");  
        keywordChoose.append(str1);
        keywordInput.append(jTextField2.getText());
        str1.append(" "+jTextField2.getText());       
        str1Ary = str1.toString().split(" ");
       
        if(keywordInput.length()>1&&keywordChoose.length()>1)
        {
            BuildRelationship relationship = new BuildRelationship(keywordInput.toString().split(" "),keywordChoose.toString().split(" "),point);
            addElement();
        } 
        else
        {
             JOptionPane.showMessageDialog(null,"请选择和输入关键词","提示",JOptionPane.ERROR_MESSAGE);
       
        }
        step[3]=true;
        keywordChoose.setLength(0);
        keywordInput.setLength(0);
        str1.setLength(0);
        
       }
      
        

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        jList1.getSelectedValue();
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseReleased
        // TODO add your handling code here:
         sec = jList1.locationToIndex(evt.getPoint());
         if ( sec != -1) {
                    if ( first != sec ) {
                        String s1 = listModel.getElementAt(first).toString();
                        String s2 = listModel.getElementAt(sec).toString();
                        listModel.setElementAt(s1, sec);
                        listModel.setElementAt(s2, first);
    
                        jList1.clearSelection();
                    }
                }
    }//GEN-LAST:event_jList1MouseReleased

    private void jList1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1MouseMoved

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        // TODO add your handling code here:
        first = jList1.locationToIndex(evt.getPoint());
    }//GEN-LAST:event_jList1MousePressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
        /**
         * 将listModel转化为字符串数组,以","分割
         * 但此时str2Ary[0]左端多出"["
         * str2Ary[len-1]右端多出"]"
         * 故将通过getElement的方法将第一个值与最后一个值直接赋予str2Ary
         */
        if(step[3]==true)
        {
        String [] newKeyword = new String [str1Ary.length];
        for(int i=0;i<newKeyword.length;i++)
        {
            newKeyword[i]=listModel.getElementAt(i).toString();
        }
         SortALG sortALG = new SortALG();
        try {
            sortALG.keywordSort(newKeyword,method1Tran,method2Tran);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"收集信息完成","提示",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
             JOptionPane.showMessageDialog(null,"请在上一步确认","提示",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton10ActionPerformed
    File fileOpen ;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fileOpen = new File(filePath);
        if(fileOpen.exists()==true)
        {
        SegmentationAndNounFilter segmentationFilter = new SegmentationAndNounFilter();
        segmentationFilter.SegmentationNounFilter(filePath, fileName);
        Method1 method1 = new Method1();           
        Method2 method2 = new Method2(); 
        
        try {
            method1Tran =method1.method1Out(mingciPath);
        } catch (Exception ex) {
            Logger.getLogger(MainFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        method2Tran =method2.MethodTest(mingciPath);
        Mega m = new Mega();
        
        try {
            keyword = m.init(method1Tran, method2Tran);
            
        } catch (Exception ex) {
            Logger.getLogger(MainFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        point = m.outPoint();
        StringBuffer showIn = new StringBuffer();   
         
         for(int i=0;i<keyword.length;i++)
         {
             showIn.append(keyword[i]+" ");
         }
         jTextArea1.setText(showIn.toString());
         
         step[1]=true;
        }
        else
             JOptionPane.showMessageDialog(null,"请选择合适的文件","提示",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void importGuanjianci(String keyword [] ) throws FileNotFoundException, IOException
    {
             FileInputStream fileIn = new FileInputStream(filePath);            
             XSSFWorkbook workbook = new XSSFWorkbook(fileIn);
             XSSFSheet sheet1 = workbook.getSheetAt(0);
             XSSFRow row1 = sheet1.getRow(0);
      for(int i = 0;i<keyword.length;i++)
      {

             row1=sheet1.createRow((short)(sheet1.getLastRowNum()+1));
	     row1.createCell(7).setCellValue(keyword[i]);

      }
             FileOutputStream fileOut = new FileOutputStream(filePath);
             fileOut.flush();
             workbook.write(fileOut);
             fileIn.close();
             fileOut.close();
        
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if(step[3])
        {
            try {
                importGuanjianci(keyword);
                JOptionPane.showMessageDialog(null,"关键词已写入导入文件","提示",JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame2.class.getName()).log(Level.SEVERE, null, ex);
            }
           System.exit(0);
           
        }
        else     
             JOptionPane.showMessageDialog(null,"请确定所有步骤","提示",JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(step[0]==false)
        {
            jTextField1.setText("");       
            filePath=null;
            fileName=null;
        }
        else
        {
             JOptionPane.showMessageDialog(null,"请从下一步进行取消","提示",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
       
        if(step[1]==false)
        {
            JOptionPane.showMessageDialog(null,"请从上一步确定","提示",JOptionPane.ERROR_MESSAGE);
        }
        if(step[2]==true)
        {
            JOptionPane.showMessageDialog(null,"请从下一步取消","提示",JOptionPane.ERROR_MESSAGE);
        }
         if(step[1]==true&&step[2]==false)
        {
        
        jTextArea1.setText("");
        for(int i= 0;i<keyword.length;i++)
        {
            keyword[i]=null;
        }
        step[1]=false;
        JOptionPane.showMessageDialog(null,"已返回上一步","提示",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
       
        if(step[2]==false)
        {
             JOptionPane.showMessageDialog(null,"请从上一步确定","提示",JOptionPane.ERROR_MESSAGE);
        }
        if(step[3]==true)
        {
             JOptionPane.showMessageDialog(null,"请从下一步取消","提示",JOptionPane.ERROR_MESSAGE);
        }
         if(step[2]==true&&step[3]==false)
        {
             jTextField2.setText(null);
             jCheckBox1.setText(null);
             jCheckBox2.setText(null);
             jCheckBox3.setText(null);
             jCheckBox4.setText(null);
             jCheckBox5.setText(null);
             jCheckBox6.setText(null);
             jCheckBox7.setText(null);
             jCheckBox8.setText(null);
             jCheckBox9.setText(null);
             jCheckBox10.setText(null);
             jCheckBox1.setSelected(false);
             jCheckBox2.setSelected(false);
             jCheckBox3.setSelected(false);
             jCheckBox4.setSelected(false);
             jCheckBox5.setSelected(false);
             jCheckBox6.setSelected(false);
             jCheckBox7.setSelected(false);
             jCheckBox8.setSelected(false);
             jCheckBox9.setSelected(false);
             jCheckBox10.setSelected(false);
             
             JOptionPane.showMessageDialog(null,"已返回上一步","提示",JOptionPane.ERROR_MESSAGE);

             step[2]=false;
             
             
             
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if(step[3]==true)
        {
             listModel.clear();
             jList1.setModel(listModel);
             JOptionPane.showMessageDialog(null,"已返回上一步","提示",JOptionPane.ERROR_MESSAGE);
             step[3]=false;
             
        }
        else
        {
             JOptionPane.showMessageDialog(null,"请从上一步确定","提示",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton11ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    
    public void addElement()
    {
        listModel.clear();
                for(int i=0;i<str1Ary.length;i++)
                {
                    listModel.addElement(str1Ary[i]);
                }
                jList1.setModel(listModel);
    }
    
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
            java.util.logging.Logger.getLogger(MainFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new MainFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    private int first;
    private int sec;    
    private   DefaultListModel listModel = new DefaultListModel();
    private String [] keyword;
    private double[] point;
    private String [] method2Tran ;
    private String [] method1Tran ;
}
