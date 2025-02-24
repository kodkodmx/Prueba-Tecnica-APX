# **Sistema APX**  

## **Descripción General**  

Este proyecto incluye el desarrollo y la evaluación de un servicio en Java, con empaquetado en archivos JAR y pruebas funcionales ejecutadas mediante Postman.  

## **Despliegue de Archivos JAR**  

La siguiente imagen muestra los archivos JAR utilizados en la solución:  

![JARs en el chache del entorno](https://github.com/user-attachments/assets/52d88c4c-ac91-42d7-ba43-ae049d4c35b3)

## **Creacion de la table en base de datos**

```
CREATE TABLE WIKJ."T_WIKJ_HAB_PRUEBAFINAL"(
    id Number(5) NOT NULL PRIMARY KEY,
    nuip Number(10) NOT NULL,
    full_name VARCHAR(50),
    phone VARCHAR(15),
    address VARCHAR(30)
)

```


## **Pruebas Realizadas con Postman**  

## **URL utilizada**

```
localhost:8101/APX_Runtime_Online/PGRestService/
```

## **Formato del JSON de Prueba**  

El siguiente JSON fue empleado para evaluar el servicio:  

```json
{
  "dtoIn": {
    "id": "3",
    "nuip": "3",
    "full_name": "Beto h",
    "phone": "55252525",
    "address": "calle mexico"
    }
}


````

Se presenta un caso de insercion exitosa devolvien el la insercion del registro nuevo ejecutado en Postman:  

![Consumo con Postman](https://github.com/user-attachments/assets/71712260-8512-4791-9660-90f3e4005855)


Se presenta un caso de intento de registro con nuip ya existente en la base de datos devolviendo el registro existente en la base de datos en Postman:  

![Consumo con Postman](https://github.com/user-attachments/assets/f8836599-e0e9-46c6-9374-edf073e0cd75)


## **Tecnologías y Herramientas Empleadas**  

1. Java 1.8  
2. Docker  
3. IntelliJ IDEA  
4. Postman  
5. Maven 3.5.3  
6. ASO  
