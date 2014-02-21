/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package version5;

/**
 *
 * @author Kuhan2
 */
public interface SwimGroup extends Duck{
    
    public abstract void performSwim();

    public void setSwimStrategy(SwimStrategy st);
    
}
