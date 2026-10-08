package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletCollectionsServletProperties   {

    private ConfigNodePropertyArray cqDamBatchCollectionsProperties;
    private ConfigNodePropertyInteger cqDamBatchCollectionsLimit;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletCollectionsServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletCollectionsServletProperties.
     *
     * @param cqDamBatchCollectionsProperties cqDamBatchCollectionsProperties
     * @param cqDamBatchCollectionsLimit cqDamBatchCollectionsLimit
     */
    public ComDayCqDamCoreImplServletCollectionsServletProperties(
        ConfigNodePropertyArray cqDamBatchCollectionsProperties, 
        ConfigNodePropertyInteger cqDamBatchCollectionsLimit
    ) {
        this.cqDamBatchCollectionsProperties = cqDamBatchCollectionsProperties;
        this.cqDamBatchCollectionsLimit = cqDamBatchCollectionsLimit;
    }



    /**
     * Get cqDamBatchCollectionsProperties
     * @return cqDamBatchCollectionsProperties
     */
    public ConfigNodePropertyArray getCqDamBatchCollectionsProperties() {
        return cqDamBatchCollectionsProperties;
    }

    public void setCqDamBatchCollectionsProperties(ConfigNodePropertyArray cqDamBatchCollectionsProperties) {
        this.cqDamBatchCollectionsProperties = cqDamBatchCollectionsProperties;
    }

    /**
     * Get cqDamBatchCollectionsLimit
     * @return cqDamBatchCollectionsLimit
     */
    public ConfigNodePropertyInteger getCqDamBatchCollectionsLimit() {
        return cqDamBatchCollectionsLimit;
    }

    public void setCqDamBatchCollectionsLimit(ConfigNodePropertyInteger cqDamBatchCollectionsLimit) {
        this.cqDamBatchCollectionsLimit = cqDamBatchCollectionsLimit;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplServletCollectionsServletProperties {\n");
        
        sb.append("    cqDamBatchCollectionsProperties: ").append(toIndentedString(cqDamBatchCollectionsProperties)).append("\n");
        sb.append("    cqDamBatchCollectionsLimit: ").append(toIndentedString(cqDamBatchCollectionsLimit)).append("\n");
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

