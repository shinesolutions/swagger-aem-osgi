package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties   {

    private ConfigNodePropertyArray resourceTypeFilters;
    private ConfigNodePropertyInteger priority;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties.
     *
     * @param resourceTypeFilters resourceTypeFilters
     * @param priority priority
     */
    public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties(
        ConfigNodePropertyArray resourceTypeFilters, 
        ConfigNodePropertyInteger priority
    ) {
        this.resourceTypeFilters = resourceTypeFilters;
        this.priority = priority;
    }



    /**
     * Get resourceTypeFilters
     * @return resourceTypeFilters
     */
    public ConfigNodePropertyArray getResourceTypeFilters() {
        return resourceTypeFilters;
    }

    public void setResourceTypeFilters(ConfigNodePropertyArray resourceTypeFilters) {
        this.resourceTypeFilters = resourceTypeFilters;
    }

    /**
     * Get priority
     * @return priority
     */
    public ConfigNodePropertyInteger getPriority() {
        return priority;
    }

    public void setPriority(ConfigNodePropertyInteger priority) {
        this.priority = priority;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties {\n");
        
        sb.append("    resourceTypeFilters: ").append(toIndentedString(resourceTypeFilters)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

