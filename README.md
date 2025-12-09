# Hola, soy Luis 👋

### Ingeniero Informático en formación & Desarrollador Full Stack Java trainee

> "Transformando lógica compleja en arquitecturas de software robustas y escalables."

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/lfiedlerf/)
[![GitHub](https://img.shields.io/badge/GitHub-Follow-black?style=for-the-badge&logo=github)](https://github.com/Lfiedlerf)

---

**Proyecto:** Nvmeless E-commerce

Breve: aplicación web de ejemplo desarrollada con Spring Boot para demostrar un frontend con Thymeleaf y páginas de producto.

**Stack relevante (estado actual):**
- **Java:** 17 (`pom.xml` declara `<java.version>17`).
- **Spring Boot:** starter parent `4.0.0` en `pom.xml` y varios starters: `spring-boot-starter-webmvc`, `spring-boot-starter-thymeleaf`, `spring-boot-starter-data-jpa`, `spring-boot-starter-security` (dependencia presente pero sin configuración activa en código).
- **Plantillas:** Thymeleaf templates en `src/main/resources/templates` y recursos estáticos en `src/main/resources/static`.
- **Base de datos:** `application.properties` apunta a MySQL (`jdbc:mysql://localhost:3306/nvmeless_db`) y `spring.jpa.hibernate.ddl-auto=update`.

**Estado actual (implementado)**
- **Arranque:** Clase principal `NvmelessEcommerceApplication` presente en `src/main/java/com/nvmeless/ecommerce`.
- **Rutas y vistas:** `HomeController` sirve las páginas `home`, `productos` y varias páginas de producto (`producto-poleron`, `producto-falda`, etc.). Las plantillas y botones (por ejemplo "Agregar al carro") están incluidos en `src/main/resources/templates`.
- **Configuración de BD:** `src/main/resources/application.properties` contiene la configuración de conexión a MySQL.

**Pendiente / No implementado**
- **Spring Security (implementación):** Aunque `pom.xml` incluye la dependencia `spring-boot-starter-security`, actualmente NO existen clases de configuración de seguridad, usuarios, roles ni uso de `BCryptPasswordEncoder` en el código fuente.
- **Carrito persistente:** La interfaz muestra botones y contador del carro, pero no hay entidades, repositorios ni servicios que persistan el carrito en la base de datos (las carpetas `model`, `repository` y `service` están vacías).
- **Panel de administración y Soft Delete:** No existen controladores ni entidades que implementen un panel administrativo ni soft-delete (`deleted` flag / `@SQLDelete`).

**Cómo ejecutar localmente (mínimo para ver las vistas)**

Prerequisitos:
- Java 17 instalado.
- MySQL: en este proyecto `application.properties` está configurado para MySQL en `localhost:3306`. Ajusta credenciales si es necesario.

Comandos (Windows PowerShell):

```powershell
.\mvnw.cmd spring-boot:run
```

O bien construir y ejecutar el JAR:

```powershell
.\mvnw.cmd clean package
java -jar target\ecommerce-0.0.1-SNAPSHOT.jar
```

La aplicación cargará las plantillas Thymeleaf y podrás navegar a `http://localhost:8080/`.

**Notas importantes**
- Las plantillas incluyen elementos de UI para carrito y botones, pero la lógica de backend para carrito/usuarios/administración aún no está implementada.
- `pom.xml` contiene dependencias de test que han sido generadas por plantillas; se recomienda revisar y limpiar dependencias de test si se desea.

**Roadmap / Siguientes pasos recomendados**
1. Implementar la entidad `User`, `Role` y una configuración de seguridad (`SecurityConfig`) utilizando `BCryptPasswordEncoder`.
2. Crear entidades `Cart`, `CartItem` y los `Repository`/`Service` correspondientes para persistir el carrito.
3. Añadir panel administrativo y soft-delete para entidades críticas.
4. Añadir tests de integración y limpiar `pom.xml` (dependencias de test innecesarias).

---

[📂 Ver Código Fuente](https://github.com/Lfiedlerf/M7_AE3_ABP)

---
*Esta fracción de portafolio fue desarrollado como parte del Bootcamp Full Stack Java Trainee - Módulo 7: Desarrollo de un portafolio digital.*