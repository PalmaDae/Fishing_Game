package ru.gamedev.fishing;

import ru.gamedev.fishing.client.entity.LakeEntity;

public class MainLogic {
    public static void main(String[] args) {
        LakeEntity daldonLake=new LakeEntity(10,10,0,0,"Озеро далдона",10);

        for (int i = 0; i < daldonLake.getLakeMatrix().length; i++){
            for (int j = 0; j < daldonLake.getLakeMatrix()[i].length;j++){
                if (daldonLake.getLakeMatrix()[i][j]!=null){
                    System.out.print("["+daldonLake.getLakeMatrix()[i][j].getName()+"]");
                } else {
                    System.out.print("[]");
                }
            }
            System.out.print("\n");
        }
    }
}
