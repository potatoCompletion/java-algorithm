package chap02;

public class PhysicalExamination {
    
    static final int VMAX = 21;

    static class PhysData {
        String name;
        int height;
        double vision;

        // 생성자
        PhysData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(PhysData[] dat) {
        double sum = 0;

        for (int i = 0; i < dat.length; i++)
            sum += dat[i].height;

        return sum / dat.length;
    }

    static void distVision(PhysData[] dat, int[] dist) {
        int i = 0;

        dist[i] = 0;
        for (i = 0; i < dat.length; i++)
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int)(dat[i].vision * 10)]++;
    }

    public static void main(String[] args) {
        PhysData[] pList = {
            new PhysData("김완수", 178, 0.1),
            new PhysData("구병문", 185, 1.1),
            new PhysData("방찬종", 179, 0.3),
            new PhysData("김현우", 175, 1.1)            
        };
        int[] vDist = new int[VMAX];

        for (PhysData i : pList) {
            System.out.printf("%s%6d%6.1f", i.name, i.height, i.vision);
            System.out.println();
        }

        System.out.println("키 평균 = " + Math.round(aveHeight(pList) * 10) / 10.0);
        
        distVision(pList, vDist);

        for(int i = 0; i < VMAX; i++) {
            System.out.print(i / 10.0 + " :");
            for(int j = 0; j < vDist[i]; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
