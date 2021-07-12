public class Arrays {
    public static void main(String[] args) {
        //Array 1 dimension
        String[] androidVersions = new String[17];
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";
        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }

        for (String androidVersion:androidVersions) {
            System.out.println(androidVersion);
        }

        /*System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
         */

        System.out.println();
        System.out.println();

        /*int days[] = new int[7];
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
         */

        //Array 2 dimension
        String [][] cities = new String[4][2]; //4*2
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota  ";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);
         */

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        for (String[] pair: cities) {
            for (String name:pair) {
                System.out.println(name);
            }
        }

        //Array 3 dimension
        int [] [] [] numbers = new int[2][2][2];

        //Array 4 dimension
        String [] [] [] [] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        //System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }

    }
}
