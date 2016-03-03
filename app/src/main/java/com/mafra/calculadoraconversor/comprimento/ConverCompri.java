package com.mafra.calculadoraconversor.comprimento;

import android.support.annotation.NonNull;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Leandro on 30/12/2015.
 */
public class ConverCompri {

    public List<String> Ordena(String valor, int posicao){
        List<String> resul = new ArrayList<String>();

        if(posicao == 0){
            resul = Kilometro(valor);
        }else if(posicao == 1){
            resul = Metro(valor);
        }else if(posicao == 2){
            resul = Cemtimetro(valor);
        }else if(posicao == 3){
            resul = Milimetro(valor);
        }else if(posicao == 4) {
            resul = Milhas(valor);
        }else if(posicao == 5){
            resul = Jarda(valor);
        }else if(posicao == 6){
            resul = Pes(valor);
        }else if(posicao == 7){
            resul = Polegada(valor);
        }else if(posicao == 8){
            resul = MilhsNauticas(valor);
        }


        return resul;
    }

    public List<String> Kilometro(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*1000)); //m
        resu.add(1, df.format(valo*100000));  //cm
        resu.add(2, df.format(valo*1000000));  //mm
        resu.add(3, df.format(valo*0.621371192237334));  //mi
        resu.add(4, df.format(valo*1093.6132983377079));  //yd
        resu.add(5, df.format(valo*3280.839895013123));  //ft
        resu.add(6, df.format(valo*39370.07874015748));  //in
        resu.add(7, df.format(valo*0.5399568034557236));  //mn


        return resu;
    }

    public List<String> Metro(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.001)); //km
        resu.add(1, df.format(valo*100));  //cm
        resu.add(2, df.format(valo*1000));  //mm
        resu.add(3, df.format(valo*0.0006213711922373339));  //mi
        resu.add(4, df.format(valo*1.0936132983377078));  //yd
        resu.add(5, df.format(valo*3.280839895013123));  //ft
        resu.add(6, df.format(valo*39.37007874015748));  //in
        resu.add(7, df.format(valo*0.0005399568034557236));  //mn

        return resu;
    }

    public List<String> Cemtimetro(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.01)); //m
        resu.add(1, df.format(valo*0.00001));  //km
        resu.add(2, df.format(valo*10));  //mm
        resu.add(3, df.format(valo*0.000006213711922373339));  //mi
        resu.add(4, df.format(valo*0.010936132983377079));  //yd
        resu.add(5, df.format(valo*0.03280839895013123));  //ft
        resu.add(6, df.format(valo*0.3937007874015748));  //in
        resu.add(7, df.format(valo*0.000005399568034557236));  //mn

        return resu;
    }

    public List<String> Milimetro(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0,  df.format(valo*0.001)); //m
        resu.add(1,  df.format(valo*0.1));  //cm
        resu.add(2,  df.format(valo*0.000001));  //km
        resu.add(3,  df.format(valo*0.00000062137119223733));  //mi
        resu.add(4,  df.format(valo*0.0010936132983377078));  //yd
        resu.add(5,  df.format(valo*0.003280839895013123));  //ft
        resu.add(6,  df.format(valo*0.03937007874015748));  //in
        resu.add(7,  df.format(valo*0.00000053995680345572));  //mn

        return resu;
    }

    public List<String> Milhas(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*1609.344)); //m
        resu.add(1, df.format(valo*160934.4));  //cm
        resu.add(2, df.format(valo*1609344));  //mm
        resu.add(3, df.format(valo*1.609344));  //km
        resu.add(4, df.format(valo*1760));  //yd
        resu.add(5, df.format(valo*5280));  //ft
        resu.add(6, df.format(valo*63360));  //in
        resu.add(7, df.format(valo*0.868976241900648));  //mn

        return resu;
    }

    public List<String> Jarda(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.9144)); //m
        resu.add(1, df.format(valo*91.44));  //cm
        resu.add(2, df.format(valo*914.4));  //mm
        resu.add(3, df.format(valo*0.0005681818181818182));  //mi
        resu.add(4, df.format(valo*0.0009144));  //km
        resu.add(5, df.format(valo*3));  //ft
        resu.add(6, df.format(valo*36));  //in
        resu.add(7, df.format(valo*0.0004937365010799136));  //mn

        return resu;
    }

    public List<String> Pes(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.3048)); //m
        resu.add(1, df.format(valo*30.48));  //cm
        resu.add(2, df.format(valo*304.8));  //mm
        resu.add(3, df.format(valo*0.0001893939393939394));  //mi
        resu.add(4, df.format(valo*0.3333333333333333));  //yd
        resu.add(5, df.format(valo*0.0003048));  //km
        resu.add(6, df.format(valo*12));  //in
        resu.add(7, df.format(valo*0.00016457883369330455));  //mn

        return resu;
    }

    public List<String> Polegada(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.0254)); //m
        resu.add(1, df.format(valo*2.54));  //cm
        resu.add(2, df.format(valo*25.4));  //mm
        resu.add(3, df.format(valo*0.0000157828282828282));  //mi
        resu.add(4, df.format(valo*0.02777777777777777));  //yd
        resu.add(5, df.format(valo*0.0833333333333333));  //ft
        resu.add(6, df.format(valo*0.0000254));  //km
        resu.add(7, df.format(valo*0.000013714902807775378));  //mn

        return resu;
    }

    public List<String> MilhsNauticas(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*1852)); //m
        resu.add(1, df.format(valo*185200));  //cm
        resu.add(2, df.format(valo*1852000));  //mm
        resu.add(3, df.format(valo*1.1507794480235425));  //mi
        resu.add(4, df.format(valo*2025.371828521435));  //yd
        resu.add(5, df.format(valo*6076.1154855643035));  //ft
        resu.add(6, df.format(valo*72913.38582677166));  //in
        resu.add(7, df.format(valo*1.852));  //km

        return resu;
    }
}
