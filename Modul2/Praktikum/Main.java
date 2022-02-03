package Modul2.Praktikum;

import Modul2.Praktikum.protec.ModifierProtec;

public class Main {
    public static void main(String[] args) {

        Modifier modif = new Modifier();

        System.out.println(modif.angkaNon);
        System.out.println(modif.angkaProtected);
        modif.printAngkaPrivate();
        ModifierProtec modifProtec = new ModifierProtec();
        System.out.println(modifProtec.teksPublic);
    }
}
