package TP4;

import java.util.BitSet;
import java.util.Vector;

public class Equipement {
    private Vector<Pièce> listePiècesEquipement;
    private BitSet pièceDefectueuse;
 
    public Pièce getPièceByRéf(int réf) {
    	return listePiècesEquipement.elementAt(réf);
    }
    
    public void marquePieceDefectueuse(int index) {
        pièceDefectueuse.set(index);
    }

    public boolean isPieceDefectueuse(int index) {
        return pièceDefectueuse.get(index);
    }
    public int compterPiecesDefectueuse() {
        return pièceDefectueuse.cardinality();
    }
}

