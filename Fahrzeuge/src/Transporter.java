/**
 * Interface f�r Transporter. {@link Fahrzeug}e, die Transporter sind, k�nnen
 * Ladung auf- und abladen.
 *
 * @author Kai G�nster
 */
public interface Transporter {

    /**
     * Lade die �bergebene Ladung.
     *
     * @param ladung die zu ladende Ladung
     */
   public void lade(String Ladung);  
   
   /**
    * Pr�fe, welche Ladung sich gerade in diesem Transporter befindet.
    *
    * @return die aktuelle Ladung
    */
   public String pruefeLadung();

   /**
    * Entlade die aktuelle Ladung und gib sie zur�ck.
    *
    * @return
    */
   default public String entlade() {
	   String ladung = pruefeLadung();
	   lade(null);
	   return ladung;
   };
}
