package bb.scripts;

public class Main {
	  public static void main(String[] args) {

		      FindMissingKeys sc = new FindMissingKeys();
		      sc.findMissingKeysAndWriteToNewFile();
		      
		    }

}


//-----------
//[x] Prendre toutes les clées du fichier FR non présente dans fichier EN et les ajouter dans un nouveau fichier
//[ ] Comparer Fichier FR et EN et virer les lignes identiques (non traduite)
//[ ] Extraire les clés BE "combox" pour faire un autre fichier (pas à traduire)
//-----------