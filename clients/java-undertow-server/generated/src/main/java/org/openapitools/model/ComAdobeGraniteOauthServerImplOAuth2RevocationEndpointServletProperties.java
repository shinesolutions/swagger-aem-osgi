/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties   {
  
  private ConfigNodePropertyString slingServletPaths;
  private ConfigNodePropertyBoolean oauthRevocationActive;

  /**
   */
  public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties slingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.paths")
  public ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }
  public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  /**
   */
  public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties oauthRevocationActive(ConfigNodePropertyBoolean oauthRevocationActive) {
    this.oauthRevocationActive = oauthRevocationActive;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.revocation.active")
  public ConfigNodePropertyBoolean getOauthRevocationActive() {
    return oauthRevocationActive;
  }
  public void setOauthRevocationActive(ConfigNodePropertyBoolean oauthRevocationActive) {
    this.oauthRevocationActive = oauthRevocationActive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties = (ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties) o;
    return Objects.equals(slingServletPaths, comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.slingServletPaths) &&
        Objects.equals(oauthRevocationActive, comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.oauthRevocationActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletPaths, oauthRevocationActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties {\n");
    
    sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
    sb.append("    oauthRevocationActive: ").append(toIndentedString(oauthRevocationActive)).append("\n");
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

