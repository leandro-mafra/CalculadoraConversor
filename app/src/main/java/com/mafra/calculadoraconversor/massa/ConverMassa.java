package com.mafra.calculadoraconversor.massa;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leandro on 31/12/2015.
 */
public class ConverMassa {

    public List<String> Ordena(String valor, int posicao) {
        List<String> resul = new ArrayList<String>();

        if(posicao == 0){
            resul = Kilo(valor);
        }else if(posicao == 1){
            resul = Grama(valor);
        }else if(posicao == 2){
            resul = Libra(valor);
        }else if(posicao == 3){
            resul = Onca(valor);
        }

        return resul;
    }

    public List<String> Kilo(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*1000)); //g
        resu.add(1, df.format(valo*2.2046224760379585));  //lb
        resu.add(2, df.format(valo*35.27396583786957));  //oz

        return resu;
    }

    public List<String> Grama(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.001)); //k
        resu.add(1, df.format(valo*0.0022046224760379584));  //lb
        resu.add(2, df.format(valo*0.03527396583786957));  //oz

        return resu;
    }

    public List<String> Libra(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*453.5924)); //g
        resu.add(1, df.format(valo*0.4535924));  //k
        resu.add(2, df.format(valo*16));  //oz

        return resu;
    }

    public List<String> Onca(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*28.34952)); //g
        resu.add(1, df.format(valo*0.0625));  //lb
        resu.add(2, df.format(valo*0.02834952));  //k

        return resu;
    }
}
