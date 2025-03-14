/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecoisland;

/**
 *
 * @author suran
 */
public class Resource {
    private int food;
    private int water;
    private int wood;

    public Resource(int food, int water, int wood) {
        this.food = food;
        this.water = water;
        this.wood = wood;
    }

    public void consumeResource(int food, int water, int wood) {
        this.food -= food;
        this.water -= water;
        this.wood -= wood;
    }

    public boolean checkLevels() {
        return food >= 0 && water >= 0 && wood >= 0;
    }

    public int totalResources() {
        return food + water + wood;
    }

    @Override
    public String toString() {
        return "Food: " + food + ", Water: " + water + ", Wood: " + wood;
    }

    void consumeResources(int food, int water, int wood) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}