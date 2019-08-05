package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray fieldWhitelist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray sitePathFilters = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString sitePackageGroup = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

