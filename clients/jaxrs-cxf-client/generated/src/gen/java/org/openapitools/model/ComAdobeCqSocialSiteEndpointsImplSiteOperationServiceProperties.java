package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray fieldWhitelist;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray sitePathFilters;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString sitePackageGroup;
 /**
   * Get fieldWhitelist
   * @return fieldWhitelist
  **/
  @JsonProperty("fieldWhitelist")
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }

  public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }

  public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties fieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
    return this;
  }

 /**
   * Get sitePathFilters
   * @return sitePathFilters
  **/
  @JsonProperty("sitePathFilters")
  public ConfigNodePropertyArray getSitePathFilters() {
    return sitePathFilters;
  }

  public void setSitePathFilters(ConfigNodePropertyArray sitePathFilters) {
    this.sitePathFilters = sitePathFilters;
  }

  public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties sitePathFilters(ConfigNodePropertyArray sitePathFilters) {
    this.sitePathFilters = sitePathFilters;
    return this;
  }

 /**
   * Get sitePackageGroup
   * @return sitePackageGroup
  **/
  @JsonProperty("sitePackageGroup")
  public ConfigNodePropertyString getSitePackageGroup() {
    return sitePackageGroup;
  }

  public void setSitePackageGroup(ConfigNodePropertyString sitePackageGroup) {
    this.sitePackageGroup = sitePackageGroup;
  }

  public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties sitePackageGroup(ConfigNodePropertyString sitePackageGroup) {
    this.sitePackageGroup = sitePackageGroup;
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
    ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties = (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties) o;
    return Objects.equals(this.fieldWhitelist, comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.fieldWhitelist) &&
        Objects.equals(this.sitePathFilters, comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.sitePathFilters) &&
        Objects.equals(this.sitePackageGroup, comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.sitePackageGroup);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

