public class Car {
    private String vin;
    private String color;

    public Car(){
        vin = "";
    }

    public Car(String vin, String color){
        this.vin = vin;
        this.color = color;
    }
    
    @Override
    public String toString() {
	
		String output = "";
		
		output += this.vin +",";
		output += this.color;
		
		
		return output;
	}

    
    @Override
    public boolean equals(Object obj) {
        boolean output = false;

        if (obj instanceof Car otherCar) {                
            if (this.vin.equalsIgnoreCase(otherCar.vin)) { 
                output = true;
            }
        }

        return output;
}

    
}
