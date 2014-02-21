/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version5;

/**
 *
 * @author Owner
 */
public interface QuackGroup extends Duck {

    public abstract void performQuack();

    public void setQuackStrategy(QuackStrategy qb);
}
