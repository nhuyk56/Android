package BaiTap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaiTapVeNha{

	public static void main(String[] args) throws IOException {
		
		
		

	    	FileInputStream Fin = new FileInputStream("Data.in");
			InputStreamReader ISR=new InputStreamReader(Fin);
			BufferedReader BR = new BufferedReader(ISR);
			
			FileOutputStream Fout= new FileOutputStream("Sort.out");
		    OutputStreamWriter OSW = new OutputStreamWriter(Fout);
		    BufferedWriter BW = new BufferedWriter(OSW);
		    
		    String s="";	
		    while (true) {
				 String Tmpstr = BR.readLine();
				if (Tmpstr==null) {
					BR.close();
					break;
				}
				s+=Tmpstr + " ";
			}
		    
		    int [] a;
		    int Tong = 0;
		    String [] ArrStr = s.split(" "); 
	        a = new int[ArrStr.length];
	        for(int i=0; i<ArrStr.length; i++) 
	            a[i] = Integer.parseInt(ArrStr[i]);
	        for(int i=0; i<ArrStr.length; i++)
	        {
	        	System.out.print(a[i] + " ");
	        	Tong += a[i];
	        }
	        System.out.println("");
	        System.out.println("Tong = " + Tong);
	        
	        for(int i=0; i<ArrStr.length; i++)
	        	for(int j=i; j<ArrStr.length; j++)
	        		if(a[i] > a[j])
	        		{
	        			int Tmpsx = a[j];
	        			a[j] =a[i];
	        			a[i] = Tmpsx;
	        		}
	        for(int i=0; i<ArrStr.length; i++)
	        	BW.write(a[i] + " ");
	        BW.close();

	}

}
