package BridgePattern.Movie;

import java.util.List;

public class HtmlFormatter implements Formatter {
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>");
        builder.append("<th>");
        builder.append("Classification");
        builder.append("</th>");
        builder.append("<th>");
        builder.append(header);
        builder.append("</th>");

        for (Detail detail:details){
            builder.append("<td><td>");
            builder.append(detail.getLabel());
            builder.append("</td></td>");
            builder.append("<td><td>");
            builder.append(detail.getValue());
            builder.append("</td></td>");
        }
        builder.append("</table>");
        return builder.toString();
    }
}
