public class PartA {
  public static void main(String[] args) {
   double material = 100.0;
   int years = 0;

   while (material > 1.0) {
    material = material / 2;
    years += 30;

   }

    System.out.println("Years required: " + years);
    System.out.println("Amount of material remaining: " + material + "%");
  }
}