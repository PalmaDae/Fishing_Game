package ru.gamedev.fishing.client.service;

import ru.gamedev.fishing.client.entity.FishEntity;
import ru.gamedev.fishing.client.entity.LakeEntity;
import ru.gamedev.fishing.client.entity.enums.FishDefaults;
import ru.gamedev.fishing.client.entity.enums.FishRares;

import java.util.Random;

public class LakeService {
    private Random random = new Random();

    public LakeService() {

    }

    public int[] getRandomMatrixCoordinate(FishEntity[][] matrix){
        int tries=0;
        int[] returned=new int[2];
        while (tries<100) {
            int x=random.nextInt(matrix[0].length);
            int y=random.nextInt(matrix.length);
            if (matrix[y][x]==null){
                returned[0]=x;
                returned[1]=y;
                return returned;
            }
            tries++;
        }
        returned[0]=-1;
        return returned;
    }

    public void fishCreate (int numberOfFish, LakeEntity lake) {
        int numberOfFishes=0;

        for (int i=0; (i<numberOfFish) && (numberOfFishes<lake.getLakeMatrix().length*lake.getLakeMatrix()[0].length);i++){
            FishEntity[][] matrix=lake.getLakeMatrix();
            FishDefaults[] allFishes=FishDefaults.values();

            int random2=random.nextInt(101);

            if (random2< 100- FishRares.DEFAULT.getChance()&&random2>=RarityService.getCommonLowestChance(FishRares.RARE)){
                random2=random.nextInt(FishDeafultService.getStartRarity(FishRares.RARE),FishDeafultService.getEndRarity(FishRares.RARE)+1);
            } else if (random2< 100-FishRares.DEFAULT.getChance()-FishRares.RARE.getChance()&&random2>=RarityService.getCommonLowestChance(FishRares.EPIC)){
                random2=random.nextInt(FishDeafultService.getStartRarity(FishRares.EPIC),FishDeafultService.getEndRarity(FishRares.EPIC)+1);
            } else if (random2< 100-FishRares.DEFAULT.getChance()-FishRares.RARE.getChance()-FishRares.EPIC.getChance()&&random2>=RarityService.getCommonLowestChance(FishRares.LEGENDARY)){
                random2=random.nextInt(FishDeafultService.getStartRarity(FishRares.LEGENDARY),FishDeafultService.getEndRarity(FishRares.LEGENDARY)+1);
            } else if (random2< 100-FishRares.DEFAULT.getChance()-FishRares.RARE.getChance()-FishRares.EPIC.getChance()-FishRares.LEGENDARY.getChance()&&random2>=RarityService.getCommonLowestChance(FishRares.DALDONIO)) {
                random2 = random.nextInt(FishDeafultService.getStartRarity(FishRares.DALDONIO), FishDeafultService.getEndRarity(FishRares.DALDONIO)+1 );
            } else {
                random2 = random.nextInt(FishDeafultService.getEndRarity(FishRares.DEFAULT) + 1);
            }

            int[] randomizer=getRandomMatrixCoordinate(matrix);
            if (randomizer[0]!=-1) {
                matrix[randomizer[1]][randomizer[0]] = new FishEntity(allFishes[random2], randomizer[0], randomizer[1]);
                numberOfFishes++;
            } else {
                System.out.print("Пустые координаты");
                i--;
            }
        }

    }
}
