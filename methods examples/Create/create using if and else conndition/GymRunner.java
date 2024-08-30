class GymRunner{
public static void main(String gym[]){
 boolean power = Gym.createGymEquipments("Leg Extension Machin");
 System.out.println(power);
 power=Gym.createGymEquipments("chest Press Machin");
 System.out.println(power);
 power=Gym.createGymEquipments("Leg curl Machin");
 System.out.println(power);
 power=Gym.createGymEquipments("Leg press Machin");
 System.out.println(power);
 power=Gym.createGymEquipments("Dumbbells");
 System.out.println(power);
 power=Gym.createGymEquipments("Power Rack");
 System.out.println(power);
 power=Gym.createGymEquipments("StairMaster");
 System.out.println(power);
 power=Gym.createGymEquipments("threadmill");
 System.out.println(power);
 Gym.getGymEquipments();
 boolean value=Gym.updateGymQuipments("Power Rack","Machin");
 Gym.getGymEquipments();
 Gym.deleteGymEquipments("StairMaster");
 Gym.getGymEquipments();
}
}