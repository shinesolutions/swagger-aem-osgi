package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties   {

    private ConfigNodePropertyArray allowedPaths;
    private ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize;

    /**
     * Default constructor.
     */
    public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.
     *
     * @param allowedPaths allowedPaths
     * @param cqAnalyticsSaintExporterPagesize cqAnalyticsSaintExporterPagesize
     */
    public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties(
        ConfigNodePropertyArray allowedPaths, 
        ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize
    ) {
        this.allowedPaths = allowedPaths;
        this.cqAnalyticsSaintExporterPagesize = cqAnalyticsSaintExporterPagesize;
    }



    /**
     * Get allowedPaths
     * @return allowedPaths
     */
    public ConfigNodePropertyArray getAllowedPaths() {
        return allowedPaths;
    }

    public void setAllowedPaths(ConfigNodePropertyArray allowedPaths) {
        this.allowedPaths = allowedPaths;
    }

    /**
     * Get cqAnalyticsSaintExporterPagesize
     * @return cqAnalyticsSaintExporterPagesize
     */
    public ConfigNodePropertyInteger getCqAnalyticsSaintExporterPagesize() {
        return cqAnalyticsSaintExporterPagesize;
    }

    public void setCqAnalyticsSaintExporterPagesize(ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize) {
        this.cqAnalyticsSaintExporterPagesize = cqAnalyticsSaintExporterPagesize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties {\n");
        
        sb.append("    allowedPaths: ").append(toIndentedString(allowedPaths)).append("\n");
        sb.append("    cqAnalyticsSaintExporterPagesize: ").append(toIndentedString(cqAnalyticsSaintExporterPagesize)).append("\n");
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

