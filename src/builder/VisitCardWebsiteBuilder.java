/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author nodira
 */
public class VisitCardWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);

    }

    @Override
    void buildPrice() {
        website.setPrice(500);

    }
    
    
    
}
