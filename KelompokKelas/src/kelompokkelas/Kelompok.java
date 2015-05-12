/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kelompokkelas;

import java.util.ArrayList;

/**
 *
 * @author Ian
 */
public class Kelompok<Mhs> extends ArrayList{
    public String namakel;

    public Kelompok(String namakel) {
        this.namakel = namakel;
    }
    
    @Override
    public String toString(){
        return this.namakel;        
    }
}
