package com.lojaonline.cart.infrastructure.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@OpenAPIDefinition
@SecurityScheme(type = SecuritySchemeType.HTTP, bearerFormat = "JWT", name = "Authorization", scheme = "Bearer")
public class SwaggerConfig {

    @Bean
    public OpenAPI basOpenAPI() {

        SecurityRequirement securityRequirement = new SecurityRequirement();
        securityRequirement.addList("Authorization");

        ApiResponse internalServerError = new ApiResponse().description("Internal Server Error");

        ApiResponse badRequest = new ApiResponse()
                .description("Bad Request");

        ApiResponse permissionDenied = new ApiResponse()
                .description("Permission Denied");

        ApiResponse conflict = new ApiResponse()
                .description("Data Conflict");

        ApiResponse ok = new ApiResponse()
                .description("Successful Request");

        ApiResponse ResourceNotFound = new ApiResponse().description("Resource Not Found");
        Components component = new Components();

        component.addResponses("InternalServerError", internalServerError);
        component.addResponses("badRequest", badRequest);
        component.addResponses("permissionDenied", permissionDenied);
        component.addResponses("conflict", conflict);
        component.addResponses("ok", ok);
        component.addResponses("ResourceNotFound", ResourceNotFound);

        return new OpenAPI()
                .security(List.of(securityRequirement))
                .components(component)
                .info(new Info().title("Ecommerce API Documentation").version("2.0.1")
                        .description("a simple API for a Ecommerce"));
    }

}