package edu.caio.carro;

public class Movement {
    private Car car;

    public Movement(Car car) {
        this.car = car;
    }
    
    public Movement() {
        this.car = new Car(); // Inicializa um carro automaticamente
    }

    public void isCarOn() {
        boolean state = car.getStateCar();
        System.out.println(state ? "O carro está ligado" : "O carro está desligado");
    }

    public void setSpeedCar(boolean speed) {
    	
        if (!car.getStateCar()) {
        	System.out.println("O carro está desligado, é necessário ligá-lo.");
            return;
        }
        
        if(speed && car.getSpeedCar() <= 120) {
        	 System.out.println("Acelerando...");
             car.setSpeedCar(car.getSpeedCar() + 1);
             speedCar();
             return;
        }
        
        if (car.getSpeedCar() > 0) {
        	 System.out.println("Desacelerando...");
             car.setSpeedCar(car.getSpeedCar() - 1);
             speedCar();
             return;
		}
       
       System.out.println("O carro já está parado");
       speedCar();
    }
    
    public void speedCar() {
		System.out.println("A velocidade atual é : " + car.getSpeedCar() + "Km/h");
	}
    
    // Novo método para ligar e desligar o carro
    public void turnCarOnOff() {
        if (car.getStateCar()) {
            car.setStateCar(false); // Desliga o carro
            isCarOn();
        } else {
            car.setStateCar(true); // Liga o carro
            isCarOn();
        }
    }
}
