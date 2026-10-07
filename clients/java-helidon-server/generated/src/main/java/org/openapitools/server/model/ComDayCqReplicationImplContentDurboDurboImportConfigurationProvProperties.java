package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties   {

    private ConfigNodePropertyBoolean preserveHierarchyNodes;
    private ConfigNodePropertyBoolean ignoreVersioning;
    private ConfigNodePropertyBoolean importAcl;
    private ConfigNodePropertyInteger saveThreshold;
    private ConfigNodePropertyBoolean preserveUserPaths;
    private ConfigNodePropertyBoolean preserveUuid;
    private ConfigNodePropertyArray preserveUuidNodetypes;
    private ConfigNodePropertyArray preserveUuidSubtrees;
    private ConfigNodePropertyBoolean autoCommit;

    /**
     * Default constructor.
     */
    public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.
     *
     * @param preserveHierarchyNodes preserveHierarchyNodes
     * @param ignoreVersioning ignoreVersioning
     * @param importAcl importAcl
     * @param saveThreshold saveThreshold
     * @param preserveUserPaths preserveUserPaths
     * @param preserveUuid preserveUuid
     * @param preserveUuidNodetypes preserveUuidNodetypes
     * @param preserveUuidSubtrees preserveUuidSubtrees
     * @param autoCommit autoCommit
     */
    public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties(
        ConfigNodePropertyBoolean preserveHierarchyNodes, 
        ConfigNodePropertyBoolean ignoreVersioning, 
        ConfigNodePropertyBoolean importAcl, 
        ConfigNodePropertyInteger saveThreshold, 
        ConfigNodePropertyBoolean preserveUserPaths, 
        ConfigNodePropertyBoolean preserveUuid, 
        ConfigNodePropertyArray preserveUuidNodetypes, 
        ConfigNodePropertyArray preserveUuidSubtrees, 
        ConfigNodePropertyBoolean autoCommit
    ) {
        this.preserveHierarchyNodes = preserveHierarchyNodes;
        this.ignoreVersioning = ignoreVersioning;
        this.importAcl = importAcl;
        this.saveThreshold = saveThreshold;
        this.preserveUserPaths = preserveUserPaths;
        this.preserveUuid = preserveUuid;
        this.preserveUuidNodetypes = preserveUuidNodetypes;
        this.preserveUuidSubtrees = preserveUuidSubtrees;
        this.autoCommit = autoCommit;
    }



    /**
     * Get preserveHierarchyNodes
     * @return preserveHierarchyNodes
     */
    public ConfigNodePropertyBoolean getPreserveHierarchyNodes() {
        return preserveHierarchyNodes;
    }

    public void setPreserveHierarchyNodes(ConfigNodePropertyBoolean preserveHierarchyNodes) {
        this.preserveHierarchyNodes = preserveHierarchyNodes;
    }

    /**
     * Get ignoreVersioning
     * @return ignoreVersioning
     */
    public ConfigNodePropertyBoolean getIgnoreVersioning() {
        return ignoreVersioning;
    }

    public void setIgnoreVersioning(ConfigNodePropertyBoolean ignoreVersioning) {
        this.ignoreVersioning = ignoreVersioning;
    }

    /**
     * Get importAcl
     * @return importAcl
     */
    public ConfigNodePropertyBoolean getImportAcl() {
        return importAcl;
    }

    public void setImportAcl(ConfigNodePropertyBoolean importAcl) {
        this.importAcl = importAcl;
    }

    /**
     * Get saveThreshold
     * @return saveThreshold
     */
    public ConfigNodePropertyInteger getSaveThreshold() {
        return saveThreshold;
    }

    public void setSaveThreshold(ConfigNodePropertyInteger saveThreshold) {
        this.saveThreshold = saveThreshold;
    }

    /**
     * Get preserveUserPaths
     * @return preserveUserPaths
     */
    public ConfigNodePropertyBoolean getPreserveUserPaths() {
        return preserveUserPaths;
    }

    public void setPreserveUserPaths(ConfigNodePropertyBoolean preserveUserPaths) {
        this.preserveUserPaths = preserveUserPaths;
    }

    /**
     * Get preserveUuid
     * @return preserveUuid
     */
    public ConfigNodePropertyBoolean getPreserveUuid() {
        return preserveUuid;
    }

    public void setPreserveUuid(ConfigNodePropertyBoolean preserveUuid) {
        this.preserveUuid = preserveUuid;
    }

    /**
     * Get preserveUuidNodetypes
     * @return preserveUuidNodetypes
     */
    public ConfigNodePropertyArray getPreserveUuidNodetypes() {
        return preserveUuidNodetypes;
    }

    public void setPreserveUuidNodetypes(ConfigNodePropertyArray preserveUuidNodetypes) {
        this.preserveUuidNodetypes = preserveUuidNodetypes;
    }

    /**
     * Get preserveUuidSubtrees
     * @return preserveUuidSubtrees
     */
    public ConfigNodePropertyArray getPreserveUuidSubtrees() {
        return preserveUuidSubtrees;
    }

    public void setPreserveUuidSubtrees(ConfigNodePropertyArray preserveUuidSubtrees) {
        this.preserveUuidSubtrees = preserveUuidSubtrees;
    }

    /**
     * Get autoCommit
     * @return autoCommit
     */
    public ConfigNodePropertyBoolean getAutoCommit() {
        return autoCommit;
    }

    public void setAutoCommit(ConfigNodePropertyBoolean autoCommit) {
        this.autoCommit = autoCommit;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {\n");
        
        sb.append("    preserveHierarchyNodes: ").append(toIndentedString(preserveHierarchyNodes)).append("\n");
        sb.append("    ignoreVersioning: ").append(toIndentedString(ignoreVersioning)).append("\n");
        sb.append("    importAcl: ").append(toIndentedString(importAcl)).append("\n");
        sb.append("    saveThreshold: ").append(toIndentedString(saveThreshold)).append("\n");
        sb.append("    preserveUserPaths: ").append(toIndentedString(preserveUserPaths)).append("\n");
        sb.append("    preserveUuid: ").append(toIndentedString(preserveUuid)).append("\n");
        sb.append("    preserveUuidNodetypes: ").append(toIndentedString(preserveUuidNodetypes)).append("\n");
        sb.append("    preserveUuidSubtrees: ").append(toIndentedString(preserveUuidSubtrees)).append("\n");
        sb.append("    autoCommit: ").append(toIndentedString(autoCommit)).append("\n");
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

