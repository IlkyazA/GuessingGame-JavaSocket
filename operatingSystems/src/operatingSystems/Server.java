package operatingSystems;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Server {
public static void main(String args[]) throws IOException
{
	boolean correcto= true;
	Random rand = new Random();
	int number,sonuc,number2,counter=0;
	number2 = rand.nextInt(10)+1;
	ServerSocket s1= new ServerSocket(1342);
	Socket ss = s1.accept(); 
	Scanner sc = new Scanner(ss.getInputStream());
	while(correcto)
	{
	InputStream in=ss.getInputStream();
	BufferedReader bin = new BufferedReader(new InputStreamReader(in));
		
	number = Integer.parseInt( bin.readLine());
	
	if(counter == 2 && number != number2)
	{sonuc = 4;
	
	PrintWriter pout = new PrintWriter(ss.getOutputStream(),true);
	pout.println(sonuc); 
	correcto = false;
	}
	
	if(number == number2)
	{sonuc = 1;
	
	PrintWriter pout = new PrintWriter(ss.getOutputStream(),true);
	pout.println(sonuc); correcto=false;}

	else if(number>number2)
	{sonuc= 3;
	counter++;
	PrintWriter pout = new PrintWriter(ss.getOutputStream(),true);
	pout.println(sonuc);}
	
	
	else if(number< number2)
	{sonuc = 2;
	counter++;
	PrintWriter pout = new PrintWriter(ss.getOutputStream(),true);
	pout.println(sonuc);
	}}
	ss.close();
	
}
}
