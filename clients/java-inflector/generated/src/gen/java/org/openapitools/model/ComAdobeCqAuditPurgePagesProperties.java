package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeCqAuditPurgePagesProperties   {
  @JsonProperty("auditlog.rule.name")
  private ConfigNodePropertyString auditlogRuleName = null;

  @JsonProperty("auditlog.rule.contentpath")
  private ConfigNodePropertyString auditlogRuleContentpath = null;

  @JsonProperty("auditlog.rule.minimumage")
  private ConfigNodePropertyInteger auditlogRuleMinimumage = null;

  @JsonProperty("auditlog.rule.types")
  private ConfigNodePropertyDropDown auditlogRuleTypes = null;

  /**
   **/
  public ComAdobeCqAuditPurgePagesProperties auditlogRuleName(ConfigNodePropertyString auditlogRuleName) {
    this.auditlogRuleName = auditlogRuleName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auditlog.rule.name")
  public ConfigNodePropertyString getAuditlogRuleName() {
    return auditlogRuleName;
  }
  public void setAuditlogRuleName(ConfigNodePropertyString auditlogRuleName) {
    this.auditlogRuleName = auditlogRuleName;
  }

  /**
   **/
  public ComAdobeCqAuditPurgePagesProperties auditlogRuleContentpath(ConfigNodePropertyString auditlogRuleContentpath) {
    this.auditlogRuleContentpath = auditlogRuleContentpath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auditlog.rule.contentpath")
  public ConfigNodePropertyString getAuditlogRuleContentpath() {
    return auditlogRuleContentpath;
  }
  public void setAuditlogRuleContentpath(ConfigNodePropertyString auditlogRuleContentpath) {
    this.auditlogRuleContentpath = auditlogRuleContentpath;
  }

  /**
   **/
  public ComAdobeCqAuditPurgePagesProperties auditlogRuleMinimumage(ConfigNodePropertyInteger auditlogRuleMinimumage) {
    this.auditlogRuleMinimumage = auditlogRuleMinimumage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auditlog.rule.minimumage")
  public ConfigNodePropertyInteger getAuditlogRuleMinimumage() {
    return auditlogRuleMinimumage;
  }
  public void setAuditlogRuleMinimumage(ConfigNodePropertyInteger auditlogRuleMinimumage) {
    this.auditlogRuleMinimumage = auditlogRuleMinimumage;
  }

  /**
   **/
  public ComAdobeCqAuditPurgePagesProperties auditlogRuleTypes(ConfigNodePropertyDropDown auditlogRuleTypes) {
    this.auditlogRuleTypes = auditlogRuleTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auditlog.rule.types")
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
    return Objects.equals(auditlogRuleName, comAdobeCqAuditPurgePagesProperties.auditlogRuleName) &&
        Objects.equals(auditlogRuleContentpath, comAdobeCqAuditPurgePagesProperties.auditlogRuleContentpath) &&
        Objects.equals(auditlogRuleMinimumage, comAdobeCqAuditPurgePagesProperties.auditlogRuleMinimumage) &&
        Objects.equals(auditlogRuleTypes, comAdobeCqAuditPurgePagesProperties.auditlogRuleTypes);
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

