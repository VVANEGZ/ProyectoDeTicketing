# PROYECTO INTEGRADOR POO
## SISTEMA DE TICKETING DE INCIDENCIAS EN EL LABORATORIO DE LIS
Proyecto desarrollado en Java para gestionar incidencias técnicas en un laboratorio de cómputo.
Permite registrar incidencias, asignar técnicos automáticamente según su especialidad, cambiar estados, filtrar incidencias dependiendo de lo que el usuario indique y generar reportes.
### Tecnologías utilizadas

* Java 17+ con el IDE intelliJ
* draw.io para el diagrama de clases en UML
* Git y GitHub

### Funcnionalidades principales: 
| Rol                             | Funcionalidad                                               |
| ------------------------------- | ----------------------------------------------------------- |
| Estudiante / Personal Académico | Registrar una incidencia técnica                            |
| Técnico                         | Filtrar incidencias por tipo, prioridad o estado            |
| Técnico                         | Actualizar el estado de una incidencia                      |
| Sistema                         | Asignar técnico automáticamente según el tipo de incidencia |
| Sistema                         | Generar reportes por tipo, prioridad y estado               |

## CÓMO EJECUTAR EL PROYECTO
Existen dos opciones para ejecutarlo:
### Opción 1:
Ejecutar en NetBeans / IntelliJ / VS Code
* Crear un proyecto Java nuevo
* Copiar todas las clases dentro de la carpeta src
* Ejecutar el archivo Main.java

### Opción 2
Compilar desde terminal
1. Abre una terminal en la carpeta del proyecto:
  ```Bash
  cd src
  ```
2. Compila todos los archivos:
 ```Bash
javac *.java
```
3. Ejecuta el programa:
```Bash
   java Main
```
