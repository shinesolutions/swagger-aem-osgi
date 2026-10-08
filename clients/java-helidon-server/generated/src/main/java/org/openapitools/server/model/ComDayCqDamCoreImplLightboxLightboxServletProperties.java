package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplLightboxLightboxServletProperties   {

    private ConfigNodePropertyString slingServletPaths;
    private ConfigNodePropertyArray slingServletMethods;
    private ConfigNodePropertyBoolean cqDamEnableAnonymous;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplLightboxLightboxServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplLightboxLightboxServletProperties.
     *
     * @param slingServletPaths slingServletPaths
     * @param slingServletMethods slingServletMethods
     * @param cqDamEnableAnonymous cqDamEnableAnonymous
     */
    public ComDayCqDamCoreImplLightboxLightboxServletProperties(
        ConfigNodePropertyString slingServletPaths, 
        ConfigNodePropertyArray slingServletMethods, 
        ConfigNodePropertyBoolean cqDamEnableAnonymous
    ) {
        this.slingServletPaths = slingServletPaths;
        this.slingServletMethods = slingServletMethods;
        this.cqDamEnableAnonymous = cqDamEnableAnonymous;
    }



    /**
     * Get slingServletPaths
     * @return slingServletPaths
     */
    public ConfigNodePropertyString getSlingServletPaths() {
        return slingServletPaths;
    }

    public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
        this.slingServletPaths = slingServletPaths;
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
     * Get cqDamEnableAnonymous
     * @return cqDamEnableAnonymous
     */
    public ConfigNodePropertyBoolean getCqDamEnableAnonymous() {
        return cqDamEnableAnonymous;
    }

    public void setCqDamEnableAnonymous(ConfigNodePropertyBoolean cqDamEnableAnonymous) {
        this.cqDamEnableAnonymous = cqDamEnableAnonymous;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplLightboxLightboxServletProperties {\n");
        
        sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
        sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
        sb.append("    cqDamEnableAnonymous: ").append(toIndentedString(cqDamEnableAnonymous)).append("\n");
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

