# Simulacro - Biblioteca - Java POO

**Duración:** 75 min
**Tags:** `Java`, `POO`, `herencia`, `abstract`, `enum`, `ArrayList`, `CRUD`, `instanceof`

---

## Enunciado

Diseña una aplicación para gestionar los recursos de una bibliotecaConPredicados.

Debes crear:

* `Recurso` (abstracta)
* `Libro`
* `Revista`
* `TipoPrestamo` (enum)
* `Biblioteca`

---

## 1. Enum — 1 punto

```java
DOMICILIO, SALA
```

---

## 2. Clase abstracta `Recurso` — 2 puntos

Atributos:

```java
private final String id;
private String titulo;
private String autor;
private TipoPrestamo tipoPrestamo;
```

Requisitos:

* Constructor completo
* Getters
* Setter (todos excepto `id`)
* Método abstracto:

```java
public abstract int calcularDiasPrestamo();
```

* `toString()` con `StringBuilder`

---

## 3. Clases hijas — 2 puntos

### `Libro`

```java
private int numeroPaginas;
```

Regla:

* Préstamo base: 15 días
* +5 días si tiene más de 300 páginas

---

### `Revista`

```java
private int numeroEdicion;
```

Regla:

* Préstamo fijo: 7 días

---

Ambas clases:

* Implementan `calcularDiasPrestamo()`
* Sobrescriben `toString()`

---

## 4. Clase `Biblioteca` — 4 puntos

Atributo:

```java
private List<Recurso> recursos;
```

Métodos:


añadirRecurso(Recurso r)

buscar(int id | String titulo | TipoPrestamo tipo)    
    
buscarPorId(String id)
buscarPorTitulo(String titulo) // coincidencia exacta
buscarPorTipoPrestamo(TipoPrestamo tipo)
eliminarPorId(String id)
modificarAutor(String id, String nuevoAutor)
~~imprimirTodos()~~
listarTodos()
~~imprimirPorTipoPrestamo(TipoPrestamo tipo)~~
listarPorTipoPrestamo(TipoPrestamo tipo)~~
    listarLibros()
    listarRevistas()


---

## 5. Buenas prácticas — 1 punto

* Encapsulación correcta
* Uso de herencia y polimorfismo
* Código claro+
* `StringBuilder` en `toString()`
