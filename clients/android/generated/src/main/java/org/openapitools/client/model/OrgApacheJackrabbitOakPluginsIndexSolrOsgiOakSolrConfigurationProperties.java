/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyArray;
import org.openapitools.client.model.ConfigNodePropertyBoolean;
import org.openapitools.client.model.ConfigNodePropertyDropDown;
import org.openapitools.client.model.ConfigNodePropertyInteger;
import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties {
  
  @SerializedName("path.desc.field")
  private ConfigNodePropertyString pathDescField = null;
  @SerializedName("path.child.field")
  private ConfigNodePropertyString pathChildField = null;
  @SerializedName("path.parent.field")
  private ConfigNodePropertyString pathParentField = null;
  @SerializedName("path.exact.field")
  private ConfigNodePropertyString pathExactField = null;
  @SerializedName("catch.all.field")
  private ConfigNodePropertyString catchAllField = null;
  @SerializedName("collapsed.path.field")
  private ConfigNodePropertyString collapsedPathField = null;
  @SerializedName("path.depth.field")
  private ConfigNodePropertyString pathDepthField = null;
  @SerializedName("commit.policy")
  private ConfigNodePropertyDropDown commitPolicy = null;
  @SerializedName("rows")
  private ConfigNodePropertyInteger rows = null;
  @SerializedName("path.restrictions")
  private ConfigNodePropertyBoolean pathRestrictions = null;
  @SerializedName("property.restrictions")
  private ConfigNodePropertyBoolean propertyRestrictions = null;
  @SerializedName("primarytypes.restrictions")
  private ConfigNodePropertyBoolean primarytypesRestrictions = null;
  @SerializedName("ignored.properties")
  private ConfigNodePropertyArray ignoredProperties = null;
  @SerializedName("used.properties")
  private ConfigNodePropertyArray usedProperties = null;
  @SerializedName("type.mappings")
  private ConfigNodePropertyArray typeMappings = null;
  @SerializedName("property.mappings")
  private ConfigNodePropertyArray propertyMappings = null;
  @SerializedName("collapse.jcrcontent.nodes")
  private ConfigNodePropertyBoolean collapseJcrcontentNodes = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPathDescField() {
    return pathDescField;
  }
  public void setPathDescField(ConfigNodePropertyString pathDescField) {
    this.pathDescField = pathDescField;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPathChildField() {
    return pathChildField;
  }
  public void setPathChildField(ConfigNodePropertyString pathChildField) {
    this.pathChildField = pathChildField;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPathParentField() {
    return pathParentField;
  }
  public void setPathParentField(ConfigNodePropertyString pathParentField) {
    this.pathParentField = pathParentField;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPathExactField() {
    return pathExactField;
  }
  public void setPathExactField(ConfigNodePropertyString pathExactField) {
    this.pathExactField = pathExactField;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCatchAllField() {
    return catchAllField;
  }
  public void setCatchAllField(ConfigNodePropertyString catchAllField) {
    this.catchAllField = catchAllField;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCollapsedPathField() {
    return collapsedPathField;
  }
  public void setCollapsedPathField(ConfigNodePropertyString collapsedPathField) {
    this.collapsedPathField = collapsedPathField;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPathDepthField() {
    return pathDepthField;
  }
  public void setPathDepthField(ConfigNodePropertyString pathDepthField) {
    this.pathDepthField = pathDepthField;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getCommitPolicy() {
    return commitPolicy;
  }
  public void setCommitPolicy(ConfigNodePropertyDropDown commitPolicy) {
    this.commitPolicy = commitPolicy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getRows() {
    return rows;
  }
  public void setRows(ConfigNodePropertyInteger rows) {
    this.rows = rows;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getPathRestrictions() {
    return pathRestrictions;
  }
  public void setPathRestrictions(ConfigNodePropertyBoolean pathRestrictions) {
    this.pathRestrictions = pathRestrictions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getPropertyRestrictions() {
    return propertyRestrictions;
  }
  public void setPropertyRestrictions(ConfigNodePropertyBoolean propertyRestrictions) {
    this.propertyRestrictions = propertyRestrictions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getPrimarytypesRestrictions() {
    return primarytypesRestrictions;
  }
  public void setPrimarytypesRestrictions(ConfigNodePropertyBoolean primarytypesRestrictions) {
    this.primarytypesRestrictions = primarytypesRestrictions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getIgnoredProperties() {
    return ignoredProperties;
  }
  public void setIgnoredProperties(ConfigNodePropertyArray ignoredProperties) {
    this.ignoredProperties = ignoredProperties;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getUsedProperties() {
    return usedProperties;
  }
  public void setUsedProperties(ConfigNodePropertyArray usedProperties) {
    this.usedProperties = usedProperties;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getTypeMappings() {
    return typeMappings;
  }
  public void setTypeMappings(ConfigNodePropertyArray typeMappings) {
    this.typeMappings = typeMappings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPropertyMappings() {
    return propertyMappings;
  }
  public void setPropertyMappings(ConfigNodePropertyArray propertyMappings) {
    this.propertyMappings = propertyMappings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.pathDescField == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathDescField == null : this.pathDescField.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathDescField)) &&
        (this.pathChildField == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathChildField == null : this.pathChildField.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathChildField)) &&
        (this.pathParentField == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathParentField == null : this.pathParentField.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathParentField)) &&
        (this.pathExactField == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathExactField == null : this.pathExactField.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathExactField)) &&
        (this.catchAllField == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.catchAllField == null : this.catchAllField.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.catchAllField)) &&
        (this.collapsedPathField == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.collapsedPathField == null : this.collapsedPathField.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.collapsedPathField)) &&
        (this.pathDepthField == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathDepthField == null : this.pathDepthField.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathDepthField)) &&
        (this.commitPolicy == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.commitPolicy == null : this.commitPolicy.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.commitPolicy)) &&
        (this.rows == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.rows == null : this.rows.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.rows)) &&
        (this.pathRestrictions == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathRestrictions == null : this.pathRestrictions.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathRestrictions)) &&
        (this.propertyRestrictions == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.propertyRestrictions == null : this.propertyRestrictions.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.propertyRestrictions)) &&
        (this.primarytypesRestrictions == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.primarytypesRestrictions == null : this.primarytypesRestrictions.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.primarytypesRestrictions)) &&
        (this.ignoredProperties == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.ignoredProperties == null : this.ignoredProperties.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.ignoredProperties)) &&
        (this.usedProperties == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.usedProperties == null : this.usedProperties.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.usedProperties)) &&
        (this.typeMappings == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.typeMappings == null : this.typeMappings.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.typeMappings)) &&
        (this.propertyMappings == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.propertyMappings == null : this.propertyMappings.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.propertyMappings)) &&
        (this.collapseJcrcontentNodes == null ? orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.collapseJcrcontentNodes == null : this.collapseJcrcontentNodes.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.collapseJcrcontentNodes));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pathDescField == null ? 0: this.pathDescField.hashCode());
    result = 31 * result + (this.pathChildField == null ? 0: this.pathChildField.hashCode());
    result = 31 * result + (this.pathParentField == null ? 0: this.pathParentField.hashCode());
    result = 31 * result + (this.pathExactField == null ? 0: this.pathExactField.hashCode());
    result = 31 * result + (this.catchAllField == null ? 0: this.catchAllField.hashCode());
    result = 31 * result + (this.collapsedPathField == null ? 0: this.collapsedPathField.hashCode());
    result = 31 * result + (this.pathDepthField == null ? 0: this.pathDepthField.hashCode());
    result = 31 * result + (this.commitPolicy == null ? 0: this.commitPolicy.hashCode());
    result = 31 * result + (this.rows == null ? 0: this.rows.hashCode());
    result = 31 * result + (this.pathRestrictions == null ? 0: this.pathRestrictions.hashCode());
    result = 31 * result + (this.propertyRestrictions == null ? 0: this.propertyRestrictions.hashCode());
    result = 31 * result + (this.primarytypesRestrictions == null ? 0: this.primarytypesRestrictions.hashCode());
    result = 31 * result + (this.ignoredProperties == null ? 0: this.ignoredProperties.hashCode());
    result = 31 * result + (this.usedProperties == null ? 0: this.usedProperties.hashCode());
    result = 31 * result + (this.typeMappings == null ? 0: this.typeMappings.hashCode());
    result = 31 * result + (this.propertyMappings == null ? 0: this.propertyMappings.hashCode());
    result = 31 * result + (this.collapseJcrcontentNodes == null ? 0: this.collapseJcrcontentNodes.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties {\n");
    
    sb.append("  pathDescField: ").append(pathDescField).append("\n");
    sb.append("  pathChildField: ").append(pathChildField).append("\n");
    sb.append("  pathParentField: ").append(pathParentField).append("\n");
    sb.append("  pathExactField: ").append(pathExactField).append("\n");
    sb.append("  catchAllField: ").append(catchAllField).append("\n");
    sb.append("  collapsedPathField: ").append(collapsedPathField).append("\n");
    sb.append("  pathDepthField: ").append(pathDepthField).append("\n");
    sb.append("  commitPolicy: ").append(commitPolicy).append("\n");
    sb.append("  rows: ").append(rows).append("\n");
    sb.append("  pathRestrictions: ").append(pathRestrictions).append("\n");
    sb.append("  propertyRestrictions: ").append(propertyRestrictions).append("\n");
    sb.append("  primarytypesRestrictions: ").append(primarytypesRestrictions).append("\n");
    sb.append("  ignoredProperties: ").append(ignoredProperties).append("\n");
    sb.append("  usedProperties: ").append(usedProperties).append("\n");
    sb.append("  typeMappings: ").append(typeMappings).append("\n");
    sb.append("  propertyMappings: ").append(propertyMappings).append("\n");
    sb.append("  collapseJcrcontentNodes: ").append(collapseJcrcontentNodes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}