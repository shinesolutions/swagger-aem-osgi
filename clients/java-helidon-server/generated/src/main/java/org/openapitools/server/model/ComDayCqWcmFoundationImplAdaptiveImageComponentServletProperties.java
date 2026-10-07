package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties   {

    private ConfigNodePropertyArray adaptSupportedWidths;

    /**
     * Default constructor.
     */
    public ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.
     *
     * @param adaptSupportedWidths adaptSupportedWidths
     */
    public ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties(
        ConfigNodePropertyArray adaptSupportedWidths
    ) {
        this.adaptSupportedWidths = adaptSupportedWidths;
    }



    /**
     * Get adaptSupportedWidths
     * @return adaptSupportedWidths
     */
    public ConfigNodePropertyArray getAdaptSupportedWidths() {
        return adaptSupportedWidths;
    }

    public void setAdaptSupportedWidths(ConfigNodePropertyArray adaptSupportedWidths) {
        this.adaptSupportedWidths = adaptSupportedWidths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties {\n");
        
        sb.append("    adaptSupportedWidths: ").append(toIndentedString(adaptSupportedWidths)).append("\n");
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

