/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.PurchaseOrder;
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
@Path("entities.purchaseorder")
public class PurchaseOrderFacadeREST extends AbstractFacade<PurchaseOrder> {
    @PersistenceContext(unitName = "EshopPU")
    private EntityManager em;

    public PurchaseOrderFacadeREST() {
        super(PurchaseOrder.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
//    @Consumes({"application/xml"})
    public void create(PurchaseOrder entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(PurchaseOrder entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }
 
//    @GET
//    @Path("{id}")
//    @Produces({"application/xml", "application/json"})
//    public PurchaseOrder find(@PathParam("id") Integer id) {
//        return super.find(id);
//    }
    
    @GET
    @Path("{orderNum}")
    @Produces({"application/xml", "application/json"})
    public PurchaseOrder findOrderNum(@PathParam("orderNum") Integer orderNum) {
        return super.find(orderNum);
    }
    
    

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<PurchaseOrder> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<PurchaseOrder> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }
    
//    @GET
//    @Path("{customerId}")
//    @Produces({"application/json"})
//    public PurchaseOrder findCustomer(@PathParam("customerId") Integer customerId) {
//        return super.find(customerId);
//    }
    
    
    @java.lang.Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
