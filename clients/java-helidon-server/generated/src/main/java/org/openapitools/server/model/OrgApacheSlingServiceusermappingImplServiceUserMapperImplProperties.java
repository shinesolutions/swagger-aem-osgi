package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties   {

    private ConfigNodePropertyArray userMapping;
    private ConfigNodePropertyString userDefault;
    private ConfigNodePropertyBoolean userEnableDefaultMapping;
    private ConfigNodePropertyBoolean requireValidation;

    /**
     * Default constructor.
     */
    public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.
     *
     * @param userMapping userMapping
     * @param userDefault userDefault
     * @param userEnableDefaultMapping userEnableDefaultMapping
     * @param requireValidation requireValidation
     */
    public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties(
        ConfigNodePropertyArray userMapping, 
        ConfigNodePropertyString userDefault, 
        ConfigNodePropertyBoolean userEnableDefaultMapping, 
        ConfigNodePropertyBoolean requireValidation
    ) {
        this.userMapping = userMapping;
        this.userDefault = userDefault;
        this.userEnableDefaultMapping = userEnableDefaultMapping;
        this.requireValidation = requireValidation;
    }



    /**
     * Get userMapping
     * @return userMapping
     */
    public ConfigNodePropertyArray getUserMapping() {
        return userMapping;
    }

    public void setUserMapping(ConfigNodePropertyArray userMapping) {
        this.userMapping = userMapping;
    }

    /**
     * Get userDefault
     * @return userDefault
     */
    public ConfigNodePropertyString getUserDefault() {
        return userDefault;
    }

    public void setUserDefault(ConfigNodePropertyString userDefault) {
        this.userDefault = userDefault;
    }

    /**
     * Get userEnableDefaultMapping
     * @return userEnableDefaultMapping
     */
    public ConfigNodePropertyBoolean getUserEnableDefaultMapping() {
        return userEnableDefaultMapping;
    }

    public void setUserEnableDefaultMapping(ConfigNodePropertyBoolean userEnableDefaultMapping) {
        this.userEnableDefaultMapping = userEnableDefaultMapping;
    }

    /**
     * Get requireValidation
     * @return requireValidation
     */
    public ConfigNodePropertyBoolean getRequireValidation() {
        return requireValidation;
    }

    public void setRequireValidation(ConfigNodePropertyBoolean requireValidation) {
        this.requireValidation = requireValidation;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties {\n");
        
        sb.append("    userMapping: ").append(toIndentedString(userMapping)).append("\n");
        sb.append("    userDefault: ").append(toIndentedString(userDefault)).append("\n");
        sb.append("    userEnableDefaultMapping: ").append(toIndentedString(userEnableDefaultMapping)).append("\n");
        sb.append("    requireValidation: ").append(toIndentedString(requireValidation)).append("\n");
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

