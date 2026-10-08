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
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString pathDescField;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString pathChildField;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString pathParentField;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString pathExactField;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString catchAllField;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString collapsedPathField;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString pathDepthField;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown commitPolicy;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger rows;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean pathRestrictions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean propertyRestrictions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean primarytypesRestrictions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray ignoredProperties;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray usedProperties;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray typeMappings;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray propertyMappings;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean collapseJcrcontentNodes;

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties pathDescField(@Nullable ConfigNodePropertyString pathDescField) {
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
  public @Nullable ConfigNodePropertyString getPathDescField() {
    return pathDescField;
  }

  @JsonProperty("path.desc.field")
  public void setPathDescField(@Nullable ConfigNodePropertyString pathDescField) {
    this.pathDescField = pathDescField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties pathChildField(@Nullable ConfigNodePropertyString pathChildField) {
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
  public @Nullable ConfigNodePropertyString getPathChildField() {
    return pathChildField;
  }

  @JsonProperty("path.child.field")
  public void setPathChildField(@Nullable ConfigNodePropertyString pathChildField) {
    this.pathChildField = pathChildField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties pathParentField(@Nullable ConfigNodePropertyString pathParentField) {
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
  public @Nullable ConfigNodePropertyString getPathParentField() {
    return pathParentField;
  }

  @JsonProperty("path.parent.field")
  public void setPathParentField(@Nullable ConfigNodePropertyString pathParentField) {
    this.pathParentField = pathParentField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties pathExactField(@Nullable ConfigNodePropertyString pathExactField) {
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
  public @Nullable ConfigNodePropertyString getPathExactField() {
    return pathExactField;
  }

  @JsonProperty("path.exact.field")
  public void setPathExactField(@Nullable ConfigNodePropertyString pathExactField) {
    this.pathExactField = pathExactField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties catchAllField(@Nullable ConfigNodePropertyString catchAllField) {
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
  public @Nullable ConfigNodePropertyString getCatchAllField() {
    return catchAllField;
  }

  @JsonProperty("catch.all.field")
  public void setCatchAllField(@Nullable ConfigNodePropertyString catchAllField) {
    this.catchAllField = catchAllField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties collapsedPathField(@Nullable ConfigNodePropertyString collapsedPathField) {
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
  public @Nullable ConfigNodePropertyString getCollapsedPathField() {
    return collapsedPathField;
  }

  @JsonProperty("collapsed.path.field")
  public void setCollapsedPathField(@Nullable ConfigNodePropertyString collapsedPathField) {
    this.collapsedPathField = collapsedPathField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties pathDepthField(@Nullable ConfigNodePropertyString pathDepthField) {
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
  public @Nullable ConfigNodePropertyString getPathDepthField() {
    return pathDepthField;
  }

  @JsonProperty("path.depth.field")
  public void setPathDepthField(@Nullable ConfigNodePropertyString pathDepthField) {
    this.pathDepthField = pathDepthField;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties commitPolicy(@Nullable ConfigNodePropertyDropDown commitPolicy) {
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
  public @Nullable ConfigNodePropertyDropDown getCommitPolicy() {
    return commitPolicy;
  }

  @JsonProperty("commit.policy")
  public void setCommitPolicy(@Nullable ConfigNodePropertyDropDown commitPolicy) {
    this.commitPolicy = commitPolicy;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties rows(@Nullable ConfigNodePropertyInteger rows) {
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
  public @Nullable ConfigNodePropertyInteger getRows() {
    return rows;
  }

  @JsonProperty("rows")
  public void setRows(@Nullable ConfigNodePropertyInteger rows) {
    this.rows = rows;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties pathRestrictions(@Nullable ConfigNodePropertyBoolean pathRestrictions) {
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
  public @Nullable ConfigNodePropertyBoolean getPathRestrictions() {
    return pathRestrictions;
  }

  @JsonProperty("path.restrictions")
  public void setPathRestrictions(@Nullable ConfigNodePropertyBoolean pathRestrictions) {
    this.pathRestrictions = pathRestrictions;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties propertyRestrictions(@Nullable ConfigNodePropertyBoolean propertyRestrictions) {
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
  public @Nullable ConfigNodePropertyBoolean getPropertyRestrictions() {
    return propertyRestrictions;
  }

  @JsonProperty("property.restrictions")
  public void setPropertyRestrictions(@Nullable ConfigNodePropertyBoolean propertyRestrictions) {
    this.propertyRestrictions = propertyRestrictions;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties primarytypesRestrictions(@Nullable ConfigNodePropertyBoolean primarytypesRestrictions) {
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
  public @Nullable ConfigNodePropertyBoolean getPrimarytypesRestrictions() {
    return primarytypesRestrictions;
  }

  @JsonProperty("primarytypes.restrictions")
  public void setPrimarytypesRestrictions(@Nullable ConfigNodePropertyBoolean primarytypesRestrictions) {
    this.primarytypesRestrictions = primarytypesRestrictions;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties ignoredProperties(@Nullable ConfigNodePropertyArray ignoredProperties) {
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
  public @Nullable ConfigNodePropertyArray getIgnoredProperties() {
    return ignoredProperties;
  }

  @JsonProperty("ignored.properties")
  public void setIgnoredProperties(@Nullable ConfigNodePropertyArray ignoredProperties) {
    this.ignoredProperties = ignoredProperties;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties usedProperties(@Nullable ConfigNodePropertyArray usedProperties) {
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
  public @Nullable ConfigNodePropertyArray getUsedProperties() {
    return usedProperties;
  }

  @JsonProperty("used.properties")
  public void setUsedProperties(@Nullable ConfigNodePropertyArray usedProperties) {
    this.usedProperties = usedProperties;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties typeMappings(@Nullable ConfigNodePropertyArray typeMappings) {
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
  public @Nullable ConfigNodePropertyArray getTypeMappings() {
    return typeMappings;
  }

  @JsonProperty("type.mappings")
  public void setTypeMappings(@Nullable ConfigNodePropertyArray typeMappings) {
    this.typeMappings = typeMappings;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties propertyMappings(@Nullable ConfigNodePropertyArray propertyMappings) {
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
  public @Nullable ConfigNodePropertyArray getPropertyMappings() {
    return propertyMappings;
  }

  @JsonProperty("property.mappings")
  public void setPropertyMappings(@Nullable ConfigNodePropertyArray propertyMappings) {
    this.propertyMappings = propertyMappings;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties collapseJcrcontentNodes(@Nullable ConfigNodePropertyBoolean collapseJcrcontentNodes) {
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
  public @Nullable ConfigNodePropertyBoolean getCollapseJcrcontentNodes() {
    return collapseJcrcontentNodes;
  }

  @JsonProperty("collapse.jcrcontent.nodes")
  public void setCollapseJcrcontentNodes(@Nullable ConfigNodePropertyBoolean collapseJcrcontentNodes) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

