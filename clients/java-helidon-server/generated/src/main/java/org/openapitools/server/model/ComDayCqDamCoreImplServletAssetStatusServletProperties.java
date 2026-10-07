package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletAssetStatusServletProperties   {

    private ConfigNodePropertyInteger cqDamBatchStatusMaxassets;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletAssetStatusServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletAssetStatusServletProperties.
     *
     * @param cqDamBatchStatusMaxassets cqDamBatchStatusMaxassets
     */
    public ComDayCqDamCoreImplServletAssetStatusServletProperties(
        ConfigNodePropertyInteger cqDamBatchStatusMaxassets
    ) {
        this.cqDamBatchStatusMaxassets = cqDamBatchStatusMaxassets;
    }



    /**
     * Get cqDamBatchStatusMaxassets
     * @return cqDamBatchStatusMaxassets
     */
    public ConfigNodePropertyInteger getCqDamBatchStatusMaxassets() {
        return cqDamBatchStatusMaxassets;
    }

    public void setCqDamBatchStatusMaxassets(ConfigNodePropertyInteger cqDamBatchStatusMaxassets) {
        this.cqDamBatchStatusMaxassets = cqDamBatchStatusMaxassets;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplServletAssetStatusServletProperties {\n");
        
        sb.append("    cqDamBatchStatusMaxassets: ").append(toIndentedString(cqDamBatchStatusMaxassets)).append("\n");
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

