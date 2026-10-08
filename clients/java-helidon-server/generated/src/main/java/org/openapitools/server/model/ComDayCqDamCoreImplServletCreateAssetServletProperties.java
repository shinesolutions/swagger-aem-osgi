package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletCreateAssetServletProperties   {

    private ConfigNodePropertyBoolean detectDuplicate;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletCreateAssetServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletCreateAssetServletProperties.
     *
     * @param detectDuplicate detectDuplicate
     */
    public ComDayCqDamCoreImplServletCreateAssetServletProperties(
        ConfigNodePropertyBoolean detectDuplicate
    ) {
        this.detectDuplicate = detectDuplicate;
    }



    /**
     * Get detectDuplicate
     * @return detectDuplicate
     */
    public ConfigNodePropertyBoolean getDetectDuplicate() {
        return detectDuplicate;
    }

    public void setDetectDuplicate(ConfigNodePropertyBoolean detectDuplicate) {
        this.detectDuplicate = detectDuplicate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplServletCreateAssetServletProperties {\n");
        
        sb.append("    detectDuplicate: ").append(toIndentedString(detectDuplicate)).append("\n");
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

