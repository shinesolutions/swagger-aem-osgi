package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties   {
  
  private ConfigNodePropertyString pathDescField = null;
  private ConfigNodePropertyString pathChildField = null;
  private ConfigNodePropertyString pathParentField = null;
  private ConfigNodePropertyString pathExactField = null;
  private ConfigNodePropertyString catchAllField = null;
  private ConfigNodePropertyString collapsedPathField = null;
  private ConfigNodePropertyString pathDepthField = null;
  private ConfigNodePropertyDropDown commitPolicy = null;
  private ConfigNodePropertyInteger rows = null;
  private ConfigNodePropertyBoolean pathRestrictions = null;
  private ConfigNodePropertyBoolean propertyRestrictions = null;
  private ConfigNodePropertyBoolean primarytypesRestrictions = null;
  private ConfigNodePropertyArray ignoredProperties = null;
  private ConfigNodePropertyArray usedProperties = null;
  private ConfigNodePropertyArray typeMappings = null;
  private ConfigNodePropertyArray propertyMappings = null;
  private ConfigNodePropertyBoolean collapseJcrcontentNodes = null;

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties () {

  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties (ConfigNodePropertyString pathDescField, ConfigNodePropertyString pathChildField, ConfigNodePropertyString pathParentField, ConfigNodePropertyString pathExactField, ConfigNodePropertyString catchAllField, ConfigNodePropertyString collapsedPathField, ConfigNodePropertyString pathDepthField, ConfigNodePropertyDropDown commitPolicy, ConfigNodePropertyInteger rows, ConfigNodePropertyBoolean pathRestrictions, ConfigNodePropertyBoolean propertyRestrictions, ConfigNodePropertyBoolean primarytypesRestrictions, ConfigNodePropertyArray ignoredProperties, ConfigNodePropertyArray usedProperties, ConfigNodePropertyArray typeMappings, ConfigNodePropertyArray propertyMappings, ConfigNodePropertyBoolean collapseJcrcontentNodes) {
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

    
  @JsonProperty("path.desc.field")
  public ConfigNodePropertyString getPathDescField() {
    return pathDescField;
  }
  public void setPathDescField(ConfigNodePropertyString pathDescField) {
    this.pathDescField = pathDescField;
  }

    
  @JsonProperty("path.child.field")
  public ConfigNodePropertyString getPathChildField() {
    return pathChildField;
  }
  public void setPathChildField(ConfigNodePropertyString pathChildField) {
    this.pathChildField = pathChildField;
  }

    
  @JsonProperty("path.parent.field")
  public ConfigNodePropertyString getPathParentField() {
    return pathParentField;
  }
  public void setPathParentField(ConfigNodePropertyString pathParentField) {
    this.pathParentField = pathParentField;
  }

    
  @JsonProperty("path.exact.field")
  public ConfigNodePropertyString getPathExactField() {
    return pathExactField;
  }
  public void setPathExactField(ConfigNodePropertyString pathExactField) {
    this.pathExactField = pathExactField;
  }

    
  @JsonProperty("catch.all.field")
  public ConfigNodePropertyString getCatchAllField() {
    return catchAllField;
  }
  public void setCatchAllField(ConfigNodePropertyString catchAllField) {
    this.catchAllField = catchAllField;
  }

    
  @JsonProperty("collapsed.path.field")
  public ConfigNodePropertyString getCollapsedPathField() {
    return collapsedPathField;
  }
  public void setCollapsedPathField(ConfigNodePropertyString collapsedPathField) {
    this.collapsedPathField = collapsedPathField;
  }

    
  @JsonProperty("path.depth.field")
  public ConfigNodePropertyString getPathDepthField() {
    return pathDepthField;
  }
  public void setPathDepthField(ConfigNodePropertyString pathDepthField) {
    this.pathDepthField = pathDepthField;
  }

    
  @JsonProperty("commit.policy")
  public ConfigNodePropertyDropDown getCommitPolicy() {
    return commitPolicy;
  }
  public void setCommitPolicy(ConfigNodePropertyDropDown commitPolicy) {
    this.commitPolicy = commitPolicy;
  }

    
  @JsonProperty("rows")
  public ConfigNodePropertyInteger getRows() {
    return rows;
  }
  public void setRows(ConfigNodePropertyInteger rows) {
    this.rows = rows;
  }

    
  @JsonProperty("path.restrictions")
  public ConfigNodePropertyBoolean getPathRestrictions() {
    return pathRestrictions;
  }
  public void setPathRestrictions(ConfigNodePropertyBoolean pathRestrictions) {
    this.pathRestrictions = pathRestrictions;
  }

    
  @JsonProperty("property.restrictions")
  public ConfigNodePropertyBoolean getPropertyRestrictions() {
    return propertyRestrictions;
  }
  public void setPropertyRestrictions(ConfigNodePropertyBoolean propertyRestrictions) {
    this.propertyRestrictions = propertyRestrictions;
  }

    
  @JsonProperty("primarytypes.restrictions")
  public ConfigNodePropertyBoolean getPrimarytypesRestrictions() {
    return primarytypesRestrictions;
  }
  public void setPrimarytypesRestrictions(ConfigNodePropertyBoolean primarytypesRestrictions) {
    this.primarytypesRestrictions = primarytypesRestrictions;
  }

    
  @JsonProperty("ignored.properties")
  public ConfigNodePropertyArray getIgnoredProperties() {
    return ignoredProperties;
  }
  public void setIgnoredProperties(ConfigNodePropertyArray ignoredProperties) {
    this.ignoredProperties = ignoredProperties;
  }

    
  @JsonProperty("used.properties")
  public ConfigNodePropertyArray getUsedProperties() {
    return usedProperties;
  }
  public void setUsedProperties(ConfigNodePropertyArray usedProperties) {
    this.usedProperties = usedProperties;
  }

    
  @JsonProperty("type.mappings")
  public ConfigNodePropertyArray getTypeMappings() {
    return typeMappings;
  }
  public void setTypeMappings(ConfigNodePropertyArray typeMappings) {
    this.typeMappings = typeMappings;
  }

    
  @JsonProperty("property.mappings")
  public ConfigNodePropertyArray getPropertyMappings() {
    return propertyMappings;
  }
  public void setPropertyMappings(ConfigNodePropertyArray propertyMappings) {
    this.propertyMappings = propertyMappings;
  }

    
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
    return Objects.equals(pathDescField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathDescField) &&
        Objects.equals(pathChildField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathChildField) &&
        Objects.equals(pathParentField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathParentField) &&
        Objects.equals(pathExactField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathExactField) &&
        Objects.equals(catchAllField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.catchAllField) &&
        Objects.equals(collapsedPathField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.collapsedPathField) &&
        Objects.equals(pathDepthField, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathDepthField) &&
        Objects.equals(commitPolicy, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.commitPolicy) &&
        Objects.equals(rows, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.rows) &&
        Objects.equals(pathRestrictions, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.pathRestrictions) &&
        Objects.equals(propertyRestrictions, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.propertyRestrictions) &&
        Objects.equals(primarytypesRestrictions, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.primarytypesRestrictions) &&
        Objects.equals(ignoredProperties, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.ignoredProperties) &&
        Objects.equals(usedProperties, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.usedProperties) &&
        Objects.equals(typeMappings, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.typeMappings) &&
        Objects.equals(propertyMappings, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.propertyMappings) &&
        Objects.equals(collapseJcrcontentNodes, orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.collapseJcrcontentNodes);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
