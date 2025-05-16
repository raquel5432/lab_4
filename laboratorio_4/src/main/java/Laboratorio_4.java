/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author CarlosXl
 */
public class Laboratorio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Por Carlos Geovany Rodriguez Dominguez 22441225
        //Por Alisson Raquel Martinez Serrano 22441033
        int menu =0;
        int cont = 0;
        while(true){   
            System.out.println("");
        System.out.println("*Bienvenido al menu*");
        System.out.println("Favor ingrese una de las siguientes opciones:");
        System.out.println("1.---Cifrado\n"
                + "2.---Filtrar\n"
                + "3.---Codigo Enigma\n"
                + "4.---Salida");
            System.out.print("Su eleccion es: ");
        menu = scanner.nextInt();
        
        
            if (menu ==4) {
                System.out.println("Saliendo del sistema.....");
                break;
            }
            
          switch(menu){
              case 1:{
                  System.out.print("Favor ingrese una cadena de texto:");
                  String cadena = scanner.next().toUpperCase();
                  System.out.print("Ingrese la cantidad de posiciones que se desea desplazar:");
                  int dez = scanner.nextInt();
                  
                 if (dez > 0 ) {
                        String cif ="";
                        for (int i = 0; i < cadena.length(); i++) {
                            char letra = cadena.charAt(i);
                            if (letra >= 'A' && letra <= 'Z') { 
                                int po = letra - 'A';
                                int nuevaP = (po + dez) % 27;
                                 char cifrado =  (char) ('A' + nuevaP);
                                 cif += cifrado;
                                } else {
                                cif += letra;
                                }
                               }
                                 System.out.println("Texto cifrado: " + cif);
                                } else {
                                 System.out.println("Favor ingrese un numero positivo");
                                continue;
                                    }
                  
                  
                  
                 
                  break;
              }
              case 2:
    System.out.println("Favor ingresar una frase:");
    scanner.nextLine(); 
    String frase = scanner.nextLine(); 
    
    System.out.println("Ingrese la cantidad mínima (entero positivo):");
    int longitud = scanner.nextInt();
    scanner.nextLine(); 

  

    System.out.println("\nPalabras con más de " + longitud + " caracteres:");

    int contador = 0;
    String palabra = "";

    for (int i = 0; i < frase.length(); i++) {
        char c = frase.charAt(i);

        if (c != ' ') {
            palabra += c;
        } else {
            if (palabra.length() > longitud) {
                System.out.println("- " + palabra);
                contador++;
            }
            palabra = "";
        }
    }

    if (palabra.length() > longitud) {
        System.out.println("- " + palabra);
        contador++;
    }

    if (contador == 0) {
        System.out.println("No se encontraron palabras que cumplan con la condición.");
    } else {
        System.out.println("\nTotal: " + contador + " palabra(s) encontradas.");
    }

    break;
              
              case 3:{
                  int elec = 0;
                    while (true) {
                        System.out.println("Menu Enigma\n"
                                + "1---Encriptar Texto\n"
                                + "2---Desencriptar Texto\n"
                                + "3---Regreso");
                        System.out.print("Ingrese su eleccion: ");
                        elec = scanner.nextInt();
                        scanner.nextLine(); // Consume la nueva línea después de leer el entero

                        if (elec == 3) {
                            System.out.println("Regresando al menu principal........");
                            break;
                        } else if (elec == 1) {
                            System.out.print("Favor ingrese el texto a encriptar: ");
                            String texto = scanner.nextLine();
                            String pares = "";
                            String impares = "";

                            for (int i = 0; i < texto.length(); i++) {
                                if (i % 2 == 0) {
                                    pares += texto.charAt(i);
                                } else {
                                    impares += texto.charAt(i);
                                }
                            }
                            String textoEncriptado = pares + impares;
                            System.out.println("El texto encriptado es: " + textoEncriptado);
                        } else if (elec == 2) {
                            System.out.print("Favor ingrese el texto a desencriptar: ");
                            String encriptado = scanner.nextLine();
                            int longitud2 = encriptado.length();
                            int mitad = (longitud2 + 1) / 2; // Para manejar longitudes impares

                            String desencriptado = "";

                            for (int i = 0; i < mitad; i++) {
                                desencriptado += encriptado.charAt(i);
                                if (i + mitad < longitud2) {
                                    desencriptado += encriptado.charAt(i + mitad);
                                }
                            }
                            System.out.println("El texto desencriptado es: " + desencriptado);
                        } else {
                            System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("Opcin invalida. Por favor, ingrese una opción valida.");
                }
            }
        }
    }
}