package com.udesc.account.framework;

import com.udesc.account.common.dto.AnimalDTO;
import com.udesc.account.common.dto.CreateAnimalRequest;
import com.udesc.account.common.service.CreateAnimal;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/animal")
@Tag(name = "Animal", description = "Operações relacionadas a animais")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AnimalResource {

    private final CreateAnimal createAnimal;

    public AnimalResource(CreateAnimal createAnimal) {
        this.createAnimal = createAnimal;
    }

    @POST
    @Operation(summary = "Cria um novo animal")
    public AnimalDTO criarAnimal(CreateAnimalRequest request) {
        return createAnimal.criarAnimal(request);
    }
}
