package org.grep.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class grepf {

	public void grepfunction(){
		
		try{


			File file = new File("test.txt");
			FileInputStream fin = new FileInputStream(file);

			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the serch String");
			String token = scn.nextLine();
			BufferedReader br = new BufferedReader(new InputStreamReader(fin));	
			//Pattern pattern = Pattern.compile(token);
			String line= null;
			int lineCount =0;
			int hitcount =0;
			while((line = br.readLine())!=null){
				
				lineCount++;
				
				String [] list = line.toLowerCase().split(" ");
				for(String s:list){

					if(s.contains(token)){
						hitcount++;
						System.out.println("Found at line:" + lineCount +"\n" + line);
					}
					
				}

			}
			
			if(hitcount==0){
				
				System.out.println("No match ofund");	
			}
			br.close();
			scn.close();


		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
