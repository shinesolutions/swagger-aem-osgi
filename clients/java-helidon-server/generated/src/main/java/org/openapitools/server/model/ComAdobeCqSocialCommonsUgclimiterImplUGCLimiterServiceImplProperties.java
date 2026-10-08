package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties   {

    private ConfigNodePropertyString eventTopics;
    private ConfigNodePropertyString eventFilter;
    private ConfigNodePropertyArray verbs;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.
     *
     * @param eventTopics eventTopics
     * @param eventFilter eventFilter
     * @param verbs verbs
     */
    public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties(
        ConfigNodePropertyString eventTopics, 
        ConfigNodePropertyString eventFilter, 
        ConfigNodePropertyArray verbs
    ) {
        this.eventTopics = eventTopics;
        this.eventFilter = eventFilter;
        this.verbs = verbs;
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
     * Get verbs
     * @return verbs
     */
    public ConfigNodePropertyArray getVerbs() {
        return verbs;
    }

    public void setVerbs(ConfigNodePropertyArray verbs) {
        this.verbs = verbs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties {\n");
        
        sb.append("    eventTopics: ").append(toIndentedString(eventTopics)).append("\n");
        sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
        sb.append("    verbs: ").append(toIndentedString(verbs)).append("\n");
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

