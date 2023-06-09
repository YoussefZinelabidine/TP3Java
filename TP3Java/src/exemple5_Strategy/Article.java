package exemple5_Strategy;

public class Article {

	private String nom;
	private int prix;

	protected Strategy startegy;

	public Article(String nom, int prix) {
		this.nom = nom;
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public int getPrix() {
		return prix;
	}

	public void payer() {
		startegy.operationStrategy();
	}

	@Override
	public String toString() {
		return "Article [nom=" + nom + ", prix=" + prix + "]";
	}

	public void setStartegy(Strategy startegy) {
		this.startegy = startegy;
	}

}
