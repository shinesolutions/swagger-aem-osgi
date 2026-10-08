package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties   {

    private ConfigNodePropertyArray cqMimeTypeBlacklist;
    private ConfigNodePropertyBoolean cqDamEmptyMime;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletDamContentDispositionFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.
     *
     * @param cqMimeTypeBlacklist cqMimeTypeBlacklist
     * @param cqDamEmptyMime cqDamEmptyMime
     */
    public ComDayCqDamCoreImplServletDamContentDispositionFilterProperties(
        ConfigNodePropertyArray cqMimeTypeBlacklist, 
        ConfigNodePropertyBoolean cqDamEmptyMime
    ) {
        this.cqMimeTypeBlacklist = cqMimeTypeBlacklist;
        this.cqDamEmptyMime = cqDamEmptyMime;
    }



    /**
     * Get cqMimeTypeBlacklist
     * @return cqMimeTypeBlacklist
     */
    public ConfigNodePropertyArray getCqMimeTypeBlacklist() {
        return cqMimeTypeBlacklist;
    }

    public void setCqMimeTypeBlacklist(ConfigNodePropertyArray cqMimeTypeBlacklist) {
        this.cqMimeTypeBlacklist = cqMimeTypeBlacklist;
    }

    /**
     * Get cqDamEmptyMime
     * @return cqDamEmptyMime
     */
    public ConfigNodePropertyBoolean getCqDamEmptyMime() {
        return cqDamEmptyMime;
    }

    public void setCqDamEmptyMime(ConfigNodePropertyBoolean cqDamEmptyMime) {
        this.cqDamEmptyMime = cqDamEmptyMime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties {\n");
        
        sb.append("    cqMimeTypeBlacklist: ").append(toIndentedString(cqMimeTypeBlacklist)).append("\n");
        sb.append("    cqDamEmptyMime: ").append(toIndentedString(cqDamEmptyMime)).append("\n");
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

