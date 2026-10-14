public class CarsAssemble {
    private int carsPerHour = 221;
    private double carsPerMinute = carsPerHour / 60.0;

    public double productionRatePerHour(int speed) {
        if(speed <= 4){
            double successRate = 1.00;
            return carsPerHour * speed * successRate;
        }
        else if(speed >= 5 && speed <= 8){
            double successRate = 0.90;
            return carsPerHour * speed * successRate;
        }
        else if(speed == 9){
            double successRate = 0.80;
            return carsPerHour * speed * successRate;
        }
        else{
            double successRate = 0.77;
            return carsPerHour * speed * successRate;
        }
    }

    public int workingItemsPerMinute(int speed) {
        if(speed <= 4){
            double successRate = 1.00;
            return (int) (carsPerMinute * speed * successRate);
        }
        else if(speed >= 5 && speed <= 8){
            double successRate = 0.90;
            return (int) (carsPerMinute * speed * successRate);
        }
        else if(speed == 9){
            double successRate = 0.80;
            return (int) (carsPerMinute * speed * successRate);
        }
        else{
            double successRate = 0.77;
            return (int) (carsPerMinute * speed * successRate);
        }
    }
}