//package com.udesc.account.framework;
//
//import com.udesc.account.common.dto.AgendaDTO;
//import com.udesc.account.common.dto.CreateAgendaRequest;
//import com.udesc.account.common.service.CreateAgenda;
//import jakarta.ws.rs.Consumes;
//import jakarta.ws.rs.POST;
//import jakarta.ws.rs.Path;
//import jakarta.ws.rs.Produces;
//import jakarta.ws.rs.core.MediaType;
//import org.eclipse.microprofile.openapi.annotations.Operation;
//import org.eclipse.microprofile.openapi.annotations.tags.Tag;
//
//@Path("/agenda")
//@Tag(name = "Agenda", description = "Operações de agendamento")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
//public class AgendaResource {
//
//    private final CreateAgenda createAgenda;
//
//    public AgendaResource(CreateAgenda createAgenda) {
//        this.createAgenda = createAgenda;
//    }
//
//    @POST
//    @Operation(summary = "Cria um novo agendamento para um animal")
//    public AgendaDTO agendar(CreateAgendaRequest request) {
//        return createAgenda.agendar(request);
//    }
//}
