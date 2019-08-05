package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingSecurityImplReferrerFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingSecurityImplReferrerFilterProperties   {
  @JsonProperty("allow.empty")
  private ConfigNodePropertyBoolean allowEmpty = null;

  @JsonProperty("allow.hosts")
  private ConfigNodePropertyArray allowHosts = null;

  @JsonProperty("allow.hosts.regexp")
  private ConfigNodePropertyArray allowHostsRegexp = null;

  @JsonProperty("filter.methods")
  private ConfigNodePropertyArray filterMethods = null;

  @JsonProperty("exclude.agents.regexp")
  private ConfigNodePropertyArray excludeAgentsRegexp = null;

  public OrgApacheSlingSecurityImplReferrerFilterProperties allowEmpty(ConfigNodePropertyBoolean allowEmpty) {
    this.allowEmpty = allowEmpty;
    return this;
  }

   /**
   * Get allowEmpty
   * @return allowEmpty
  **/
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
  public ConfigNodePropertyArray getExcludeAgentsRegexp() {
    return excludeAgentsRegexp;
  }

  public void setExcludeAgentsRegexp(ConfigNodePropertyArray excludeAgentsRegexp) {
    this.excludeAgentsRegexp = excludeAgentsRegexp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

