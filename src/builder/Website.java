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
public class Website {
    
    private String name;
    private Cms cms;
    private int price;
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setCms(Cms cms){
        this.cms=cms;
    }
    
    public void setPrice(int price){
        this.price=price;
    }
    
    
   @Override
   public String toString(){
       return "Website{" + "pice" + price + ", cms" + cms +", name" + name + '\'' + '}';
   }
}
