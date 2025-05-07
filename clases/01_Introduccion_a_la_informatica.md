# Introducción a la Informática

El fundamento de toda computadora (incluyendo los celulares modernos) se basa en **procesadores** y **memoria** trabajando conjuntamente. Entender cómo funcionan estos componentes es clave para escribir código eficiente y aprovechar al máximo el hardware.

---

## Los Procesadores (CPU)
![](procesador.png)

Un procesador o CPU (Central Processing Unit) es el componente principal que ejecuta instrucciones de un programa, realizando operaciones aritméticas, lógicas, de control y de entrada/salida ([Central processing unit](https://en.wikipedia.org/wiki/Central_processing_unit?utm_source=chatgpt.com)).  
Cada CPU integra, como mínimo, una **Unidad Aritmético-Lógica (ALU)** encargada de las operaciones matemáticas y lógicas, **registros** para guardar datos temporales y una **Unidad de Control** que orquesta la secuencia de ejecución de las instrucciones ([Central processing unit](https://en.wikipedia.org/wiki/Central_processing_unit?utm_source=chatgpt.com)).  
La mayoría de los procesadores modernos son microprocesadores en un solo chip, con uno o varios **núcleos** (cores) que permiten ejecutar múltiples hilos de ejecución simultáneamente ([Central processing unit](https://en.wikipedia.org/wiki/Central_processing_unit?utm_source=chatgpt.com)).  
Los primeros “procesadores” estaban formados por relés o tubos de vacío (p.ej., ENIAC) y tenían que reconfigurarse manualmente; la arquitectura de programa almacenado propuesta por von Neumann en 1945 redefinió este concepto al guardar instrucciones en memoria electrónica ([Central processing unit](https://en.wikipedia.org/wiki/Central_processing_unit?utm_source=chatgpt.com)).  
En los años 1970–1980 se produjo la “revolución del microprocesador”, con chips como el Intel 4004 y posteriores, que llevaron la CPU a computadoras personales y dispositivos embebidos ([History of general-purpose CPUs - Wikipedia](https://en.wikipedia.org/wiki/History_of_general-purpose_CPUs?utm_source=chatgpt.com)).  
Con la miniaturización impulsada por la Ley de Moore, hoy los **SoC** (systems on a chip) integran CPU, memoria cache, GPU y otros periféricos en un mismo silicio, base de los smartphones actuales ([Central processing unit](https://en.wikipedia.org/wiki/Central_processing_unit?utm_source=chatgpt.com)).  
Para profundizar: [Procesador](https://chatgpt.com/c/Definiciones_y_aclaraciones/Procesador.md)

---

## La Memoria RAM

La **RAM** (Random Access Memory) es la memoria principal de trabajo donde el procesador carga y modifica datos e instrucciones en ejecución ([Random-access memory](https://en.wikipedia.org/wiki/Random-access_memory?utm_source=chatgpt.com)).  
Se denomina “acceso aleatorio” porque cualquier celda de memoria puede leerse o escribirse en el mismo tiempo aproximado, independientemente de su posición física ([Random-access memory](https://en.wikipedia.org/wiki/Random-access_memory?utm_source=chatgpt.com)).  
Esta memoria es **volátil**: pierde su contenido al apagarse el dispositivo, a diferencia del almacenamiento secundario (discos SSD/HDD) ([Random-access memory](https://en.wikipedia.org/wiki/Random-access_memory?utm_source=chatgpt.com)).  
Existen principalmente dos tipos de RAM dinámica (DRAM)—la más común en módulos de sistema—y estática (SRAM), que es más rápida y se utiliza en cachés de CPU ([Random-access memory](https://en.wikipedia.org/wiki/Random-access_memory?utm_source=chatgpt.com)).  
La DRAM almacena cada bit en un condensador que debe refrescarse periódicamente para mantener el dato; este proceso introduce restricciones de diseño y consumo ([Random-access memory](https://en.wikipedia.org/wiki/Random-access_memory?utm_source=chatgpt.com)).  
El primer chip comercial de DRAM fue el Intel 1103 (1970), y la evolución llevó a memorias sincronizadas (SDRAM) en 1992, mejorando la velocidad y eficiencia ([Random-access memory](https://en.wikipedia.org/wiki/Random-access_memory?utm_source=chatgpt.com)).  
Para tu aprendizaje: [Memoria RAM](https://chatgpt.com/c/Definiciones_y_aclaraciones/Memoria_RAM.md)

---

## Conclusión

Procesadores y RAM constituyen el **corazón** de cualquier sistema de cómputo. La CPU obtiene instrucciones y datos de la RAM, los procesa en sus unidades internas (ALU, registros, control) y escribe resultados de vuelta a memoria. Comprender esta colaboración es esencial para diseñar software optimizado y sacarle el máximo provecho tanto en Android Studio como en cualquier entorno de desarrollo.