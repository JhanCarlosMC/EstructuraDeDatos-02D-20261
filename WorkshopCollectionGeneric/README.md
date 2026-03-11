# Workshop Collections & Generics

Este proyecto contiene 10 ejercicios prácticos sobre Collections, Generics, Iteradores y temas relacionados en Java.

## 📁 Estructura del Proyecto

```
src/main/java/co/edu/uniquindio/
├── ejercicio1/    - Sistema de Gestión de Tareas
├── ejercicio2/    - PairList Genérico
├── ejercicio3/    - Análisis de LinkedHashSet
├── ejercicio4/    - Repositorio<T> con Iterable
├── ejercicio5/    - spliceStack
├── ejercicio6/    - maximo Genérico
├── ejercicio7/    - Comparador<T> Genérico
├── ejercicio8/    - splitStack
├── ejercicio9/    - Sistema de Alquiler de Vehículos (Wildcards)
└── ejercicio10/   - GestorPaquetes<T> con PriorityQueue
```

## 🚀 Cómo Ejecutar

### Ejecutar un ejercicio específico:
```bash
# Ejecutar ejercicio 1
mvn exec:java -Dexec.mainClass="co.edu.uniquindio.ejercicio1.MainEjercicio1"

# Ejecutar ejercicio 2
mvn exec:java -Dexec.mainClass="co.edu.uniquindio.ejercicio2.MainEjercicio2"

# ... y así con cada ejercicio
```

### Compilar todo el proyecto:
```bash
mvn compile
```

## 📚 Descripción de Ejercicios

### Ejercicio 1: Sistema de Gestión de Tareas
**Temas:** Clases genéricas, List, Comparator, Collections.sort

Implementa un sistema para gestionar tareas con descripción, prioridad y fecha de vencimiento.

**Clases:**
- `Tarea` - Representa una tarea
- `ListaDeTareas` - Gestiona la lista de tareas
- `MainEjercicio1` - Pruebas del sistema

### Ejercicio 2: PairList Genérico
**Temas:** Clases genéricas con múltiples tipos de parámetros

Implementa una lista que almacena pares clave-valor genéricos.

**Clases:**
- `Pair<K,V>` - Representa un par clave-valor
- `PairList<K,V>` - Lista de pares genérica
- `MainEjercicio2` - Pruebas con diferentes tipos

### Ejercicio 3: Análisis de LinkedHashSet
**Temas:** Set, LinkedHashSet, orden de inserción, duplicados

Analiza el comportamiento de LinkedHashSet comparado con HashSet y TreeSet.

**Clases:**
- `MainEjercicio3` - Explicación y demostración del comportamiento

### Ejercicio 4: Repositorio<T> con Iterable
**Temas:** Interfaces genéricas, Iterable, Iterator, for-each, iteradores personalizados

Implementa un repositorio genérico usando una interfaz genérica `IRepositorio<T>` que extiende de `Iterable<T>`. Incluye un iterador reverso personalizado.

**Clases:**
- `IRepositorio<T>` - Interfaz genérica con métodos agregar, obtener e iterator
- `Repositorio<T>` - Implementación concreta de IRepositorio<T>
- `MainEjercicio4` - Pruebas de iteración y polimorfismo

### Ejercicio 5: spliceStack
**Temas:** Stack, manipulación de colecciones, algoritmos

Método que extrae una secuencia de elementos de un stack manteniendo el orden.

**Clases:**
- `SpliceStackUtil` - Utilidad con método spliceStack
- `MainEjercicio5` - Pruebas del método

### Ejercicio 6: maximo Genérico
**Temas:** Generics con bounded types, Comparable

Encuentra el máximo elemento de una lista de objetos comparables.

**Clases:**
- `MaximoUtil` - Método maximo genérico
- `MainEjercicio6` - Pruebas con varios tipos

### Ejercicio 7: Comparador<T> Genérico
**Temas:** Interfaces genéricas, Comparable vs Comparator

Interfaz genérica para comparar objetos y varias implementaciones.

**Clases:**
- `Comparador<T>` - Interfaz genérica
- `ComparadorNumeros<T>` - Implementación para números
- `ComparadorCadenas` - Implementación para strings
- `UtilidadesComparador` - Métodos de utilidad
- `MainEjercicio7` - Pruebas completas

### Ejercicio 8: splitStack
**Temas:** Stack, Pair<T,U>, división de colecciones

Divide un stack en dos sub-stacks según una posición.

**Clases:**
- `SplitStackUtil` - Método splitStack
- `MainEjercicio8` - Pruebas del método

### Ejercicio 9: Sistema de Alquiler de Vehículos
**Temas:** Wildcards (? extends V), polimorfismo, herencia

Sistema genérico que maneja diferentes tipos de vehículos usando wildcards.

**Clases:**
- `Vehiculo` - Clase base abstracta
- `Auto` - Subclase de Vehiculo
- `Moto` - Subclase de Vehiculo
- `Camion` - Subclase de Vehiculo
- `SistemaAlquiler` - Maneja List<? extends Vehiculo>
- `MainEjercicio9` - Pruebas del sistema

### Ejercicio 10: GestorPaquetes<T> con PriorityQueue
**Temas:** PriorityQueue, Comparable, Comparator, Iterator (sin ciclos)

Sistema de gestión de paquetes con prioridad, usando solo iteradores (sin for/while explícitos).

**Clases:**
- `Paquete` - Implementa Comparable (orden natural por ID)
- `ComparadorPrioridadDescendente` - Comparator por prioridad
- `GestorPaquetes<T>` - Gestión con PriorityQueue
- `MainEjercicio10` - Pruebas completas

## 🔑 Conceptos Clave

### Generics
- `<T>` - Tipo parametrizado
- `<K, V>` - Múltiples tipos parametrizados
- `<? extends T>` - Wildcard con upper bound
- `<? super T>` - Wildcard con lower bound
- Bounded type parameters: `<T extends Comparable<T>>`, `<T extends Number & Comparable<T>>`

### Interfaces Genéricas
- **IRepositorio<T>:** Interfaz que define contrato para colecciones personalizadas
- Las interfaces genéricas permiten polimorfismo y desacoplamiento
- Pueden extender otras interfaces (ej: `IRepositorio<T> extends Iterable<T>`)

### Collections Framework
- **List:** ArrayList, LinkedList (ordenado, permite duplicados)
- **Set:** HashSet (sin orden), LinkedHashSet (orden de inserción), TreeSet (ordenado)
- **Queue:** PriorityQueue (cola con prioridad)
- **Stack:** LIFO (Last In, First Out)

### Interfaces Funcionales
- **Iterable<T>:** Permite recorrer con for-each
- **Iterator<T>:** Recorrer colecciones elemento por elemento
- **Comparable<T>:** Orden natural de un objeto
- **Comparator<T>:** Orden alternativo/personalizado

## 📝 Requisitos

- Java 23 o superior
- Maven 3.x

## 🛠️ Autor

Desarrollado para el curso de Estructura de Datos - Universidad del Quindío
