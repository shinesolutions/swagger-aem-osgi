package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplVersionPurgeTaskProperties   {

    private ConfigNodePropertyArray versionpurgePaths;
    private ConfigNodePropertyBoolean versionpurgeRecursive;
    private ConfigNodePropertyInteger versionpurgeMaxVersions;
    private ConfigNodePropertyInteger versionpurgeMinVersions;
    private ConfigNodePropertyInteger versionpurgeMaxAgeDays;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplVersionPurgeTaskProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplVersionPurgeTaskProperties.
     *
     * @param versionpurgePaths versionpurgePaths
     * @param versionpurgeRecursive versionpurgeRecursive
     * @param versionpurgeMaxVersions versionpurgeMaxVersions
     * @param versionpurgeMinVersions versionpurgeMinVersions
     * @param versionpurgeMaxAgeDays versionpurgeMaxAgeDays
     */
    public ComDayCqWcmCoreImplVersionPurgeTaskProperties(
        ConfigNodePropertyArray versionpurgePaths, 
        ConfigNodePropertyBoolean versionpurgeRecursive, 
        ConfigNodePropertyInteger versionpurgeMaxVersions, 
        ConfigNodePropertyInteger versionpurgeMinVersions, 
        ConfigNodePropertyInteger versionpurgeMaxAgeDays
    ) {
        this.versionpurgePaths = versionpurgePaths;
        this.versionpurgeRecursive = versionpurgeRecursive;
        this.versionpurgeMaxVersions = versionpurgeMaxVersions;
        this.versionpurgeMinVersions = versionpurgeMinVersions;
        this.versionpurgeMaxAgeDays = versionpurgeMaxAgeDays;
    }



    /**
     * Get versionpurgePaths
     * @return versionpurgePaths
     */
    public ConfigNodePropertyArray getVersionpurgePaths() {
        return versionpurgePaths;
    }

    public void setVersionpurgePaths(ConfigNodePropertyArray versionpurgePaths) {
        this.versionpurgePaths = versionpurgePaths;
    }

    /**
     * Get versionpurgeRecursive
     * @return versionpurgeRecursive
     */
    public ConfigNodePropertyBoolean getVersionpurgeRecursive() {
        return versionpurgeRecursive;
    }

    public void setVersionpurgeRecursive(ConfigNodePropertyBoolean versionpurgeRecursive) {
        this.versionpurgeRecursive = versionpurgeRecursive;
    }

    /**
     * Get versionpurgeMaxVersions
     * @return versionpurgeMaxVersions
     */
    public ConfigNodePropertyInteger getVersionpurgeMaxVersions() {
        return versionpurgeMaxVersions;
    }

    public void setVersionpurgeMaxVersions(ConfigNodePropertyInteger versionpurgeMaxVersions) {
        this.versionpurgeMaxVersions = versionpurgeMaxVersions;
    }

    /**
     * Get versionpurgeMinVersions
     * @return versionpurgeMinVersions
     */
    public ConfigNodePropertyInteger getVersionpurgeMinVersions() {
        return versionpurgeMinVersions;
    }

    public void setVersionpurgeMinVersions(ConfigNodePropertyInteger versionpurgeMinVersions) {
        this.versionpurgeMinVersions = versionpurgeMinVersions;
    }

    /**
     * Get versionpurgeMaxAgeDays
     * @return versionpurgeMaxAgeDays
     */
    public ConfigNodePropertyInteger getVersionpurgeMaxAgeDays() {
        return versionpurgeMaxAgeDays;
    }

    public void setVersionpurgeMaxAgeDays(ConfigNodePropertyInteger versionpurgeMaxAgeDays) {
        this.versionpurgeMaxAgeDays = versionpurgeMaxAgeDays;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplVersionPurgeTaskProperties {\n");
        
        sb.append("    versionpurgePaths: ").append(toIndentedString(versionpurgePaths)).append("\n");
        sb.append("    versionpurgeRecursive: ").append(toIndentedString(versionpurgeRecursive)).append("\n");
        sb.append("    versionpurgeMaxVersions: ").append(toIndentedString(versionpurgeMaxVersions)).append("\n");
        sb.append("    versionpurgeMinVersions: ").append(toIndentedString(versionpurgeMinVersions)).append("\n");
        sb.append("    versionpurgeMaxAgeDays: ").append(toIndentedString(versionpurgeMaxAgeDays)).append("\n");
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

