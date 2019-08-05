package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingSecurityImplReferrerFilterProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean allowEmpty = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray allowHosts = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray allowHostsRegexp = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray filterMethods = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray excludeAgentsRegexp = null;
 /**
   * Get allowEmpty
   * @return allowEmpty
  **/
  @JsonProperty("allow.empty")
  public ConfigNodePropertyBoolean getAllowEmpty() {
    return allowEmpty;
  }

  public void setAllowEmpty(ConfigNodePropertyBoolean allowEmpty) {
    this.allowEmpty = allowEmpty;
  }

  public OrgApacheSlingSecurityImplReferrerFilterProperties allowEmpty(ConfigNodePropertyBoolean allowEmpty) {
    this.allowEmpty = allowEmpty;
    return this;
  }

 /**
   * Get allowHosts
   * @return allowHosts
  **/
  @JsonProperty("allow.hosts")
  public ConfigNodePropertyArray getAllowHosts() {
    return allowHosts;
  }

  public void setAllowHosts(ConfigNodePropertyArray allowHosts) {
    this.allowHosts = allowHosts;
  }

  public OrgApacheSlingSecurityImplReferrerFilterProperties allowHosts(ConfigNodePropertyArray allowHosts) {
    this.allowHosts = allowHosts;
    return this;
  }

 /**
   * Get allowHostsRegexp
   * @return allowHostsRegexp
  **/
  @JsonProperty("allow.hosts.regexp")
  public ConfigNodePropertyArray getAllowHostsRegexp() {
    return allowHostsRegexp;
  }

  public void setAllowHostsRegexp(ConfigNodePropertyArray allowHostsRegexp) {
    this.allowHostsRegexp = allowHostsRegexp;
  }

  public OrgApacheSlingSecurityImplReferrerFilterProperties allowHostsRegexp(ConfigNodePropertyArray allowHostsRegexp) {
    this.allowHostsRegexp = allowHostsRegexp;
    return this;
  }

 /**
   * Get filterMethods
   * @return filterMethods
  **/
  @JsonProperty("filter.methods")
  public ConfigNodePropertyArray getFilterMethods() {
    return filterMethods;
  }

  public void setFilterMethods(ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
  }

  public OrgApacheSlingSecurityImplReferrerFilterProperties filterMethods(ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
    return this;
  }

 /**
   * Get excludeAgentsRegexp
   * @return excludeAgentsRegexp
  **/
  @JsonProperty("exclude.agents.regexp")
  public ConfigNodePropertyArray getExcludeAgentsRegexp() {
    return excludeAgentsRegexp;
  }

  public void setExcludeAgentsRegexp(ConfigNodePropertyArray excludeAgentsRegexp) {
    this.excludeAgentsRegexp = excludeAgentsRegexp;
  }

  public OrgApacheSlingSecurityImplReferrerFilterProperties excludeAgentsRegexp(ConfigNodePropertyArray excludeAgentsRegexp) {
    this.excludeAgentsRegexp = excludeAgentsRegexp;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

