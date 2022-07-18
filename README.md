# Taller_Microservicios

## Cómo desplegar

### Correr los servicios

Seguir el siguiente orden para ejecutar:

- eureka-service


- product-service


- payment-service


- order-service


### Registrar datos

__POST:__ localhost:9001/compras/save

```json
{
    "id": "1",
    "name": "Coca Cola",
    "stock": 20,
    "price": "2.5"
},
{
    "id": "2",
    "name": "Inka Cola",
    "stock": 20,
    "price": "2.5"
},
{
	"id": "3",
	"name": "Pícaras",
	"stock": 20,
	"price": "1.2"
}
```

__POST:__ localhost:9002/venta/save

```json
{
    "id": "1",
    "clientId": "Fernando",
    "product": {
    	"id": "1"
    },
    "payment": {
    	"id": "1"
    }
}
```

### Desplegar Docker-Compose

Desde el terminal, dirigirse a la carpeta tool y ejecutar el siguiente comando.

> docker-compose up -d

### Abrir Prometheus

__Ingresar en el navegador:__ localhost:9090


Seguir los siguientes pasos:


- Click en el botón __Global__.


- Escoger cualquier comando.


- Hacer click en __Execute__.

### Implementar Grafana

__Ingresar en el navegador:__ localhost:3000

Seguir los siguientes pasos:


- Crear un nuevo __Data Source__.


- Ingresar la siguiente dirección: http://host.docker.internal:9090


*Esto permitirá conectarse a Prometheus desde Docker.*


- Hacer click en __Save & Test__.


- Crear un nuevo Dashboard.


- Escoger crear desde cero.


- Probar los servicios.