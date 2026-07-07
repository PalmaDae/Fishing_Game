package ru.gamedev.fishing.client.entity;

import ru.gamedev.fishing.client.service.LakeService;

import java.util.Random;

public class FishTest {
    public static void main(String[] args) {
        Random myRandom = new Random();
        LakeService lakeService=new LakeService(myRandom);
        LakeEntity daldonLake=new LakeEntity(10,10,0,0,"Озеро далдона",10
        );
        lakeService.fishCreate(5,daldonLake);
        for(int i=0;i<daldonLake.getLakeMatrix().length;i++){
            for (int j=0;j<daldonLake.getLakeMatrix()[i].length;j++){
                if (daldonLake.getLakeMatrix()[i][j]!=null){
                    System.out.print("["+daldonLake.getLakeMatrix()[i][j].getName()+"]");
                }else {
                    System.out.print("[]");
                }
            }
            System.out.print("\n");
        }
    }
}
