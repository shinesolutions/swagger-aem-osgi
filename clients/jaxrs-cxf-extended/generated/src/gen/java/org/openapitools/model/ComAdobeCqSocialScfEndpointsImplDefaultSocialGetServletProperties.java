package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray slingServletSelectors;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingServletExtensions;
 /**
  * Get slingServletSelectors
  * @return slingServletSelectors
  */
  @JsonProperty("sling.servlet.selectors")
  public ConfigNodePropertyArray getSlingServletSelectors() {
    return slingServletSelectors;
  }

  /**
   * Sets the <code>slingServletSelectors</code> property.
   */
 public void setSlingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  /**
   * Sets the <code>slingServletSelectors</code> property.
   */
  public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties slingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

 /**
  * Get slingServletExtensions
  * @return slingServletExtensions
  */
  @JsonProperty("sling.servlet.extensions")
  public ConfigNodePropertyString getSlingServletExtensions() {
    return slingServletExtensions;
  }

  /**
   * Sets the <code>slingServletExtensions</code> property.
   */
 public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
  }

  /**
   * Sets the <code>slingServletExtensions</code> property.
   */
  public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties slingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
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
    ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties = (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties) o;
    return Objects.equals(this.slingServletSelectors, comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.slingServletSelectors) &&
        Objects.equals(this.slingServletExtensions, comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.slingServletExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletSelectors, slingServletExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties {\n");
    
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
    sb.append("    slingServletExtensions: ").append(toIndentedString(slingServletExtensions)).append("\n");
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

