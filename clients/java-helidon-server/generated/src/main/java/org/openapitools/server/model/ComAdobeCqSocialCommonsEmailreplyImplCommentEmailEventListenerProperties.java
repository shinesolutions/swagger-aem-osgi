package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties   {

    private ConfigNodePropertyString eventTopics;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties.
     *
     * @param eventTopics eventTopics
     */
    public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties(
        ConfigNodePropertyString eventTopics
    ) {
        this.eventTopics = eventTopics;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties {\n");
        
        sb.append("    eventTopics: ").append(toIndentedString(eventTopics)).append("\n");
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

