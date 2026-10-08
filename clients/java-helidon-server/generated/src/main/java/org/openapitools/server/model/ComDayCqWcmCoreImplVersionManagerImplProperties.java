package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplVersionManagerImplProperties   {

    private ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation;
    private ConfigNodePropertyBoolean versionmanagerPurgingEnabled;
    private ConfigNodePropertyArray versionmanagerPurgePaths;
    private ConfigNodePropertyArray versionmanagerIvPaths;
    private ConfigNodePropertyInteger versionmanagerMaxAgeDays;
    private ConfigNodePropertyInteger versionmanagerMaxNumberVersions;
    private ConfigNodePropertyInteger versionmanagerMinNumberVersions;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplVersionManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplVersionManagerImplProperties.
     *
     * @param versionmanagerCreateVersionOnActivation versionmanagerCreateVersionOnActivation
     * @param versionmanagerPurgingEnabled versionmanagerPurgingEnabled
     * @param versionmanagerPurgePaths versionmanagerPurgePaths
     * @param versionmanagerIvPaths versionmanagerIvPaths
     * @param versionmanagerMaxAgeDays versionmanagerMaxAgeDays
     * @param versionmanagerMaxNumberVersions versionmanagerMaxNumberVersions
     * @param versionmanagerMinNumberVersions versionmanagerMinNumberVersions
     */
    public ComDayCqWcmCoreImplVersionManagerImplProperties(
        ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation, 
        ConfigNodePropertyBoolean versionmanagerPurgingEnabled, 
        ConfigNodePropertyArray versionmanagerPurgePaths, 
        ConfigNodePropertyArray versionmanagerIvPaths, 
        ConfigNodePropertyInteger versionmanagerMaxAgeDays, 
        ConfigNodePropertyInteger versionmanagerMaxNumberVersions, 
        ConfigNodePropertyInteger versionmanagerMinNumberVersions
    ) {
        this.versionmanagerCreateVersionOnActivation = versionmanagerCreateVersionOnActivation;
        this.versionmanagerPurgingEnabled = versionmanagerPurgingEnabled;
        this.versionmanagerPurgePaths = versionmanagerPurgePaths;
        this.versionmanagerIvPaths = versionmanagerIvPaths;
        this.versionmanagerMaxAgeDays = versionmanagerMaxAgeDays;
        this.versionmanagerMaxNumberVersions = versionmanagerMaxNumberVersions;
        this.versionmanagerMinNumberVersions = versionmanagerMinNumberVersions;
    }



    /**
     * Get versionmanagerCreateVersionOnActivation
     * @return versionmanagerCreateVersionOnActivation
     */
    public ConfigNodePropertyBoolean getVersionmanagerCreateVersionOnActivation() {
        return versionmanagerCreateVersionOnActivation;
    }

    public void setVersionmanagerCreateVersionOnActivation(ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation) {
        this.versionmanagerCreateVersionOnActivation = versionmanagerCreateVersionOnActivation;
    }

    /**
     * Get versionmanagerPurgingEnabled
     * @return versionmanagerPurgingEnabled
     */
    public ConfigNodePropertyBoolean getVersionmanagerPurgingEnabled() {
        return versionmanagerPurgingEnabled;
    }

    public void setVersionmanagerPurgingEnabled(ConfigNodePropertyBoolean versionmanagerPurgingEnabled) {
        this.versionmanagerPurgingEnabled = versionmanagerPurgingEnabled;
    }

    /**
     * Get versionmanagerPurgePaths
     * @return versionmanagerPurgePaths
     */
    public ConfigNodePropertyArray getVersionmanagerPurgePaths() {
        return versionmanagerPurgePaths;
    }

    public void setVersionmanagerPurgePaths(ConfigNodePropertyArray versionmanagerPurgePaths) {
        this.versionmanagerPurgePaths = versionmanagerPurgePaths;
    }

    /**
     * Get versionmanagerIvPaths
     * @return versionmanagerIvPaths
     */
    public ConfigNodePropertyArray getVersionmanagerIvPaths() {
        return versionmanagerIvPaths;
    }

    public void setVersionmanagerIvPaths(ConfigNodePropertyArray versionmanagerIvPaths) {
        this.versionmanagerIvPaths = versionmanagerIvPaths;
    }

    /**
     * Get versionmanagerMaxAgeDays
     * @return versionmanagerMaxAgeDays
     */
    public ConfigNodePropertyInteger getVersionmanagerMaxAgeDays() {
        return versionmanagerMaxAgeDays;
    }

    public void setVersionmanagerMaxAgeDays(ConfigNodePropertyInteger versionmanagerMaxAgeDays) {
        this.versionmanagerMaxAgeDays = versionmanagerMaxAgeDays;
    }

    /**
     * Get versionmanagerMaxNumberVersions
     * @return versionmanagerMaxNumberVersions
     */
    public ConfigNodePropertyInteger getVersionmanagerMaxNumberVersions() {
        return versionmanagerMaxNumberVersions;
    }

    public void setVersionmanagerMaxNumberVersions(ConfigNodePropertyInteger versionmanagerMaxNumberVersions) {
        this.versionmanagerMaxNumberVersions = versionmanagerMaxNumberVersions;
    }

    /**
     * Get versionmanagerMinNumberVersions
     * @return versionmanagerMinNumberVersions
     */
    public ConfigNodePropertyInteger getVersionmanagerMinNumberVersions() {
        return versionmanagerMinNumberVersions;
    }

    public void setVersionmanagerMinNumberVersions(ConfigNodePropertyInteger versionmanagerMinNumberVersions) {
        this.versionmanagerMinNumberVersions = versionmanagerMinNumberVersions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplVersionManagerImplProperties {\n");
        
        sb.append("    versionmanagerCreateVersionOnActivation: ").append(toIndentedString(versionmanagerCreateVersionOnActivation)).append("\n");
        sb.append("    versionmanagerPurgingEnabled: ").append(toIndentedString(versionmanagerPurgingEnabled)).append("\n");
        sb.append("    versionmanagerPurgePaths: ").append(toIndentedString(versionmanagerPurgePaths)).append("\n");
        sb.append("    versionmanagerIvPaths: ").append(toIndentedString(versionmanagerIvPaths)).append("\n");
        sb.append("    versionmanagerMaxAgeDays: ").append(toIndentedString(versionmanagerMaxAgeDays)).append("\n");
        sb.append("    versionmanagerMaxNumberVersions: ").append(toIndentedString(versionmanagerMaxNumberVersions)).append("\n");
        sb.append("    versionmanagerMinNumberVersions: ").append(toIndentedString(versionmanagerMinNumberVersions)).append("\n");
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

