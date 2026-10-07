package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties   {

    private ConfigNodePropertyDropDown dimDefaultMode;
    private ConfigNodePropertyBoolean dimAppcacheEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.
     *
     * @param dimDefaultMode dimDefaultMode
     * @param dimAppcacheEnabled dimAppcacheEnabled
     */
    public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties(
        ConfigNodePropertyDropDown dimDefaultMode, 
        ConfigNodePropertyBoolean dimAppcacheEnabled
    ) {
        this.dimDefaultMode = dimDefaultMode;
        this.dimAppcacheEnabled = dimAppcacheEnabled;
    }



    /**
     * Get dimDefaultMode
     * @return dimDefaultMode
     */
    public ConfigNodePropertyDropDown getDimDefaultMode() {
        return dimDefaultMode;
    }

    public void setDimDefaultMode(ConfigNodePropertyDropDown dimDefaultMode) {
        this.dimDefaultMode = dimDefaultMode;
    }

    /**
     * Get dimAppcacheEnabled
     * @return dimAppcacheEnabled
     */
    public ConfigNodePropertyBoolean getDimAppcacheEnabled() {
        return dimAppcacheEnabled;
    }

    public void setDimAppcacheEnabled(ConfigNodePropertyBoolean dimAppcacheEnabled) {
        this.dimAppcacheEnabled = dimAppcacheEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties {\n");
        
        sb.append("    dimDefaultMode: ").append(toIndentedString(dimDefaultMode)).append("\n");
        sb.append("    dimAppcacheEnabled: ").append(toIndentedString(dimAppcacheEnabled)).append("\n");
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

