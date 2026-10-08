package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqPollingImporterImplPollingImporterImplProperties   {

    private ConfigNodePropertyInteger importerMinInterval;
    private ConfigNodePropertyString importerUser;
    private ConfigNodePropertyArray excludePaths;
    private ConfigNodePropertyArray includePaths;

    /**
     * Default constructor.
     */
    public ComDayCqPollingImporterImplPollingImporterImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqPollingImporterImplPollingImporterImplProperties.
     *
     * @param importerMinInterval importerMinInterval
     * @param importerUser importerUser
     * @param excludePaths excludePaths
     * @param includePaths includePaths
     */
    public ComDayCqPollingImporterImplPollingImporterImplProperties(
        ConfigNodePropertyInteger importerMinInterval, 
        ConfigNodePropertyString importerUser, 
        ConfigNodePropertyArray excludePaths, 
        ConfigNodePropertyArray includePaths
    ) {
        this.importerMinInterval = importerMinInterval;
        this.importerUser = importerUser;
        this.excludePaths = excludePaths;
        this.includePaths = includePaths;
    }



    /**
     * Get importerMinInterval
     * @return importerMinInterval
     */
    public ConfigNodePropertyInteger getImporterMinInterval() {
        return importerMinInterval;
    }

    public void setImporterMinInterval(ConfigNodePropertyInteger importerMinInterval) {
        this.importerMinInterval = importerMinInterval;
    }

    /**
     * Get importerUser
     * @return importerUser
     */
    public ConfigNodePropertyString getImporterUser() {
        return importerUser;
    }

    public void setImporterUser(ConfigNodePropertyString importerUser) {
        this.importerUser = importerUser;
    }

    /**
     * Get excludePaths
     * @return excludePaths
     */
    public ConfigNodePropertyArray getExcludePaths() {
        return excludePaths;
    }

    public void setExcludePaths(ConfigNodePropertyArray excludePaths) {
        this.excludePaths = excludePaths;
    }

    /**
     * Get includePaths
     * @return includePaths
     */
    public ConfigNodePropertyArray getIncludePaths() {
        return includePaths;
    }

    public void setIncludePaths(ConfigNodePropertyArray includePaths) {
        this.includePaths = includePaths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqPollingImporterImplPollingImporterImplProperties {\n");
        
        sb.append("    importerMinInterval: ").append(toIndentedString(importerMinInterval)).append("\n");
        sb.append("    importerUser: ").append(toIndentedString(importerUser)).append("\n");
        sb.append("    excludePaths: ").append(toIndentedString(excludePaths)).append("\n");
        sb.append("    includePaths: ").append(toIndentedString(includePaths)).append("\n");
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

