package com.udesc.account.framework;

import com.udesc.account.common.dto.AnimalDTO;
import com.udesc.account.common.dto.CreateAnimalRequest;
import com.udesc.account.common.service.CreateAnimal;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/animal")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AnimalResource {

    private final CreateAnimal createAnimal;

    public AnimalResource(CreateAnimal createAnimal) {
        this.createAnimal = createAnimal;
    }

    @POST
    public AnimalDTO criarAnimal(CreateAnimalRequest request) {
        return createAnimal.criarAnimal(request);
    }
}
