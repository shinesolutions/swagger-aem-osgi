/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T13:44:27.963Z[GMT]")
public class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties {
  public static final String SERIALIZED_NAME_SLING_SERVLET_SELECTORS = "sling.servlet.selectors";
  @SerializedName(SERIALIZED_NAME_SLING_SERVLET_SELECTORS)
  private ConfigNodePropertyArray slingServletSelectors = null;

  public static final String SERIALIZED_NAME_SLING_SERVLET_EXTENSIONS = "sling.servlet.extensions";
  @SerializedName(SERIALIZED_NAME_SLING_SERVLET_EXTENSIONS)
  private ConfigNodePropertyString slingServletExtensions = null;

  public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties slingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

   /**
   * Get slingServletSelectors
   * @return slingServletSelectors
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties slingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
    return this;
  }

   /**
   * Get slingServletExtensions
   * @return slingServletExtensions
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingServletExtensions() {
    return slingServletExtensions;
  }

  public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

