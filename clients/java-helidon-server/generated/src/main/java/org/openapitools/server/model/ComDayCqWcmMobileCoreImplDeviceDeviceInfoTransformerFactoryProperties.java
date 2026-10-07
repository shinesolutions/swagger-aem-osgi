package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties   {

    private ConfigNodePropertyBoolean deviceInfoTransformerEnabled;
    private ConfigNodePropertyString deviceInfoTransformerCssStyle;

    /**
     * Default constructor.
     */
    public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.
     *
     * @param deviceInfoTransformerEnabled deviceInfoTransformerEnabled
     * @param deviceInfoTransformerCssStyle deviceInfoTransformerCssStyle
     */
    public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties(
        ConfigNodePropertyBoolean deviceInfoTransformerEnabled, 
        ConfigNodePropertyString deviceInfoTransformerCssStyle
    ) {
        this.deviceInfoTransformerEnabled = deviceInfoTransformerEnabled;
        this.deviceInfoTransformerCssStyle = deviceInfoTransformerCssStyle;
    }



    /**
     * Get deviceInfoTransformerEnabled
     * @return deviceInfoTransformerEnabled
     */
    public ConfigNodePropertyBoolean getDeviceInfoTransformerEnabled() {
        return deviceInfoTransformerEnabled;
    }

    public void setDeviceInfoTransformerEnabled(ConfigNodePropertyBoolean deviceInfoTransformerEnabled) {
        this.deviceInfoTransformerEnabled = deviceInfoTransformerEnabled;
    }

    /**
     * Get deviceInfoTransformerCssStyle
     * @return deviceInfoTransformerCssStyle
     */
    public ConfigNodePropertyString getDeviceInfoTransformerCssStyle() {
        return deviceInfoTransformerCssStyle;
    }

    public void setDeviceInfoTransformerCssStyle(ConfigNodePropertyString deviceInfoTransformerCssStyle) {
        this.deviceInfoTransformerCssStyle = deviceInfoTransformerCssStyle;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties {\n");
        
        sb.append("    deviceInfoTransformerEnabled: ").append(toIndentedString(deviceInfoTransformerEnabled)).append("\n");
        sb.append("    deviceInfoTransformerCssStyle: ").append(toIndentedString(deviceInfoTransformerCssStyle)).append("\n");
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

