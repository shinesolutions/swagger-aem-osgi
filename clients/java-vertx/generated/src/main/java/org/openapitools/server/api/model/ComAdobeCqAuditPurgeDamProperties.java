package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqAuditPurgeDamProperties   {
  
  private ConfigNodePropertyString auditlogRuleName = null;
  private ConfigNodePropertyString auditlogRuleContentpath = null;
  private ConfigNodePropertyInteger auditlogRuleMinimumage = null;
  private ConfigNodePropertyDropDown auditlogRuleTypes = null;

  public ComAdobeCqAuditPurgeDamProperties () {

  }

  public ComAdobeCqAuditPurgeDamProperties (ConfigNodePropertyString auditlogRuleName, ConfigNodePropertyString auditlogRuleContentpath, ConfigNodePropertyInteger auditlogRuleMinimumage, ConfigNodePropertyDropDown auditlogRuleTypes) {
    this.auditlogRuleName = auditlogRuleName;
    this.auditlogRuleContentpath = auditlogRuleContentpath;
    this.auditlogRuleMinimumage = auditlogRuleMinimumage;
    this.auditlogRuleTypes = auditlogRuleTypes;
  }

    
  @JsonProperty("auditlog.rule.name")
  public ConfigNodePropertyString getAuditlogRuleName() {
    return auditlogRuleName;
  }
  public void setAuditlogRuleName(ConfigNodePropertyString auditlogRuleName) {
    this.auditlogRuleName = auditlogRuleName;
  }

    
  @JsonProperty("auditlog.rule.contentpath")
  public ConfigNodePropertyString getAuditlogRuleContentpath() {
    return auditlogRuleContentpath;
  }
  public void setAuditlogRuleContentpath(ConfigNodePropertyString auditlogRuleContentpath) {
    this.auditlogRuleContentpath = auditlogRuleContentpath;
  }

    
  @JsonProperty("auditlog.rule.minimumage")
  public ConfigNodePropertyInteger getAuditlogRuleMinimumage() {
    return auditlogRuleMinimumage;
  }
  public void setAuditlogRuleMinimumage(ConfigNodePropertyInteger auditlogRuleMinimumage) {
    this.auditlogRuleMinimumage = auditlogRuleMinimumage;
  }

    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
