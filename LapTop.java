public class LapTop extends Product implements PhysicalProduct{


    @Override
    public  float  getWeight() {
        float weight= (float) 2.5;   //kg
        return weight;
    }

    @Override
    public String Warranty() {
        String warranty= " 6 month";
        return warranty;
    }

    @Override
    double calcPrice() {

        return price+(getWeight()*(double)1.4);
    }



}
