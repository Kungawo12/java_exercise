public class Driver {
    public static void main(String[] args) {
        double [] prices = new double[50];
        prices[2] = 13.99;
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]>10){
                count ++;
            }
        }
        System.out.println("prices greater than 10: "+ count);

        Car car1 = new Car("VIN123", "Red");
        Car car2 = new Car("VIN999", "Blue");
        Car car3 = new Car("VIN123", "Green");

        System.out.println("car1 vs car2: " + car1.equals(car2));  
        System.out.println("car1 vs car3: " + car1.equals(car3));
	

        Car [] dealerCars = new Car[40];
        dealerCars[0] = new Car("VIN100", "Blue");
        dealerCars[1] = new Car("VIN200", "Green");
        dealerCars[2] = new Car("VIN300", "Black");

        for(int i = 2; i >=0;i--){
            dealerCars[i+1] = dealerCars[i];
        }

        dealerCars[0] = new Car("VIN001", "Red");
        
        for (int i = 0; i < dealerCars.length; i++) {
            if(dealerCars[i]!= null){
                System.out.println(dealerCars[i]);
            }
        }

    }
}



