package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

public class Filehandling{
	
	public void createfile(File f) throws IOException {
		if(f.createNewFile()){
			System.out.println("File created");
			}
		else {
			System.out.println("file already exist");
		}
	}
	
	public void writefile(File f) throws FileNotFoundException {
		PrintWriter out= new PrintWriter(f); 
	out.println("abcde");
	out.close();
	}
	
	public void readfile(File f) throws IOException {
		BufferedReader br= new BufferedReader(new FileReader(f));
	
	String content=br.readLine();
	System.out.println(content);
	br.close();
	
	}
	
	public static void copyFile(File source, File dest) throws IOException {
	    Files.copy(source.toPath(), dest.toPath());
	}

	
	
}
