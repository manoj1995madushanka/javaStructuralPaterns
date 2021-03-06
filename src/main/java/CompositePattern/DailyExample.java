package CompositePattern;

import java.util.HashMap;
import java.util.Map;

public class DailyExample {
    public void dailyComposite(){
        Map<String,String> personAttributes = new HashMap<String, String>();
        personAttributes.put("site_role","person");
        personAttributes.put("access_role","limited");

        Map<String,String> groupAttributes = new HashMap<String, String>();
        groupAttributes.put("group_role","claims");

        Map<String,String> secAttributes = new HashMap<String, String>();
        secAttributes.putAll(personAttributes);
        secAttributes.putAll(groupAttributes);

        System.out.println(secAttributes);
    }
}
