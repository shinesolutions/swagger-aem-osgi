package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties   {

    private ConfigNodePropertyArray preUpgradeMaintenanceTasks;
    private ConfigNodePropertyArray preUpgradeHcTags;

    /**
     * Default constructor.
     */
    public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.
     *
     * @param preUpgradeMaintenanceTasks preUpgradeMaintenanceTasks
     * @param preUpgradeHcTags preUpgradeHcTags
     */
    public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties(
        ConfigNodePropertyArray preUpgradeMaintenanceTasks, 
        ConfigNodePropertyArray preUpgradeHcTags
    ) {
        this.preUpgradeMaintenanceTasks = preUpgradeMaintenanceTasks;
        this.preUpgradeHcTags = preUpgradeHcTags;
    }



    /**
     * Get preUpgradeMaintenanceTasks
     * @return preUpgradeMaintenanceTasks
     */
    public ConfigNodePropertyArray getPreUpgradeMaintenanceTasks() {
        return preUpgradeMaintenanceTasks;
    }

    public void setPreUpgradeMaintenanceTasks(ConfigNodePropertyArray preUpgradeMaintenanceTasks) {
        this.preUpgradeMaintenanceTasks = preUpgradeMaintenanceTasks;
    }

    /**
     * Get preUpgradeHcTags
     * @return preUpgradeHcTags
     */
    public ConfigNodePropertyArray getPreUpgradeHcTags() {
        return preUpgradeHcTags;
    }

    public void setPreUpgradeHcTags(ConfigNodePropertyArray preUpgradeHcTags) {
        this.preUpgradeHcTags = preUpgradeHcTags;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties {\n");
        
        sb.append("    preUpgradeMaintenanceTasks: ").append(toIndentedString(preUpgradeMaintenanceTasks)).append("\n");
        sb.append("    preUpgradeHcTags: ").append(toIndentedString(preUpgradeHcTags)).append("\n");
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

