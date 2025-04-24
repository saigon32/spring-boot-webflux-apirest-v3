package com.bolsadeideas.springboot.reactor.app;

import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.bolsadeideas.springboot.reactor.app.handler.ProductoHandler;
import com.bolsadeideas.springboot.reactor.app.models.services.ProductoServiceImpl;

@Configuration
public class RouterFunctionConfig {

	private final ProductoServiceImpl productoServiceImpl;

	RouterFunctionConfig(ProductoServiceImpl productoServiceImpl) {
		this.productoServiceImpl = productoServiceImpl;
	}

	@Bean
	public RouterFunction<ServerResponse> routes(ProductoHandler handler) {
		return route(GET("/api/v2/productos").or(GET("/api/v3/productos")), handler::listar)
				.andRoute(GET("/api/v2/productos/{id}"), handler::ver)
				.andRoute(POST("/api/v2/productos"), handler::crear)
				.andRoute(PUT("/api/v2/productos/{id}"), handler::editar)
				.andRoute(DELETE("/api/v2/productos/{id}"), handler::eliminar)
				.andRoute(POST("/api/v2/productos/upload/{id}"), handler::upload)
				.andRoute(POST("/api/v2/productos/crearConFoto"), handler::crearConFoto);
		// se podria hacer validacion con contentType desde la cabecera para validar el
		// formato enviado en el request
	}

}
