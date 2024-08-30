class GoldShopRunner{
public static void main(String args[]){
boolean gold=GoldShop.addGoldItem("gold Chain");
System.out.println(gold);
 gold=GoldShop.addGoldItem("Ring");
System.out.println(gold);
 gold=GoldShop.addGoldItem("Bracelets");
System.out.println(gold);
 gold=GoldShop.addGoldItem("Bangles");
System.out.println(gold);
 gold=GoldShop.addGoldItem("Earrings");
System.out.println(gold);
 gold=GoldShop.addGoldItem("Necklace");
System.out.println(gold);
 gold=GoldShop.addGoldItem("Anklets");
System.out.println(gold);
GoldShop.GetAllGoldItem();
boolean item=GoldShop.updateGoldItem("Necklace","small chain");
GoldShop.GetAllGoldItem();
  GoldShop.deleteGoldItem("Anklets");
  GoldShop.GetAllGoldItem();
 }
}
