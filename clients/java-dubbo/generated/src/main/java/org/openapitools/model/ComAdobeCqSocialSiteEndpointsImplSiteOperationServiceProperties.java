package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("fieldWhitelist")
  private ConfigNodePropertyArray fieldWhitelist;

  @JsonProperty("sitePathFilters")
  private ConfigNodePropertyArray sitePathFilters;

  @JsonProperty("sitePackageGroup")
  private ConfigNodePropertyString sitePackageGroup;

  /**
   * 
   * @return fieldWhitelist
   */
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }

  public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }

  /**
   * 
   * @return sitePathFilters
   */
  public ConfigNodePropertyArray getSitePathFilters() {
    return sitePathFilters;
  }

  public void setSitePathFilters(ConfigNodePropertyArray sitePathFilters) {
    this.sitePathFilters = sitePathFilters;
  }

  /**
   * 
   * @return sitePackageGroup
   */
  public ConfigNodePropertyString getSitePackageGroup() {
    return sitePackageGroup;
  }

  public void setSitePackageGroup(ConfigNodePropertyString sitePackageGroup) {
    this.sitePackageGroup = sitePackageGroup;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
