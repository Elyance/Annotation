import classe.*;

import java.lang.reflect.Method;

import annotation.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world !!!");

        Class<Etudiant> etdCLass = Etudiant.class;
        if (etdCLass.isAnnotationPresent(Annotation.class)) {
            Annotation ann = etdCLass.getAnnotation(Annotation.class);

            System.out.println(ann.ecole());
        } else {
            System.out.println("L'annotation n'est pas présente");
        }

        Class<ControllerUrl> contUrl = ControllerUrl.class;
        Method[] listMethode = contUrl.getDeclaredMethods();
        for (Method m : listMethode) {
            System.out.println("====================================================================");
            if (m.isAnnotationPresent(Url.class)) {
                Url url = m.getAnnotation(Url.class);
                System.out.println("Methode : " + m.getName());
                System.out.println("Url : "+url.value());
            } else {
                System.out.println("Methode : " + m.getName());
            }
            
        }

    }
}
