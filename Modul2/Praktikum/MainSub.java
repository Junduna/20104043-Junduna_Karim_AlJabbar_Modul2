package Modul2.Praktikum;

import Modul2.Praktikum.protec.ModifierSubClass;

public class MainSub extends ModifierSubClass{

    public static void main(String[] args){

        MainSub mainSub = new MainSub();
        System.out.println(mainSub.teksPublic);
        System.out.println(mainSub.teksProtect);

    }
}
