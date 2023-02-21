/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreriafinal;

import com.mycompany.libreriafinal.entidad.Autor;
import com.mycompany.libreriafinal.entidad.Editorial;
import com.mycompany.libreriafinal.entidad.Libro;
import com.mycompany.libreriafinal.servicios.ServicioAutor;
import com.mycompany.libreriafinal.servicios.ServicioEditorial;
import com.mycompany.libreriafinal.servicios.ServicioLibro;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Menu {
    private Scanner sc;
    private ServicioAutor servAut;
    private ServicioEditorial servEdit;
    private ServicioLibro servLibro;
//constructor

    public Menu() {
        sc = new Scanner(System.in).useDelimiter("\n");
        servAut = new ServicioAutor();
        servEdit = new ServicioEditorial();
        servLibro = new ServicioLibro();
    }
//menu general
    public void menu() throws Exception {
        int op = 0;
        do
        {
            try
            {
                System.out.println("*****      LIBRERIA     ******");
                System.out.println("** 1. LIBROS                **");
                System.out.println("** 2. AUTORES               **");
                System.out.println("** 3. EDITORIALES           **");
                System.out.println("** 4. PARA SALIR            **");
                System.out.println("******************************");
                System.out.println("Ingrese un opcion...\n");
                op = sc.nextInt();
                switch (op)
                {
                    case 1:
                        menuLibro();
                        break;
                    case 2:
                        menuAutor();
                        break;
                    case 3:
                        menuEditorial();
                        break;
                    case 4:
                        System.out.println("\nCHAU!!  \n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }
            } catch (InputMismatchException e)
            {
                e.getMessage();
                System.out.println("PAPARULO NO METAS LETRAS\n\n");
                sc.next();
            }
            limpiarPantalla();
        } while (op != 4);
    }
//limpia la pantalla
    public void limpiarPantalla() throws AWTException {
        //Dejo esre metodo para ir borrando la consola.. y que no sea un desorden.
        Robot pressbot = new Robot();
        pressbot.setAutoDelay(30); // Tiempo de espera antes de borrar
        pressbot.keyPress(17); // Orden para apretar CTRL key
        pressbot.keyPress(76);// Orden para apretar L key
        pressbot.keyRelease(17); // Orden para soltar CTRL key
        pressbot.keyRelease(76); // Orden para soltar L key
    }

//************* metodos Autor ********************    
    private void menuAutor() throws Exception {
        int op = 0;

        do
        {
            try
            {
                System.out.println("\n*****  AUTORES    ******");
                System.out.println("** 1. LISTAR AUTORES **");
                System.out.println("** 2. AGREGAR AUTOR   **");
                System.out.println("** 3. BORRAR AUTOR    **");
                System.out.println("** 4. BUSCAR AUTOR    **");
                System.out.println("** 5. VOLVER          **");
                System.out.println("************************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op)
                {
                    case 1:
                        muestraAutor(servAut.buscaTodo());
                        break;
                    case 2:
                        nuevoAutor();
                        break;
                    case 3:
                        muestraBorraAutor(servAut.buscaTodo());
                        break;
                    case 4:
                        buscaAutorNombre();
                        break;
                    case 5:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }

            } catch (InputMismatchException e)
            {
                e.getMessage();
                System.out.println("SALAME NO METAS LETRAS\n\n");
                sc.next();
            }
        } while (op != 5);
    }
    private void nuevoAutor() {
        System.out.println("Ingrese el nombre del nuevo Autor");
        Autor aux = servAut.creaAutor(sc.next());

        System.out.println("\n\nPresione Enter para continuar...");
        try
        {
            System.in.read();
            if (aux == null)
            {
                System.out.println("No se pudo crear una nueva Editorial");
            } else
            {
                System.out.println("**** Editorial Creada ****");
                
            }

        } catch (IOException e)
        {
        }

    }

    private void buscaAutorNombre() {
        System.out.println("\nIngrese el nombre del Autor a buscar");
        Autor a1 = servAut.buscaAutor(sc.next());
        System.out.printf("\n%-15s%-35s\n", "NOMBRE", "ID\n");
        System.out.println(a1);
    }
    private Autor muestraCreaAutor(List<Autor> aut) {
        Autor aux = null;
        int opcion = 0;
        muestraAutor(aut);
        System.out.println((aut.size() + 1) + ") Nuevo Autor");
        System.out.println("\nSeleccione el numero de un Autor ó " + (aut.size() + 1) + " para un Autor Nuevo");
        //queda el cursor esperando que el usuario elija alguna editorial o crear una nueva
        try
        {
            opcion = sc.nextInt();
        } catch (InputMismatchException e)
        {
            e.getMessage();
            System.out.println("SALAME NO METAS LETRAS\n\n");
            sc.next();
        }
        
        if (opcion <= 0)
        {
            return null; 
        } else if (opcion == aut.size() + 1) 
        {
            System.out.println("Ingrese el nombre del nuevo Autor");
            aux = servAut.creaAutor(sc.next());
        } else if (opcion <= aut.size() && opcion > 0)
        {
            aux = aut.get(opcion);
        }
        return aux;
    }

    private void muestraAutor(List<Autor> autores) {

        System.out.printf("%-35s\n", "NRO. NOMBRE");
        //recorro y muestro los Autores
        for (int i = 0; i < autores.size(); i++)
        {
            System.out.println((i + 1) + ") " + autores.get(i));
        }
    }
    private void muestraBorraAutor(List<Autor> aux) {
        String op;
        muestraAutor(aux);

       
        System.out.println("Ingrese el nombre del autor a eliminar");
       
        try
        {
            op = sc.next();
            servAut.eliminarautor(op);
        } catch (InputMismatchException e)
        {
            e.getMessage();
            System.out.println("INGRESA OPCION VALIDA\n\n");
            sc.next();
        }
       

    }
    
    //Menu Editorial
    private void menuEditorial() {
        int op = 0;

        do
        {
            try
            {
                System.out.println("\n\n***** EDITORIALES ******");
                System.out.println("** 1. LISTAR EDITORIALES  **");
                System.out.println("** 2. AGREGAR EDITORIAL   **");
                System.out.println("** 3. BORRAR EDITORIAL    **");
                System.out.println("** 4. BUSCAR EDITORIAL    **");
                System.out.println("** 5. VOLVER              **");
                System.out.println("***************************");
                System.out.println("Ingrese una opcion...\n");
                op = sc.nextInt();

                switch (op)
                {
                    case 1:
                        muestraEditorial(servEdit.buscaTodo());
                        break;
                    case 2:
                        nuevaEditorial();
                        break;
                    case 3:
                        muestraBorraEditorial(servEdit.buscaTodo());
                        break;
                    case 4:
                        buscaEditorial();
                        break;
                    case 5:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }

            } catch (InputMismatchException e)
            {
                e.getMessage();
                System.out.println("SALAME NO METAS LETRAS\n\n");
                sc.next();
            }
        } while (op != 5);
    }

    private Editorial muestraCreaEditorial(List<Editorial> edit) {
        Editorial aux = null;
        int opcion = 0;
        muestraEditorial(edit);

       
        System.out.println((edit.size() + 1) + ") Nueva Editorial");
        System.out.println("\n\nSeleccione el numero de una Editorial ó " + (edit.size() + 1) + " para una Editorial Nueva\n");
        //queda el cursor esperando que el usuario elija alguna editorial o crear una nueva

        try
        {
            opcion = sc.nextInt();
            opcion--;
        } catch (InputMismatchException e)
        {
            e.getMessage();
            System.out.println("INGRESA OPCION VALIDA\n\n");
            sc.next();
        }
        if (opcion <= 0)
        {
            return null; 
        } else if (opcion == edit.size() + 1) 
        {
            System.out.println("Ingrese el nombre de la nueva Editorial");
            aux = servEdit.creaEditorial(sc.next());
            System.out.println("\n\nPresione Enter para continuar...");
            try
            {
                System.in.read();
                if (aux == null)
                {
                    System.out.println("No se pudo crear una nueva Editorial");
                } else
                {
                    System.out.println("**** Editorial Creada ****");
                    
                }
            } catch (IOException e)
            {
            }
        } else if (opcion <= edit.size() && opcion > 0)
        {
            aux = edit.get(opcion - 1);
        }
        return aux;
    }

    private void muestraEditorial(List<Editorial> edit) {

        System.out.printf("\n%-15s%-35s\n", "NOMBRE", "ID");
        //recorro y muestro las editoriales
        for (Editorial editorial : edit) {
            System.out.println(editorial.getNombre());
            
        }
            
        }
        
    

    private void nuevaEditorial() {
        System.out.println("Ingrese el nombre de la nueva Editorial");
        Editorial aux = servEdit.creaEditorial(sc.next());

        System.out.println("\n\nPresione Enter para continuar...");
        try
        {
            System.in.read();
            if (aux == null)
            {
                System.out.println("No se pudo crear una nueva Editorial");
            } else
            {
                System.out.println("**** Editorial Creada ****");
                
            }

        } catch (IOException e)
        {
        }

    }

    private void muestraBorraEditorial(List<Editorial> aux) {
        int op = 0;
        muestraEditorial(aux);

        System.out.println("0) PARA VOLVER");
        System.out.println("\nSeleccione el numero para borrar ó CERO para Volver");
        //queda el cursor esperando que el usuario elija alguna editorial o volver
        try
        {
            op = sc.nextInt();
        } catch (InputMismatchException e)
        {
            e.getMessage();
            System.out.println("INGRESA OPCION VALIDA\n\n");
            sc.next();
        }
        //logica para elegir la editorial a borrar
        if (op > 0 && op < aux.size() + 1)
        {
            //Elimino todos los libros de la editorial
            servLibro.eliminarPorEditorial(aux.get(op - 1));
            //elimino la editorial
            servEdit.eliminaEditorial(aux.get(op - 1));
        }

    }

    private void buscaEditorial() {
        System.out.println("\nIngrese el nombre de la Editorial a buscar");
        List<Editorial> a1 = servEdit.buscaEdit(sc.next());
        muestraEditorial(a1);
    }

//**************** metodos libros ********************
    private void menuLibro() throws Exception {
        int op = 0;
        do
        {
            try
            {
                System.out.println("\n***** LIBROS   ******");
                System.out.println("** 1. MOSTRAR LIBROS **");
                System.out.println("** 2. AGREGAR LIBRO  **");
                System.out.println("** 3. BORRAR LIBRO   **");
                System.out.println("** 4. BUSCAR LIBRO   **");
                System.out.println("** 5. VOLVER         **");
                System.out.println("***********************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op)
                {
                    case 1:
                        muestraLibro(servLibro.buscaTodo());
                        System.out.println("\n\nPresione Enter para continuar...");
                        try
                        {
                            System.in.read();
                        } catch (IOException e)
                        {
                        }
                        break;
                    case 2:
                        nuevoLibro();
                        break;
                    case 3:
                        borraLibro(servLibro.buscaTodo());
                        break;
                    case 4:
                        buscaLibro();
                        break;
                    case 5:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }

            } catch (InputMismatchException e)
            {
                e.getMessage();
                System.out.println("INGRESA OPCION VALIDA\n\n");
                sc.next();
            }
            limpiarPantalla();
        } while (op != 8);
    }

    private void nuevoLibro() {

        System.out.println("Ingrese el titulo del Libro");
        String titulo = sc.next();

        List<Libro> aux = servLibro.buscaLibro(titulo);

        if (aux == null || aux.isEmpty())
        {

            System.out.println("Ingrese el año de Editado");
            Integer anio = sc.nextInt();

            Editorial ed = muestraCreaEditorial(servEdit.buscaTodo());
            Autor at = muestraCreaAutor(servAut.buscaTodo());

            Libro nuevo = servLibro.creaLibro(titulo, anio, at, ed);

        } else
        {
            System.out.println("Ya existe un libro con ese nombre");
            muestraLibro(aux);
        }

    }

    private void buscaLibro() throws Exception {
        int op = 0;
        do
        {
            try
            {
                System.out.println("*****   BUSCAR    *****");
                System.out.println("** 1. POR ISBN       **");
                System.out.println("** 2. POR TITULO     **");
                System.out.println("** 3. POR EDITORIAL  **");
                System.out.println("** 4. POR AUTOR      **");
                System.out.println("** 5. VOLVER         **");
                System.out.println("***********************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op)
                {
                    case 1:
                        porISBN();
                        break;
                    case 2:
                        porTitulo();
                        break;
                    case 3:
                        porEditorial();
                        break;
                    case 4:
                        porAutor();
                        break;
                    case 5:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }

            } catch (InputMismatchException e)
            {
                e.getMessage();
                System.out.println("INGRESA OPCION VALIDA\n\n");
                sc.next();
            }
            limpiarPantalla();
        } while (op != 5);

    }

    private void porISBN() {
        System.out.println("Ingrese el codigo ISBN");

        try
        {
            Libro l1 = servLibro.buscaISBN(sc.nextLong());

            if (l1 == null)
            {
                System.out.println("No existe registro con ese ISBN");
            } else
            {
                System.out.println("RESULTADO:");
                System.out.println(l1);
            }
            System.out.println("\n\nPresione Enter para continuar...");
            try
            {
                System.in.read();
            } catch (IOException e)
            {
            }
        } catch (Exception e)
        {
            e.getMessage();
        }
    }

    private void porTitulo() {
        System.out.println("Ingrese el titulo a buscar");
        List<Libro> l1 = servLibro.buscaLibro(sc.next());
        muestraLibro(l1);
    }

    private void porAutor() {
        System.out.println("Ingrese el nombre del autor");
        List<Libro> l1 = servLibro.buscaPorAutor(sc.next());
        muestraLibro(l1);
    }

    private void porEditorial() {
        System.out.println("Ingrese el nombre de la Editorial");
        List<Libro> l1 = servLibro.buscaPorEditorial(sc.next());
        muestraLibro(l1);
    }

    private void muestraLibro(List<Libro> libros) {

        System.out.printf("%-17s%-38s%-26s%-26s\n", "ISBN", "TITULO", "AUTOR", "EDITORIAL");

        for (int i = 0; i < libros.size(); i++)
        {
            System.out.println((i + 1) + ") " + libros.get(i));
        }

    }

    private void borraLibro(List<Libro> libros) {
        int opcion = 0;
        muestraLibro(libros);
        System.out.println("0) PARA VOLVER");
        System.out.println("\nSeleccione el numero para borrar ó CERO para Volver");
        //queda el cursor esperando que el usuario elija alguna editorial o volver
        try
        {
            opcion = sc.nextInt();
        } catch (InputMismatchException e)
        {
            e.getMessage();
            System.out.println("INGRESA OPCION VALIDA\n\n");
            sc.next();
        }
        if (opcion > 0 && opcion < libros.size() + 1)
        {
            //Elimino todos los libros de la editorial
            servLibro.eliminarLibro(libros.get(opcion - 1).getTitulo());
        }
    }
    
}
