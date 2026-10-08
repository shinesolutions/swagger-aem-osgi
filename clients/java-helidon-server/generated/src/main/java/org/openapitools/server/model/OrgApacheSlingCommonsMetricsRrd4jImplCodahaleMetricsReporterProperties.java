package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties   {

    private ConfigNodePropertyArray datasources;
    private ConfigNodePropertyInteger step;
    private ConfigNodePropertyArray archives;
    private ConfigNodePropertyString path;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.
     *
     * @param datasources datasources
     * @param step step
     * @param archives archives
     * @param path path
     */
    public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties(
        ConfigNodePropertyArray datasources, 
        ConfigNodePropertyInteger step, 
        ConfigNodePropertyArray archives, 
        ConfigNodePropertyString path
    ) {
        this.datasources = datasources;
        this.step = step;
        this.archives = archives;
        this.path = path;
    }



    /**
     * Get datasources
     * @return datasources
     */
    public ConfigNodePropertyArray getDatasources() {
        return datasources;
    }

    public void setDatasources(ConfigNodePropertyArray datasources) {
        this.datasources = datasources;
    }

    /**
     * Get step
     * @return step
     */
    public ConfigNodePropertyInteger getStep() {
        return step;
    }

    public void setStep(ConfigNodePropertyInteger step) {
        this.step = step;
    }

    /**
     * Get archives
     * @return archives
     */
    public ConfigNodePropertyArray getArchives() {
        return archives;
    }

    public void setArchives(ConfigNodePropertyArray archives) {
        this.archives = archives;
    }

    /**
     * Get path
     * @return path
     */
    public ConfigNodePropertyString getPath() {
        return path;
    }

    public void setPath(ConfigNodePropertyString path) {
        this.path = path;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties {\n");
        
        sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    archives: ").append(toIndentedString(archives)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

