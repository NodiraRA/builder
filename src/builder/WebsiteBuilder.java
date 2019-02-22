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
public abstract class WebsiteBuilder {
    Website website;
    void createWebsite(){
        website = new Website();
    }
    
    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();
    
    Website getWebsite(){
        return website;
    }

}
