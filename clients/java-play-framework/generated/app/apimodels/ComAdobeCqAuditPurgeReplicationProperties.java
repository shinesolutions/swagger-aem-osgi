package apimodels;

import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqAuditPurgeReplicationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqAuditPurgeReplicationProperties   {
  @JsonProperty("auditlog.rule.name")
  private ConfigNodePropertyString auditlogRuleName = null;

  @JsonProperty("auditlog.rule.contentpath")
  private ConfigNodePropertyString auditlogRuleContentpath = null;

  @JsonProperty("auditlog.rule.minimumage")
  private ConfigNodePropertyInteger auditlogRuleMinimumage = null;

  @JsonProperty("auditlog.rule.types")
  private ConfigNodePropertyDropDown auditlogRuleTypes = null;

  public ComAdobeCqAuditPurgeReplicationProperties auditlogRuleName(ConfigNodePropertyString auditlogRuleName) {
    this.auditlogRuleName = auditlogRuleName;
    return this;
  }

   /**
   * Get auditlogRuleName
   * @return auditlogRuleName
  **/
  @Valid
  public ConfigNodePropertyString getAuditlogRuleName() {
    return auditlogRuleName;
  }

  public void setAuditlogRuleName(ConfigNodePropertyString auditlogRuleName) {
    this.auditlogRuleName = auditlogRuleName;
  }

  public ComAdobeCqAuditPurgeReplicationProperties auditlogRuleContentpath(ConfigNodePropertyString auditlogRuleContentpath) {
    this.auditlogRuleContentpath = auditlogRuleContentpath;
    return this;
  }

   /**
   * Get auditlogRuleContentpath
   * @return auditlogRuleContentpath
  **/
  @Valid
  public ConfigNodePropertyString getAuditlogRuleContentpath() {
    return auditlogRuleContentpath;
  }

  public void setAuditlogRuleContentpath(ConfigNodePropertyString auditlogRuleContentpath) {
    this.auditlogRuleContentpath = auditlogRuleContentpath;
  }

  public ComAdobeCqAuditPurgeReplicationProperties auditlogRuleMinimumage(ConfigNodePropertyInteger auditlogRuleMinimumage) {
    this.auditlogRuleMinimumage = auditlogRuleMinimumage;
    return this;
  }

   /**
   * Get auditlogRuleMinimumage
   * @return auditlogRuleMinimumage
  **/
  @Valid
  public ConfigNodePropertyInteger getAuditlogRuleMinimumage() {
    return auditlogRuleMinimumage;
  }

  public void setAuditlogRuleMinimumage(ConfigNodePropertyInteger auditlogRuleMinimumage) {
    this.auditlogRuleMinimumage = auditlogRuleMinimumage;
  }

  public ComAdobeCqAuditPurgeReplicationProperties auditlogRuleTypes(ConfigNodePropertyDropDown auditlogRuleTypes) {
    this.auditlogRuleTypes = auditlogRuleTypes;
    return this;
  }

   /**
   * Get auditlogRuleTypes
   * @return auditlogRuleTypes
  **/
  @Valid
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
    ComAdobeCqAuditPurgeReplicationProperties comAdobeCqAuditPurgeReplicationProperties = (ComAdobeCqAuditPurgeReplicationProperties) o;
    return Objects.equals(auditlogRuleName, comAdobeCqAuditPurgeReplicationProperties.auditlogRuleName) &&
        Objects.equals(auditlogRuleContentpath, comAdobeCqAuditPurgeReplicationProperties.auditlogRuleContentpath) &&
        Objects.equals(auditlogRuleMinimumage, comAdobeCqAuditPurgeReplicationProperties.auditlogRuleMinimumage) &&
        Objects.equals(auditlogRuleTypes, comAdobeCqAuditPurgeReplicationProperties.auditlogRuleTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditlogRuleName, auditlogRuleContentpath, auditlogRuleMinimumage, auditlogRuleTypes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqAuditPurgeReplicationProperties {\n");
    
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

