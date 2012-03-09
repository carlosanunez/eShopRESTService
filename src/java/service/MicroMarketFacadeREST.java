/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.MicroMarket;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;

/**
 *
 * @author alex
 */
@Stateless
@Path("entities.micromarket")
public class MicroMarketFacadeREST extends AbstractFacade<MicroMarket> {
    @PersistenceContext(unitName = "EshopPU")
    private EntityManager em;

    public MicroMarketFacadeREST() {
        super(MicroMarket.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(MicroMarket entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(MicroMarket entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public MicroMarket find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<MicroMarket> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<MicroMarket> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @java.lang.Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
