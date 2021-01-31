import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		FileWriter fw = null;

		try {

			fw = new FileWriter("archivo.txt", true);

			String texto = "Hola amigo";

			for (int i = 0; i < texto.length(); i++) {
				fw.write(texto.charAt(i));
			}

		} catch(IOException e) {

		} finally {

			if(fw!=null) {

				try {
					f.close();
				} catch(IOException e) {

				}

			FileReader fr = null;

			try {

			fr = new FileReader("archivo.txt", true);

			String texto = "";

			char letra = fr.read();

			while(letra != -1) {
				texto += letra;
				letra = fr.read();
			}

				} catch(IOException e) {

			}
		}
	}
}

}
