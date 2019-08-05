package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties   {
  @JsonProperty("path.desc.field")
  private ConfigNodePropertyString pathDescField = null;

  @JsonProperty("path.child.field")
  private ConfigNodePropertyString pathChildField = null;

  @JsonProperty("path.parent.field")
  private ConfigNodePropertyString pathParentField = null;

  @JsonProperty("path.exact.field")
  private ConfigNodePropertyString pathExactField = null;

  @JsonProperty("catch.all.field")
  private ConfigNodePropertyString catchAllField = null;

  @JsonProperty("collapsed.path.field")
  private ConfigNodePropertyString collapsedPathField = null;

  @JsonProperty("path.depth.field")
  private ConfigNodePropertyString pathDepthField = null;

  @JsonProperty("commit.policy")
  private ConfigNodePropertyDropDown commitPolicy = null;

  @JsonProperty("rows")
  private ConfigNodePropertyInteger rows = null;

  @JsonProperty("path.restrictions")
  private ConfigNodePropertyBoolean pathRestrictions = null;

  @JsonProperty("property.restrictions")
  private ConfigNodePropertyBoolean propertyRestrictions = null;

  @JsonProperty("primarytypes.restrictions")
  private ConfigNodePropertyBoolean primarytypesRestrictions = null;

  @JsonProperty("ignored.properties")
  private ConfigNodePropertyArray ignoredProperties = null;

  @JsonProperty("used.properties")
  private ConfigNodePropertyArray usedProperties = null;

  @JsonProperty("type.mappings")
  private ConfigNodePropertyArray typeMappings = null;

  @JsonProperty("property.mappings")
  private ConfigNodePropertyArray propertyMappings = null;

  @JsonProperty("collapse.jcrcontent.nodes")
  private ConfigNodePropertyBoolean collapseJcrcontentNodes = null;

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties pathDescField(ConfigNodePropertyString pathDescField) {
    this.pathDescField = pathDescField;
    return this;
  }

   /**
   * Get pathDescField
   * @return pathDescField
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCollapseJcrcontentNodes() {
    return collapseJcrcontentNodes;
  }

  public void setCollapseJcrcontentNodes(ConfigNodePropertyBoolean collapseJcrcontentNodes) {
    this.collapseJcrcontentNodes = collapseJcrcontentNodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

