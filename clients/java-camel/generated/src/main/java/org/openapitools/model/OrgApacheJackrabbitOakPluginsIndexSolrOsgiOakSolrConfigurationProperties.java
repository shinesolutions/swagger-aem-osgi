package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties
 */

@JsonTypeName("orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties {

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

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties pathDescField(ConfigNodePropertyString pathDescField) {
    this.pathDescField = pathDescField;
    return this;
  }

  /**
   * Get pathDescField
   * @return pathDescField
   */
  @Valid 
  @Schema(name = "path.desc.field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path.desc.field")
  public ConfigNodePropertyString getPathDescField() {
    return pathDescField;
  }

  public void setPathDescField(ConfigNodePropertyString pathDescField) {
    this.pathDescField = pathDescField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties pathChildField(ConfigNodePropertyString pathChildField) {
    this.pathChildField = pathChildField;
    return this;
  }

  /**
   * Get pathChildField
   * @return pathChildField
   */
  @Valid 
  @Schema(name = "path.child.field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path.child.field")
  public ConfigNodePropertyString getPathChildField() {
    return pathChildField;
  }

  public void setPathChildField(ConfigNodePropertyString pathChildField) {
    this.pathChildField = pathChildField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties pathParentField(ConfigNodePropertyString pathParentField) {
    this.pathParentField = pathParentField;
    return this;
  }

  /**
   * Get pathParentField
   * @return pathParentField
   */
  @Valid 
  @Schema(name = "path.parent.field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path.parent.field")
  public ConfigNodePropertyString getPathParentField() {
    return pathParentField;
  }

  public void setPathParentField(ConfigNodePropertyString pathParentField) {
    this.pathParentField = pathParentField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties pathExactField(ConfigNodePropertyString pathExactField) {
    this.pathExactField = pathExactField;
    return this;
  }

  /**
   * Get pathExactField
   * @return pathExactField
   */
  @Valid 
  @Schema(name = "path.exact.field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path.exact.field")
  public ConfigNodePropertyString getPathExactField() {
    return pathExactField;
  }

  public void setPathExactField(ConfigNodePropertyString pathExactField) {
    this.pathExactField = pathExactField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties catchAllField(ConfigNodePropertyString catchAllField) {
    this.catchAllField = catchAllField;
    return this;
  }

  /**
   * Get catchAllField
   * @return catchAllField
   */
  @Valid 
  @Schema(name = "catch.all.field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catch.all.field")
  public ConfigNodePropertyString getCatchAllField() {
    return catchAllField;
  }

  public void setCatchAllField(ConfigNodePropertyString catchAllField) {
    this.catchAllField = catchAllField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties collapsedPathField(ConfigNodePropertyString collapsedPathField) {
    this.collapsedPathField = collapsedPathField;
    return this;
  }

  /**
   * Get collapsedPathField
   * @return collapsedPathField
   */
  @Valid 
  @Schema(name = "collapsed.path.field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collapsed.path.field")
  public ConfigNodePropertyString getCollapsedPathField() {
    return collapsedPathField;
  }

  public void setCollapsedPathField(ConfigNodePropertyString collapsedPathField) {
    this.collapsedPathField = collapsedPathField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties pathDepthField(ConfigNodePropertyString pathDepthField) {
    this.pathDepthField = pathDepthField;
    return this;
  }

  /**
   * Get pathDepthField
   * @return pathDepthField
   */
  @Valid 
  @Schema(name = "path.depth.field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path.depth.field")
  public ConfigNodePropertyString getPathDepthField() {
    return pathDepthField;
  }

  public void setPathDepthField(ConfigNodePropertyString pathDepthField) {
    this.pathDepthField = pathDepthField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties commitPolicy(ConfigNodePropertyDropDown commitPolicy) {
    this.commitPolicy = commitPolicy;
    return this;
  }

  /**
   * Get commitPolicy
   * @return commitPolicy
   */
  @Valid 
  @Schema(name = "commit.policy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commit.policy")
  public ConfigNodePropertyDropDown getCommitPolicy() {
    return commitPolicy;
  }

  public void setCommitPolicy(ConfigNodePropertyDropDown commitPolicy) {
    this.commitPolicy = commitPolicy;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties rows(ConfigNodePropertyInteger rows) {
    this.rows = rows;
    return this;
  }

  /**
   * Get rows
   * @return rows
   */
  @Valid 
  @Schema(name = "rows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rows")
  public ConfigNodePropertyInteger getRows() {
    return rows;
  }

  public void setRows(ConfigNodePropertyInteger rows) {
    this.rows = rows;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties pathRestrictions(ConfigNodePropertyBoolean pathRestrictions) {
    this.pathRestrictions = pathRestrictions;
    return this;
  }

  /**
   * Get pathRestrictions
   * @return pathRestrictions
   */
  @Valid 
  @Schema(name = "path.restrictions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path.restrictions")
  public ConfigNodePropertyBoolean getPathRestrictions() {
    return pathRestrictions;
  }

  public void setPathRestrictions(ConfigNodePropertyBoolean pathRestrictions) {
    this.pathRestrictions = pathRestrictions;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties propertyRestrictions(ConfigNodePropertyBoolean propertyRestrictions) {
    this.propertyRestrictions = propertyRestrictions;
    return this;
  }

  /**
   * Get propertyRestrictions
   * @return propertyRestrictions
   */
  @Valid 
  @Schema(name = "property.restrictions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property.restrictions")
  public ConfigNodePropertyBoolean getPropertyRestrictions() {
    return propertyRestrictions;
  }

  public void setPropertyRestrictions(ConfigNodePropertyBoolean propertyRestrictions) {
    this.propertyRestrictions = propertyRestrictions;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties primarytypesRestrictions(ConfigNodePropertyBoolean primarytypesRestrictions) {
    this.primarytypesRestrictions = primarytypesRestrictions;
    return this;
  }

  /**
   * Get primarytypesRestrictions
   * @return primarytypesRestrictions
   */
  @Valid 
  @Schema(name = "primarytypes.restrictions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primarytypes.restrictions")
  public ConfigNodePropertyBoolean getPrimarytypesRestrictions() {
    return primarytypesRestrictions;
  }

  public void setPrimarytypesRestrictions(ConfigNodePropertyBoolean primarytypesRestrictions) {
    this.primarytypesRestrictions = primarytypesRestrictions;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties ignoredProperties(ConfigNodePropertyArray ignoredProperties) {
    this.ignoredProperties = ignoredProperties;
    return this;
  }

  /**
   * Get ignoredProperties
   * @return ignoredProperties
   */
  @Valid 
  @Schema(name = "ignored.properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ignored.properties")
  public ConfigNodePropertyArray getIgnoredProperties() {
    return ignoredProperties;
  }

  public void setIgnoredProperties(ConfigNodePropertyArray ignoredProperties) {
    this.ignoredProperties = ignoredProperties;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties usedProperties(ConfigNodePropertyArray usedProperties) {
    this.usedProperties = usedProperties;
    return this;
  }

  /**
   * Get usedProperties
   * @return usedProperties
   */
  @Valid 
  @Schema(name = "used.properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("used.properties")
  public ConfigNodePropertyArray getUsedProperties() {
    return usedProperties;
  }

  public void setUsedProperties(ConfigNodePropertyArray usedProperties) {
    this.usedProperties = usedProperties;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties typeMappings(ConfigNodePropertyArray typeMappings) {
    this.typeMappings = typeMappings;
    return this;
  }

  /**
   * Get typeMappings
   * @return typeMappings
   */
  @Valid 
  @Schema(name = "type.mappings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type.mappings")
  public ConfigNodePropertyArray getTypeMappings() {
    return typeMappings;
  }

  public void setTypeMappings(ConfigNodePropertyArray typeMappings) {
    this.typeMappings = typeMappings;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties propertyMappings(ConfigNodePropertyArray propertyMappings) {
    this.propertyMappings = propertyMappings;
    return this;
  }

  /**
   * Get propertyMappings
   * @return propertyMappings
   */
  @Valid 
  @Schema(name = "property.mappings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property.mappings")
  public ConfigNodePropertyArray getPropertyMappings() {
    return propertyMappings;
  }

  public void setPropertyMappings(ConfigNodePropertyArray propertyMappings) {
    this.propertyMappings = propertyMappings;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties collapseJcrcontentNodes(ConfigNodePropertyBoolean collapseJcrcontentNodes) {
    this.collapseJcrcontentNodes = collapseJcrcontentNodes;
    return this;
  }

  /**
   * Get collapseJcrcontentNodes
   * @return collapseJcrcontentNodes
   */
  @Valid 
  @Schema(name = "collapse.jcrcontent.nodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collapse.jcrcontent.nodes")
  public ConfigNodePropertyBoolean getCollapseJcrcontentNodes() {
    return collapseJcrcontentNodes;
  }

  public void setCollapseJcrcontentNodes(ConfigNodePropertyBoolean collapseJcrcontentNodes) {
    this.collapseJcrcontentNodes = collapseJcrcontentNodes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties = (OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties) o;
    return Objects.equals(this.pathDescField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathDescField) &&
        Objects.equals(this.pathChildField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathChildField) &&
        Objects.equals(this.pathParentField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathParentField) &&
        Objects.equals(this.pathExactField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathExactField) &&
        Objects.equals(this.catchAllField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.catchAllField) &&
        Objects.equals(this.collapsedPathField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.collapsedPathField) &&
        Objects.equals(this.pathDepthField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathDepthField) &&
        Objects.equals(this.commitPolicy, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.commitPolicy) &&
        Objects.equals(this.rows, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.rows) &&
        Objects.equals(this.pathRestrictions, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathRestrictions) &&
        Objects.equals(this.propertyRestrictions, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.propertyRestrictions) &&
        Objects.equals(this.primarytypesRestrictions, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.primarytypesRestrictions) &&
        Objects.equals(this.ignoredProperties, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.ignoredProperties) &&
        Objects.equals(this.usedProperties, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.usedProperties) &&
        Objects.equals(this.typeMappings, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.typeMappings) &&
        Objects.equals(this.propertyMappings, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.propertyMappings) &&
        Objects.equals(this.collapseJcrcontentNodes, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.collapseJcrcontentNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathDescField, pathChildField, pathParentField, pathExactField, catchAllField, collapsedPathField, pathDepthField, commitPolicy, rows, pathRestrictions, propertyRestrictions, primarytypesRestrictions, ignoredProperties, usedProperties, typeMappings, propertyMappings, collapseJcrcontentNodes);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

