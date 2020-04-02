package ejercicio8.archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class AppLecturaArchivo {
	public static void main(String args[]) {
		try {
			FileReader fr = new FileReader("C:\\datos\\clases\\sa\\testout.txt");
			BufferedReader br = new BufferedReader(fr);

			File fout = new File("C:\\datos\\clases\\sa\\out.txt");
			FileOutputStream fos;
			fos = new FileOutputStream(fout);
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

			String i;
			while ((i = br.readLine()) != null) {

				bw.write(i);
				bw.newLine();
			}
			br.close();
			fr.close();
			bw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


	}
}
