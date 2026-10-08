package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreWCMRequestFilterProperties   {

    private ConfigNodePropertyDropDown wcmfilterMode;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreWCMRequestFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreWCMRequestFilterProperties.
     *
     * @param wcmfilterMode wcmfilterMode
     */
    public ComDayCqWcmCoreWCMRequestFilterProperties(
        ConfigNodePropertyDropDown wcmfilterMode
    ) {
        this.wcmfilterMode = wcmfilterMode;
    }



    /**
     * Get wcmfilterMode
     * @return wcmfilterMode
     */
    public ConfigNodePropertyDropDown getWcmfilterMode() {
        return wcmfilterMode;
    }

    public void setWcmfilterMode(ConfigNodePropertyDropDown wcmfilterMode) {
        this.wcmfilterMode = wcmfilterMode;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreWCMRequestFilterProperties {\n");
        
        sb.append("    wcmfilterMode: ").append(toIndentedString(wcmfilterMode)).append("\n");
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

