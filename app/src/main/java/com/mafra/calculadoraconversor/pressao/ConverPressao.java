package com.mafra.calculadoraconversor.pressao;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leandro on 31/12/2015.
 */
public class ConverPressao {
    public List<String> Ordena(String valor, int posicao) {
        List<String> resul = new ArrayList<String>();

        if(posicao == 0){
            resul = Bar(valor);
        }else if(posicao == 1){
            resul = Psi(valor);
        }else if(posicao == 2){
            resul = Kgf(valor);
        }else if(posicao == 3){
            resul = Pa(valor);
        }else if(posicao == 4){
            resul = Kpa(valor);
        }else if(posicao == 5){
            resul = Inhg(valor);
        }else if(posicao == 6){
            resul = Cmhg(valor);
        }else if(posicao == 7){
            resul = Mmhg(valor);
        }

            return resul;

    }

    public List<String> Bar(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*14.503774389728312)); //psi
        resu.add(1, df.format(valo*1.0197162129779282));  //kgf
        resu.add(2, df.format(valo*100000));  //pa
        resu.add(3, df.format(valo*100));  //kpa
        resu.add(4, df.format(valo*29.52998016471232));  //inhg
        resu.add(5, df.format(valo*75.00615050434135));  //cmhg
        resu.add(6, df.format(valo*750.0615050434136));  //mmhg

        return resu;
    }

    public List<String> Psi(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.06894757)); //bar
        resu.add(1, df.format(valo*0.07030695497443061));  //kgf
        resu.add(2, df.format(valo*6894.757));  //pa
        resu.add(3, df.format(valo*6.894757));  //kpa
        resu.add(4, df.format(valo*2.036020374505114));  //inhg
        resu.add(5, df.format(valo*5.17149181232861));  //cmhg
        resu.add(6, df.format(valo*51.71491812328611));  //mmhg

        return resu;
    }

    public List<String> Kgf(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*14.223343911902914)); //psi
        resu.add(1, df.format(valo*0.980665));  //bar
        resu.add(2, df.format(valo*98066.5));  //pa
        resu.add(3, df.format(valo*98.0665));  //kpa
        resu.add(4, df.format(valo*28.95901799822761));  //inhg
        resu.add(5, df.format(valo*73.55590658433992));  //cmhg
        resu.add(6, df.format(valo*735.5590658433993));  //mmhg

        return resu;
    }

    public List<String> Pa(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.00014503774389728312)); //psi
        resu.add(1, df.format(valo*0.000010197162129779282));  //kgf
        resu.add(2, df.format(valo*0.00001));  //bar
        resu.add(3, df.format(valo*0.001));  //kpa
        resu.add(4, df.format(valo*0.0002952998016471232));  //inhg
        resu.add(5, df.format(valo*0.0007500615050434136));  //cmhg
        resu.add(6, df.format(valo*0.0075006150504341364));  //mmhg

        return resu;
    }

    public List<String> Kpa(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.1450377438972831)); //psi
        resu.add(1, df.format(valo*0.010197162129779282));  //kgf
        resu.add(2, df.format(valo*1000));  //pa
        resu.add(3, df.format(valo*0.01));  //bar
        resu.add(4, df.format(valo*0.2952998016471232));  //inhg
        resu.add(5, df.format(valo*0.7500615050434135));  //cmhg
        resu.add(6, df.format(valo*7.500615050434137));  //mmhg

        return resu;
    }

    public List<String> Inhg(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.4911542205185767)); //psi
        resu.add(1, df.format(valo*0.034531557667501135));  //kgf
        resu.add(2, df.format(valo*3386.389));  //pa
        resu.add(3, df.format(valo*3.386389));  //kpa
        resu.add(4, df.format(valo*0.03386389));  //bar
        resu.add(5, df.format(valo*2.54));  //cmhg
        resu.add(6, df.format(valo*25.4));  //mmhg

        return resu;
    }

    public List<String> Cmhg(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.19336780106971138)); //psi
        resu.add(1, df.format(valo*0.013595101283312852));  //kgf
        resu.add(2, df.format(valo*1333.224));  //pa
        resu.add(3, df.format(valo*1.333224));  //kpa
        resu.add(4, df.format(valo*0.39370078275118414));  //inhg
        resu.add(5, df.format(valo*0.01333224));  //bar
        resu.add(6, df.format(valo*10));  //mmhg

        return resu;
    }

    public List<String> Mmhg(String valor){
        List<String> resu = new ArrayList<String>();
        double valo = Double.parseDouble(valor);
        DecimalFormat df = new DecimalFormat("#.####");

        resu.add(0, df.format(valo*0.019336780106971138)); //psi
        resu.add(1, df.format(valo*0.0013595101283312852));  //kgf
        resu.add(2, df.format(valo*133.3224));  //pa
        resu.add(3, df.format(valo*0.1333224));  //kpa
        resu.add(4, df.format(valo*0.03937007827511842));  //inhg
        resu.add(5, df.format(valo*0.1));  //cmhg
        resu.add(6, df.format(valo*0.001333224));  //bar

        return resu;
    }
}
