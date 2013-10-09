UNTreF - Algoritmos y Programación 1

# Práctica de Encapsulamiento - Examen

## Enunciado

Implementar la clase `Examen` con las siguientes operaciones:

* crear el `Examen` indicando la cantidad total de puntos que tiene.
	
* `calcularNota`: devuelve la nota final del `Examen`, comprendida en el rango [0, 10].

* `corregirPunto`: agrega la corrección de un punto; indicando qué porcentaje se consiguió [0, 100].
	
* `contarPuntos`: devuelve la cantidad de puntos que tiene el `Examen`.

* `contarPuntosCorregidos`: devuelve la cantidad de puntos que fueron corregidos.

Ejemplifique el uso de la clase, indicando el resultado esperado.

## Resolución

`Examen.java` [ver](../master/src/Examen.java)

```java
Examen examenDeMartin = new Examen(5)
examenDeMartin.corregirPunto(100.0)
examenDeMartin.corregirPunto(50.0)
examenDeMartin.corregirPunto(25.0)
examenDeMartin.corregirPunto(100.0)
examenDeMartin.contarPuntosCorregidos()
examenDeMartin.corregirPunto(50.0)
examenDeMartin.calcularNota()

Examen examenDeAlicia = new Examen(5)
examenDeAlicia.corregirPunto(75.0)
examenDeAlicia.corregirPunto(30.0)
examenDeAlicia.contarPuntosCorregidos()
examenDeAlicia.calcuarNota()

Examen examenDeCarlosLibre = new Examen(10)
examenDeCarlosLibre.contarPuntos()
examenDeCarlosLibre.contarPuntosCorregidos()
examenDeCarlosLibre.calcularNota()
examenDeCarlosLibre.corregirPunto(25.0)
examenDeCarlosLibre.contarPuntosCorregidos()
examenDeCarlosLibre.calcularNota()
```
