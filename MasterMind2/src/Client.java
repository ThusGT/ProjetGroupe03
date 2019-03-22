import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;

public class Client {

	public static void main(String[] args) {
		
		
	/* Creation de notre socket Client-Serveur, 
	qui nous permettre de communiquer via nos deux ariables in et out */	
		
	Socket socket;
	
	/* Création des deux variables qui vont nous permettre d'envoyer des données, 
	in étant la variable qui recevra les données du message entrant et out étant
	la variable prenant ce que l'Utilisateur voudra envoyer, ou servant a envoyer
	des messages automatique au serveur */
	
	BufferReader in;
	PrintWriter out;

	try {
		
		/*Creation de la connection
		Un client a besoin seulement d'instancier une connection (avec bien sur des 
		variables permettant de l'identifer comme son ip)*/
		
		socket=new Socket(InetAdress.getLocalHost(),/*Port*/);
		
		//Permet de lire et afficher les messages entrants
		
		in = new BufferedReader ( new InputStreamReader (socket.getInputStream()));
		
		String messageEntrant = in.readLine();
		
		System.out.println((messageDistant);;
		
		//Creation et initialisation de la variable sortante
		
		out = new PrintWriter();
		out.println("");
		
	}
	
	catch (UnknownHostException e) {
		
		e.printStackTrace();
		
	}

	catch (IOException e) {
		
		e.printStackTrace();
		
	}
	
	
	
	}

}
