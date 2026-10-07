package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties   {

    private ConfigNodePropertyBoolean cqDamDrmEnable;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.
     *
     * @param cqDamDrmEnable cqDamDrmEnable
     */
    public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties(
        ConfigNodePropertyBoolean cqDamDrmEnable
    ) {
        this.cqDamDrmEnable = cqDamDrmEnable;
    }



    /**
     * Get cqDamDrmEnable
     * @return cqDamDrmEnable
     */
    public ConfigNodePropertyBoolean getCqDamDrmEnable() {
        return cqDamDrmEnable;
    }

    public void setCqDamDrmEnable(ConfigNodePropertyBoolean cqDamDrmEnable) {
        this.cqDamDrmEnable = cqDamDrmEnable;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties {\n");
        
        sb.append("    cqDamDrmEnable: ").append(toIndentedString(cqDamDrmEnable)).append("\n");
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

