import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;

public class Serveur {

	public static void main(String[] args) {
		
		/* ServerSocket étant notre objet serveur, une fois instancié nous pourrons 
		linker un Client a ce serveur via des sockets et via des parametres permettant 
		d'identifier (Serveur et Client) pouvant etre recuperé */
		
		ServerSocket serveursocket;
		Socket socket;
		
		// Les memes variables que dans notre classe Client
		
		BufferedReader in;
		PrintWriter out;
		
		try {
			
			/* Instance du serveur, puis lancement de la connection, tant que aucune 
			connection au serveur n'a été detecté le programme ne continuera pas, enfin 
			tant que personne ne s'est connecté */
			
			serveursocket = new ServerSocket(/*Port*/);
			socket = socket.accept();
			
			/* Lancement du serveur, pret a "reconnaitre", une fois que la connection 
			a été reconnu, envoie la suite! */
			
			System.out.println("Bienvenue, vous (recup de l'ip du client) etes bien connecté a notre serveur");
			
			// Permet de lire et afficher les messages entrants
			
			in = new BufferedReader (new InputStreamReader(socket.getInputStream()));
			
			String messageEntrant = in.readLine();
			System.out.println(messageDistant);
			
			// Creation de la variable sortante
			
			out = new PrintWriter()args;
			out.println("");
			
			// Fermeture
			
			socketserver.close();
			socket.close();
			
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
			
		}
	}

}
