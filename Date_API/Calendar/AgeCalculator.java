import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AgeCalculator extends Thread {

AgeCalculator(Main main)
 {
cal = new GregorianCalendar();
m = main;
 }
 
public void run()
{
jf = new JFrame();
jf.setLayout(new BorderLayout());
jf.setTitle("Age Calculator Calandar");
jf.setSize(400, 300);
JFrame _tmp = jf;
JFrame.setDefaultLookAndFeelDecorated(true);
jf.setDefaultCloseOperation(2);
jf.setVisible(true);
jf.setLocation(450, 150);
jf.setResizable(false);
label = new JLabel();
label.setHorizontalAlignment(0);
JButton jbutton = new JButton("<-M");
jbutton.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent actionevent)
{
cal.add(2,-1); 
updateMonth();
}

});

JButton jbutton1 = new JButton("M->");
jbutton1.addActionListener(new ActionListener(){
	
public void actionPerformed(ActionEvent actionevent)
{
cal.add(2, 1);
updateMonth();
}
});

JButton jbutton2 = new JButton("<-Y");
jbutton2.setBackground(Color.blue);
jbutton2.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent actionevent)
{
cal.add(1,-1); 
updateMonth();
}

});

JButton jbutton3 = new JButton("Y->"); 
jbutton3.setBackground(Color.blue);
jbutton3.addActionListener(new ActionListener() {
	
public void actionPerformed(ActionEvent actionevent)
{
cal.add(1, 1); 
updateMonth();
}
});

JPanel jpanel = new JPanel();
jpanel.setLayout(new BorderLayout());

JPanel jpanel1 = new JPanel();
jpanel1.setLayout(new FlowLayout(1, 10, 30)); 
jpanel1.add(jbutton);
jpanel1.add(jbutton2);
JPanel jpanel2 = new JPanel();
jpanel2.setLayout(new FlowLayout(1, 10, 30));
jpanel2.add(jbutton3);
jpanel2.add(jbutton1);

jpanel.add(jpanel1, "West"); 
jpanel.add(label, "Center");
jpanel.add(jpanel2, "East");

String as[] = {
      "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"
};
model = new DefaultTableModel((Object[][])null, as) {

public boolean isCellEditable(int i, int j)
{
return false;
}

};

JTable jtable = new JTable(model);
JScrollPane jscrollpane = new JScrollPane(jtable);
jf.add(jpanel, "North"); 
jf.add(jscrollpane, "Center");
updateMonth();
jtable.addMouseListener(new MouseAdapter() {

public void mouseClicked(MouseEvent mouseevent)
{
if(mouseevent.getClickCount() == 1)
{ 
JTable jtable1 = (JTable)mouseevent.getSource();
int i = jtable1.getSelectedRow();
int j = jtable1.getSelectedColumn();

try
{
date= ((Integer)jtable1.getValueAt(i, j)).intValue();
}
catch(Exception exception)
{
date = 0;
}

if(date != 0)
{
String s = (new StringBuilder()).append(date).append("/").append(month1).append("/").append(year).toString();
m.getResult(s);
jf.dispose();
}
}
}

});
}

void updateMonth()
{
cal.set(5, 1);
month1 = cal.get(2);
month = cal.getDisplayName(2, 2, Locale.getDefault());
year = cal.get(1);
label.setText((new StringBuilder()).append(month).append("").append(year).toString());
int i = cal.get(7);
int j = cal.getActualMaximum(5); 
int k = cal.getActualMaximum(4);

model.setRowCount(0);
model.setRowCount(k);
int l = i -1;
for (int i1=1; i1<=j; i1++){

model.setValueAt(Integer.valueOf(i1), l/7, l%7 );

l++;
}
}


DefaultTableModel model;
Calendar cal;
JLabel label; 
String month;
int year;
int month1;
int date;
JFrame jf;
Main m;

}