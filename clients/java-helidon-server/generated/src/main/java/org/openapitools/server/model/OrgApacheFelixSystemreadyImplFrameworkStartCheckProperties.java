package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties   {

    private ConfigNodePropertyInteger timeout;
    private ConfigNodePropertyInteger targetStartLevel;
    private ConfigNodePropertyString targetStartLevelPropName;
    private ConfigNodePropertyDropDown type;

    /**
     * Default constructor.
     */
    public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.
     *
     * @param timeout timeout
     * @param targetStartLevel targetStartLevel
     * @param targetStartLevelPropName targetStartLevelPropName
     * @param type type
     */
    public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties(
        ConfigNodePropertyInteger timeout, 
        ConfigNodePropertyInteger targetStartLevel, 
        ConfigNodePropertyString targetStartLevelPropName, 
        ConfigNodePropertyDropDown type
    ) {
        this.timeout = timeout;
        this.targetStartLevel = targetStartLevel;
        this.targetStartLevelPropName = targetStartLevelPropName;
        this.type = type;
    }



    /**
     * Get timeout
     * @return timeout
     */
    public ConfigNodePropertyInteger getTimeout() {
        return timeout;
    }

    public void setTimeout(ConfigNodePropertyInteger timeout) {
        this.timeout = timeout;
    }

    /**
     * Get targetStartLevel
     * @return targetStartLevel
     */
    public ConfigNodePropertyInteger getTargetStartLevel() {
        return targetStartLevel;
    }

    public void setTargetStartLevel(ConfigNodePropertyInteger targetStartLevel) {
        this.targetStartLevel = targetStartLevel;
    }

    /**
     * Get targetStartLevelPropName
     * @return targetStartLevelPropName
     */
    public ConfigNodePropertyString getTargetStartLevelPropName() {
        return targetStartLevelPropName;
    }

    public void setTargetStartLevelPropName(ConfigNodePropertyString targetStartLevelPropName) {
        this.targetStartLevelPropName = targetStartLevelPropName;
    }

    /**
     * Get type
     * @return type
     */
    public ConfigNodePropertyDropDown getType() {
        return type;
    }

    public void setType(ConfigNodePropertyDropDown type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties {\n");
        
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    targetStartLevel: ").append(toIndentedString(targetStartLevel)).append("\n");
        sb.append("    targetStartLevelPropName: ").append(toIndentedString(targetStartLevelPropName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

