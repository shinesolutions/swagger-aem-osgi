package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties   {

    private ConfigNodePropertyInteger cqDamBatchIndesignMaxassets;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletAssetXMPSearchServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.
     *
     * @param cqDamBatchIndesignMaxassets cqDamBatchIndesignMaxassets
     */
    public ComDayCqDamCoreImplServletAssetXMPSearchServletProperties(
        ConfigNodePropertyInteger cqDamBatchIndesignMaxassets
    ) {
        this.cqDamBatchIndesignMaxassets = cqDamBatchIndesignMaxassets;
    }



    /**
     * Get cqDamBatchIndesignMaxassets
     * @return cqDamBatchIndesignMaxassets
     */
    public ConfigNodePropertyInteger getCqDamBatchIndesignMaxassets() {
        return cqDamBatchIndesignMaxassets;
    }

    public void setCqDamBatchIndesignMaxassets(ConfigNodePropertyInteger cqDamBatchIndesignMaxassets) {
        this.cqDamBatchIndesignMaxassets = cqDamBatchIndesignMaxassets;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties {\n");
        
        sb.append("    cqDamBatchIndesignMaxassets: ").append(toIndentedString(cqDamBatchIndesignMaxassets)).append("\n");
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

