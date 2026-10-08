package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialNotificationsImplNotificationsRouterProperties   {

    private ConfigNodePropertyString eventTopics;
    private ConfigNodePropertyString eventFilter;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialNotificationsImplNotificationsRouterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialNotificationsImplNotificationsRouterProperties.
     *
     * @param eventTopics eventTopics
     * @param eventFilter eventFilter
     */
    public ComAdobeCqSocialNotificationsImplNotificationsRouterProperties(
        ConfigNodePropertyString eventTopics, 
        ConfigNodePropertyString eventFilter
    ) {
        this.eventTopics = eventTopics;
        this.eventFilter = eventFilter;
    }



    /**
     * Get eventTopics
     * @return eventTopics
     */
    public ConfigNodePropertyString getEventTopics() {
        return eventTopics;
    }

    public void setEventTopics(ConfigNodePropertyString eventTopics) {
        this.eventTopics = eventTopics;
    }

    /**
     * Get eventFilter
     * @return eventFilter
     */
    public ConfigNodePropertyString getEventFilter() {
        return eventFilter;
    }

    public void setEventFilter(ConfigNodePropertyString eventFilter) {
        this.eventFilter = eventFilter;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialNotificationsImplNotificationsRouterProperties {\n");
        
        sb.append("    eventTopics: ").append(toIndentedString(eventTopics)).append("\n");
        sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
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

