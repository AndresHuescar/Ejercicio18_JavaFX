# Ejercicio 18 - JavaFX

## Descripción

Este proyecto corresponde al ejercicio 18 del bloque BC5 de JavaFX.

El objetivo del ejercicio es crear un formulario con varios botones, donde cada botón muestra un mensaje diferente en la consola al pulsarlo.

## Tecnologías utilizadas

- Java
- JavaFX
- Maven
- IntelliJ IDEA

## Funcionamiento

La aplicación muestra una ventana con cuatro botones:

- Guardar
- Modificar
- Eliminar
- Salir

Cada botón tiene asociado un evento diferente.

Cuando el usuario pulsa un botón, se muestra en la consola un mensaje indicando qué botón ha sido pulsado.

## Mensajes de consola

```text
Has pulsado el botón Guardar.
Has pulsado el botón Modificar.
Has pulsado el botón Eliminar.
Has pulsado el botón Salir.
```

## Conceptos utilizados

- `Application`: clase base para crear aplicaciones JavaFX.
- `Stage`: ventana principal de la aplicación.
- `Scene`: contenido visual de la ventana.
- `Label`: control utilizado para mostrar texto.
- `Button`: control gráfico utilizado para crear botones.
- `setOnAction`: método utilizado para asignar una acción a cada botón.
- `System.out.println`: instrucción utilizada para mostrar mensajes en consola.
- `VBox`: layout que organiza los elementos en vertical.

## Estructura del proyecto

```text
Ejercicio18_JavaFX
 ├── pom.xml
 └── src
     └── main
         └── java
             └── org
                 └── example
                     └── Main.java
```

## Cómo ejecutar el proyecto

Para ejecutar el proyecto desde IntelliJ IDEA:

1. Abrir el proyecto en IntelliJ.
2. Sincronizar el archivo `pom.xml` con Maven.
3. Abrir el panel Maven.
4. Ejecutar:

```bash
mvn javafx:run
```

## Autor

Andrés Huéscar Fernández
