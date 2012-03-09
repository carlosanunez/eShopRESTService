/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Product;
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
@Path("entities.product")
public class ProductFacadeREST extends AbstractFacade<Product> {
    @PersistenceContext(unitName = "EshopPU")
    private EntityManager em;

    public ProductFacadeREST() {
        super(Product.class);
    }

    @POST
    @Override
//    @Consumes({"application/xml", "application/json"})
    @Consumes({"application/json"})
    public void create(Product entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(Product entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
//    @Produces({"application/xml", "application/json"})
    @Produces({"application/json"})
//    @Produces({"application/json", "application/xml"})
    public Product find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
//    @Produces({"application/xml", "application/json"})
        @Produces({"application/json"})
    public List<Product> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Product> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
