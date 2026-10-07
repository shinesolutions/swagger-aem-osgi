package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties   {

    private ConfigNodePropertyArray upgradeTaskIgnoreList;

    /**
     * Default constructor.
     */
    public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.
     *
     * @param upgradeTaskIgnoreList upgradeTaskIgnoreList
     */
    public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties(
        ConfigNodePropertyArray upgradeTaskIgnoreList
    ) {
        this.upgradeTaskIgnoreList = upgradeTaskIgnoreList;
    }



    /**
     * Get upgradeTaskIgnoreList
     * @return upgradeTaskIgnoreList
     */
    public ConfigNodePropertyArray getUpgradeTaskIgnoreList() {
        return upgradeTaskIgnoreList;
    }

    public void setUpgradeTaskIgnoreList(ConfigNodePropertyArray upgradeTaskIgnoreList) {
        this.upgradeTaskIgnoreList = upgradeTaskIgnoreList;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties {\n");
        
        sb.append("    upgradeTaskIgnoreList: ").append(toIndentedString(upgradeTaskIgnoreList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

