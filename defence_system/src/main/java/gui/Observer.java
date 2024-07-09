/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gui;
/**
 *
 * @author TWINTECH
 */
public interface Observer {
    public void setVisible(boolean b);
    public String sendSoldierCount();
    public String sendAmmoCount();
    public String sendFuelAmount();
    public void buttonDisable(boolean isDisable);
    public String sendOxygenLevel();
    public void getMsgFromMainControl(String msg);
    public void areaCleared(Boolean isClear);
}
