/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et.com.inhousetraining.L12.models;

import java.util.*;

/**
 *
 * @author eyu
 */
public class Section extends InventoryComponent {
    
    private int sectionID;
    private String aisleName;
    private int shelfNumber;
    private int maxCapacity;
    private int currentQuantity = 0;
    private List<StorageBin> storageBins = new ArrayList<>();

    public Section(int sectionID, String aisleName, int shelfNumber, int maxCapacity) {
        this.sectionID = sectionID;
        this.aisleName = aisleName;
        this.shelfNumber = shelfNumber;
        this.maxCapacity = maxCapacity;
    }
    
    public Section(){
    }

    /**
     * @return the sectionID
     */
    public int getSectionID() {
        return sectionID;
    }

    /**
     * @param sectionID the sectionID to set
     */
    public void setSectionID(int sectionID) {
        this.sectionID = sectionID;
    }

    /**
     * @return the aisleName
     */
    public String getAisleName() {
        return aisleName;
    }

    /**
     * @param aisleName the aisleName to set
     */
    public void setAisleName(String aisleName) {
        this.aisleName = aisleName;
    }

    /**
     * @return the shelfNumber
     */
    public int getShelfNumber() {
        return shelfNumber;
    }

    /**
     * @param shelfNumber the shelfNumber to set
     */
    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    /**
     * @return the maxCapacity
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * @param maxCapacity the maxCapacity to set
     */
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * @return the currentQuantity
     */
    public int getCurrentQuantity() {
        return currentQuantity;
    }

    /**
     * @param currentQuantity the currentQuantity to set
     */
    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    /**
     * @return the storageBins
     */
    public List<StorageBin> getStorageBins() {
        return storageBins;
    }

    /**
     * @param storageBins the storageBins to set
     */
    public void setStorageBins(List<StorageBin> storageBins) {
        this.storageBins = storageBins;
    }

    @Override
    public void display() {
        
        System.out.println("Section ID :"+this.getSectionID());
        System.out.println("Section AisleName :"+this.getAisleName());
        System.out.println("Section CurrentQuantity :"+this.getCurrentQuantity());
        System.out.println("Section MaxCapacity :"+this.getMaxCapacity());
        System.out.println("Section getShelfNumber :"+this.getShelfNumber());
        System.out.println("Section has "+ (this.getStorageBins()!= null ? this.getStorageBins().size():0) +" Storage Bins");


    }
    
    

    
}
