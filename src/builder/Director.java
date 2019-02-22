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
public class Director {
    WebsiteBuilder builder;
    
    public void setBuilder(WebsiteBuilder builder){
        this.builder=builder;
    }
    
    Website buildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildName();
        builder.buildPrice();
        
        Website website = builder.getWebsite();
        
        return website;
    }
}
