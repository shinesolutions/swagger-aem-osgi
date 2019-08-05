package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties   {
  
  private ConfigNodePropertyBoolean enable = null;
  private ConfigNodePropertyInteger ugCLimit = null;
  private ConfigNodePropertyInteger ugcLimitDuration = null;
  private ConfigNodePropertyArray domains = null;
  private ConfigNodePropertyArray toList = null;

  /**
   **/
  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties enable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enable")
  public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }
  public void setEnable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties ugCLimit(ConfigNodePropertyInteger ugCLimit) {
    this.ugCLimit = ugCLimit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("UGCLimit")
  public ConfigNodePropertyInteger getUgCLimit() {
    return ugCLimit;
  }
  public void setUgCLimit(ConfigNodePropertyInteger ugCLimit) {
    this.ugCLimit = ugCLimit;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties ugcLimitDuration(ConfigNodePropertyInteger ugcLimitDuration) {
    this.ugcLimitDuration = ugcLimitDuration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ugcLimitDuration")
  public ConfigNodePropertyInteger getUgcLimitDuration() {
    return ugcLimitDuration;
  }
  public void setUgcLimitDuration(ConfigNodePropertyInteger ugcLimitDuration) {
    this.ugcLimitDuration = ugcLimitDuration;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties domains(ConfigNodePropertyArray domains) {
    this.domains = domains;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("domains")
  public ConfigNodePropertyArray getDomains() {
    return domains;
  }
  public void setDomains(ConfigNodePropertyArray domains) {
    this.domains = domains;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties toList(ConfigNodePropertyArray toList) {
    this.toList = toList;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("toList")
  public ConfigNodePropertyArray getToList() {
    return toList;
  }
  public void setToList(ConfigNodePropertyArray toList) {
    this.toList = toList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties = (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties) o;
    return Objects.equals(enable, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.enable) &&
        Objects.equals(ugCLimit, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.ugCLimit) &&
        Objects.equals(ugcLimitDuration, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.ugcLimitDuration) &&
        Objects.equals(domains, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.domains) &&
        Objects.equals(toList, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.toList);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

