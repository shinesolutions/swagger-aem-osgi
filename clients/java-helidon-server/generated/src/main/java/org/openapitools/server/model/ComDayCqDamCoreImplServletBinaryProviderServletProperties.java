package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletBinaryProviderServletProperties   {

    private ConfigNodePropertyArray slingServletResourceTypes;
    private ConfigNodePropertyArray slingServletMethods;
    private ConfigNodePropertyBoolean cqDamDrmEnable;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletBinaryProviderServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletBinaryProviderServletProperties.
     *
     * @param slingServletResourceTypes slingServletResourceTypes
     * @param slingServletMethods slingServletMethods
     * @param cqDamDrmEnable cqDamDrmEnable
     */
    public ComDayCqDamCoreImplServletBinaryProviderServletProperties(
        ConfigNodePropertyArray slingServletResourceTypes, 
        ConfigNodePropertyArray slingServletMethods, 
        ConfigNodePropertyBoolean cqDamDrmEnable
    ) {
        this.slingServletResourceTypes = slingServletResourceTypes;
        this.slingServletMethods = slingServletMethods;
        this.cqDamDrmEnable = cqDamDrmEnable;
    }



    /**
     * Get slingServletResourceTypes
     * @return slingServletResourceTypes
     */
    public ConfigNodePropertyArray getSlingServletResourceTypes() {
        return slingServletResourceTypes;
    }

    public void setSlingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
        this.slingServletResourceTypes = slingServletResourceTypes;
    }

    /**
     * Get slingServletMethods
     * @return slingServletMethods
     */
    public ConfigNodePropertyArray getSlingServletMethods() {
        return slingServletMethods;
    }

    public void setSlingServletMethods(ConfigNodePropertyArray slingServletMethods) {
        this.slingServletMethods = slingServletMethods;
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
        sb.append("class ComDayCqDamCoreImplServletBinaryProviderServletProperties {\n");
        
        sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
        sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
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

