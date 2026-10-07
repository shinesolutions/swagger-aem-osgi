package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties   {

    private ConfigNodePropertyString slingName;
    private ConfigNodePropertyString slingDescription;

    /**
     * Default constructor.
     */
    public OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.
     *
     * @param slingName slingName
     * @param slingDescription slingDescription
     */
    public OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties(
        ConfigNodePropertyString slingName, 
        ConfigNodePropertyString slingDescription
    ) {
        this.slingName = slingName;
        this.slingDescription = slingDescription;
    }



    /**
     * Get slingName
     * @return slingName
     */
    public ConfigNodePropertyString getSlingName() {
        return slingName;
    }

    public void setSlingName(ConfigNodePropertyString slingName) {
        this.slingName = slingName;
    }

    /**
     * Get slingDescription
     * @return slingDescription
     */
    public ConfigNodePropertyString getSlingDescription() {
        return slingDescription;
    }

    public void setSlingDescription(ConfigNodePropertyString slingDescription) {
        this.slingDescription = slingDescription;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {\n");
        
        sb.append("    slingName: ").append(toIndentedString(slingName)).append("\n");
        sb.append("    slingDescription: ").append(toIndentedString(slingDescription)).append("\n");
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

