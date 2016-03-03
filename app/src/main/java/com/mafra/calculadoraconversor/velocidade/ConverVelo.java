package com.mafra.calculadoraconversor.velocidade;

import android.support.annotation.NonNull;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Leandro on 29/12/2015.
 */
public class ConverVelo {

    public List<String> Ordena(String valor, int posicao){
        List<String> resu = new ArrayList<String>();

        if(posicao == 0){
            resu = Kilomentro(valor);
        }else if(posicao == 1){
            resu = Metros(valor);
        }else if(posicao == 2){
            resu = Milhas(valor);
        }else if(posicao == 3){
            resu = Pes(valor);
        }else if(posicao == 4){
            resu = MilhasNauticas(valor);
        }

        return resu;
    }

    public List<String> Kilomentro(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.277777777777778));  // m/s
        resu.add(1, df.format(valo*0.6213711922373323));  //milhas/h
        resu.add(2, df.format(valo*0.9113444152814205));  //pés/s
        resu.add(3, df.format(valo*0.5399568034557222));  //minhas nauticas

        return resu;

    }

    public List<String> Metros(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*3.6));  // Km/h
        resu.add(1, df.format(valo*2.2369362920544025));  //milhas/h
        resu.add(2, df.format(valo*3.280839895013123));  //pés/s
        resu.add(3, df.format(valo*1.943844492440605));  //minhas nauticas

        return resu;


    }

    public List<String> Milhas(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.44704));  // m/s
        resu.add(1, df.format(valo*1.609344));  //Km/h
        resu.add(2, df.format(valo*1.4666666666666668));  //pés/s
        resu.add(3, df.format(valo*0.868976241900648));  //minhas nauticas

        return resu;

    }

    public List<String> Pes(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.3048));  // m/s
        resu.add(1, df.format(valo*0.681818181818182));  //milhas
        resu.add(2, df.format(valo*1.09728));  //km/h
        resu.add(3, df.format(valo*0.5924838012958965));  //minhas nauticas

        return resu;

    }

    public List<String> MilhasNauticas(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.5144444444444444));  // m/s
        resu.add(1, df.format(valo*1.1507794480235425));  //milhas
        resu.add(2, df.format(valo*1.6878098571011952));  //pes
        resu.add(3, df.format(valo*1.852));  //km/s

        return resu;

    }

}
