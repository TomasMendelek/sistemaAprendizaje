# Sistema de Aprendizaje Integral - Backend

Este proyecto es una plataforma de aprendizaje en línea que permite a instructores gestionar cursos y a los estudiantes avanzar en su aprendizaje mediante módulos, lecciones y evaluaciones. El sistema está dividido en un **backend desarrollado con Spring Boot** y un **frontend construido con Next.js**, permitiendo la conexión a **MongoDB Atlas** como base de datos.

---

## Objetivos del Proyecto

- Aplicar principios de programación orientada a objetos en la gestión de cursos, usuarios, evaluaciones y progreso.
- Desarrollar una API RESTful robusta con **Spring Boot** conectada a **MongoDB Atlas**.
- Implementar un sistema que permita la gestión de usuarios con diferentes roles (Instructores y Estudiantes).
- Crear una interfaz de usuario funcional con **Next.js y TypeScript** para interactuar con el sistema.
- Desplegar el backend y frontend utilizando **Railway** y **Vercel**.

---

### Links de Producción:

- **Link Backend (API):**  
  [backend-production-ec88.up.railway.app](backend-production-ec88.up.railway.app)

- **Link Frontend:**  
  [https://sistemaaprendizaje-1ihhddi55-tomascorbalans-projects.vercel.app/](https://sistemaaprendizaje-1ihhddi55-tomascorbalans-projects.vercel.app/)

---

## Tecnologías Utilizadas

### Backend
- **Java 17**
- **Spring Boot**
- **MongoDB Atlas**
- **Maven**
- **Railway** (Deploy)
- **Lombok** (para reducir código repetitivo)

### Frontend
- **Next.js 14**
- **React 18**
- **TypeScript**
- **TailwindCSS** (Estilos)
- **Axios** (Para comunicación con la API)
- **Vercel** (Deploy)

---

## Estructura del Proyecto

El proyecto sigue una arquitectura por capas para mantener el código organizado y modular:

### Backend
- **models/**: Contiene las entidades principales (`Usuario`, `Curso`, `Módulo`, `Lección`, `Evaluación`, `Progreso`).
- **repositories/**: Define los repositorios para interactuar con MongoDB.
- **services/**: Implementa la lógica de negocio, como la creación de cursos y usuarios.
- **controllers/**: Exponen los endpoints RESTful.
- **config/**: Contiene la configuración del proyecto, como CORS.

### Frontend
- **app/**: Define las rutas de la aplicación.
- **components/**: Contiene los formularios y otros componentes reutilizables.
- **axiosConfig.ts**: Configuración de Axios para conectarse con el backend.

---

## Entidades Principales

### 1. Usuario
- `id`: Identificador único.
- `nombre`: Nombre del usuario.
- `email`: Correo electrónico del usuario.
- `rol`: Rol del usuario (`Instructor` o `Estudiante`).

### 2. Curso
- `id`: Identificador único.
- `nombre`: Nombre del curso.
- `descripcion`: Descripción del curso.
- `modulos`: Lista de módulos asociados.

### 3. Módulo
- `id`: Identificador único.
- `nombre`: Nombre del módulo.
- `lecciones`: Lista de lecciones en este módulo.

### 4. Lección
- `id`: Identificador único.
- `titulo`: Título de la lección.
- `contenido`: Contenido de la lección.
- `evaluaciones`: Evaluaciones asociadas a la lección.

### 5. Evaluación
- `id`: Identificador único.
- `preguntas`: Lista de preguntas.
- `resultado`: Resultado de la evaluación.

### 6. Progreso
- `id`: Identificador único.
- `usuarioId`: Identificador del usuario.
- `cursoId`: Identificador del curso.
- `porcentaje`: Porcentaje completado.

---

## Cardinalidades

- **Usuario - Curso**: Un usuario puede estar inscrito en varios cursos.
- **Curso - Módulo**: Un curso tiene muchos módulos.
- **Módulo - Lección**: Un módulo contiene múltiples lecciones.
- **Lección - Evaluación**: Una lección tiene evaluaciones.
- **Usuario - Progreso**: Un usuario tiene un progreso asociado por cada curso.

---
![image](https://github.com/user-attachments/assets/ee4d4947-daef-48f9-ba25-333b0d083389)
---
## Endpoints RESTful Principales

### Usuarios
- `GET /api/usuarios`: Obtiene todos los usuarios.
- `POST /api/usuarios`: Crea un nuevo usuario.
- `GET /api/usuarios/{id}`: Obtiene un usuario por ID.
- `DELETE /api/usuarios/{id}`: Elimina un usuario por ID.

### Cursos
- `GET /api/cursos`: Obtiene todos los cursos.
- `POST /api/cursos`: Crea un nuevo curso.
- `GET /api/cursos/{id}`: Obtiene un curso por ID.
- `DELETE /api/cursos/{id}`: Elimina un curso por ID.

### Módulos
- `GET /api/modulos`: Obtiene todos los módulos.
- `POST /api/modulos`: Crea un nuevo módulo.

### Lecciones
- `GET /api/lecciones`: Obtiene todas las lecciones.
- `POST /api/lecciones`: Crea una nueva lección.

### Evaluaciones
- `GET /api/evaluaciones`: Obtiene todas las evaluaciones.
- `POST /api/evaluaciones`: Crea una nueva evaluación.

---

## Funcionalidades Principales

### 1. Gestión de Usuarios
- Los usuarios pueden ser creados y eliminados mediante la API.
- Un usuario puede ser **Instructor** o **Estudiante**.

### 2. Gestión de Cursos
- Los instructores pueden crear, editar y eliminar cursos.

### 3. Evaluaciones y Progreso
- Los estudiantes pueden realizar evaluaciones para medir su progreso.
- El progreso del estudiante se calcula automáticamente en función de sus resultados.

---

