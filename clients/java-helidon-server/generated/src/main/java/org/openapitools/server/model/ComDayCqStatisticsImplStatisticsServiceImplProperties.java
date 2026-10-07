package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqStatisticsImplStatisticsServiceImplProperties   {

    private ConfigNodePropertyInteger schedulerPeriod;
    private ConfigNodePropertyBoolean schedulerConcurrent;
    private ConfigNodePropertyString path;
    private ConfigNodePropertyString workspace;
    private ConfigNodePropertyString keywordsPath;
    private ConfigNodePropertyBoolean asyncEntries;

    /**
     * Default constructor.
     */
    public ComDayCqStatisticsImplStatisticsServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqStatisticsImplStatisticsServiceImplProperties.
     *
     * @param schedulerPeriod schedulerPeriod
     * @param schedulerConcurrent schedulerConcurrent
     * @param path path
     * @param workspace workspace
     * @param keywordsPath keywordsPath
     * @param asyncEntries asyncEntries
     */
    public ComDayCqStatisticsImplStatisticsServiceImplProperties(
        ConfigNodePropertyInteger schedulerPeriod, 
        ConfigNodePropertyBoolean schedulerConcurrent, 
        ConfigNodePropertyString path, 
        ConfigNodePropertyString workspace, 
        ConfigNodePropertyString keywordsPath, 
        ConfigNodePropertyBoolean asyncEntries
    ) {
        this.schedulerPeriod = schedulerPeriod;
        this.schedulerConcurrent = schedulerConcurrent;
        this.path = path;
        this.workspace = workspace;
        this.keywordsPath = keywordsPath;
        this.asyncEntries = asyncEntries;
    }



    /**
     * Get schedulerPeriod
     * @return schedulerPeriod
     */
    public ConfigNodePropertyInteger getSchedulerPeriod() {
        return schedulerPeriod;
    }

    public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
        this.schedulerPeriod = schedulerPeriod;
    }

    /**
     * Get schedulerConcurrent
     * @return schedulerConcurrent
     */
    public ConfigNodePropertyBoolean getSchedulerConcurrent() {
        return schedulerConcurrent;
    }

    public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
        this.schedulerConcurrent = schedulerConcurrent;
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
     * Get workspace
     * @return workspace
     */
    public ConfigNodePropertyString getWorkspace() {
        return workspace;
    }

    public void setWorkspace(ConfigNodePropertyString workspace) {
        this.workspace = workspace;
    }

    /**
     * Get keywordsPath
     * @return keywordsPath
     */
    public ConfigNodePropertyString getKeywordsPath() {
        return keywordsPath;
    }

    public void setKeywordsPath(ConfigNodePropertyString keywordsPath) {
        this.keywordsPath = keywordsPath;
    }

    /**
     * Get asyncEntries
     * @return asyncEntries
     */
    public ConfigNodePropertyBoolean getAsyncEntries() {
        return asyncEntries;
    }

    public void setAsyncEntries(ConfigNodePropertyBoolean asyncEntries) {
        this.asyncEntries = asyncEntries;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqStatisticsImplStatisticsServiceImplProperties {\n");
        
        sb.append("    schedulerPeriod: ").append(toIndentedString(schedulerPeriod)).append("\n");
        sb.append("    schedulerConcurrent: ").append(toIndentedString(schedulerConcurrent)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    keywordsPath: ").append(toIndentedString(keywordsPath)).append("\n");
        sb.append("    asyncEntries: ").append(toIndentedString(asyncEntries)).append("\n");
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

