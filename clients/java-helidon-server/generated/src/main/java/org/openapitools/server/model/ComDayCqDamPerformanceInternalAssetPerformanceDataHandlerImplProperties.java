package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties   {

    private ConfigNodePropertyInteger batchCommitSize;

    /**
     * Default constructor.
     */
    public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.
     *
     * @param batchCommitSize batchCommitSize
     */
    public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties(
        ConfigNodePropertyInteger batchCommitSize
    ) {
        this.batchCommitSize = batchCommitSize;
    }



    /**
     * Get batchCommitSize
     * @return batchCommitSize
     */
    public ConfigNodePropertyInteger getBatchCommitSize() {
        return batchCommitSize;
    }

    public void setBatchCommitSize(ConfigNodePropertyInteger batchCommitSize) {
        this.batchCommitSize = batchCommitSize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties {\n");
        
        sb.append("    batchCommitSize: ").append(toIndentedString(batchCommitSize)).append("\n");
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

