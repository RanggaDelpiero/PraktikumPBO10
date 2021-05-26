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
public class Mahasiswa extends Civitas{
    private String nim;
    
    public Mahasiswa(String nim, String nama, String prodi, String fakultas) {
        super(nama, prodi, fakultas);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

}
