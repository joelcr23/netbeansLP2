/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.MAlvaradoSoft.model.bean;

/**
 *
 * @author alulab14
 */
public class Principal extends User {
    private int tableStatus;

    public Principal(int tableStatus, String name, String firstLastName, String secondLastName, String dni, String adress, int phone, String email, boolean active, int id, String userName, String password) {
        super(name, firstLastName, secondLastName, dni, adress, phone, email, active, id, userName, password);
        this.tableStatus = tableStatus;
    }

    public Principal(int tableStatus) {
        this.tableStatus = tableStatus;
    }

    public Principal() {
    }

    public int getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(int tableStatus) {
        this.tableStatus = tableStatus;
    }

    
   
}
