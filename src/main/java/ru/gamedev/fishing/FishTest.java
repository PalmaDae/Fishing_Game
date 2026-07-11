package ru.gamedev.fishing;

import ru.gamedev.fishing.client.entity.LakeEntity;
import ru.gamedev.fishing.client.service.FishService;
import ru.gamedev.fishing.client.service.LakeService;
import ru.gamedev.fishing.client.service.MoveService;

import java.util.Random;

public class FishTest {
    public static void main(String[] args) {
        LakeService lakeService=new LakeService();
        MoveService moveService=new MoveService();
        LakeEntity daldonLake = new LakeEntity(10,10,0,0,"Озеро далдона");

        lakeService.fishCreate(25,daldonLake);
        Runnable task=()-> {
            try {
                while(true) {
                    for (int i = 0; i < daldonLake.getLakeMatrix().length; i++) {
                        for (int j = 0; j < daldonLake.getLakeMatrix()[i].length; j++) {
                            if (daldonLake.getLakeMatrix()[i][j] != null) {
                                System.out.print("[" + daldonLake.getLakeMatrix()[i][j].getName() + "]");
                            } else {
                                System.out.print("[]");
                            }
                        }
                        System.out.print("\n");

                    }
                    moveService.allFishMove(daldonLake);
                    Thread.sleep(5000);
                    System.out.print("\n\n\n\n\n\n");
                }
            } catch (InterruptedException e) {
                System.out.print("АШИБКА");
            }
        };

        Thread thread=new Thread(task,"MyDaldon");
        thread.start();
    }
}
