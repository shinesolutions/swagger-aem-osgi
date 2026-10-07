package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmDesignimporterDesignPackageImporterProperties   {

    private ConfigNodePropertyArray extractFilter;

    /**
     * Default constructor.
     */
    public ComDayCqWcmDesignimporterDesignPackageImporterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmDesignimporterDesignPackageImporterProperties.
     *
     * @param extractFilter extractFilter
     */
    public ComDayCqWcmDesignimporterDesignPackageImporterProperties(
        ConfigNodePropertyArray extractFilter
    ) {
        this.extractFilter = extractFilter;
    }



    /**
     * Get extractFilter
     * @return extractFilter
     */
    public ConfigNodePropertyArray getExtractFilter() {
        return extractFilter;
    }

    public void setExtractFilter(ConfigNodePropertyArray extractFilter) {
        this.extractFilter = extractFilter;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmDesignimporterDesignPackageImporterProperties {\n");
        
        sb.append("    extractFilter: ").append(toIndentedString(extractFilter)).append("\n");
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

