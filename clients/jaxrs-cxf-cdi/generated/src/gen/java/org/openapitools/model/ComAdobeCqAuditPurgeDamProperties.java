package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComAdobeCqAuditPurgeDamProperties   {
  
  private ConfigNodePropertyString auditlogRuleName;

  private ConfigNodePropertyString auditlogRuleContentpath;

  private ConfigNodePropertyInteger auditlogRuleMinimumage;

  private ConfigNodePropertyDropDown auditlogRuleTypes;

  /**
   **/
  public ComAdobeCqAuditPurgeDamProperties auditlogRuleName(ConfigNodePropertyString auditlogRuleName) {
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
  public ComAdobeCqAuditPurgeDamProperties auditlogRuleContentpath(ConfigNodePropertyString auditlogRuleContentpath) {
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
  public ComAdobeCqAuditPurgeDamProperties auditlogRuleMinimumage(ConfigNodePropertyInteger auditlogRuleMinimumage) {
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
  public ComAdobeCqAuditPurgeDamProperties auditlogRuleTypes(ConfigNodePropertyDropDown auditlogRuleTypes) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties = (ComAdobeCqAuditPurgeDamProperties) o;
    return Objects.equals(this.auditlogRuleName, comAdobeCqAuditPurgeDamProperties.auditlogRuleName) &&
        Objects.equals(this.auditlogRuleContentpath, comAdobeCqAuditPurgeDamProperties.auditlogRuleContentpath) &&
        Objects.equals(this.auditlogRuleMinimumage, comAdobeCqAuditPurgeDamProperties.auditlogRuleMinimumage) &&
        Objects.equals(this.auditlogRuleTypes, comAdobeCqAuditPurgeDamProperties.auditlogRuleTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditlogRuleName, auditlogRuleContentpath, auditlogRuleMinimumage, auditlogRuleTypes);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

