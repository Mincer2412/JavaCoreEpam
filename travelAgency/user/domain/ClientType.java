package travelAgency.user.domain;

import java.util.*;

public enum ClientType {
    CONSTANT("Constant client"),
    ORDINARY("Usual client"),
    NEW("New client"),
    EMPLOYEE("Travel agency employee"),
    BLACK("Blocked user");

    private static Map<String, ClientType> strNameEnumItemMap;
    private String description;

    static {
        strNameEnumItemMap = new HashMap<>();
        for (ClientType enumItem : ClientType.values()) {
            strNameEnumItemMap.put(enumItem.name(), enumItem);
        }
    }


    ClientType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static boolean isStrBelongsToEnumValues(String enumItemAsStr) {
        return strNameEnumItemMap.containsKey(enumItemAsStr);
    }

    public static ClientType getEnumFromEnumByName(String enumName) {
        return strNameEnumItemMap.get(enumName);
    }

}
