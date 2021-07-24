package view;

import model.Formador;
import model.curse;

public class vista {

    public static void main(String[] args) {
        curse cursofrances = new curse(52441, "Frances 101", 'N', 0002, "Pedro");
        curse cursoitaliano = new curse(52442, "Italiano 101", 'T',0001,"juan");

        Formador profesor = new Formador ("pablo", 0003);
        System.out.println(profesor.getNombre());
        System.out.println(profesor.getCodigo());
        System.out.println(cursofrances.getCodigo());
        System.out.println(cursofrances.getJornada());
        System.out.println(cursofrances.getNombre());
        System.out.println(cursofrances.getFormador().getNombre());
        System.out.println(cursofrances.getFormador().getCodigo());
        System.out.println(cursoitaliano.getFormador().getNombre());
        System.out.println(cursoitaliano.getFormador().getCodigo());
        //**System.out.println(cursoitaliano.getNombre());
        //cursofrances.setNombre("hola");
        //System.out.println(cursofrances.getNombre());
        //System.out.println(cursoitaliano.getNombre());

    }
}
