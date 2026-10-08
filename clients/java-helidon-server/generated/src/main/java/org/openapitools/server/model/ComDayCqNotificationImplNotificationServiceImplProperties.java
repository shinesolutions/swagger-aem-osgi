package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqNotificationImplNotificationServiceImplProperties   {

    private ConfigNodePropertyString eventFilter;

    /**
     * Default constructor.
     */
    public ComDayCqNotificationImplNotificationServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqNotificationImplNotificationServiceImplProperties.
     *
     * @param eventFilter eventFilter
     */
    public ComDayCqNotificationImplNotificationServiceImplProperties(
        ConfigNodePropertyString eventFilter
    ) {
        this.eventFilter = eventFilter;
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
        sb.append("class ComDayCqNotificationImplNotificationServiceImplProperties {\n");
        
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

