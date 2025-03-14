/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecoisland;

/**
 *
 * @author suran
 */
public class Player {
    private String name;
    private Resource resources;

    public Player(String name) {
        this.name = name;
        this.resources = new Resource(50, 50, 50);
    }

    public void allocateResources(int food, int water, int wood) {
        resources.consumeResources(food, water, wood);
    }

    public boolean checkSurvival() {
        return resources.checkLevels();
    }

    public Resource getResources() {
        return resources;
    }

    public String getName() {
        return name;
    }
}