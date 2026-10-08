package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray fieldWhitelist;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray sitePathFilters;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString sitePackageGroup;
 /**
  * Get fieldWhitelist
  * @return fieldWhitelist
  */
  @JsonProperty("fieldWhitelist")
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }

  /**
   * Sets the <code>fieldWhitelist</code> property.
   */
 public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }

  /**
   * Sets the <code>fieldWhitelist</code> property.
   */
  public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties fieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
    return this;
  }

 /**
  * Get sitePathFilters
  * @return sitePathFilters
  */
  @JsonProperty("sitePathFilters")
  public ConfigNodePropertyArray getSitePathFilters() {
    return sitePathFilters;
  }

  /**
   * Sets the <code>sitePathFilters</code> property.
   */
 public void setSitePathFilters(ConfigNodePropertyArray sitePathFilters) {
    this.sitePathFilters = sitePathFilters;
  }

  /**
   * Sets the <code>sitePathFilters</code> property.
   */
  public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties sitePathFilters(ConfigNodePropertyArray sitePathFilters) {
    this.sitePathFilters = sitePathFilters;
    return this;
  }

 /**
  * Get sitePackageGroup
  * @return sitePackageGroup
  */
  @JsonProperty("sitePackageGroup")
  public ConfigNodePropertyString getSitePackageGroup() {
    return sitePackageGroup;
  }

  /**
   * Sets the <code>sitePackageGroup</code> property.
   */
 public void setSitePackageGroup(ConfigNodePropertyString sitePackageGroup) {
    this.sitePackageGroup = sitePackageGroup;
  }

  /**
   * Sets the <code>sitePackageGroup</code> property.
   */
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

