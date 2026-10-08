package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean enable;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger ugCLimit;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger ugcLimitDuration;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray domains;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray toList;
 /**
   * Get enable
   * @return enable
  **/
  @JsonProperty("enable")
  public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }

  public void setEnable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties enable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

 /**
   * Get ugCLimit
   * @return ugCLimit
  **/
  @JsonProperty("UGCLimit")
  public ConfigNodePropertyInteger getUgCLimit() {
    return ugCLimit;
  }

  public void setUgCLimit(ConfigNodePropertyInteger ugCLimit) {
    this.ugCLimit = ugCLimit;
  }

  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties ugCLimit(ConfigNodePropertyInteger ugCLimit) {
    this.ugCLimit = ugCLimit;
    return this;
  }

 /**
   * Get ugcLimitDuration
   * @return ugcLimitDuration
  **/
  @JsonProperty("ugcLimitDuration")
  public ConfigNodePropertyInteger getUgcLimitDuration() {
    return ugcLimitDuration;
  }

  public void setUgcLimitDuration(ConfigNodePropertyInteger ugcLimitDuration) {
    this.ugcLimitDuration = ugcLimitDuration;
  }

  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties ugcLimitDuration(ConfigNodePropertyInteger ugcLimitDuration) {
    this.ugcLimitDuration = ugcLimitDuration;
    return this;
  }

 /**
   * Get domains
   * @return domains
  **/
  @JsonProperty("domains")
  public ConfigNodePropertyArray getDomains() {
    return domains;
  }

  public void setDomains(ConfigNodePropertyArray domains) {
    this.domains = domains;
  }

  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties domains(ConfigNodePropertyArray domains) {
    this.domains = domains;
    return this;
  }

 /**
   * Get toList
   * @return toList
  **/
  @JsonProperty("toList")
  public ConfigNodePropertyArray getToList() {
    return toList;
  }

  public void setToList(ConfigNodePropertyArray toList) {
    this.toList = toList;
  }

  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties toList(ConfigNodePropertyArray toList) {
    this.toList = toList;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties = (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties) o;
    return Objects.equals(this.enable, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.enable) &&
        Objects.equals(this.ugCLimit, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.ugCLimit) &&
        Objects.equals(this.ugcLimitDuration, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.ugcLimitDuration) &&
        Objects.equals(this.domains, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.domains) &&
        Objects.equals(this.toList, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.toList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, ugCLimit, ugcLimitDuration, domains, toList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    ugCLimit: ").append(toIndentedString(ugCLimit)).append("\n");
    sb.append("    ugcLimitDuration: ").append(toIndentedString(ugcLimitDuration)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    toList: ").append(toIndentedString(toList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

