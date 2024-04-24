public class CarData {
    String Licence;
    int HourIn;
    int MinutesIn;
    int SecondsIn;
    int MilliSecondsIn;
    int HourOut;
    int MinuteOut;
    int SecondOut;
    int MilliSecondOut;

    public CarData(String Licence, int HourIn, int MinutesIn, int SecondsIn, int MilliSecondsIn, int HourOut, int MinuteOut, int SecondOut, int MilliSecondOut) {
        this.Licence = Licence;
        this.HourIn = HourIn;
        this.MinutesIn = MinutesIn;
        this.SecondsIn = SecondsIn;
        this.MilliSecondsIn = MilliSecondsIn;
        this.HourOut = HourOut;
        this.MinuteOut = MinuteOut;
        this.SecondOut = SecondOut;
        this.MilliSecondOut = MilliSecondOut;
    }

    public String toString() {
        return this.Licence;
    }


}