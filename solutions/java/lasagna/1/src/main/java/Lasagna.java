public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int minutes = 40;
        return minutes;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInOven){
        return expectedMinutesInOven() - minutesInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int layerPreparationTimeInMinutes = 2;
        return layers * layerPreparationTimeInMinutes;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesInOven){
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}
