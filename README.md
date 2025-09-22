# 🧪 Gestor de Tareas - Automatización con Selenium y POM

Este proyecto implementa pruebas automatizadas para una aplicación propia desarrollada con TypeScript en React [Gestasks](https://gestasks.vercel.app/) utilizando el patrón Page Object Model (POM), Selenium WebDriver y JUnit 5. El objetivo es validar el flujo de creación y visualización de tareas en la interfaz web.


## 📁 Estructura del Proyecto

```
src/
├── main/
│   └── java/
│       └── cl/mauriciovera/pages/
│           └── GestorTareas.java
└── test/
    └── java/
        └── cl/mauriciovera/tests/
            └── GestorTareasTest.java
```


## 🧩 Tecnologías Utilizadas

- Java 17+
- Selenium WebDriver
- JUnit 5
- WebDriverManager (Bonigarcia)
- Maven (gestión de dependencias)


## 🧱 Patrón Page Object Model (POM)

El archivo `GestorTareas.java` encapsula los elementos y acciones de la página principal de la aplicación:

- `setTitleInput(String title)` – Ingresa el título de la tarea
- `setDescriptionTextarea(String description)` – Ingresa la descripción
- `clickSubmitButton()` – Envía el formulario
- `isCompleteBtnVisible()` – Verifica si se muestra el botón de completar
- `clickCompleteButton()` – Marca la tarea como completada

Este enfoque mejora la mantenibilidad, reutilización y trazabilidad de las pruebas.


## 🧪 Prueba Implementada

El archivo `GestorTareasTest.java` contiene una prueba funcional:

```java
@Test
public void testCrearTarea() {
  // Given
  String title = "Tarea de prueba";
  String description = "Descripcion de la tarea";

  // When
  gestorTareas.setTitleInput(title);
  gestorTareas.setDescriptionTextarea(description);
  gestorTareas.clickSubmitButton();

  // Then
  assertTrue(gestorTareas.isCompleteBtnVisible());
}
```

Esta prueba valida que, al crear una tarea, el botón para marcarla como completada aparece correctamente.


## 🚀 Cómo Ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/mauricioverar/gestor-tareas-pom-tests
   cd gestor-tareas-automation
   ```

2. Ejecuta las pruebas con Maven:
   ```bash
   mvn test
   ```

> Asegúrate de tener Chrome instalado y configurado correctamente en tu sistema.


## 📌 Recomendaciones

- Modulariza más acciones si el flujo crece (edición, eliminación, filtros).
- Integra con CI/CD para ejecución continua.
- Agrega validaciones visuales o pruebas de rendimiento si el proyecto lo requiere.


## 👨‍💻 Autor

Mauricio Vera – QA Automation Specialist  
📍 Viña del Mar, Chile  
🔗 [LinkedIn](https://www.linkedin.com/in/mauricio-vera-rodriguez)


## 📄 Licencia

Este proyecto se distribuye bajo la licencia MIT. Puedes modificarlo y adaptarlo libremente.
