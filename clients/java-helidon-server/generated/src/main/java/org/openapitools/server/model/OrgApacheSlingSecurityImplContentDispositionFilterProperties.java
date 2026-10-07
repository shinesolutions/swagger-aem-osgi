package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingSecurityImplContentDispositionFilterProperties   {

    private ConfigNodePropertyArray slingContentDispositionPaths;
    private ConfigNodePropertyArray slingContentDispositionExcludedPaths;
    private ConfigNodePropertyBoolean slingContentDispositionAllPaths;

    /**
     * Default constructor.
     */
    public OrgApacheSlingSecurityImplContentDispositionFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingSecurityImplContentDispositionFilterProperties.
     *
     * @param slingContentDispositionPaths slingContentDispositionPaths
     * @param slingContentDispositionExcludedPaths slingContentDispositionExcludedPaths
     * @param slingContentDispositionAllPaths slingContentDispositionAllPaths
     */
    public OrgApacheSlingSecurityImplContentDispositionFilterProperties(
        ConfigNodePropertyArray slingContentDispositionPaths, 
        ConfigNodePropertyArray slingContentDispositionExcludedPaths, 
        ConfigNodePropertyBoolean slingContentDispositionAllPaths
    ) {
        this.slingContentDispositionPaths = slingContentDispositionPaths;
        this.slingContentDispositionExcludedPaths = slingContentDispositionExcludedPaths;
        this.slingContentDispositionAllPaths = slingContentDispositionAllPaths;
    }



    /**
     * Get slingContentDispositionPaths
     * @return slingContentDispositionPaths
     */
    public ConfigNodePropertyArray getSlingContentDispositionPaths() {
        return slingContentDispositionPaths;
    }

    public void setSlingContentDispositionPaths(ConfigNodePropertyArray slingContentDispositionPaths) {
        this.slingContentDispositionPaths = slingContentDispositionPaths;
    }

    /**
     * Get slingContentDispositionExcludedPaths
     * @return slingContentDispositionExcludedPaths
     */
    public ConfigNodePropertyArray getSlingContentDispositionExcludedPaths() {
        return slingContentDispositionExcludedPaths;
    }

    public void setSlingContentDispositionExcludedPaths(ConfigNodePropertyArray slingContentDispositionExcludedPaths) {
        this.slingContentDispositionExcludedPaths = slingContentDispositionExcludedPaths;
    }

    /**
     * Get slingContentDispositionAllPaths
     * @return slingContentDispositionAllPaths
     */
    public ConfigNodePropertyBoolean getSlingContentDispositionAllPaths() {
        return slingContentDispositionAllPaths;
    }

    public void setSlingContentDispositionAllPaths(ConfigNodePropertyBoolean slingContentDispositionAllPaths) {
        this.slingContentDispositionAllPaths = slingContentDispositionAllPaths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingSecurityImplContentDispositionFilterProperties {\n");
        
        sb.append("    slingContentDispositionPaths: ").append(toIndentedString(slingContentDispositionPaths)).append("\n");
        sb.append("    slingContentDispositionExcludedPaths: ").append(toIndentedString(slingContentDispositionExcludedPaths)).append("\n");
        sb.append("    slingContentDispositionAllPaths: ").append(toIndentedString(slingContentDispositionAllPaths)).append("\n");
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

