/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus_apl;

/**
 *
 * @author BintangMeKa
 */
public class newID {

    private String ID;
    
    public newID(String oldID, String pre) {
        int jj = Integer.parseInt(oldID.replaceAll("[\\D]",""))+1;
        String kk = String.format("%04d", jj);
        this.ID = pre.concat(kk);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
}
