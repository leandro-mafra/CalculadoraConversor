package com.mafra.calculadoraconversor.prePsi;

import java.text.DecimalFormat;

/**
 * Created by Leandro on 01/01/2016.
 */
public class CalcuPressao {


    public String Ordem(int posicao, int etapa, String ent1, String ent2) {
        String resu = null;

        switch (posicao){
            case 0:
                resu = Psi(etapa, ent1, ent2);
                break;
            case 1:
                resu = Pa(etapa, ent1, ent2);
                break;
            case 2:
                resu = Kpa(etapa, ent1, ent2);
                break;
            case 3:
                resu = Kgf(etapa, ent1, ent2);
                break;
        };

        return resu;
    }

    public String Psi(int etapa, String ent1, String ent2){
        String resu = null;
        double valo1 = Double.parseDouble(ent1);
        double valo2 = Double.parseDouble(ent2);
        DecimalFormat df = new DecimalFormat("#.####");

        switch (etapa){
            case 0:
                resu = df.format(valo1/valo2);
                break;
            case 1:
                resu = df.format(valo2*valo1);
                break;
            case 2:
                resu = df.format(valo2/valo1);
                break;
        };

        return resu;
    }

    public String Pa(int etapa, String ent1, String ent2){
        String resu = null;
        double valo1 = Double.parseDouble(ent1);
        double valo2 = Double.parseDouble(ent2);
        DecimalFormat df = new DecimalFormat("#.####");

        switch (etapa){
            case 0:
                resu = df.format(valo1/valo2);
                break;
            case 1:
                resu = df.format(valo2*valo1);
                break;
            case 2:
                resu = df.format(valo2/valo1);
                break;
        };

        return resu;
    }

    public String Kpa(int etapa, String ent1, String ent2){
        String resu = null;
        double valo1 = Double.parseDouble(ent1);
        double valo2 = Double.parseDouble(ent2);
        DecimalFormat df = new DecimalFormat("#.####");

        switch (etapa){
            case 0:
                resu = df.format((valo1/valo2)*Math.pow(10, -3));
                break;
            case 1:
                resu = df.format((valo2*Math.pow(10, 3))*valo1);
                break;
            case 2:
                resu = df.format(valo2 / (valo1*Math.pow(10, 3)));
                break;
        };

        return resu;
    }

    public String Kgf(int etapa, String ent1, String ent2){
        String resu = null;
        double valo1 = Double.parseDouble(ent1);
        double valo2 = Double.parseDouble(ent2);
        DecimalFormat df = new DecimalFormat("#.####");

        switch (etapa){
            case 0:
                resu = df.format(valo1/valo2);
                break;
            case 1:
                resu = df.format(valo2*valo1);
                break;
            case 2:
                resu = df.format(valo2/valo1);
                break;
        };

        return resu;
    }
}
