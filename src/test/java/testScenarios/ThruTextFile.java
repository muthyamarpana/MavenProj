package testScenarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class ThruTextFile {

	
	FileWriter fw;
	BufferedWriter bw;
	FileReader fr;
	BufferedReader br;
	String src="C:\\selenium_new\\sel@9AM(IST)\\data.txt";
	
	@Test
	public void writeAndReadFrmtxtFile() throws IOException
	{
		File fc=new File(src);
		fc.createNewFile();  //creates new file
		fw=new FileWriter(src);  //refers the text file
		bw=new BufferedWriter(fw);
		bw.write("this is my first Line");
		bw.newLine();
		bw.write("this is my second line");
		bw.close();
		fr=new FileReader(src);
		br=new BufferedReader(fr);
		String content=null;
		while((content=br.readLine())!=null)
		{
			System.out.println(content);
		}
		br.close();
		
		
	}
}
