public class Awards {
    private String awardName;
    private String location;

    public Awards(String awardName, String location) {
        this.awardName = awardName;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }
    public static Awards[] awards(){
        Awards[] award = new Awards[3];
        award[0]=new Awards("Water","River");
        award[1]=new Awards("Food","Cave");
        award[2]=new Awards("Firewood","Forest");
        return award;
    }
}
