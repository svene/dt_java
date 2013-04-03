package ${packagename};

/**
 * Place for shared information among client and server. Typically identifiers for models, attributes and actions.
 */
public class ApplicationConstants {
    public static final String PM_APP = unique("APP");
    public static final String COMMAND_ID = unique("DO");
    public static final String ATT_ATTR_ID = "ATTRID";


    /**
     * Unify the identifier with the class name prefix.
     */
    private static String unique(String key) {
        return ApplicationConstants.class.getName() + "." + key;
    }

}
