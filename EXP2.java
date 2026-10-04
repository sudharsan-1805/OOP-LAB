Package currency;
import java.util.*;
import java.text.DecimalFormat;
 Class CurrencyConvertor
{
double rupee,dollar,euro,yen;
Scanner sc = new Scanner(System.in);
DecimalFormat f = new DecimalFormat("##.###");
 public void convertInrToEuro()
{
System.out.println("Enter amount in rupees");
 rupee = sc.nextFloat();
euro = rupee / 80;
System.out.println("Euro : "+f.format(euro));
}
Public void convertEuroToInr()
{
System.out.println("Enter amount in Euro");
 euro = sc.nextFloat();
rupee = euro * 80;
System.out.println("Rupees : "+f.format(rupee));
}
public  void convertInrToDollar()
{
System.out.println("Enter amount in rupees"); 
rupee = sc.nextFloat();
dollar = rupee / 66;
System.out.println("Dollar : "+f.format(dollar));
}
Public void convertDollarToInr()
{
System.out.println("Enter amount in Dollar"); 
dollar = sc.nextFloat();
rupee = dollar * 66;
System.out.println("Rupees : "+f.format(rupee))
}
public void convertInrToYen()
{
System.out.println("Enter amount in rupees");
 rupee = sc.nextFloat();
yen = rupee / 0.61; 
System.out.println("Yen : "+f.format(yen));
}
Public void convertYenToInr()
{
System.out.println("Enter amount in Yen");
 euro = sc.nextFloat();
rupee = yen * 0.61;
System.out.println("Rupees : "+f.format(rupee));
}
}
Package distance;
import.java.util.*;
import java.text.DecimalFormat; 
Class DistanceConvertor
{
double meter,km,miles;
Scanner sc = new Scanner(System.in); DecimalFormat f =newDecimalFormat("##.###"); public void convertMeterToKm()
{
System.out.println("Enter the meter");
 meter = sc.nextFloat();
km = meter * 0.001; System.out.println("Kilometer : "+f.format(km));
}
public void convertKmToMeter()
{
System.out.println("Enter the Kilometer");
 km = sc.nextFloat();
meter = km / 0.001;
System.out.println("Meter : "+f.format(meter));
}
public void convertMilesToKm()
{
System.out.println("Enter the miles"); 
miles = sc.nextFloat();
km = miles * 1.6093; 
System.out.println("Kilometer : "+f.format(km));
}
public void convertKmToMiles()
{
System.out.println("Enter the Kilometer");
 km = sc.nextFloat();
miles = km / 1.6093;
System.out.println("Miles : "+f.format(miles));
}
}
Package time
Import java.util.*;
import java.text.DecimalFormat; 
Class TimeConvertor
{
double hour,minute,second;
Scanner sc = new Scanner(System.in);
 DecimalFormat f = new DecimalFormat("##.###");
public void convertHourToMinute()
{
System.out.println("Enter the Hour");
 hour = sc.nextFloat();
minute = hour * 60;
System.out.println("Minutes : "+f.format(minute));
}
public void convertMinuteToHour()
{
System.out.println("Enter the Minute"); 
minute = sc.nextFloat();
hour = minute / 60;
System.out.println("Hours : "+f.format(hour));
}
public void convertHourToSeconds()
{
System.out.println("Enter the Hour"); hour = sc.nextFloat();
second = hour * 3600; 
System.out.println("Seconds :"+f.format(second));
}
public void convertSecondsToHour()
{
System.out.println("Enter the Seconds"); 
second = sc.nextFloat();
hour = second / 3600; 
System.out.println("Hours : "+f.format(hour));
}
}
import currency.*;
 import distance.*;
import time.*;
import java.util.Scanner;
public class Convertor
{
public static void main (String[] args)
{
int code,currency_code,distance_code,time_code;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the code 1:Currency\n2:Distance\n3:Time"); code=sc.nextInt();
if(code==1)
{
System.out.println("Enter the Currecy code 1:Euro\n2:Dollar\n3:Yen"); currency_code=sc.nextInt();
if(currency_code == 1)
{
convertInrToEuro();
convertEuroToInr();
}
else if(currency_code == 2)
{
convertInrToDollar(); 
convertDollarToInr();
}
else if(currency code == 3)
{
convertInrToYen(); 
convertYenToInr();
}
else
{
System.out.println(“Invalid Code”);
}
}
else if(code==2)
{
System.out.println("Enter the Distance code 1:Meter\n2:Miles");
 distance_code=sc.nextInt();
if(distance_code == 1)
{
convertMeterToKm();
convertKmToMeter();
}
else
{
System.out.println(“Invalid Code”);
}
}
else if(code==3)
{
System.out.println("Enter the Time code 1:Minutes\n2:Seconds");
 time_code=sc.nextInt();
if(time_code == 1)
{
convertHourToMinute();
convertMinuteToHour();
}
else if(time_code == 2)
{
convertHourToSeconds();
 convertSecondsToHour();
}
else
{
System.out.println(“Invalid Code”);
}
}
else
{
System.out.println(“Invalid Code”);
}
}
}







                      
                       
          






OUTPUT

Enter the cod 1:Currency\n2:Distance\n3:Time
 1
Enter the Currecy code 1:Euro\n2:Dollar\n3:Yen
 2
Enter amount in rupees
               6600
Dollar : 100
	Enter amount in Dollar
6
Rupees : 396
