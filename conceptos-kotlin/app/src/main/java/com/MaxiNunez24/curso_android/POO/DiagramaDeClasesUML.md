# 📐 Resumen de Diagramas de Clases en UML

El **diagrama de clases UML** se utiliza para representar la **estructura estática** de un sistema:
- Define **clases** (objetos y conceptos).
- Muestra **atributos** y **métodos**.
- Representa **relaciones** entre clases.

---

## 📦 Estructura básica de una clase

Una clase en UML se dibuja como un rectángulo dividido en tres partes:

```

+------------------+
\| NombreClase      |
+------------------+
\| - atributo: Tipo |
\| - edad: Int      |
+------------------+
\| + metodo(): Tipo |
\| + correr(): Void |
+------------------+

```

- **Primera sección** → nombre de la clase (mayúscula inicial).
- **Segunda sección** → atributos (con su tipo).
- **Tercera sección** → métodos (con su tipo de retorno).

### Convenciones de visibilidad
- `+` público  
- `-` privado  
- `#` protegido  
- `~` paquete (default)

---

## 🔗 Relaciones entre clases

- **Asociación (—)**: Relación normal entre clases.  
  Ejemplo: `Persona — Auto` (una persona posee un auto).  

- **Herencia ( ⤷ )**: Una clase hija hereda de otra.  
  Ejemplo: `Empleado ⤷ Persona`.  

- **Implementación (⤷ con línea discontinua)**: Una clase implementa una interfaz.  

- **Agregación (◇)**: Una clase contiene a otra, pero las partes pueden existir sin el todo.  
  Ejemplo: `Curso ◇— Alumno`.  

- **Composición (◆)**: Una clase contiene a otra y las partes dependen del todo.  
  Ejemplo: `Casa ◆— Habitación`.  

---

## 📋 Ejemplo simple

### UML
```

+------------------+
\| Persona          |
+------------------+
\| - nombre: String |
\| - edad: Int      |
+------------------+
\| + hablar(): Void |
+------------------+

```
    ⤷
```

+------------------+
\| Estudiante       |
+------------------+
\| - legajo: Int    |
+------------------+
\| + estudiar()\:Void|
+------------------+

```

### Interpretación
- `Persona` es una **superclase**.  
- `Estudiante` **hereda** de `Persona`.  
- Un estudiante tiene además un `legajo` y el método `estudiar()`.

---

## ✅ Buenas prácticas
- Usar **sustantivos** para las clases (`Persona`, `Curso`).  
- Usar **verbos** para métodos (`hablar()`, `calcularNota()`).  
- Modelar lo **esencial** primero: no hace falta poner todo.  
- Analizar primero el problema en texto → luego dibujar las clases y relaciones.  

---
