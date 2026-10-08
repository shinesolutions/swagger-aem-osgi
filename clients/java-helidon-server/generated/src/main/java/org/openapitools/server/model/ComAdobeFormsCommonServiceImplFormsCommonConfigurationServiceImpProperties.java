package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties   {

    private ConfigNodePropertyDropDown tempStorageConfig;

    /**
     * Default constructor.
     */
    public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.
     *
     * @param tempStorageConfig tempStorageConfig
     */
    public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties(
        ConfigNodePropertyDropDown tempStorageConfig
    ) {
        this.tempStorageConfig = tempStorageConfig;
    }



    /**
     * Get tempStorageConfig
     * @return tempStorageConfig
     */
    public ConfigNodePropertyDropDown getTempStorageConfig() {
        return tempStorageConfig;
    }

    public void setTempStorageConfig(ConfigNodePropertyDropDown tempStorageConfig) {
        this.tempStorageConfig = tempStorageConfig;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties {\n");
        
        sb.append("    tempStorageConfig: ").append(toIndentedString(tempStorageConfig)).append("\n");
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

