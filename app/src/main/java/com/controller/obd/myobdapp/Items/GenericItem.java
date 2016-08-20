package com.controller.obd.myobdapp.Items;

public class GenericItem {
    private int image_id;
    private String name;
    private String instruction;
    private float data;


    public GenericItem(int image_id, String name, String instruction, float data) {
        this.image_id = image_id;
        this.name = name;
        this.instruction = instruction;
        this.data = data;
    }

    public int getImage_ID() {
        return image_id;
    }

    public void setImage_ID(int image_id) {
        this.image_id = image_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public float getData() {
        return data;
    }

    public void setData(float data) {
        this.data = data;
    }
}
