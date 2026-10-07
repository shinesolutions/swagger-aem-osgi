package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("path.desc.field")
  private ConfigNodePropertyString pathDescField;

  @JsonProperty("path.child.field")
  private ConfigNodePropertyString pathChildField;

  @JsonProperty("path.parent.field")
  private ConfigNodePropertyString pathParentField;

  @JsonProperty("path.exact.field")
  private ConfigNodePropertyString pathExactField;

  @JsonProperty("catch.all.field")
  private ConfigNodePropertyString catchAllField;

  @JsonProperty("collapsed.path.field")
  private ConfigNodePropertyString collapsedPathField;

  @JsonProperty("path.depth.field")
  private ConfigNodePropertyString pathDepthField;

  @JsonProperty("commit.policy")
  private ConfigNodePropertyDropDown commitPolicy;

  @JsonProperty("rows")
  private ConfigNodePropertyInteger rows;

  @JsonProperty("path.restrictions")
  private ConfigNodePropertyBoolean pathRestrictions;

  @JsonProperty("property.restrictions")
  private ConfigNodePropertyBoolean propertyRestrictions;

  @JsonProperty("primarytypes.restrictions")
  private ConfigNodePropertyBoolean primarytypesRestrictions;

  @JsonProperty("ignored.properties")
  private ConfigNodePropertyArray ignoredProperties;

  @JsonProperty("used.properties")
  private ConfigNodePropertyArray usedProperties;

  @JsonProperty("type.mappings")
  private ConfigNodePropertyArray typeMappings;

  @JsonProperty("property.mappings")
  private ConfigNodePropertyArray propertyMappings;

  @JsonProperty("collapse.jcrcontent.nodes")
  private ConfigNodePropertyBoolean collapseJcrcontentNodes;

  /**
   * 
   * @return pathDescField
   */
  public ConfigNodePropertyString getPathDescField() {
    return pathDescField;
  }

  public void setPathDescField(ConfigNodePropertyString pathDescField) {
    this.pathDescField = pathDescField;
  }

  /**
   * 
   * @return pathChildField
   */
  public ConfigNodePropertyString getPathChildField() {
    return pathChildField;
  }

  public void setPathChildField(ConfigNodePropertyString pathChildField) {
    this.pathChildField = pathChildField;
  }

  /**
   * 
   * @return pathParentField
   */
  public ConfigNodePropertyString getPathParentField() {
    return pathParentField;
  }

  public void setPathParentField(ConfigNodePropertyString pathParentField) {
    this.pathParentField = pathParentField;
  }

  /**
   * 
   * @return pathExactField
   */
  public ConfigNodePropertyString getPathExactField() {
    return pathExactField;
  }

  public void setPathExactField(ConfigNodePropertyString pathExactField) {
    this.pathExactField = pathExactField;
  }

  /**
   * 
   * @return catchAllField
   */
  public ConfigNodePropertyString getCatchAllField() {
    return catchAllField;
  }

  public void setCatchAllField(ConfigNodePropertyString catchAllField) {
    this.catchAllField = catchAllField;
  }

  /**
   * 
   * @return collapsedPathField
   */
  public ConfigNodePropertyString getCollapsedPathField() {
    return collapsedPathField;
  }

  public void setCollapsedPathField(ConfigNodePropertyString collapsedPathField) {
    this.collapsedPathField = collapsedPathField;
  }

  /**
   * 
   * @return pathDepthField
   */
  public ConfigNodePropertyString getPathDepthField() {
    return pathDepthField;
  }

  public void setPathDepthField(ConfigNodePropertyString pathDepthField) {
    this.pathDepthField = pathDepthField;
  }

  /**
   * 
   * @return commitPolicy
   */
  public ConfigNodePropertyDropDown getCommitPolicy() {
    return commitPolicy;
  }

  public void setCommitPolicy(ConfigNodePropertyDropDown commitPolicy) {
    this.commitPolicy = commitPolicy;
  }

  /**
   * 
   * @return rows
   */
  public ConfigNodePropertyInteger getRows() {
    return rows;
  }

  public void setRows(ConfigNodePropertyInteger rows) {
    this.rows = rows;
  }

  /**
   * 
   * @return pathRestrictions
   */
  public ConfigNodePropertyBoolean getPathRestrictions() {
    return pathRestrictions;
  }

  public void setPathRestrictions(ConfigNodePropertyBoolean pathRestrictions) {
    this.pathRestrictions = pathRestrictions;
  }

  /**
   * 
   * @return propertyRestrictions
   */
  public ConfigNodePropertyBoolean getPropertyRestrictions() {
    return propertyRestrictions;
  }

  public void setPropertyRestrictions(ConfigNodePropertyBoolean propertyRestrictions) {
    this.propertyRestrictions = propertyRestrictions;
  }

  /**
   * 
   * @return primarytypesRestrictions
   */
  public ConfigNodePropertyBoolean getPrimarytypesRestrictions() {
    return primarytypesRestrictions;
  }

  public void setPrimarytypesRestrictions(ConfigNodePropertyBoolean primarytypesRestrictions) {
    this.primarytypesRestrictions = primarytypesRestrictions;
  }

  /**
   * 
   * @return ignoredProperties
   */
  public ConfigNodePropertyArray getIgnoredProperties() {
    return ignoredProperties;
  }

  public void setIgnoredProperties(ConfigNodePropertyArray ignoredProperties) {
    this.ignoredProperties = ignoredProperties;
  }

  /**
   * 
   * @return usedProperties
   */
  public ConfigNodePropertyArray getUsedProperties() {
    return usedProperties;
  }

  public void setUsedProperties(ConfigNodePropertyArray usedProperties) {
    this.usedProperties = usedProperties;
  }

  /**
   * 
   * @return typeMappings
   */
  public ConfigNodePropertyArray getTypeMappings() {
    return typeMappings;
  }

  public void setTypeMappings(ConfigNodePropertyArray typeMappings) {
    this.typeMappings = typeMappings;
  }

  /**
   * 
   * @return propertyMappings
   */
  public ConfigNodePropertyArray getPropertyMappings() {
    return propertyMappings;
  }

  public void setPropertyMappings(ConfigNodePropertyArray propertyMappings) {
    this.propertyMappings = propertyMappings;
  }

  /**
   * 
   * @return collapseJcrcontentNodes
   */
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
