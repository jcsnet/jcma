/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jcsnet
 */

@ManagedBean
@SessionScoped

public class User {
    
    private String imie;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
    
    
    
}
