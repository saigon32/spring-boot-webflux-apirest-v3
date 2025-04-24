material del curso de webflux udemy pragma: https://www.udemy.com/certificate/UC-454143b4-5f8b-4720-b793-0886b0dc5ce5/

Seccion 5: API RESTFUL usando RestController https://github.com/saigon32/spring-boot-webflux-apirest

listar-v3-route: curl --location 'http://localhost:8080/api/v2/productos'

crear-v3-route:  curl --location 'http://localhost:8080/api/v2/productos' \
--header 'Content-Type: application/json' \
--data '    {
        "nombre": "TV Huawei Pantalla LED 55",
        "precio":700,
        "categoria": {
            "id": "680a686f2050b31c47b13a20",
            "nombre": "Electronico"
        }
    }'

crear-v3-upload:
curl --location 'http://localhost:8080/api/v2/productos/upload/680a92b6f91bc24525c708c5' \
--form 'file=@"/C:/Users/andres.jurado_pragma/Desktop/pngtree-led-tv-television-screen-vector-png-image_6673700.png"'    

crear-v3-con-foto:
curl --location 'http://localhost:8080/api/v2/productos/crearConFoto' \
--form 'file=@"/C:/Users/andres.jurado_pragma/Desktop/pngtree-led-tv-television-screen-vector-png-image_6673700.png"' \
--form 'nombre="TV Panasonic Led 60"' \
--form 'precio="2000"' \
--form 'categoria.id="680a92b6f91bc24525c708b9"' \
--form 'categoria.nombre="Electronico"'

editar-v3-route: curl --location --request PUT 'http://localhost:8080/api/v2/productos/12345' \
--header 'Content-Type: application/json' \
--data '    {
        "nombre": "Sony Camara HD CyberShot",
        "precio": 1666.89,
        "categoria": {
            "id": "680a6dac3d2dd96bcf95c210",
            "nombre": "Electronico"
        }
    }'

eliminar-v3-route: curl --location --request DELETE 'http://localhost:8080/api/v2/productos/680a7231d0cdb43f1d8df6fd' \
--header 'Content-Type: application/json' \
--data '    {
        "nombre": "Sony Camara HD CyberShot",
        "precio": 1666.89,
        "categoria": {
            "id": "680a6dac3d2dd96bcf95c210",
            "nombre": "Electronico"
        }
    }'

    ver-v3-route: curl --location 'http://localhost:8080/api/v2/productos/12345' \
--data ''
    
