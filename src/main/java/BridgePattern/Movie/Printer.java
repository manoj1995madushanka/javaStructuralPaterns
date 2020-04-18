package BridgePattern.Movie;

import java.util.List;

//make interface
// after this class
public abstract class Printer {
    public  String print(Formatter formatter){
        return  formatter.format(getHeader(),getDetails());
    }

    protected abstract String getHeader();

    protected abstract List<Detail> getDetails();

}
