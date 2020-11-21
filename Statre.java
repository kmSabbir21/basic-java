package household;

public class Statre {

    public static void main(String[] args) {
        Brand brand = new Brand();
        brand.setBrandId(123.87);
        System.out.println("BrandId:"+brand.getBrandId());
        
        Door door = new Door();
        door.setDoorPrice(12000);
        door.setDoorSize(12.3);
        door.setBrand(brand);
        
        System.out.print("Door Brand:"+door.getBrand().getBrandId()+
                         "\n"+"Door price:"+door.getDoorPrice()+
                         "\n"+"Door size:"+" "+door.getDoorSize());
    }
    
}
