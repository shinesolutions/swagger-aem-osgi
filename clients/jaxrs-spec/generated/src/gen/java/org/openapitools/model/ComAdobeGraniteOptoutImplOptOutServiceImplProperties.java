package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteOptoutImplOptOutServiceImplProperties   {
  
  private @Valid ConfigNodePropertyArray optoutCookies = null;
  private @Valid ConfigNodePropertyArray optoutHeaders = null;
  private @Valid ConfigNodePropertyArray optoutWhitelistCookies = null;

  /**
   **/
  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutCookies(ConfigNodePropertyArray optoutCookies) {
    this.optoutCookies = optoutCookies;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("optout.cookies")
  public ConfigNodePropertyArray getOptoutCookies() {
    return optoutCookies;
  }
  public void setOptoutCookies(ConfigNodePropertyArray optoutCookies) {
    this.optoutCookies = optoutCookies;
  }

  /**
   **/
  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutHeaders(ConfigNodePropertyArray optoutHeaders) {
    this.optoutHeaders = optoutHeaders;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("optout.headers")
  public ConfigNodePropertyArray getOptoutHeaders() {
    return optoutHeaders;
  }
  public void setOptoutHeaders(ConfigNodePropertyArray optoutHeaders) {
    this.optoutHeaders = optoutHeaders;
  }

  /**
   **/
  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutWhitelistCookies(ConfigNodePropertyArray optoutWhitelistCookies) {
    this.optoutWhitelistCookies = optoutWhitelistCookies;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("optout.whitelist.cookies")
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
    return Objects.equals(optoutCookies, comAdobeGraniteOptoutImplOptOutServiceImplProperties.optoutCookies) &&
        Objects.equals(optoutHeaders, comAdobeGraniteOptoutImplOptOutServiceImplProperties.optoutHeaders) &&
        Objects.equals(optoutWhitelistCookies, comAdobeGraniteOptoutImplOptOutServiceImplProperties.optoutWhitelistCookies);
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

