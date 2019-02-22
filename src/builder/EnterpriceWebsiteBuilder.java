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
public class EnterpriceWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("Enterprice web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALFIRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
    
}
