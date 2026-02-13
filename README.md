# 🛒 Backend Tienda Rich

Sistema de gestión de inventario y ventas desarrollado para **Rich Supplements**.
Este proyecto utiliza una arquitectura monolítica modular basada en **Spring Boot 3** y **Java 21**.

## 🚀 Tecnologías

* **Lenguaje:** Java 21 (LTS)
* **Framework:** Spring Boot 3.2.3
* **Base de Datos:** PostgreSQL 16
* **Motor de Plantillas:** Thymeleaf (Server-Side Rendering)
* **Seguridad:** Spring Security (Próximamente)
* **Build Tool:** Maven

## 📂 Estructura del Proyecto

El código fuente se encuentra bajo `src/main/java/com/tiendarich/gestion` y sigue una arquitectura en capas clásica:

```text
src/
├── main/
│   ├── java/com/tiendarich/gestion/
│   │   ├── config/       # Configuraciones (Seguridad, Beans, Swagger)
│   │   ├── controller/   # Controladores REST y MVC (Reciben HTTP)
│   │   ├── model/        # Entidades JPA (Tablas de Base de Datos)
│   │   ├── repository/   # Interfaces Repository (Spring Data JPA)
│   │   ├── service/      # Lógica de Negocio y Reglas
│   │   └── exception/    # Manejadores de Errores Globales
│   │
│   └── resources/
│       ├── static/       # Archivos públicos (CSS, JS, Imágenes)
│       ├── templates/    # Vistas HTML (Thymeleaf)
│       └── application.yml # Configuración de la Aplicación
