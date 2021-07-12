public class Runner {

    public static void main(String[] args) {

        Planet planet = new Planet("Mars",100);
        String name = planet.getName();
        System.out.println(name);

        int size = planet.getSize();
        System.out.println(size);

        String explode = planet.explode();
        System.out.println(explode);

    }
}
