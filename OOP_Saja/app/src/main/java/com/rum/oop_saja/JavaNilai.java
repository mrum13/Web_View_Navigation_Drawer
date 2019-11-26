package com.rum.oop_saja;

public class JavaNilai {
    Integer nilai1,nilai2,nilai3;

    public String menerima(String nilaiKirim1, String nilaiKirim2){
        PojoHitung pojokuClas = new PojoHitung();

        nilai3 = Integer.valueOf(nilaiKirim1)+Integer.valueOf(nilaiKirim2);
        String terima = String.valueOf(nilai3);
        return  terima;

//        pojokuClas.setHasil(nilai3.toString());

    }


}
