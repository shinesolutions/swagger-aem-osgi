package org.openapitools.model;

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

public class ComAdobeCqAuditPurgeDamProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("auditlog.rule.name")
  private ConfigNodePropertyString auditlogRuleName;

  @JsonProperty("auditlog.rule.contentpath")
  private ConfigNodePropertyString auditlogRuleContentpath;

  @JsonProperty("auditlog.rule.minimumage")
  private ConfigNodePropertyInteger auditlogRuleMinimumage;

  @JsonProperty("auditlog.rule.types")
  private ConfigNodePropertyDropDown auditlogRuleTypes;

  /**
   * 
   * @return auditlogRuleName
   */
  public ConfigNodePropertyString getAuditlogRuleName() {
    return auditlogRuleName;
  }

  public void setAuditlogRuleName(ConfigNodePropertyString auditlogRuleName) {
    this.auditlogRuleName = auditlogRuleName;
  }

  /**
   * 
   * @return auditlogRuleContentpath
   */
  public ConfigNodePropertyString getAuditlogRuleContentpath() {
    return auditlogRuleContentpath;
  }

  public void setAuditlogRuleContentpath(ConfigNodePropertyString auditlogRuleContentpath) {
    this.auditlogRuleContentpath = auditlogRuleContentpath;
  }

  /**
   * 
   * @return auditlogRuleMinimumage
   */
  public ConfigNodePropertyInteger getAuditlogRuleMinimumage() {
    return auditlogRuleMinimumage;
  }

  public void setAuditlogRuleMinimumage(ConfigNodePropertyInteger auditlogRuleMinimumage) {
    this.auditlogRuleMinimumage = auditlogRuleMinimumage;
  }

  /**
   * 
   * @return auditlogRuleTypes
   */
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
