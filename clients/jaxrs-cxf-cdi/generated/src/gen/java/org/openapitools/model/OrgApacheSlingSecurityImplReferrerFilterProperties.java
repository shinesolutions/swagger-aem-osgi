package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheSlingSecurityImplReferrerFilterProperties   {
  
  private ConfigNodePropertyBoolean allowEmpty = null;

  private ConfigNodePropertyArray allowHosts = null;

  private ConfigNodePropertyArray allowHostsRegexp = null;

  private ConfigNodePropertyArray filterMethods = null;

  private ConfigNodePropertyArray excludeAgentsRegexp = null;


  /**
   **/
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
   **/
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
   **/
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
   **/
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
   **/
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

