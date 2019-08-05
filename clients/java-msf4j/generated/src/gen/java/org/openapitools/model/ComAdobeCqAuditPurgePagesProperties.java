package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeCqAuditPurgePagesProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqAuditPurgePagesProperties   {
  @JsonProperty("auditlog.rule.name")
  private ConfigNodePropertyString auditlogRuleName = null;

  @JsonProperty("auditlog.rule.contentpath")
  private ConfigNodePropertyString auditlogRuleContentpath = null;

  @JsonProperty("auditlog.rule.minimumage")
  private ConfigNodePropertyInteger auditlogRuleMinimumage = null;

  @JsonProperty("auditlog.rule.types")
  private ConfigNodePropertyDropDown auditlogRuleTypes = null;

  public ComAdobeCqAuditPurgePagesProperties auditlogRuleName(ConfigNodePropertyString auditlogRuleName) {
    this.auditlogRuleName = auditlogRuleName;
    return this;
  }

   /**
   * Get auditlogRuleName
   * @return auditlogRuleName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAuditlogRuleName() {
    return auditlogRuleName;
  }

  public void setAuditlogRuleName(ConfigNodePropertyString auditlogRuleName) {
    this.auditlogRuleName = auditlogRuleName;
  }

  public ComAdobeCqAuditPurgePagesProperties auditlogRuleContentpath(ConfigNodePropertyString auditlogRuleContentpath) {
    this.auditlogRuleContentpath = auditlogRuleContentpath;
    return this;
  }

   /**
   * Get auditlogRuleContentpath
   * @return auditlogRuleContentpath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAuditlogRuleContentpath() {
    return auditlogRuleContentpath;
  }

  public void setAuditlogRuleContentpath(ConfigNodePropertyString auditlogRuleContentpath) {
    this.auditlogRuleContentpath = auditlogRuleContentpath;
  }

  public ComAdobeCqAuditPurgePagesProperties auditlogRuleMinimumage(ConfigNodePropertyInteger auditlogRuleMinimumage) {
    this.auditlogRuleMinimumage = auditlogRuleMinimumage;
    return this;
  }

   /**
   * Get auditlogRuleMinimumage
   * @return auditlogRuleMinimumage
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getAuditlogRuleMinimumage() {
    return auditlogRuleMinimumage;
  }

  public void setAuditlogRuleMinimumage(ConfigNodePropertyInteger auditlogRuleMinimumage) {
    this.auditlogRuleMinimumage = auditlogRuleMinimumage;
  }

  public ComAdobeCqAuditPurgePagesProperties auditlogRuleTypes(ConfigNodePropertyDropDown auditlogRuleTypes) {
    this.auditlogRuleTypes = auditlogRuleTypes;
    return this;
  }

   /**
   * Get auditlogRuleTypes
   * @return auditlogRuleTypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getAuditlogRuleTypes() {
    return auditlogRuleTypes;
  }

  public void setAuditlogRuleTypes(ConfigNodePropertyDropDown auditlogRuleTypes) {
    this.auditlogRuleTypes = auditlogRuleTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqAuditPurgePagesProperties comAdobeCqAuditPurgePagesProperties = (ComAdobeCqAuditPurgePagesProperties) o;
    return Objects.equals(this.auditlogRuleName, comAdobeCqAuditPurgePagesProperties.auditlogRuleName) &&
        Objects.equals(this.auditlogRuleContentpath, comAdobeCqAuditPurgePagesProperties.auditlogRuleContentpath) &&
        Objects.equals(this.auditlogRuleMinimumage, comAdobeCqAuditPurgePagesProperties.auditlogRuleMinimumage) &&
        Objects.equals(this.auditlogRuleTypes, comAdobeCqAuditPurgePagesProperties.auditlogRuleTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditlogRuleName, auditlogRuleContentpath, auditlogRuleMinimumage, auditlogRuleTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqAuditPurgePagesProperties {\n");
    
    sb.append("    auditlogRuleName: ").append(toIndentedString(auditlogRuleName)).append("\n");
    sb.append("    auditlogRuleContentpath: ").append(toIndentedString(auditlogRuleContentpath)).append("\n");
    sb.append("    auditlogRuleMinimumage: ").append(toIndentedString(auditlogRuleMinimumage)).append("\n");
    sb.append("    auditlogRuleTypes: ").append(toIndentedString(auditlogRuleTypes)).append("\n");
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

