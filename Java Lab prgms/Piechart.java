Write a java program to display the piechart using AWT Components.

import java.awt.*;
import java.awt.event.*;
class PieChartDemo extends Frame
{
  
   int start=0;
   int values[];
   Color colors[]={Color.red, Color.green, Color.blue, Color.orange,Color.cyan,Color.pink};
   public PieChartDemo(int arr[])
   {
       values=arr;
       this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we)
        {
          System.exit(0);
        }});
   }
   public void paint(Graphics g)
   {
     for(int i = 0; i<values.length; i++) 
      {
            g.setColor(colors[i%colors.length]);
            g.fillArc(150, 150, 200, 200, start, values[i]);
            start = start + values[i];
       }
    }
   public static void main(String args[])
   {
      PieChartDemo f=new PieChartDemo(new int[]{90,90,60,60,60});
       f.setSize(500,500);
       f.setVisible(true);
       f.setTitle("Pie Chart");
   }
}
