package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * ComAdobeGraniteOptoutImplOptOutServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeGraniteOptoutImplOptOutServiceImplProperties   {
  @JsonProperty("optout.cookies")
  private ConfigNodePropertyArray optoutCookies = null;

  @JsonProperty("optout.headers")
  private ConfigNodePropertyArray optoutHeaders = null;

  @JsonProperty("optout.whitelist.cookies")
  private ConfigNodePropertyArray optoutWhitelistCookies = null;

  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutCookies(ConfigNodePropertyArray optoutCookies) {
    this.optoutCookies = optoutCookies;
    return this;
  }

   /**
   * Get optoutCookies
   * @return optoutCookies
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getOptoutCookies() {
    return optoutCookies;
  }

  public void setOptoutCookies(ConfigNodePropertyArray optoutCookies) {
    this.optoutCookies = optoutCookies;
  }

  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutHeaders(ConfigNodePropertyArray optoutHeaders) {
    this.optoutHeaders = optoutHeaders;
    return this;
  }

   /**
   * Get optoutHeaders
   * @return optoutHeaders
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getOptoutHeaders() {
    return optoutHeaders;
  }

  public void setOptoutHeaders(ConfigNodePropertyArray optoutHeaders) {
    this.optoutHeaders = optoutHeaders;
  }

  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutWhitelistCookies(ConfigNodePropertyArray optoutWhitelistCookies) {
    this.optoutWhitelistCookies = optoutWhitelistCookies;
    return this;
  }

   /**
   * Get optoutWhitelistCookies
   * @return optoutWhitelistCookies
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getOptoutWhitelistCookies() {
    return optoutWhitelistCookies;
  }

  public void setOptoutWhitelistCookies(ConfigNodePropertyArray optoutWhitelistCookies) {
    this.optoutWhitelistCookies = optoutWhitelistCookies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOptoutImplOptOutServiceImplProperties comAdobeGraniteOptoutImplOptOutServiceImplProperties = (ComAdobeGraniteOptoutImplOptOutServiceImplProperties) o;
    return Objects.equals(this.optoutCookies, comAdobeGraniteOptoutImplOptOutServiceImplProperties.optoutCookies) &&
        Objects.equals(this.optoutHeaders, comAdobeGraniteOptoutImplOptOutServiceImplProperties.optoutHeaders) &&
        Objects.equals(this.optoutWhitelistCookies, comAdobeGraniteOptoutImplOptOutServiceImplProperties.optoutWhitelistCookies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optoutCookies, optoutHeaders, optoutWhitelistCookies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOptoutImplOptOutServiceImplProperties {\n");
    
    sb.append("    optoutCookies: ").append(toIndentedString(optoutCookies)).append("\n");
    sb.append("    optoutHeaders: ").append(toIndentedString(optoutHeaders)).append("\n");
    sb.append("    optoutWhitelistCookies: ").append(toIndentedString(optoutWhitelistCookies)).append("\n");
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

