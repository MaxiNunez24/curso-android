# Clases del curso de Desarrollo de Aplicaciones Móviles

## Introducción a la informática
"Información Automática"
	La Informática es un área de la ciencia que estudia el hardware, las redes de datos y el software necesarios para tratar información de forma automática.
#### Clase de breve historia sobre la informática y enseñar el código binario...

## Preparando el entorno
Para empezar vamos a tener que programar con un IDE (Entorno de Desarrollo Integrado), es un programa que, similar a como utilizamos Paint para "pintar" este en cambio, se utiliza para programar. 
Dependiendo de lo que se vaya a programar se utiliza un IDE u otro, para Android tenemos un IDE oficial llamado Android Studio. Fue creado por JetBrains, que es la empresa que creó Kotlin (el lenguaje de programación que vamos a utilizar) entre otros IDEs muy utilizados en la industria.
Para no abrumarnos con diferentes lenguajes y/o herramientas, vamos a utilizar Android Studio para todo, significando esto que al principio vamos a olvidar/ignorar algunas cosas para luego verlas más adelante.

1) Lo primero que vamos a hacer es ir a https://developer.android.com/studio 
    Es la herramienta que vamos a utilizar para todo y se puede utilizar para desarrollar aplicaciones para Wearables, Android Auto, Android TV, y celulares.

2) Descargar Android Studio e Instalarlo

3) Abrir Android Studio y cambiar el tema a preferencia de cada uno

4) Crear un nuevo proyecto

5) Seleccionar una No Activity

6) Ponerle al proyecto el nombre CursoAplicacionesMoviles

7) Ponerle al package name (Identificador único de la aplicación) com.sunombre.cfp401.cursoappsmoviles

8) Seleccionar una ruta donde guardar el proyecto (dejarla en el escritorio o recordar la ruta por defecto)

9) Seleccionar el lenguaje Kotlin:
    Esto debido a que en 2019 Google (dueña de Android) decidió que el lenguaje oficial para desarrollar aplicaciones de Android pase de ser Java a Kotlin (Kotlin First).

10) Seleccionar el mínimo SDK (Kit de Desarrollo de Software):
    Dependiendo de este mínimo se va a limitar las versiones de Android que van a poder instalar la aplicación. 
    Pero también cuanto más reciente sea más seguro y optimizado va a estar el código para utilizar.
    (Mostrar la tabla de versiones)

11) Dar a Finish

12) Para realizar la primera parte del curso vamos a trabajar en el directorio (teniendo la vista en Android): app/java/com/"NOMBRE"/cfp401/cursoAppsMoviles (Notar que es el Package name que dijimos anteriormente)

13) Crear un archivo llamado "Variables":
    - Click derecho sobre el directorio 
    - Dejar el mouse sobre New
    - Click izquierdo en Kotlin Class/File
    - Tipear el nombre Variables
    - Dar Enter
    
14) La instrucción package da a entender que el archivo está en ese "directorio"/paquete

15) Para ejecutar código en Kotlin necesitamos una función main escribimos lo siguiente:
    **fun main(){
        // Acá va el código
    }**

    - Comentarios en Kotlin: Son lineas de código que no se van a ejecutar ("se ignoran") por lo que se utilizan para documentar
      - Comentario de una linea 
        - **// Esto es un comentario de una linea**
      - Comentario de varias lineas 
      - **/\*
            Esto es un comentario 
            de varias lineas
         \*/**
    
16) Poner su primer Hola Mundo!:
    Dentro de las llaves escribir **print("¡Hola Mundo!")**
    (print significa Imprimir en inglés)

17) Dar click en el botón de "Play"/Run

18) Debería de salir "¡Hola Mundo!" impreso en la consola de abajo