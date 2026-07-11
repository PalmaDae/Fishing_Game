package ru.gamedev.fishing.client.service;

import ru.gamedev.fishing.client.entity.FishEntity;
import ru.gamedev.fishing.client.entity.LakeEntity;
import ru.gamedev.fishing.client.entity.enums.Directions;

import java.util.Random;

public class MoveService {



    public void fishRandomhMove(FishEntity fish, LakeEntity lake){
        Random random=new Random();
        FishEntity[][] matrix =lake.getLakeMatrix();
        Directions direction= Directions.values()[random.nextInt(Directions.values().length)];
        switch (direction){
            case LEFT->{
                if ((fish.getPositionX()>0)&&(matrix[fish.getPositionY()][fish.getPositionX()-1]==null)) {
                    matrix[fish.getPositionY()][fish.getPositionX()-1]=matrix[fish.getPositionY()][fish.getPositionX()];
                    matrix[fish.getPositionY()][fish.getPositionX()]=null;
                    fish.setPositionX(fish.getPosition()[0]-1);

                }
            }
            case RIGHT->{
                if ((fish.getPositionX()<matrix[fish.getPositionY()].length-1)&&(matrix[fish.getPositionY()][fish.getPositionX()+1]==null)) {
                    matrix[fish.getPositionY()][fish.getPositionX()+1]=matrix[fish.getPositionY()][fish.getPositionX()];
                    matrix[fish.getPositionY()][fish.getPositionX()]=null;
                    fish.setPositionX(fish.getPosition()[0]+1);
                }
            }
            case UP->{
                if ((fish.getPositionX()>0)&&(matrix[fish.getPositionY()][fish.getPositionX()-1]==null)) {
                    matrix[fish.getPositionY()][fish.getPositionX()-1]=matrix[fish.getPositionY()][fish.getPositionX()];
                    matrix[fish.getPositionY()][fish.getPositionX()]=null;
                    fish.setPositionX(fish.getPosition()[0]-1);

                }
            }
            case DOWN->{
                if ((fish.getPositionX()<matrix[fish.getPositionY()].length-1)&&(matrix[fish.getPositionY()][fish.getPositionX()+1]==null)) {
                    matrix[fish.getPositionY()][fish.getPositionX()+1]=matrix[fish.getPositionY()][fish.getPositionX()];
                    matrix[fish.getPositionY()][fish.getPositionX()]=null;
                    fish.setPositionX(fish.getPosition()[0]+1);
                }
            }
        }
    }

    public void allFishMove(LakeEntity lake){
        for(FishEntity[] fish :lake.getLakeMatrix()) {
            for (FishEntity fish1:fish){
                if (fish1!=null)fishRandomhMove(fish1,lake);
            }
        }
    }


}
