package com.udesc.account.framework;

import com.udesc.account.common.dto.AgendaDTO;
import com.udesc.account.common.dto.CreateAgendaRequest;
import com.udesc.account.common.service.CancelAgenda;
import com.udesc.account.common.service.CreateAgenda;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/agenda")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AgendaResource {

    private final CreateAgenda createAgenda;
    private final CancelAgenda cancelAgenda;

    public AgendaResource(CreateAgenda createAgenda, CancelAgenda cancelAgenda) {
        this.createAgenda = createAgenda;
        this.cancelAgenda = cancelAgenda;
    }

    @POST
    public AgendaDTO agendar(CreateAgendaRequest request) {
        return createAgenda.agendar(request);
    }

    @DELETE
    @Path("/{id}")
    public String cancelar(@PathParam("id") Long id) {
        return cancelAgenda.cancelar(id);
    }
}
