/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author mafal
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(sandbox.RestResource.class);
        resources.add(sandbox.service.AeroportFacadeREST.class);
        resources.add(sandbox.service.AffectationFacadeREST.class);
        resources.add(sandbox.service.AvionFacadeREST.class);
        resources.add(sandbox.service.ConstructeurFacadeREST.class);
        resources.add(sandbox.service.PiloteFacadeREST.class);
        resources.add(sandbox.service.TypeFacadeREST.class);
        resources.add(sandbox.service.VolFacadeREST.class);
    }
    
}
