package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

