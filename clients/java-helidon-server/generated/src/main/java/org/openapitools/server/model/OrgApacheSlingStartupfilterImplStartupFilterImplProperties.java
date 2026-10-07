package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingStartupfilterImplStartupFilterImplProperties   {

    private ConfigNodePropertyBoolean activeByDefault;
    private ConfigNodePropertyString defaultMessage;

    /**
     * Default constructor.
     */
    public OrgApacheSlingStartupfilterImplStartupFilterImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingStartupfilterImplStartupFilterImplProperties.
     *
     * @param activeByDefault activeByDefault
     * @param defaultMessage defaultMessage
     */
    public OrgApacheSlingStartupfilterImplStartupFilterImplProperties(
        ConfigNodePropertyBoolean activeByDefault, 
        ConfigNodePropertyString defaultMessage
    ) {
        this.activeByDefault = activeByDefault;
        this.defaultMessage = defaultMessage;
    }



    /**
     * Get activeByDefault
     * @return activeByDefault
     */
    public ConfigNodePropertyBoolean getActiveByDefault() {
        return activeByDefault;
    }

    public void setActiveByDefault(ConfigNodePropertyBoolean activeByDefault) {
        this.activeByDefault = activeByDefault;
    }

    /**
     * Get defaultMessage
     * @return defaultMessage
     */
    public ConfigNodePropertyString getDefaultMessage() {
        return defaultMessage;
    }

    public void setDefaultMessage(ConfigNodePropertyString defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingStartupfilterImplStartupFilterImplProperties {\n");
        
        sb.append("    activeByDefault: ").append(toIndentedString(activeByDefault)).append("\n");
        sb.append("    defaultMessage: ").append(toIndentedString(defaultMessage)).append("\n");
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

