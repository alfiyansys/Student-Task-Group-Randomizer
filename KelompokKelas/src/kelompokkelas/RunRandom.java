/**
 * Task Group Randomizer
 * 
 * M. Alfiyan Syamsuddin
 * 2110121030, Electronics Engineering Polytechnic Institute of Surabaya
 * 2015
 * 
 * Contributor :
 * - null
 */

package kelompokkelas;

import java.util.Collections;

public class RunRandom {
    public static void main(String[] args) {
        Materi m = new Materi<Kelompok>();
        
        Kelompok k = null;
        
        /*
         * Masukkan data kelompok ketika membuat object kelompok baru
         * Nama kelompok pada constructor kelompok
         * Masukkan anggota kelompok pada constructor Mhs
         * setelah semua Mhs pada sebuah kelompok masuk pada k, 
         * tambahkan kelompok tersebut ke m
         */
        
        //Kelompok 1
        k = new Kelompok<Mhs>("K1");
        k.add(new Mhs("Hap"));        
        k.add(new Mhs("Chuta"));        
        k.add(new Mhs("Singgih"));        
        m.add(k);
        
        //Kelompok 2
        k = new Kelompok<Mhs>("K2");
        k.add(new Mhs("Nanda"));        
        k.add(new Mhs("Ika"));        
        k.add(new Mhs("Nindy"));        
        m.add(k);
        
        //Kelompok 3
        k = new Kelompok<Mhs>("K3");
        k.add(new Mhs("Kentung"));        
        k.add(new Mhs("Pram"));        
        k.add(new Mhs("Samudra"));
        k.add(new Mhs("Haqi"));
        m.add(k);
        
        /*
         * Lakukan pengacakan
         */
        Collections.shuffle(m);
        
        /**
         * Tampilkan hasil random
         */
        for(int i=0;i<m.size();i++){
            System.out.println("Materi "+ (i+1) +" = "+m.get(i).toString());
            //Nanti ditambahkan untuk menampilkan data kelompok
        }
    }
    
}
