package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties   {

    private ConfigNodePropertyString pathDescField;
    private ConfigNodePropertyString pathChildField;
    private ConfigNodePropertyString pathParentField;
    private ConfigNodePropertyString pathExactField;
    private ConfigNodePropertyString catchAllField;
    private ConfigNodePropertyString collapsedPathField;
    private ConfigNodePropertyString pathDepthField;
    private ConfigNodePropertyDropDown commitPolicy;
    private ConfigNodePropertyInteger rows;
    private ConfigNodePropertyBoolean pathRestrictions;
    private ConfigNodePropertyBoolean propertyRestrictions;
    private ConfigNodePropertyBoolean primarytypesRestrictions;
    private ConfigNodePropertyArray ignoredProperties;
    private ConfigNodePropertyArray usedProperties;
    private ConfigNodePropertyArray typeMappings;
    private ConfigNodePropertyArray propertyMappings;
    private ConfigNodePropertyBoolean collapseJcrcontentNodes;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.
     *
     * @param pathDescField pathDescField
     * @param pathChildField pathChildField
     * @param pathParentField pathParentField
     * @param pathExactField pathExactField
     * @param catchAllField catchAllField
     * @param collapsedPathField collapsedPathField
     * @param pathDepthField pathDepthField
     * @param commitPolicy commitPolicy
     * @param rows rows
     * @param pathRestrictions pathRestrictions
     * @param propertyRestrictions propertyRestrictions
     * @param primarytypesRestrictions primarytypesRestrictions
     * @param ignoredProperties ignoredProperties
     * @param usedProperties usedProperties
     * @param typeMappings typeMappings
     * @param propertyMappings propertyMappings
     * @param collapseJcrcontentNodes collapseJcrcontentNodes
     */
    public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties(
        ConfigNodePropertyString pathDescField, 
        ConfigNodePropertyString pathChildField, 
        ConfigNodePropertyString pathParentField, 
        ConfigNodePropertyString pathExactField, 
        ConfigNodePropertyString catchAllField, 
        ConfigNodePropertyString collapsedPathField, 
        ConfigNodePropertyString pathDepthField, 
        ConfigNodePropertyDropDown commitPolicy, 
        ConfigNodePropertyInteger rows, 
        ConfigNodePropertyBoolean pathRestrictions, 
        ConfigNodePropertyBoolean propertyRestrictions, 
        ConfigNodePropertyBoolean primarytypesRestrictions, 
        ConfigNodePropertyArray ignoredProperties, 
        ConfigNodePropertyArray usedProperties, 
        ConfigNodePropertyArray typeMappings, 
        ConfigNodePropertyArray propertyMappings, 
        ConfigNodePropertyBoolean collapseJcrcontentNodes
    ) {
        this.pathDescField = pathDescField;
        this.pathChildField = pathChildField;
        this.pathParentField = pathParentField;
        this.pathExactField = pathExactField;
        this.catchAllField = catchAllField;
        this.collapsedPathField = collapsedPathField;
        this.pathDepthField = pathDepthField;
        this.commitPolicy = commitPolicy;
        this.rows = rows;
        this.pathRestrictions = pathRestrictions;
        this.propertyRestrictions = propertyRestrictions;
        this.primarytypesRestrictions = primarytypesRestrictions;
        this.ignoredProperties = ignoredProperties;
        this.usedProperties = usedProperties;
        this.typeMappings = typeMappings;
        this.propertyMappings = propertyMappings;
        this.collapseJcrcontentNodes = collapseJcrcontentNodes;
    }



    /**
     * Get pathDescField
     * @return pathDescField
     */
    public ConfigNodePropertyString getPathDescField() {
        return pathDescField;
    }

    public void setPathDescField(ConfigNodePropertyString pathDescField) {
        this.pathDescField = pathDescField;
    }

    /**
     * Get pathChildField
     * @return pathChildField
     */
    public ConfigNodePropertyString getPathChildField() {
        return pathChildField;
    }

    public void setPathChildField(ConfigNodePropertyString pathChildField) {
        this.pathChildField = pathChildField;
    }

    /**
     * Get pathParentField
     * @return pathParentField
     */
    public ConfigNodePropertyString getPathParentField() {
        return pathParentField;
    }

    public void setPathParentField(ConfigNodePropertyString pathParentField) {
        this.pathParentField = pathParentField;
    }

    /**
     * Get pathExactField
     * @return pathExactField
     */
    public ConfigNodePropertyString getPathExactField() {
        return pathExactField;
    }

    public void setPathExactField(ConfigNodePropertyString pathExactField) {
        this.pathExactField = pathExactField;
    }

    /**
     * Get catchAllField
     * @return catchAllField
     */
    public ConfigNodePropertyString getCatchAllField() {
        return catchAllField;
    }

    public void setCatchAllField(ConfigNodePropertyString catchAllField) {
        this.catchAllField = catchAllField;
    }

    /**
     * Get collapsedPathField
     * @return collapsedPathField
     */
    public ConfigNodePropertyString getCollapsedPathField() {
        return collapsedPathField;
    }

    public void setCollapsedPathField(ConfigNodePropertyString collapsedPathField) {
        this.collapsedPathField = collapsedPathField;
    }

    /**
     * Get pathDepthField
     * @return pathDepthField
     */
    public ConfigNodePropertyString getPathDepthField() {
        return pathDepthField;
    }

    public void setPathDepthField(ConfigNodePropertyString pathDepthField) {
        this.pathDepthField = pathDepthField;
    }

    /**
     * Get commitPolicy
     * @return commitPolicy
     */
    public ConfigNodePropertyDropDown getCommitPolicy() {
        return commitPolicy;
    }

    public void setCommitPolicy(ConfigNodePropertyDropDown commitPolicy) {
        this.commitPolicy = commitPolicy;
    }

    /**
     * Get rows
     * @return rows
     */
    public ConfigNodePropertyInteger getRows() {
        return rows;
    }

    public void setRows(ConfigNodePropertyInteger rows) {
        this.rows = rows;
    }

    /**
     * Get pathRestrictions
     * @return pathRestrictions
     */
    public ConfigNodePropertyBoolean getPathRestrictions() {
        return pathRestrictions;
    }

    public void setPathRestrictions(ConfigNodePropertyBoolean pathRestrictions) {
        this.pathRestrictions = pathRestrictions;
    }

    /**
     * Get propertyRestrictions
     * @return propertyRestrictions
     */
    public ConfigNodePropertyBoolean getPropertyRestrictions() {
        return propertyRestrictions;
    }

    public void setPropertyRestrictions(ConfigNodePropertyBoolean propertyRestrictions) {
        this.propertyRestrictions = propertyRestrictions;
    }

    /**
     * Get primarytypesRestrictions
     * @return primarytypesRestrictions
     */
    public ConfigNodePropertyBoolean getPrimarytypesRestrictions() {
        return primarytypesRestrictions;
    }

    public void setPrimarytypesRestrictions(ConfigNodePropertyBoolean primarytypesRestrictions) {
        this.primarytypesRestrictions = primarytypesRestrictions;
    }

    /**
     * Get ignoredProperties
     * @return ignoredProperties
     */
    public ConfigNodePropertyArray getIgnoredProperties() {
        return ignoredProperties;
    }

    public void setIgnoredProperties(ConfigNodePropertyArray ignoredProperties) {
        this.ignoredProperties = ignoredProperties;
    }

    /**
     * Get usedProperties
     * @return usedProperties
     */
    public ConfigNodePropertyArray getUsedProperties() {
        return usedProperties;
    }

    public void setUsedProperties(ConfigNodePropertyArray usedProperties) {
        this.usedProperties = usedProperties;
    }

    /**
     * Get typeMappings
     * @return typeMappings
     */
    public ConfigNodePropertyArray getTypeMappings() {
        return typeMappings;
    }

    public void setTypeMappings(ConfigNodePropertyArray typeMappings) {
        this.typeMappings = typeMappings;
    }

    /**
     * Get propertyMappings
     * @return propertyMappings
     */
    public ConfigNodePropertyArray getPropertyMappings() {
        return propertyMappings;
    }

    public void setPropertyMappings(ConfigNodePropertyArray propertyMappings) {
        this.propertyMappings = propertyMappings;
    }

    /**
     * Get collapseJcrcontentNodes
     * @return collapseJcrcontentNodes
     */
    public ConfigNodePropertyBoolean getCollapseJcrcontentNodes() {
        return collapseJcrcontentNodes;
    }

    public void setCollapseJcrcontentNodes(ConfigNodePropertyBoolean collapseJcrcontentNodes) {
        this.collapseJcrcontentNodes = collapseJcrcontentNodes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties {\n");
        
        sb.append("    pathDescField: ").append(toIndentedString(pathDescField)).append("\n");
        sb.append("    pathChildField: ").append(toIndentedString(pathChildField)).append("\n");
        sb.append("    pathParentField: ").append(toIndentedString(pathParentField)).append("\n");
        sb.append("    pathExactField: ").append(toIndentedString(pathExactField)).append("\n");
        sb.append("    catchAllField: ").append(toIndentedString(catchAllField)).append("\n");
        sb.append("    collapsedPathField: ").append(toIndentedString(collapsedPathField)).append("\n");
        sb.append("    pathDepthField: ").append(toIndentedString(pathDepthField)).append("\n");
        sb.append("    commitPolicy: ").append(toIndentedString(commitPolicy)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    pathRestrictions: ").append(toIndentedString(pathRestrictions)).append("\n");
        sb.append("    propertyRestrictions: ").append(toIndentedString(propertyRestrictions)).append("\n");
        sb.append("    primarytypesRestrictions: ").append(toIndentedString(primarytypesRestrictions)).append("\n");
        sb.append("    ignoredProperties: ").append(toIndentedString(ignoredProperties)).append("\n");
        sb.append("    usedProperties: ").append(toIndentedString(usedProperties)).append("\n");
        sb.append("    typeMappings: ").append(toIndentedString(typeMappings)).append("\n");
        sb.append("    propertyMappings: ").append(toIndentedString(propertyMappings)).append("\n");
        sb.append("    collapseJcrcontentNodes: ").append(toIndentedString(collapseJcrcontentNodes)).append("\n");
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

