/**
 * Interface für Transporter. {@link Fahrzeug}e, die Transporter sind, können
 * Ladung auf- und abladen.
 *
 * @author Kai Günster
 */
public interface Transporter {

    /**
     * Lade die übergebene Ladung.
     *
     * @param ladung die zu ladende Ladung
     */
   public void lade(String Ladung);  
   
   /**
    * Prüfe, welche Ladung sich gerade in diesem Transporter befindet.
    *
    * @return die aktuelle Ladung
    */
   public String pruefeLadung();

   /**
    * Entlade die aktuelle Ladung und gib sie zurück.
    *
    * @return
    */
   default public String entlade() {
	   String ladung = pruefeLadung();
	   lade(null);
	   return ladung;
   };
}
