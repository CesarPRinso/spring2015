package com.tecsup.spring.app;

import com.tecsup.spring.model.Instrumento;
import com.tecsup.spring.model.Musico;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBasico {

    public static void main(String[] args) {
        ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");

    }

    public static void ejemplo9(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("paul");

        System.out.println(musico.getInstrumentoFavorito().getNombre());
    }

    public static void ejemplo8(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("bruce");

        System.out.println(musico.getInstrumentoFavorito().getNombre());
    }

    public static void ejemplo7(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("kurt");

        System.out.println(musico.getInstrumentoFavorito().getNombre());
    }

    public static void ejemplo6(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("elvis");

        System.out.println(musico.getInstrumentoFavorito().getNombre());
    }

    public static void ejemplo5(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("patricio");

        System.out.println(musico.getNombre());
        System.out.println(musico.getInstrumentos().size());

        List<Instrumento> instrumentos = musico.getInstrumentos();

        for (Instrumento ins : instrumentos) {
            ins.sonido();
        }
    }

    public static void ejemplo4(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("vertiz");

        System.out.println(musico.getNombre());
        System.out.println(musico.getCanciones());
        System.out.println(musico.getInstrumentoFavorito().getNombre());

        try {
            Instrumento instrumento = (Instrumento) cntx.getBean("rafaela");
            System.out.println(instrumento.getNombre());

        } catch (Exception e) {
            System.out.println("Imposible mostrar porque es un bean interno.");
        }
    }

    public static void ejemplo3(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("calamaro");

        System.out.println(musico.getNombre());
        System.out.println(musico.getCanciones());
        System.out.println(musico.getInstrumentoFavorito().getNombre());
    }

    public static void ejemplo2(ApplicationContext cntx) {

        Musico musico = (Musico) cntx.getBean("cerati");

        Instrumento guitarra = musico.getInstrumentoFavorito();

        System.out.println("Nombre G:" + guitarra.getNombre());
        System.out.println("Marca G:" + guitarra.getMarca());

    }

    public static void ejemplo1(ApplicationContext cntx) {

        Musico musico = (Musico) cntx.getBean("bob");

        System.out.println(musico.getNombre());
        System.out.println("CC:" + musico.getCanciones());

    }

}
