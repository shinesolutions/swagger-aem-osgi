package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean enable = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger ugCLimit = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger ugcLimitDuration = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray domains = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray toList = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

