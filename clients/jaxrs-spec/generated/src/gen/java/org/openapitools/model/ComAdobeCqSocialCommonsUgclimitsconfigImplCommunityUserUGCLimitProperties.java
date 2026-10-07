package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties   {
  private ConfigNodePropertyBoolean enable;
  private ConfigNodePropertyInteger ugCLimit;
  private ConfigNodePropertyInteger ugcLimitDuration;
  private ConfigNodePropertyArray domains;
  private ConfigNodePropertyArray toList;

  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties() {
  }

  /**
   **/
  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties enable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enable")
  @Valid public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }

  @JsonProperty("enable")
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
  @Valid public ConfigNodePropertyInteger getUgCLimit() {
    return ugCLimit;
  }

  @JsonProperty("UGCLimit")
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
  @Valid public ConfigNodePropertyInteger getUgcLimitDuration() {
    return ugcLimitDuration;
  }

  @JsonProperty("ugcLimitDuration")
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
  @Valid public ConfigNodePropertyArray getDomains() {
    return domains;
  }

  @JsonProperty("domains")
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
  @Valid public ConfigNodePropertyArray getToList() {
    return toList;
  }

  @JsonProperty("toList")
  public void setToList(ConfigNodePropertyArray toList) {
    this.toList = toList;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
