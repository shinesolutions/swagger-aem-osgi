package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingSecurityImplReferrerFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingSecurityImplReferrerFilterProperties   {
  @JsonProperty("allow.empty")
  @Valid

  private ConfigNodePropertyBoolean allowEmpty;

  @JsonProperty("allow.hosts")
  @Valid

  private ConfigNodePropertyArray allowHosts;

  @JsonProperty("allow.hosts.regexp")
  @Valid

  private ConfigNodePropertyArray allowHostsRegexp;

  @JsonProperty("filter.methods")
  @Valid

  private ConfigNodePropertyArray filterMethods;

  @JsonProperty("exclude.agents.regexp")
  @Valid

  private ConfigNodePropertyArray excludeAgentsRegexp;

  public OrgApacheSlingSecurityImplReferrerFilterProperties allowEmpty(ConfigNodePropertyBoolean allowEmpty) {
    this.allowEmpty = allowEmpty;
    return this;
  }

   /**
   * Get allowEmpty
   * @return allowEmpty
  **/
  public ConfigNodePropertyBoolean getAllowEmpty() {
    return allowEmpty;
  }

  public void setAllowEmpty(ConfigNodePropertyBoolean allowEmpty) {
    this.allowEmpty = allowEmpty;
  }

  public OrgApacheSlingSecurityImplReferrerFilterProperties allowHosts(ConfigNodePropertyArray allowHosts) {
    this.allowHosts = allowHosts;
    return this;
  }

   /**
   * Get allowHosts
   * @return allowHosts
  **/
  public ConfigNodePropertyArray getAllowHosts() {
    return allowHosts;
  }

  public void setAllowHosts(ConfigNodePropertyArray allowHosts) {
    this.allowHosts = allowHosts;
  }

  public OrgApacheSlingSecurityImplReferrerFilterProperties allowHostsRegexp(ConfigNodePropertyArray allowHostsRegexp) {
    this.allowHostsRegexp = allowHostsRegexp;
    return this;
  }

   /**
   * Get allowHostsRegexp
   * @return allowHostsRegexp
  **/
  public ConfigNodePropertyArray getAllowHostsRegexp() {
    return allowHostsRegexp;
  }

  public void setAllowHostsRegexp(ConfigNodePropertyArray allowHostsRegexp) {
    this.allowHostsRegexp = allowHostsRegexp;
  }

  public OrgApacheSlingSecurityImplReferrerFilterProperties filterMethods(ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
    return this;
  }

   /**
   * Get filterMethods
   * @return filterMethods
  **/
  public ConfigNodePropertyArray getFilterMethods() {
    return filterMethods;
  }

  public void setFilterMethods(ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
  }

  public OrgApacheSlingSecurityImplReferrerFilterProperties excludeAgentsRegexp(ConfigNodePropertyArray excludeAgentsRegexp) {
    this.excludeAgentsRegexp = excludeAgentsRegexp;
    return this;
  }

   /**
   * Get excludeAgentsRegexp
   * @return excludeAgentsRegexp
  **/
  public ConfigNodePropertyArray getExcludeAgentsRegexp() {
    return excludeAgentsRegexp;
  }

  public void setExcludeAgentsRegexp(ConfigNodePropertyArray excludeAgentsRegexp) {
    this.excludeAgentsRegexp = excludeAgentsRegexp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingSecurityImplReferrerFilterProperties orgApacheSlingSecurityImplReferrerFilterProperties = (OrgApacheSlingSecurityImplReferrerFilterProperties) o;
    return Objects.equals(allowEmpty, orgApacheSlingSecurityImplReferrerFilterProperties.allowEmpty) &&
        Objects.equals(allowHosts, orgApacheSlingSecurityImplReferrerFilterProperties.allowHosts) &&
        Objects.equals(allowHostsRegexp, orgApacheSlingSecurityImplReferrerFilterProperties.allowHostsRegexp) &&
        Objects.equals(filterMethods, orgApacheSlingSecurityImplReferrerFilterProperties.filterMethods) &&
        Objects.equals(excludeAgentsRegexp, orgApacheSlingSecurityImplReferrerFilterProperties.excludeAgentsRegexp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEmpty, allowHosts, allowHostsRegexp, filterMethods, excludeAgentsRegexp);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingSecurityImplReferrerFilterProperties {\n");
    
    sb.append("    allowEmpty: ").append(toIndentedString(allowEmpty)).append("\n");
    sb.append("    allowHosts: ").append(toIndentedString(allowHosts)).append("\n");
    sb.append("    allowHostsRegexp: ").append(toIndentedString(allowHostsRegexp)).append("\n");
    sb.append("    filterMethods: ").append(toIndentedString(filterMethods)).append("\n");
    sb.append("    excludeAgentsRegexp: ").append(toIndentedString(excludeAgentsRegexp)).append("\n");
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

