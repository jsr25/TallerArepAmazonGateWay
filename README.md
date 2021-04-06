# Taller AWS Api Gateway

## Autor: Juan Sebastian Ramos Isaza

## Fecha: 05-04-2021

### Prerequisitos
Para el uso de esta aplicación se necesitan tener instalados los siguientes componentes:

* [Java 11 o superior](https://www.oracle.com/co/java/)
* [maven](https://maven.apache.org/)
* [git](https://git-scm.com/)
* [docker y docker-compose](https://www.docker.com/)

### Uso 
Para el uso de la apliacion deben clonar el repositorio en su maquina con el comando:
* git clone https://github.com/jsr25/TallerArepAmazonGateWay.git

Deberan entrar en el directorio del repositorio y ejecutar el siguiente comando
*  mvn package

Para generar la imagen de docker debe ejecutar 
* docker build --tag tallerarep .

para generar el contenedor deben ejecutar 
* docker run -d -p 80:6000 --name tallerarepconteiner tallerarep

Para usar la aplicacion deberan entrar a localhost/converter?value=<numero> 

## Evidencia Ec2
Se puede apreciar la maquina ec2 de AWS que tiene en este momento la aplicacion 
corriendo
![](./img/maquinaAws.png)
Se puede apreciar una prueba a la maquina Ec2.
![](./img/vistaNavegador.png)

## Evidencia Gateway
![](./img/gateway.png)
![](./img/gateway2.png)
## Evidencia S3
![](./img/S3.png)

## video 


https://youtu.be/qb0nKYmLbso en este enlace encontrara el video demostracion de la apliacacion montada en ec2 aws con dokcer, ademas 
usando Api Gateway y S3.

### Javadoc
La documentación se encuentra en el directorio apidocs dentro el directorio Robin y LogService, para generar una nueva documentación
pueden hacer uso del comando mvn javadoc:javadoc en su Shell esta se generará en el directorio target/site.

### Licencia

En este proyecto se usó la licencia GNU - se puede ver [LICENSE.txt](LICENSE.txt) para más detalles.
