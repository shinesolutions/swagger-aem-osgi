package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties   {
  
  private ConfigNodePropertyBoolean enable = null;
  private ConfigNodePropertyInteger ugCLimit = null;
  private ConfigNodePropertyInteger ugcLimitDuration = null;
  private ConfigNodePropertyArray domains = null;
  private ConfigNodePropertyArray toList = null;

  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties () {

  }

  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties (ConfigNodePropertyBoolean enable, ConfigNodePropertyInteger ugCLimit, ConfigNodePropertyInteger ugcLimitDuration, ConfigNodePropertyArray domains, ConfigNodePropertyArray toList) {
    this.enable = enable;
    this.ugCLimit = ugCLimit;
    this.ugcLimitDuration = ugcLimitDuration;
    this.domains = domains;
    this.toList = toList;
  }

    
  @JsonProperty("enable")
  public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }
  public void setEnable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

    
  @JsonProperty("UGCLimit")
  public ConfigNodePropertyInteger getUgCLimit() {
    return ugCLimit;
  }
  public void setUgCLimit(ConfigNodePropertyInteger ugCLimit) {
    this.ugCLimit = ugCLimit;
  }

    
  @JsonProperty("ugcLimitDuration")
  public ConfigNodePropertyInteger getUgcLimitDuration() {
    return ugcLimitDuration;
  }
  public void setUgcLimitDuration(ConfigNodePropertyInteger ugcLimitDuration) {
    this.ugcLimitDuration = ugcLimitDuration;
  }

    
  @JsonProperty("domains")
  public ConfigNodePropertyArray getDomains() {
    return domains;
  }
  public void setDomains(ConfigNodePropertyArray domains) {
    this.domains = domains;
  }

    
  @JsonProperty("toList")
  public ConfigNodePropertyArray getToList() {
    return toList;
  }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
