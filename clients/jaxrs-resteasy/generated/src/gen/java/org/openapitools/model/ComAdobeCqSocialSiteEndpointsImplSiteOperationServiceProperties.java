package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties   {
  
  private ConfigNodePropertyArray fieldWhitelist = null;
  private ConfigNodePropertyArray sitePathFilters = null;
  private ConfigNodePropertyString sitePackageGroup = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fieldWhitelist")
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }
  public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sitePathFilters")
  public ConfigNodePropertyArray getSitePathFilters() {
    return sitePathFilters;
  }
  public void setSitePathFilters(ConfigNodePropertyArray sitePathFilters) {
    this.sitePathFilters = sitePathFilters;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sitePackageGroup")
  public ConfigNodePropertyString getSitePackageGroup() {
    return sitePackageGroup;
  }
  public void setSitePackageGroup(ConfigNodePropertyString sitePackageGroup) {
    this.sitePackageGroup = sitePackageGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties = (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties) o;
    return Objects.equals(fieldWhitelist, comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.fieldWhitelist) &&
        Objects.equals(sitePathFilters, comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.sitePathFilters) &&
        Objects.equals(sitePackageGroup, comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.sitePackageGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldWhitelist, sitePathFilters, sitePackageGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties {\n");
    
    sb.append("    fieldWhitelist: ").append(toIndentedString(fieldWhitelist)).append("\n");
    sb.append("    sitePathFilters: ").append(toIndentedString(sitePathFilters)).append("\n");
    sb.append("    sitePackageGroup: ").append(toIndentedString(sitePackageGroup)).append("\n");
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

