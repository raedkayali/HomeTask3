public class Main {
    public static void main(String[] args) {
       ICEV icev1 = new ICEV(new Manufacture(1, "Toyota", "Corolla", 2019, "White", 20000, "123456"), new CombustionEngine());
       ICEV icev2 = new ICEV(new Manufacture(2, "Toyota", "Corolla", 2019, "White", 20000, "123456"), new CombustionEngine());
       BEV bev1 = new BEV(new Manufacture(3, "Tesla", "Model 3", 2019, "Black", 40000, "654321"), new ElectricEngine());
       BEV bev2 = new BEV(new Manufacture(4, "Tesla", "Model 3", 2019, "Black", 40000, "654321"), new ElectricEngine());
       HybridV hybridv1 = new HybridV(new Manufacture(5, "Toyota", "Prius", 2019, "Red", 30000, "789456"), new HybridEngine());
       HybridV hybridv2 = new HybridV(new Manufacture(6, "Toyota", "Prius", 2019, "Red", 30000, "789456"), new HybridEngine());
       Vehicle[] vehicles = {icev1, icev2, bev1, bev2, hybridv1, hybridv2};
       for (Vehicle vehicle : vehicles) {
           vehicle.showCharacteristics();
       }
    }
}
