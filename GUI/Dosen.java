/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author RanggaDelpiero UB
 */
public class Dosen extends Civitas{
    private String nip;
    
    public Dosen(String nip, String nama, String prodi, String fakultas) {
        super(nama, prodi, fakultas);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
}
