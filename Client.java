package operatingSystems;

import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.*;
public class Client {
	
public static void main(String args[]) throws UnknownHostException, IOException
{
	int number,sonuc;
	  boolean correct=true;
	  Scanner sc=new Scanner(System.in);
		Socket s = new Socket("127.0.0.1",1342);
		Scanner sc1= new Scanner (s.getInputStream());
	  while(correct)
	  {
	
	System.out.println("Enter a number between 1-10");
	number = sc.nextInt();
	
	
	PrintWriter pout = new PrintWriter(s.getOutputStream(),true);
	pout.println(number);
	
	InputStream in=s.getInputStream();
	BufferedReader bin = new BufferedReader(new InputStreamReader(in));
	sonuc=Integer.parseInt( bin.readLine());	
	if(sonuc==1)
	{System.out.println("You win!"); correct= false;}
	else if(sonuc==2)
	{System.out.println("Increase!");

	}
	else if(sonuc==3)
	{System.out.println("Decrease!"); }
	  
	 if(sonuc==4)
	{System.out.println("You Lost!"); correct=false;}
}
s.close();
}}
