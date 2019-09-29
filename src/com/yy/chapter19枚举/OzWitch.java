package com.yy.chapter19Ã¶¾Ù;

public enum OzWitch {
    WEST("A b c"),North("cde");
    private String description;
    private OzWitch(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

    public static void main(String[] args) {
        for(OzWitch o : OzWitch.values()){
            System.out.println(o +"---" + o.getDescription());
        }
    }
}
