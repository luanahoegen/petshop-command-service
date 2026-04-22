package com.udesc.account.framework;

import com.udesc.account.common.dto.AgendaDTO;
import com.udesc.account.common.dto.CreateAgendaRequest;
import com.udesc.account.common.service.CreateAgenda;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/agenda")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AgendaResource {

    private final CreateAgenda createAgenda;

    public AgendaResource(CreateAgenda createAgenda) {
        this.createAgenda = createAgenda;
    }

    @POST
    public AgendaDTO agendar(CreateAgendaRequest request) {
        return createAgenda.agendar(request);
    }
}
