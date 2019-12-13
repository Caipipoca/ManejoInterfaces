package test;

import Dominio.Empleado;

public class ClaseObjet {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Juan", 1000);

        System.out.println("emp1 = " + emp1);

        Empleado emp2 = new Empleado("Juan", 1000);

        System.out.println("emp2 = " + emp2);

        System.out.println("Objetos iguales " + (emp1 == emp2));

        compararObjetos(emp1, emp2);

    }

    private static void compararObjetos(Empleado emp1, Empleado emp2) {

        System.out.println("emp1 = " + emp1);
        System.out.println("emp2 = " + emp2);

        // revision por referencia:
        if (emp1 == emp2) {

            System.out.println("Los Objetos tienen la misma direcion en memoria!");
        } else {

            System.out.println("Los onjetos tiene distintas direciones de memoria!");

        }
        // revision de Metodo Equals: respecto a los atributos de los objetos

        if (emp1.equals(emp2)) {

            System.out.println("Los Objetos tiene el mismo contenido");
        } else {
            System.out.println("Los objetos no tienen el mismo contenido!");

        }

        // revisamos el metodo HashCode
        
        if (emp1.hashCode()==emp2.hashCode()){
        
            System.out.println("Los objetos tioene el mismo codigo Hash");
        
        }else{
        
            System.out.println("Los objetos no tiene el mismo codigo Hash");
        }
        
        
    }

}
