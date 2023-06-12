package rikkei;
// bao gói trường dữ liệu
public class Animals {
    private  int footCount;
    private String color;
    private String types;
   public class SubAnimals{
        public SubAnimals() {
        }
    }

    public Animals() {
    }

    public Animals(int footCount, String color, String types) {
        this.footCount = footCount;
        this.color = color;
        this.types = types;
    }
    // getter, setter


    public int getFootCount() {
       class  Count {

       }
        return footCount;
    }

    public void setFootCount(int footCount) {
        this.footCount = footCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "Type: "+ types + " | Color : "+ color  + " | foot : "+footCount;
    }
}
