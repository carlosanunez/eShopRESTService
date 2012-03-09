/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.DiscountCode;
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
@Path("entities.discountcode")
public class DiscountCodeFacadeREST extends AbstractFacade<DiscountCode> {
    @PersistenceContext(unitName = "EshopPU")
    private EntityManager em;

    public DiscountCodeFacadeREST() {
        super(DiscountCode.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(DiscountCode entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(DiscountCode entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id.charAt(0)));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public DiscountCode find(@PathParam("id") String id) {
        return super.find(id.charAt(0));
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<DiscountCode> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<DiscountCode> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
