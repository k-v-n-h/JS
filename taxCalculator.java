import java.util.Scanner; 
import javax.swing.JOptionPane; 
import javax.swing.*;

public class ComputeTax {
   public static void main(String[] args) {
   
      String intro;
   
    // Prompt the user to enter filing status
   
      intro = ("(0-single filer, 1-married jointly or qualifying widow(er), "
         + "\n2-married separately, 3-head of household)\n" +
         "Enter the filing status: ");
      
        
      int status;
      double tax = 0.;
      double income;
   
      status = Integer.parseInt(JOptionPane.showInputDialog(intro));
      
      if (status == 0) { 
      
         income = Integer.parseInt(JOptionPane.showInputDialog("Enter the taxable income: "));
      
         if (income <= 8250)
            tax = income * 0.10;
         
         
         else if (income <= 33950)
            tax = 8350 * 0.10 + (income - 8350) * 0.15;
         
         
         else if (income <= 82250)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
               (income - 33950) * 0.25;
          
          
         else if (income <= 171550)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
               (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
         
          
         else if (income <= 372950)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
               (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
               (income - 171550) * 0.33;
          
          
         if (income > 372950)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
               (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
               (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
      
         JOptionPane.showMessageDialog(null,"Your estimated income tax is: "+tax);}
      
      
      else if (status == 1){
      
         tax = 0.;
         
         income = Integer.parseInt(JOptionPane.showInputDialog("Enter the taxable income: "));
      
         if (income <= 16700){
            tax = income * .10;
         }      //tax for married file jointly
      
         if (income <= 67900){
            tax  = 16700 * 0.10 + (income - 16700) * 0.15;
         }
      
         if (income <= 137050){
            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
               (income - 67900) * 0.25;
         }
         if  (income <= 208850){
            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 +
               (income - 137050) * 0.28;
         }
         if  (income <= 372950){
            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
               (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
               (income - 208850) * 0.33;
         }
         if  (income >= 372951){
            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
               (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
               (372950 - 208850) * 0.33 + (income - 372951) * 0.35;
         }
         JOptionPane.showMessageDialog(null,"Your estimated income tax is: " + tax);
      }
      
      else  if (status == 2){  // tax for married separately
      
         income = Integer.parseInt(JOptionPane.showInputDialog("Enter the taxable income: "));
      
         if (income <= 8350)
            tax = income * 0.10;
         
         
         else if (income <= 33950)
            tax = 8350 * 0.10 + (income - 8350) * 0.15;
         
         
         else if (income <= 68525)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
               (income - 33950) * 0.25;
          
          
         else if (income <= 104425)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 +
               (income - 104425) * 0.28;
         
              
         else if (income <= 186475) 
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 +
               (104425 - 68525) * 0.28 + (income - 104425) * .33;
         
         
         else if (income > 186476)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 +
               (104425 - 68525) * 0.28 + (186475 - 104425) * .33 + (income - 186476) * .35;
       
         JOptionPane.showMessageDialog(null,"Your estimated income tax is: "+tax);}
       
      else   if (status == 3){  //tax for head of household
      
         income = Integer.parseInt(JOptionPane.showInputDialog("Enter the taxable income: "));
      
         if (income <= 11950)
            tax = income * 0.10;
         
         else if (income <= 45500)
            tax = 11950 * 0.10 + (income - 11950) * 0.15;
         
         else if (income <= 117450)
            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
               (income - 45500) * 0.25;
          
         else if (income <= 190200)
            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 +
               (income - 117450) * 0.28;
         
         else if (income <= 372950) 
            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 +
               (190200 - 117450) * 0.28 + (income - 190200) * .33;
         
         else if (income > 372951)
            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 +
               (190200 - 117450) * 0.28 + (372950 - 190200) * .33 + (income - 372950) * .35;
       
         JOptionPane.showMessageDialog(null,"Your estimated income tax is: "+tax);}
   }      
}
      //else  {
      //JOptionPane.showMessageDialog(null,"Error: invalid status");
         //System.exit(1);}
