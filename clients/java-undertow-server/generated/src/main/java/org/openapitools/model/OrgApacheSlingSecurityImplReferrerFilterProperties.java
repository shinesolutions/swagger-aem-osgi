/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingSecurityImplReferrerFilterProperties   {
  
  private ConfigNodePropertyBoolean allowEmpty;
  private ConfigNodePropertyArray allowHosts;
  private ConfigNodePropertyArray allowHostsRegexp;
  private ConfigNodePropertyArray filterMethods;
  private ConfigNodePropertyArray excludeAgentsRegexp;

  /**
   */
  public OrgApacheSlingSecurityImplReferrerFilterProperties allowEmpty(ConfigNodePropertyBoolean allowEmpty) {
    this.allowEmpty = allowEmpty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("allow.empty")
  public ConfigNodePropertyBoolean getAllowEmpty() {
    return allowEmpty;
  }
  public void setAllowEmpty(ConfigNodePropertyBoolean allowEmpty) {
    this.allowEmpty = allowEmpty;
  }

  /**
   */
  public OrgApacheSlingSecurityImplReferrerFilterProperties allowHosts(ConfigNodePropertyArray allowHosts) {
    this.allowHosts = allowHosts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("allow.hosts")
  public ConfigNodePropertyArray getAllowHosts() {
    return allowHosts;
  }
  public void setAllowHosts(ConfigNodePropertyArray allowHosts) {
    this.allowHosts = allowHosts;
  }

  /**
   */
  public OrgApacheSlingSecurityImplReferrerFilterProperties allowHostsRegexp(ConfigNodePropertyArray allowHostsRegexp) {
    this.allowHostsRegexp = allowHostsRegexp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("allow.hosts.regexp")
  public ConfigNodePropertyArray getAllowHostsRegexp() {
    return allowHostsRegexp;
  }
  public void setAllowHostsRegexp(ConfigNodePropertyArray allowHostsRegexp) {
    this.allowHostsRegexp = allowHostsRegexp;
  }

  /**
   */
  public OrgApacheSlingSecurityImplReferrerFilterProperties filterMethods(ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("filter.methods")
  public ConfigNodePropertyArray getFilterMethods() {
    return filterMethods;
  }
  public void setFilterMethods(ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
  }

  /**
   */
  public OrgApacheSlingSecurityImplReferrerFilterProperties excludeAgentsRegexp(ConfigNodePropertyArray excludeAgentsRegexp) {
    this.excludeAgentsRegexp = excludeAgentsRegexp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exclude.agents.regexp")
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

