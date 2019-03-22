
public class MastermindPartie {

	private List<String> code = new List<String>;
	
	private String difficulte = "Default";
	private int paramTailleDuCode = 5;
	
	List<String> difficultePossible = {"Default";"Mitige";"Difficile"};
	
	List<String> couleurPossible = {"Rouge";"Jaune";"Orange";"Bleu";"Violet";"Vert";"Noir";"Blanc"};
	
	/*Instanciation d'un objet de la classe random, 
	pour utiliser une de ces methodes, nextInt */
	
	Random rand = new Random();
	
	//setCode() il faut que for(el :code), tous appartiennent a couleurPossible
	
	public void setCode(int tailleDuCode) {
		
		List<String> codeBase = {tailleDuCode};
		for(int i=0;i<tailleDuCode;i++) {
			
			int alea = rand.nextInt(max - min + 1) + min;
					
		}
		
	}
	
	public void rappelRegle() {
		System.out.println(" *rappel des regles* ");
	}
	
	// public void lancementMasterMind(){}
	
	
	
}
