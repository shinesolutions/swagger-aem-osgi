package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplReportsReportExportServiceProperties   {

    private ConfigNodePropertyInteger queryBatchSize;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplReportsReportExportServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplReportsReportExportServiceProperties.
     *
     * @param queryBatchSize queryBatchSize
     */
    public ComDayCqDamCoreImplReportsReportExportServiceProperties(
        ConfigNodePropertyInteger queryBatchSize
    ) {
        this.queryBatchSize = queryBatchSize;
    }



    /**
     * Get queryBatchSize
     * @return queryBatchSize
     */
    public ConfigNodePropertyInteger getQueryBatchSize() {
        return queryBatchSize;
    }

    public void setQueryBatchSize(ConfigNodePropertyInteger queryBatchSize) {
        this.queryBatchSize = queryBatchSize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplReportsReportExportServiceProperties {\n");
        
        sb.append("    queryBatchSize: ").append(toIndentedString(queryBatchSize)).append("\n");
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

