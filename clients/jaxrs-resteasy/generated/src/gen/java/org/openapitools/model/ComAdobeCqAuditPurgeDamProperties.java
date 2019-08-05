package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqAuditPurgeDamProperties   {
  
  private ConfigNodePropertyString auditlogRuleName = null;
  private ConfigNodePropertyString auditlogRuleContentpath = null;
  private ConfigNodePropertyInteger auditlogRuleMinimumage = null;
  private ConfigNodePropertyDropDown auditlogRuleTypes = null;

  /**
   **/
  
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
    ComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties = (ComAdobeCqAuditPurgeDamProperties) o;
    return Objects.equals(auditlogRuleName, comAdobeCqAuditPurgeDamProperties.auditlogRuleName) &&
        Objects.equals(auditlogRuleContentpath, comAdobeCqAuditPurgeDamProperties.auditlogRuleContentpath) &&
        Objects.equals(auditlogRuleMinimumage, comAdobeCqAuditPurgeDamProperties.auditlogRuleMinimumage) &&
        Objects.equals(auditlogRuleTypes, comAdobeCqAuditPurgeDamProperties.auditlogRuleTypes);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

