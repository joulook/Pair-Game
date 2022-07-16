
package PairGame;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }
int a[]={0,2,5,6,7,1,3,5,4,8,1,3,8,7,2,4,6};
boolean b=true;
int btl1;
int btl2;
int numP1;
int numP2;
int counter;
int score;
int end;
int again;
int w;
int l;
int e;
public  int compair(int x,int y){
    if(x==y){
        
        return 1;
    }
    else{
        
     return 0;
    }          
}
public void normalButton(int a,int b){
        if(a==1||b==1)
           one.setText("");
        if(a==2||b==2)
           two.setText("");
        if(a==3||b==3)
           three.setText("");
        if(a==4||b==4)
            four.setText("");
        if(a==5||b==5)
            five.setText("");
        if(a==6||b==6)
            six.setText("");
        if(a==7||b==7)
            seven.setText("");
        if(a==8||b==8)
            eigth.setText("");
        if(a==9||b==9)
            nine.setText("");
        if(a==10||b==10)
            ten.setText("");
        if(a==11||b==11)
            eleven.setText("");
        if(a==12||b==12)
            twelve.setText("");
        if(a==13||b==13)
            thriteen.setText("");
        if(a==14||b==14)
            fourteen.setText("");
        if(a==15||b==15)
            fifteen.setText("");
        if(a==16||b==16)
            sixteen.setText("");
           counter=1;
}
public void disableButton(int a,int b){
    end++;
   score++;
        textField1.setText("score : "+score);
    if(a==1||b==1)
        one.setEnabled(false);
    if(a==2||b==2)
        two.setEnabled(false);
    if(a==3||b==3)
        three.setEnabled(false);
    if(a==4||b==4)
        four.setEnabled(false);
    if(a==5||b==5)
        five.setEnabled(false);
    if(a==6||b==6)
        six.setEnabled(false);
    if(a==7||b==7)
        seven.setEnabled(false);
    if(a==8||b==8)
        eigth.setEnabled(false);
    if(a==9||b==9)
        nine.setEnabled(false);
    if(a==10||b==10)
        ten.setEnabled(false);
    if(a==11||b==11)
        eleven.setEnabled(false);
    if(a==12||b==12)
        twelve.setEnabled(false);
    if(a==13||b==13)
        thriteen.setEnabled(false);
    if(a==14||b==14)
        fourteen.setEnabled(false);
    if(a==15||b==15)
        fifteen.setEnabled(false);
    if(a==16||b==16)
        sixteen.setEnabled(false);
    counter=0;
    
        if(end==8){
            if(score>0){
            JOptionPane.showMessageDialog(null,"Your score is : "+score,"Congratulations!   ...   You Win  :) ",JOptionPane.INFORMATION_MESSAGE);
            w++;
            MI.setText("win : "+w+"  "+"lost : "+l+"  "+"equal : "+e);
            }
            if(score==0){
            JOptionPane.showMessageDialog(null," It was too Close  ...  But Not Bad   ...  Try More .","Equal   ...   O_o  ",JOptionPane.INFORMATION_MESSAGE);
            e++;
            MI.setText("win : "+w+"  "+"lost : "+l+"  "+"equal : "+e);
            }
            if(score<0){
            JOptionPane.showMessageDialog(null,"Your score is : "+score,"Sorry   ...   You lose   ;(  ",JOptionPane.INFORMATION_MESSAGE);
            l++;
            MI.setText("win : "+w+"  "+"lost : "+l+"  "+"equal : "+e);
            }
            }
            
}

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eigth = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        ten = new javax.swing.JButton();
        eleven = new javax.swing.JButton();
        twelve = new javax.swing.JButton();
        thriteen = new javax.swing.JButton();
        fourteen = new javax.swing.JButton();
        fifteen = new javax.swing.JButton();
        sixteen = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        RM = new javax.swing.JButton();
        NOR = new java.awt.TextField();
        MI = new java.awt.TextField();
        textField1 = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eigthActionPerformed(evt);
            }
        });

        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenActionPerformed(evt);
            }
        });

        eleven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevenActionPerformed(evt);
            }
        });

        twelve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twelveActionPerformed(evt);
            }
        });

        thriteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thriteenActionPerformed(evt);
            }
        });

        fourteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourteenActionPerformed(evt);
            }
        });

        fifteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fifteenActionPerformed(evt);
            }
        });

        sixteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixteenActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        RM.setText("Rematch");
        RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RMActionPerformed(evt);
            }
        });

        NOR.setText("Num of reset : 0");
        NOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NORActionPerformed(evt);
            }
        });

        MI.setText("win : 0 ");
        MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(five, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(one, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thriteen, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fourteen, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eleven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fifteen, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eigth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twelve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sixteen, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NOR, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MI, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RM, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eigth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nine, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eleven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twelve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thriteen, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(fourteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fifteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RM, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NOR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(MI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        textField1.setText("Score : 0");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Developed By : KC\nDe.coder(); \n\n\nRules:\n1.each wrong choise has a nagative point\nand each true choise has a posetive point.\n\n2.at the end of the match , \nif your score was bigger than 0\nyou won , if it was 0 its equal\nand if it was lower than 0 you lost\n\n3.you can reset the game only 3 times \n\n4. you can Rematch the game only when\nmatch was finished\n\n5.Enjoy it :)\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
       if(one.getText()==""){
           counter++;
        one.setText(""+a[1]);
        b=!b;
        if(b==false){
            if(counter==3){
                if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
  
}
else
    disableButton(numP1, numP2);
            }
            numP1=1;
    btl1=a[1];
        }
        else{
            numP2=1;
    btl2=a[1];
if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
else{
score--;
        textField1.setText("score : "+score);
}    
        }
       }
     
    }

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {
    if(three.getText()==""){
        counter++;
        three.setText(""+a[3]);
        b=!b;
        if(b==false){
            if(counter==3){
                if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
}
            }
            numP1=3;
    btl1=a[3];
    
        }
        else{
            numP2=3;
    btl2=a[3];
if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
else{
score--;
        textField1.setText("score : "+score);
}  
}    
        
       }
        
    }

    private void eigthActionPerformed(java.awt.event.ActionEvent evt) {
if(eigth.getText()==""){
           counter++;
        eigth.setText(""+a[8]);
        b=!b;
        if(b==false){
            if(counter==3){
                if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
}
            }
            numP1=8;
    btl1=a[8];
        }
        else{
            numP2=8;
    btl2=a[8];
if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
else{
score--;
        textField1.setText("score : "+score);
}    
        }
       }
    }

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {
if(nine.getText()==""){
           counter++;
        nine.setText(""+a[9]);
        b=!b;
        if(b==false){
            if(counter==3){
                if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
  
}
            }
            numP1=9;
    btl1=a[9];
        }
        else{
            numP2=9;
    btl2=a[9];
if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
else{
score--;
        textField1.setText("score : "+score);
}    
        }
       }
    }

    private void twelveActionPerformed(java.awt.event.ActionEvent evt) {
if(twelve.getText()==""){
           counter++;
        twelve.setText(""+a[12]);
        b=!b;
        if(b==false){
            if(counter==3){
                if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
  
}
            }
            numP1=12;
    btl1=a[12];
        }
        else{
            numP2=12;
    btl2=a[12];
if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
else{
score--;
        textField1.setText("score : "+score);
}    
        }
       }
    }

    private void fourteenActionPerformed(java.awt.event.ActionEvent evt) {
   if(fourteen.getText()==""){
    counter++;
        fourteen.setText(""+a[14]);

b=!b;
if(b==false){
    if(counter==3){
        if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
}
    }
    numP1=14;
    btl1=a[14];
}
else{
        numP2=14;
    btl2=a[14];
    if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
    else{
score--;
        textField1.setText("score : "+score);
}
}
       
    } 
    }

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {
if(two.getText()==""){
    counter++;
        two.setText(""+a[2]);
b=!b;
if(b==false){
    if(counter==3){
        if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
}
    }
    numP1=2;
    btl1=a[2];
}
else{
        numP2=2;
    btl2=a[2];
    if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
    else{
score--;
        textField1.setText("score : "+score);
}
}
      
    }
    }
    private void fourActionPerformed(java.awt.event.ActionEvent evt) {
     if(four.getText()==""){
    counter++;
        four.setText(""+a[4]);
b=!b;
if(b==false){
    if(counter==3){
        if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
}
    }
    numP1=4;
    btl1=a[4];}
else{
        numP2=4;
    btl2=a[4];
    if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
    else{
score--;
        textField1.setText("score : "+score);
}
}
        
    }
    }

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {
if(five.getText()==""){
    counter++;
        five.setText(""+a[5]);
b=!b;
if(b==false){
    if(counter==3){
        if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
}
    }
    numP1=5;
    btl1=a[5];}
else{
        numP2=5;
    btl2=a[5];
    if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
    else{
score--;
        textField1.setText("score : "+score);
}
}
        
    }
    }

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {
if(six.getText()==""){
    counter++;
        six.setText(""+a[6]);
b=!b;
if(b==false){
    if(counter==3){
        if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
}
    }
    numP1=6;
    btl1=a[6];}
else{
        numP2=6;
    btl2=a[6];
    if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
    else{
score--;
        textField1.setText("score : "+score);
}
}
        
    }
    }

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {
    if(seven.getText()==""){
    counter++;
        seven.setText(""+a[7]);
b=!b;
if(b==false){
    if(counter==3){
        if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
}
    }
    numP1=7;
    btl1=a[7];
}
else{
        numP2=7;
    btl2=a[7];
    if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
    else{
score--;
        textField1.setText("score : "+score);
}
}
        
    }
    }

    private void tenActionPerformed(java.awt.event.ActionEvent evt) {
if(ten.getText()==""){
    counter++;
        ten.setText(""+a[10]);
b=!b;
if(b==false){
    if(counter==3){
        if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
}
    }
    numP1=10;
    btl1=a[10];}
else{
        numP2=10;
    btl2=a[10];
    if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
    else{
score--;
        textField1.setText("score : "+score);
}
}
       
    }
    }

    private void elevenActionPerformed(java.awt.event.ActionEvent evt) {
    if(eleven.getText()==""){
    counter++;
        eleven.setText(""+a[11]);
b=!b;
if(b==false){
    if(counter==3){
        if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
}
    }
    numP1=11;
    btl1=a[11];}
else{
        numP2=11;
    btl2=a[11];
    if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
    else{
score--;
        textField1.setText("score : "+score);
}
}
        
    }
    }

    private void thriteenActionPerformed(java.awt.event.ActionEvent evt) {
if(thriteen.getText()==""){
    counter++;
        thriteen.setText(""+a[13]);
b=!b;
if(b==false){
    if(counter==3){
        if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
}
    }
    numP1=13;
    btl1=a[13];}
else{
        numP2=13;
    btl2=a[13];
    if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
    else{
score--;
        textField1.setText("score : "+score);
}
}
        
    }
    }

    private void fifteenActionPerformed(java.awt.event.ActionEvent evt) {
if(fifteen.getText()==""){
    counter++;
        fifteen.setText(""+a[15]);
b=!b;
if(b==false){
    if(counter==3){
        if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
}
    }
    numP1=15;
    btl1=a[15];}
else{
        numP2=15;
    btl2=a[15];
    if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
    else{
score--;
        textField1.setText("score : "+score);
}
}
        
    }
    }

    private void sixteenActionPerformed(java.awt.event.ActionEvent evt) {
if(sixteen.getText()==""){
    counter++;
        sixteen.setText(""+a[16]);
b=!b;
if(b==false){
    if(counter==3){
        if(compair(btl1,btl2)==0){
    normalButton(numP1,numP2);
}
    }
    numP1=16;
    btl1=a[16];
}
else{
        numP2=16;
    btl2=a[16];
    if(compair(btl1, btl2)==1)
    disableButton(numP1, numP2);
    else{
score--;
        textField1.setText("score : "+score);
}
}
        
    }
    }

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {
    
    }
    

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {
     again++;
     if(again<=3){
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eigth.setEnabled(true);
        nine.setEnabled(true);
        ten.setEnabled(true);
        eleven.setEnabled(true);
        twelve.setEnabled(true);
        thriteen.setEnabled(true);
        fourteen.setEnabled(true);
        fifteen.setEnabled(true);
        sixteen.setEnabled(true);
           one.setText("");
           two.setText("");
           three.setText("");
            four.setText("");
            five.setText("");
            six.setText("");
            seven.setText("");
            eigth.setText("");
            nine.setText("");
            ten.setText("");
            eleven.setText("");
            twelve.setText("");
            thriteen.setText("");
            fourteen.setText("");
            fifteen.setText("");
            sixteen.setText("");
            score=0;
            textField1.setText("score : "+score);
            counter=0;
            end=0;
            b=true;
            NOR.setText("num of reset : "+again);
     }
     if(again==3)
         Reset.setEnabled(false);
    }

    private void RMActionPerformed(java.awt.event.ActionEvent evt) {
        if(end==8){
            one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eigth.setEnabled(true);
        nine.setEnabled(true);
        ten.setEnabled(true);
        eleven.setEnabled(true);
        twelve.setEnabled(true);
        thriteen.setEnabled(true);
        fourteen.setEnabled(true);
        fifteen.setEnabled(true);
        sixteen.setEnabled(true);
           one.setText("");
           two.setText("");
           three.setText("");
            four.setText("");
            five.setText("");
            six.setText("");
            seven.setText("");
            eigth.setText("");
            nine.setText("");
            ten.setText("");
            eleven.setText("");
            twelve.setText("");
            thriteen.setText("");
            fourteen.setText("");
            fifteen.setText("");
            sixteen.setText("");
            score=0;
            textField1.setText("score : "+score);
            counter=0;
            end=0;
            again=0;
            b=true;
            Reset.setEnabled(true);
            NOR.setText("num of reset : "+0);
        }
    }
public void fill(){
    
}
    private void NORActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void MIActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

   
    private java.awt.TextField MI;
    private java.awt.TextField NOR;
    private javax.swing.JButton RM;
    private javax.swing.JButton Reset;
    private javax.swing.JButton eigth;
    private javax.swing.JButton eleven;
    private javax.swing.JButton fifteen;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton fourteen;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton sixteen;
    private javax.swing.JButton ten;
    private java.awt.TextField textField1;
    private javax.swing.JButton three;
    private javax.swing.JButton thriteen;
    private javax.swing.JButton twelve;
    private javax.swing.JButton two;
    
}
