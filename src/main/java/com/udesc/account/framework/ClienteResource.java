package com.udesc.account.framework;

import com.udesc.account.common.dto.ClienteDTO;
import com.udesc.account.common.dto.CreateClienteRequest;
import com.udesc.account.common.service.CreateCliente;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/cliente")
@Tag(name = "Cliente", description = "Operações relacionadas a clientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteResource {

    private final CreateCliente createCliente;

    public ClienteResource(CreateCliente createCliente) {
        this.createCliente = createCliente;
    }

    @POST
    @Operation(summary = "Cria um novo cliente")
    public ClienteDTO criarCliente(CreateClienteRequest request) {
        return createCliente.criarCliente(request);
    }
}
