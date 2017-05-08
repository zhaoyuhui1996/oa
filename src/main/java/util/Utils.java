package util;

import java.util.Collection;
import java.util.Map;

/**
 * Created by 研发三科 王永梅 on 2015/8/11.
 */
public class Utils {
    public static boolean isNullOrEmpty(Object obj) {
        if (obj == null) {
            return true;
        }

        if (obj instanceof String) {
            return "".equals(((String) obj).trim());
        }
        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length() == 0;

        }
        if (obj instanceof Collection)
            return ((Collection) obj).isEmpty();

        if (obj instanceof Map)
            return ((Map) obj).isEmpty();

        if (obj instanceof Object[]) {
            Object[] object = (Object[]) obj;
            if (object.length == 0) {
                return true;
            }
            boolean empty = true;
            for (int i = 0; i < object.length; i++) {
                if (!isNullOrEmpty(object[i])) {
                    empty = false;
                    break;
                }
            }
            return empty;
        }
        return false;
    }
    
    public static boolean isNullOrNonPos(Object obj) {
    	if (obj == null) {
            return true;
        }
    	if (obj instanceof Integer) {
            return ((Integer) obj <= 0);
        }
    	if (obj instanceof Long) {
            return ((Long) obj <= 0);
        }
    	if (obj instanceof Short) {
            return ((Short) obj <= 0);
        }
    	if (obj instanceof Double) {
            return ((Double) obj <= 0);
        }
    	if (obj instanceof Float) {
            return ((Float) obj <= 0);
        }
    	
    	return false;
    }
}
