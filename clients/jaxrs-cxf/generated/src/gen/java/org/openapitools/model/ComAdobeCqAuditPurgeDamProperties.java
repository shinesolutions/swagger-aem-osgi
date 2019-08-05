package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqAuditPurgeDamProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString auditlogRuleName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString auditlogRuleContentpath = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger auditlogRuleMinimumage = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown auditlogRuleTypes = null;
 /**
   * Get auditlogRuleName
   * @return auditlogRuleName
  **/
  @JsonProperty("auditlog.rule.name")
  public ConfigNodePropertyString getAuditlogRuleName() {
    return auditlogRuleName;
  }

  public void setAuditlogRuleName(ConfigNodePropertyString auditlogRuleName) {
    this.auditlogRuleName = auditlogRuleName;
  }

  public ComAdobeCqAuditPurgeDamProperties auditlogRuleName(ConfigNodePropertyString auditlogRuleName) {
    this.auditlogRuleName = auditlogRuleName;
    return this;
  }

 /**
   * Get auditlogRuleContentpath
   * @return auditlogRuleContentpath
  **/
  @JsonProperty("auditlog.rule.contentpath")
  public ConfigNodePropertyString getAuditlogRuleContentpath() {
    return auditlogRuleContentpath;
  }

  public void setAuditlogRuleContentpath(ConfigNodePropertyString auditlogRuleContentpath) {
    this.auditlogRuleContentpath = auditlogRuleContentpath;
  }

  public ComAdobeCqAuditPurgeDamProperties auditlogRuleContentpath(ConfigNodePropertyString auditlogRuleContentpath) {
    this.auditlogRuleContentpath = auditlogRuleContentpath;
    return this;
  }

 /**
   * Get auditlogRuleMinimumage
   * @return auditlogRuleMinimumage
  **/
  @JsonProperty("auditlog.rule.minimumage")
  public ConfigNodePropertyInteger getAuditlogRuleMinimumage() {
    return auditlogRuleMinimumage;
  }

  public void setAuditlogRuleMinimumage(ConfigNodePropertyInteger auditlogRuleMinimumage) {
    this.auditlogRuleMinimumage = auditlogRuleMinimumage;
  }

  public ComAdobeCqAuditPurgeDamProperties auditlogRuleMinimumage(ConfigNodePropertyInteger auditlogRuleMinimumage) {
    this.auditlogRuleMinimumage = auditlogRuleMinimumage;
    return this;
  }

 /**
   * Get auditlogRuleTypes
   * @return auditlogRuleTypes
  **/
  @JsonProperty("auditlog.rule.types")
  public ConfigNodePropertyDropDown getAuditlogRuleTypes() {
    return auditlogRuleTypes;
  }

  public void setAuditlogRuleTypes(ConfigNodePropertyDropDown auditlogRuleTypes) {
    this.auditlogRuleTypes = auditlogRuleTypes;
  }

  public ComAdobeCqAuditPurgeDamProperties auditlogRuleTypes(ConfigNodePropertyDropDown auditlogRuleTypes) {
    this.auditlogRuleTypes = auditlogRuleTypes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqAuditPurgeDamProperties {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

